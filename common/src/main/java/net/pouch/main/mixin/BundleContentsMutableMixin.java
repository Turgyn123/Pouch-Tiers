package net.pouch.main.mixin;

import java.util.List;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.BundleContents;
import net.pouch.Items.PouchTiers.TieredPouchItem;
import org.apache.commons.lang3.math.Fraction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Mixin into BundleContents.Mutable to allow tiered pouches to have
 * different capacities. Vanilla hardcodes the max weight to Fraction.ONE (1 stack).
 * When a TieredPouchItem sets its slot count via ThreadLocal, this mixin
 * overrides the capacity check to use that value instead.
 *
 * Also overrides tryInsert to prevent vanilla's stack merging from creating
 * oversized stacks (count > maxStackSize), which would fail
 * ItemStack.CODEC validation and crash the creative mode packet handler.
 */
@Mixin(BundleContents.Mutable.class)
public abstract class BundleContentsMutableMixin {

    @Shadow
    private List<ItemStack> items;

    @Shadow
    private Fraction weight;

    @Shadow
    private int findStackIndex(ItemStack stack) { throw new AbstractMethodError(); }

    @Inject(method = "getMaxAmountToAdd", at = @At("HEAD"), cancellable = true)
    private void pouch$modifyCapacity(ItemStack stack, CallbackInfoReturnable<Integer> cir) {
        Integer customSlots = TieredPouchItem.CURRENT_SLOT_COUNT.get();
        if (customSlots != null) {
            Fraction maxWeight = Fraction.getFraction(customSlots, 1);
            Fraction remaining = maxWeight.subtract(this.weight);
            Fraction itemWeight = calculateItemWeight(stack);
            cir.setReturnValue(Math.max(remaining.divideBy(itemWeight).intValue(), 0));
        }
    }

    /**
     * Overrides tryInsert when a TieredPouchItem is active to handle
     * stack splitting correctly. Vanilla merges matching stacks with
     * copyWithCount(old + new) which can exceed maxStackSize when our
     * getMaxAmountToAdd allows more items. ItemStack.CODEC enforces
     * intRange(1,99) on count, so oversized stacks crash the network codec.
     *
     * This fix caps each merged/new stack at maxStackSize and creates
     * additional entries for overflow.
     */
    @Inject(method = "tryInsert(Lnet/minecraft/world/item/ItemStack;)I", at = @At("HEAD"), cancellable = true)
    private void pouch$fixStackOverflow(ItemStack stack, CallbackInfoReturnable<Integer> cir) {
        Integer customSlots = TieredPouchItem.CURRENT_SLOT_COUNT.get();
        if (customSlots == null) return; // let vanilla handle non-pouch bundles

        if (stack.isEmpty() || !stack.getItem().canFitInsideContainerItems()) {
            cir.setReturnValue(0);
            return;
        }

        // Calculate how many items to add (uses our modified getMaxAmountToAdd via mixin)
        Fraction maxWeight = Fraction.getFraction(customSlots, 1);
        Fraction remaining = maxWeight.subtract(this.weight);
        Fraction itemWeight = calculateItemWeight(stack);
        int maxCanAdd = Math.max(remaining.divideBy(itemWeight).intValue(), 0);
        int totalToAdd = Math.min(stack.getCount(), maxCanAdd);

        if (totalToAdd == 0) {
            cir.setReturnValue(0);
            return;
        }

        // Update tracked weight
        this.weight = this.weight.add(itemWeight.multiplyBy(Fraction.getFraction(totalToAdd, 1)));

        int left = totalToAdd;
        int maxStackSize = stack.getMaxStackSize();

        // Try to merge with an existing matching stack first (capped at maxStackSize)
        int existingIdx = this.findStackIndex(stack);
        if (existingIdx != -1) {
            ItemStack existing = this.items.remove(existingIdx);
            int canMerge = Math.min(left, maxStackSize - existing.getCount());
            if (canMerge > 0) {
                this.items.add(0, existing.copyWithCount(existing.getCount() + canMerge));
                left -= canMerge;
            } else {
                // Existing stack already full, move it to front (vanilla behavior)
                this.items.add(0, existing);
            }
        }

        // Add any remaining items as new properly-sized stacks
        int insertPos = (existingIdx != -1) ? 1 : 0;
        while (left > 0) {
            int chunk = Math.min(left, maxStackSize);
            this.items.add(insertPos, stack.copyWithCount(chunk));
            left -= chunk;
            insertPos++;
        }

        // Remove added items from the input stack
        stack.shrink(totalToAdd);
        cir.setReturnValue(totalToAdd);
    }

    /**
     * Replicates BundleContents.getWeight() logic since the original is package-private.
     * Matches vanilla weight calculation including bee-nest check.
     */
    private static Fraction calculateItemWeight(ItemStack stack) {
        // Nested bundles/pouches weigh 1/16 + their stored contents' weight
        BundleContents contents = stack.get(DataComponents.BUNDLE_CONTENTS);
        if (contents != null) {
            return Fraction.getFraction(1, 16).add(contents.weight());
        }
        // Items containing bees occupy a full slot
        if (!stack.getOrDefault(DataComponents.BEES, List.of()).isEmpty()) {
            return Fraction.ONE;
        }
        // All other items weigh 1/maxStackSize per unit
        return Fraction.getFraction(1, stack.getMaxStackSize());
    }
}

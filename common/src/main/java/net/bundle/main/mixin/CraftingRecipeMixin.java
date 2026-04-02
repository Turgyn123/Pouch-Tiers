package net.bundle.main.mixin;

import net.bundle.Items.BundleTiers.TieredBundleItem;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.minecraft.world.item.component.BundleContents;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Preserves BundleContents when a TieredBundleItem is used in a shaped
 * crafting recipe (e.g. upgrading to a higher tier).
 */
@Mixin(ShapedRecipe.class)
public class CraftingRecipeMixin {

    @Inject(method = "assemble(Lnet/minecraft/world/item/crafting/CraftingInput;Lnet/minecraft/core/HolderLookup$Provider;)Lnet/minecraft/world/item/ItemStack;",
            at = @At("TAIL"))
    private void preserveBundleContents(CraftingInput input, HolderLookup.Provider registries,
                                        CallbackInfoReturnable<ItemStack> cir) {
        ItemStack result = cir.getReturnValue();
        if (!(result.getItem() instanceof TieredBundleItem)) return;

        for (int i = 0; i < input.size(); i++) {
            ItemStack ingredient = input.getItem(i);
            if (ingredient.getItem() instanceof TieredBundleItem) {
                BundleContents contents = ingredient.get(DataComponents.BUNDLE_CONTENTS);
                if (contents != null && !contents.isEmpty()) {
                    result.set(DataComponents.BUNDLE_CONTENTS, contents);
                }
                break;
            }
        }
    }
}

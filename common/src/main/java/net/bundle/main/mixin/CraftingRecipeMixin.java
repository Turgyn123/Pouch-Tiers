package net.bundle.main.mixin;

import net.minecraft.core.HolderLookup;
import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.BundleContents;
import net.minecraft.world.item.crafting.CraftingInput;
import net.minecraft.world.item.crafting.ShapedRecipe;
import net.bundle.Items.BundleTiers.TieredBundleItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/**
 * Mixin on ShapedRecipe to preserve BundleContents when a TieredBundleItem
 * is used as an ingredient and the result is also a TieredBundleItem.
 * Covers upgrade recipes (shaped: bundle + ingots → higher-tier bundle).
 */
@Mixin(ShapedRecipe.class)
public class CraftingRecipeMixin {

    @Inject(method = "assemble", at = @At("TAIL"))
    private void bundle$preserveContents(CraftingInput input, HolderLookup.Provider registries, CallbackInfoReturnable<ItemStack> cir) {
        ItemStack result = cir.getReturnValue();
        if (result == null || !(result.getItem() instanceof TieredBundleItem)) {
            return;
        }

        for (int i = 0; i < input.size(); i++) {
            ItemStack ingredient = input.getItem(i);
            if (ingredient.getItem() instanceof TieredBundleItem) {
                BundleContents contents = ingredient.get(DataComponents.BUNDLE_CONTENTS);
                if (contents != null) {
                    result.set(DataComponents.BUNDLE_CONTENTS, contents);
                }
                break;
            }
        }
    }
}

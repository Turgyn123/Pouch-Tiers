package net.bundle.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.bundle.main.Main;

public class FabricTab {

    public static final CreativeModeTab BUNDLE_TIERS_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "bundle_tiers"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(FabricItems.COPPER_BUNDLE))
                    .title(Component.translatable("itemGroup.bundle.bundle_tiers"))
                    .displayItems((params, output) -> {
                        output.accept(FabricItems.BUNDLE);
                        output.accept(FabricItems.WHITE_BUNDLE);
                        output.accept(FabricItems.LIGHT_GRAY_BUNDLE);
                        output.accept(FabricItems.GRAY_BUNDLE);
                        output.accept(FabricItems.BLACK_BUNDLE);
                        output.accept(FabricItems.BROWN_BUNDLE);
                        output.accept(FabricItems.RED_BUNDLE);
                        output.accept(FabricItems.ORANGE_BUNDLE);
                        output.accept(FabricItems.YELLOW_BUNDLE);
                        output.accept(FabricItems.LIME_BUNDLE);
                        output.accept(FabricItems.GREEN_BUNDLE);
                        output.accept(FabricItems.CYAN_BUNDLE);
                        output.accept(FabricItems.LIGHT_BLUE_BUNDLE);
                        output.accept(FabricItems.BLUE_BUNDLE);
                        output.accept(FabricItems.PURPLE_BUNDLE);
                        output.accept(FabricItems.MAGENTA_BUNDLE);
                        output.accept(FabricItems.PINK_BUNDLE);
                        output.accept(FabricItems.COPPER_BUNDLE);
                        output.accept(FabricItems.IRON_BUNDLE);
                        output.accept(FabricItems.GOLD_BUNDLE);
                        output.accept(FabricItems.DIAMOND_BUNDLE);
                        output.accept(FabricItems.NETHERITE_BUNDLE);
                        output.accept(FabricItems.EMERALD_BUNDLE);
                        output.accept(FabricItems.BLACK_COPPER_BUNDLE);
                        output.accept(FabricItems.BLUE_COPPER_BUNDLE);
                        output.accept(FabricItems.BROWN_COPPER_BUNDLE);
                        output.accept(FabricItems.CYAN_COPPER_BUNDLE);
                        output.accept(FabricItems.GRAY_COPPER_BUNDLE);
                        output.accept(FabricItems.GREEN_COPPER_BUNDLE);
                        output.accept(FabricItems.LIGHT_BLUE_COPPER_BUNDLE);
                        output.accept(FabricItems.LIGHT_GRAY_COPPER_BUNDLE);
                        output.accept(FabricItems.LIME_COPPER_BUNDLE);
                        output.accept(FabricItems.MAGENTA_COPPER_BUNDLE);
                        output.accept(FabricItems.ORANGE_COPPER_BUNDLE);
                        output.accept(FabricItems.PINK_COPPER_BUNDLE);
                        output.accept(FabricItems.PURPLE_COPPER_BUNDLE);
                        output.accept(FabricItems.RED_COPPER_BUNDLE);
                        output.accept(FabricItems.WHITE_COPPER_BUNDLE);
                        output.accept(FabricItems.YELLOW_COPPER_BUNDLE);
                        output.accept(FabricItems.BLACK_IRON_BUNDLE);
                        output.accept(FabricItems.BLUE_IRON_BUNDLE);
                        output.accept(FabricItems.BROWN_IRON_BUNDLE);
                        output.accept(FabricItems.CYAN_IRON_BUNDLE);
                        output.accept(FabricItems.GRAY_IRON_BUNDLE);
                        output.accept(FabricItems.GREEN_IRON_BUNDLE);
                        output.accept(FabricItems.LIGHT_BLUE_IRON_BUNDLE);
                        output.accept(FabricItems.LIGHT_GRAY_IRON_BUNDLE);
                        output.accept(FabricItems.LIME_IRON_BUNDLE);
                        output.accept(FabricItems.MAGENTA_IRON_BUNDLE);
                        output.accept(FabricItems.ORANGE_IRON_BUNDLE);
                        output.accept(FabricItems.PINK_IRON_BUNDLE);
                        output.accept(FabricItems.PURPLE_IRON_BUNDLE);
                        output.accept(FabricItems.RED_IRON_BUNDLE);
                        output.accept(FabricItems.WHITE_IRON_BUNDLE);
                        output.accept(FabricItems.YELLOW_IRON_BUNDLE);
                        output.accept(FabricItems.BLACK_GOLD_BUNDLE);
                        output.accept(FabricItems.BLUE_GOLD_BUNDLE);
                        output.accept(FabricItems.BROWN_GOLD_BUNDLE);
                        output.accept(FabricItems.CYAN_GOLD_BUNDLE);
                        output.accept(FabricItems.GRAY_GOLD_BUNDLE);
                        output.accept(FabricItems.GREEN_GOLD_BUNDLE);
                        output.accept(FabricItems.LIGHT_BLUE_GOLD_BUNDLE);
                        output.accept(FabricItems.LIGHT_GRAY_GOLD_BUNDLE);
                        output.accept(FabricItems.LIME_GOLD_BUNDLE);
                        output.accept(FabricItems.MAGENTA_GOLD_BUNDLE);
                        output.accept(FabricItems.ORANGE_GOLD_BUNDLE);
                        output.accept(FabricItems.PINK_GOLD_BUNDLE);
                        output.accept(FabricItems.PURPLE_GOLD_BUNDLE);
                        output.accept(FabricItems.RED_GOLD_BUNDLE);
                        output.accept(FabricItems.WHITE_GOLD_BUNDLE);
                        output.accept(FabricItems.YELLOW_GOLD_BUNDLE);
                        output.accept(FabricItems.BLACK_DIAMOND_BUNDLE);
                        output.accept(FabricItems.BLUE_DIAMOND_BUNDLE);
                        output.accept(FabricItems.BROWN_DIAMOND_BUNDLE);
                        output.accept(FabricItems.CYAN_DIAMOND_BUNDLE);
                        output.accept(FabricItems.GRAY_DIAMOND_BUNDLE);
                        output.accept(FabricItems.GREEN_DIAMOND_BUNDLE);
                        output.accept(FabricItems.LIGHT_BLUE_DIAMOND_BUNDLE);
                        output.accept(FabricItems.LIGHT_GRAY_DIAMOND_BUNDLE);
                        output.accept(FabricItems.LIME_DIAMOND_BUNDLE);
                        output.accept(FabricItems.MAGENTA_DIAMOND_BUNDLE);
                        output.accept(FabricItems.ORANGE_DIAMOND_BUNDLE);
                        output.accept(FabricItems.PINK_DIAMOND_BUNDLE);
                        output.accept(FabricItems.PURPLE_DIAMOND_BUNDLE);
                        output.accept(FabricItems.RED_DIAMOND_BUNDLE);
                        output.accept(FabricItems.WHITE_DIAMOND_BUNDLE);
                        output.accept(FabricItems.YELLOW_DIAMOND_BUNDLE);
                        output.accept(FabricItems.BLACK_NETHERITE_BUNDLE);
                        output.accept(FabricItems.BLUE_NETHERITE_BUNDLE);
                        output.accept(FabricItems.BROWN_NETHERITE_BUNDLE);
                        output.accept(FabricItems.CYAN_NETHERITE_BUNDLE);
                        output.accept(FabricItems.GRAY_NETHERITE_BUNDLE);
                        output.accept(FabricItems.GREEN_NETHERITE_BUNDLE);
                        output.accept(FabricItems.LIGHT_BLUE_NETHERITE_BUNDLE);
                        output.accept(FabricItems.LIGHT_GRAY_NETHERITE_BUNDLE);
                        output.accept(FabricItems.LIME_NETHERITE_BUNDLE);
                        output.accept(FabricItems.MAGENTA_NETHERITE_BUNDLE);
                        output.accept(FabricItems.ORANGE_NETHERITE_BUNDLE);
                        output.accept(FabricItems.PINK_NETHERITE_BUNDLE);
                        output.accept(FabricItems.PURPLE_NETHERITE_BUNDLE);
                        output.accept(FabricItems.RED_NETHERITE_BUNDLE);
                        output.accept(FabricItems.WHITE_NETHERITE_BUNDLE);
                        output.accept(FabricItems.YELLOW_NETHERITE_BUNDLE);
                        output.accept(FabricItems.BLACK_EMERALD_BUNDLE);
                        output.accept(FabricItems.BLUE_EMERALD_BUNDLE);
                        output.accept(FabricItems.BROWN_EMERALD_BUNDLE);
                        output.accept(FabricItems.CYAN_EMERALD_BUNDLE);
                        output.accept(FabricItems.GRAY_EMERALD_BUNDLE);
                        output.accept(FabricItems.GREEN_EMERALD_BUNDLE);
                        output.accept(FabricItems.LIGHT_BLUE_EMERALD_BUNDLE);
                        output.accept(FabricItems.LIGHT_GRAY_EMERALD_BUNDLE);
                        output.accept(FabricItems.LIME_EMERALD_BUNDLE);
                        output.accept(FabricItems.MAGENTA_EMERALD_BUNDLE);
                        output.accept(FabricItems.ORANGE_EMERALD_BUNDLE);
                        output.accept(FabricItems.PINK_EMERALD_BUNDLE);
                        output.accept(FabricItems.PURPLE_EMERALD_BUNDLE);
                        output.accept(FabricItems.RED_EMERALD_BUNDLE);
                        output.accept(FabricItems.WHITE_EMERALD_BUNDLE);
                        output.accept(FabricItems.YELLOW_EMERALD_BUNDLE);
                    })
                    .build()
    );

    /**
     * Call from mod initializer to trigger static field initialization (class loading).
     */
    public static void init() {
    }
}

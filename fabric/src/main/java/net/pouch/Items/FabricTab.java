package net.pouch.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.pouch.main.Main;

public class FabricTab {

    public static final CreativeModeTab POUCH_TIERS_TAB = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "pouch_tiers"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(FabricItems.COPPER_POUCH))
                    .title(Component.translatable("itemGroup.pouch.pouch_tiers"))
                    .displayItems((params, output) -> {
                        output.accept(FabricItems.POUCH);
                        output.accept(FabricItems.WHITE_POUCH);
                        output.accept(FabricItems.LIGHT_GRAY_POUCH);
                        output.accept(FabricItems.GRAY_POUCH);
                        output.accept(FabricItems.BLACK_POUCH);
                        output.accept(FabricItems.BROWN_POUCH);
                        output.accept(FabricItems.RED_POUCH);
                        output.accept(FabricItems.ORANGE_POUCH);
                        output.accept(FabricItems.YELLOW_POUCH);
                        output.accept(FabricItems.LIME_POUCH);
                        output.accept(FabricItems.GREEN_POUCH);
                        output.accept(FabricItems.CYAN_POUCH);
                        output.accept(FabricItems.LIGHT_BLUE_POUCH);
                        output.accept(FabricItems.BLUE_POUCH);
                        output.accept(FabricItems.PURPLE_POUCH);
                        output.accept(FabricItems.MAGENTA_POUCH);
                        output.accept(FabricItems.PINK_POUCH);
                        output.accept(FabricItems.COPPER_POUCH);
                        output.accept(FabricItems.IRON_POUCH);
                        output.accept(FabricItems.GOLD_POUCH);
                        output.accept(FabricItems.DIAMOND_POUCH);
                        output.accept(FabricItems.NETHERITE_POUCH);
                        output.accept(FabricItems.EMERALD_POUCH);
                        output.accept(FabricItems.BLACK_COPPER_POUCH);
                        output.accept(FabricItems.BLUE_COPPER_POUCH);
                        output.accept(FabricItems.BROWN_COPPER_POUCH);
                        output.accept(FabricItems.CYAN_COPPER_POUCH);
                        output.accept(FabricItems.GRAY_COPPER_POUCH);
                        output.accept(FabricItems.GREEN_COPPER_POUCH);
                        output.accept(FabricItems.LIGHT_BLUE_COPPER_POUCH);
                        output.accept(FabricItems.LIGHT_GRAY_COPPER_POUCH);
                        output.accept(FabricItems.LIME_COPPER_POUCH);
                        output.accept(FabricItems.MAGENTA_COPPER_POUCH);
                        output.accept(FabricItems.ORANGE_COPPER_POUCH);
                        output.accept(FabricItems.PINK_COPPER_POUCH);
                        output.accept(FabricItems.PURPLE_COPPER_POUCH);
                        output.accept(FabricItems.RED_COPPER_POUCH);
                        output.accept(FabricItems.WHITE_COPPER_POUCH);
                        output.accept(FabricItems.YELLOW_COPPER_POUCH);
                        output.accept(FabricItems.BLACK_IRON_POUCH);
                        output.accept(FabricItems.BLUE_IRON_POUCH);
                        output.accept(FabricItems.BROWN_IRON_POUCH);
                        output.accept(FabricItems.CYAN_IRON_POUCH);
                        output.accept(FabricItems.GRAY_IRON_POUCH);
                        output.accept(FabricItems.GREEN_IRON_POUCH);
                        output.accept(FabricItems.LIGHT_BLUE_IRON_POUCH);
                        output.accept(FabricItems.LIGHT_GRAY_IRON_POUCH);
                        output.accept(FabricItems.LIME_IRON_POUCH);
                        output.accept(FabricItems.MAGENTA_IRON_POUCH);
                        output.accept(FabricItems.ORANGE_IRON_POUCH);
                        output.accept(FabricItems.PINK_IRON_POUCH);
                        output.accept(FabricItems.PURPLE_IRON_POUCH);
                        output.accept(FabricItems.RED_IRON_POUCH);
                        output.accept(FabricItems.WHITE_IRON_POUCH);
                        output.accept(FabricItems.YELLOW_IRON_POUCH);
                        output.accept(FabricItems.BLACK_GOLD_POUCH);
                        output.accept(FabricItems.BLUE_GOLD_POUCH);
                        output.accept(FabricItems.BROWN_GOLD_POUCH);
                        output.accept(FabricItems.CYAN_GOLD_POUCH);
                        output.accept(FabricItems.GRAY_GOLD_POUCH);
                        output.accept(FabricItems.GREEN_GOLD_POUCH);
                        output.accept(FabricItems.LIGHT_BLUE_GOLD_POUCH);
                        output.accept(FabricItems.LIGHT_GRAY_GOLD_POUCH);
                        output.accept(FabricItems.LIME_GOLD_POUCH);
                        output.accept(FabricItems.MAGENTA_GOLD_POUCH);
                        output.accept(FabricItems.ORANGE_GOLD_POUCH);
                        output.accept(FabricItems.PINK_GOLD_POUCH);
                        output.accept(FabricItems.PURPLE_GOLD_POUCH);
                        output.accept(FabricItems.RED_GOLD_POUCH);
                        output.accept(FabricItems.WHITE_GOLD_POUCH);
                        output.accept(FabricItems.YELLOW_GOLD_POUCH);
                        output.accept(FabricItems.BLACK_DIAMOND_POUCH);
                        output.accept(FabricItems.BLUE_DIAMOND_POUCH);
                        output.accept(FabricItems.BROWN_DIAMOND_POUCH);
                        output.accept(FabricItems.CYAN_DIAMOND_POUCH);
                        output.accept(FabricItems.GRAY_DIAMOND_POUCH);
                        output.accept(FabricItems.GREEN_DIAMOND_POUCH);
                        output.accept(FabricItems.LIGHT_BLUE_DIAMOND_POUCH);
                        output.accept(FabricItems.LIGHT_GRAY_DIAMOND_POUCH);
                        output.accept(FabricItems.LIME_DIAMOND_POUCH);
                        output.accept(FabricItems.MAGENTA_DIAMOND_POUCH);
                        output.accept(FabricItems.ORANGE_DIAMOND_POUCH);
                        output.accept(FabricItems.PINK_DIAMOND_POUCH);
                        output.accept(FabricItems.PURPLE_DIAMOND_POUCH);
                        output.accept(FabricItems.RED_DIAMOND_POUCH);
                        output.accept(FabricItems.WHITE_DIAMOND_POUCH);
                        output.accept(FabricItems.YELLOW_DIAMOND_POUCH);
                        output.accept(FabricItems.BLACK_NETHERITE_POUCH);
                        output.accept(FabricItems.BLUE_NETHERITE_POUCH);
                        output.accept(FabricItems.BROWN_NETHERITE_POUCH);
                        output.accept(FabricItems.CYAN_NETHERITE_POUCH);
                        output.accept(FabricItems.GRAY_NETHERITE_POUCH);
                        output.accept(FabricItems.GREEN_NETHERITE_POUCH);
                        output.accept(FabricItems.LIGHT_BLUE_NETHERITE_POUCH);
                        output.accept(FabricItems.LIGHT_GRAY_NETHERITE_POUCH);
                        output.accept(FabricItems.LIME_NETHERITE_POUCH);
                        output.accept(FabricItems.MAGENTA_NETHERITE_POUCH);
                        output.accept(FabricItems.ORANGE_NETHERITE_POUCH);
                        output.accept(FabricItems.PINK_NETHERITE_POUCH);
                        output.accept(FabricItems.PURPLE_NETHERITE_POUCH);
                        output.accept(FabricItems.RED_NETHERITE_POUCH);
                        output.accept(FabricItems.WHITE_NETHERITE_POUCH);
                        output.accept(FabricItems.YELLOW_NETHERITE_POUCH);
                        output.accept(FabricItems.BLACK_EMERALD_POUCH);
                        output.accept(FabricItems.BLUE_EMERALD_POUCH);
                        output.accept(FabricItems.BROWN_EMERALD_POUCH);
                        output.accept(FabricItems.CYAN_EMERALD_POUCH);
                        output.accept(FabricItems.GRAY_EMERALD_POUCH);
                        output.accept(FabricItems.GREEN_EMERALD_POUCH);
                        output.accept(FabricItems.LIGHT_BLUE_EMERALD_POUCH);
                        output.accept(FabricItems.LIGHT_GRAY_EMERALD_POUCH);
                        output.accept(FabricItems.LIME_EMERALD_POUCH);
                        output.accept(FabricItems.MAGENTA_EMERALD_POUCH);
                        output.accept(FabricItems.ORANGE_EMERALD_POUCH);
                        output.accept(FabricItems.PINK_EMERALD_POUCH);
                        output.accept(FabricItems.PURPLE_EMERALD_POUCH);
                        output.accept(FabricItems.RED_EMERALD_POUCH);
                        output.accept(FabricItems.WHITE_EMERALD_POUCH);
                        output.accept(FabricItems.YELLOW_EMERALD_POUCH);
                    })
                    .build()
    );

    /**
     * Call from mod initializer to trigger static field initialization (class loading).
     */
    public static void init() {
    }
}

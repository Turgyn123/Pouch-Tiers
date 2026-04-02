package net.bundle.main.Items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.bundle.main.Main;

public class NeoForgeTab {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> BUNDLE_TIERS = TABS.register("bundle_tiers", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.bundle.bundle_tiers")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> NeoForgeItems.COPPER_BUNDLE.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(NeoForgeItems.BUNDLE.get());
                output.accept(NeoForgeItems.WHITE_BUNDLE.get());
                output.accept(NeoForgeItems.LIGHT_GRAY_BUNDLE.get());
                output.accept(NeoForgeItems.GRAY_BUNDLE.get());
                output.accept(NeoForgeItems.BLACK_BUNDLE.get());
                output.accept(NeoForgeItems.BROWN_BUNDLE.get());
                output.accept(NeoForgeItems.RED_BUNDLE.get());
                output.accept(NeoForgeItems.ORANGE_BUNDLE.get());
                output.accept(NeoForgeItems.YELLOW_BUNDLE.get());
                output.accept(NeoForgeItems.LIME_BUNDLE.get());
                output.accept(NeoForgeItems.GREEN_BUNDLE.get());
                output.accept(NeoForgeItems.CYAN_BUNDLE.get());
                output.accept(NeoForgeItems.LIGHT_BLUE_BUNDLE.get());
                output.accept(NeoForgeItems.BLUE_BUNDLE.get());
                output.accept(NeoForgeItems.PURPLE_BUNDLE.get());
                output.accept(NeoForgeItems.MAGENTA_BUNDLE.get());
                output.accept(NeoForgeItems.PINK_BUNDLE.get());

                // Copper Colored Bundles
                output.accept(NeoForgeItems.COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.BLACK_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.BLUE_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.BROWN_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.CYAN_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.GRAY_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.GREEN_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.LIGHT_BLUE_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.LIGHT_GRAY_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.LIME_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.MAGENTA_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.ORANGE_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.PINK_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.PURPLE_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.RED_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.WHITE_COPPER_BUNDLE.get());
                output.accept(NeoForgeItems.YELLOW_COPPER_BUNDLE.get());

                // Iron Colored Bundles
                output.accept(NeoForgeItems.IRON_BUNDLE.get());
                output.accept(NeoForgeItems.BLACK_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.BLUE_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.BROWN_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.CYAN_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.GRAY_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.GREEN_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.LIGHT_BLUE_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.LIGHT_GRAY_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.LIME_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.MAGENTA_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.ORANGE_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.PINK_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.PURPLE_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.RED_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.WHITE_IRON_BUNDLE.get());
                output.accept(NeoForgeItems.YELLOW_IRON_BUNDLE.get());

                // Gold Colored Bundles
                output.accept(NeoForgeItems.GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.BLACK_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.BLUE_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.BROWN_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.CYAN_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.GRAY_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.GREEN_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.LIGHT_BLUE_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.LIGHT_GRAY_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.LIME_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.MAGENTA_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.ORANGE_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.PINK_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.PURPLE_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.RED_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.WHITE_GOLD_BUNDLE.get());
                output.accept(NeoForgeItems.YELLOW_GOLD_BUNDLE.get());

                // Diamond Colored Bundles
                output.accept(NeoForgeItems.DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.BLACK_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.BLUE_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.BROWN_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.CYAN_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.GRAY_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.GREEN_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.LIGHT_BLUE_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.LIGHT_GRAY_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.LIME_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.MAGENTA_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.ORANGE_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.PINK_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.PURPLE_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.RED_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.WHITE_DIAMOND_BUNDLE.get());
                output.accept(NeoForgeItems.YELLOW_DIAMOND_BUNDLE.get());

                // Netherite Colored Bundles
                output.accept(NeoForgeItems.NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.BLACK_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.BLUE_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.BROWN_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.CYAN_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.GRAY_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.GREEN_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.LIGHT_BLUE_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.LIGHT_GRAY_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.LIME_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.MAGENTA_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.ORANGE_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.PINK_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.PURPLE_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.RED_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.WHITE_NETHERITE_BUNDLE.get());
                output.accept(NeoForgeItems.YELLOW_NETHERITE_BUNDLE.get());

                // Emerald Colored Bundles
                output.accept(NeoForgeItems.EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.BLACK_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.BLUE_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.BROWN_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.CYAN_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.GRAY_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.GREEN_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.LIGHT_BLUE_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.LIGHT_GRAY_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.LIME_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.MAGENTA_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.ORANGE_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.PINK_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.PURPLE_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.RED_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.WHITE_EMERALD_BUNDLE.get());
                output.accept(NeoForgeItems.YELLOW_EMERALD_BUNDLE.get());
            }).build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}

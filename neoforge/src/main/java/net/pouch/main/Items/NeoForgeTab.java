package net.pouch.main.Items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pouch.main.Main;

public class NeoForgeTab {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> POUCH_TIERS = TABS.register("pouch_tiers", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.pouch.pouch_tiers")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> NeoForgeItems.COPPER_POUCH.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(NeoForgeItems.POUCH.get());
                output.accept(NeoForgeItems.WHITE_POUCH.get());
                output.accept(NeoForgeItems.LIGHT_GRAY_POUCH.get());
                output.accept(NeoForgeItems.GRAY_POUCH.get());
                output.accept(NeoForgeItems.BLACK_POUCH.get());
                output.accept(NeoForgeItems.BROWN_POUCH.get());
                output.accept(NeoForgeItems.RED_POUCH.get());
                output.accept(NeoForgeItems.ORANGE_POUCH.get());
                output.accept(NeoForgeItems.YELLOW_POUCH.get());
                output.accept(NeoForgeItems.LIME_POUCH.get());
                output.accept(NeoForgeItems.GREEN_POUCH.get());
                output.accept(NeoForgeItems.CYAN_POUCH.get());
                output.accept(NeoForgeItems.LIGHT_BLUE_POUCH.get());
                output.accept(NeoForgeItems.BLUE_POUCH.get());
                output.accept(NeoForgeItems.PURPLE_POUCH.get());
                output.accept(NeoForgeItems.MAGENTA_POUCH.get());
                output.accept(NeoForgeItems.PINK_POUCH.get());

                // Copper Colored Pouches
                output.accept(NeoForgeItems.COPPER_POUCH.get());
                output.accept(NeoForgeItems.BLACK_COPPER_POUCH.get());
                output.accept(NeoForgeItems.BLUE_COPPER_POUCH.get());
                output.accept(NeoForgeItems.BROWN_COPPER_POUCH.get());
                output.accept(NeoForgeItems.CYAN_COPPER_POUCH.get());
                output.accept(NeoForgeItems.GRAY_COPPER_POUCH.get());
                output.accept(NeoForgeItems.GREEN_COPPER_POUCH.get());
                output.accept(NeoForgeItems.LIGHT_BLUE_COPPER_POUCH.get());
                output.accept(NeoForgeItems.LIGHT_GRAY_COPPER_POUCH.get());
                output.accept(NeoForgeItems.LIME_COPPER_POUCH.get());
                output.accept(NeoForgeItems.MAGENTA_COPPER_POUCH.get());
                output.accept(NeoForgeItems.ORANGE_COPPER_POUCH.get());
                output.accept(NeoForgeItems.PINK_COPPER_POUCH.get());
                output.accept(NeoForgeItems.PURPLE_COPPER_POUCH.get());
                output.accept(NeoForgeItems.RED_COPPER_POUCH.get());
                output.accept(NeoForgeItems.WHITE_COPPER_POUCH.get());
                output.accept(NeoForgeItems.YELLOW_COPPER_POUCH.get());

                // Iron Colored Pouches
                output.accept(NeoForgeItems.IRON_POUCH.get());
                output.accept(NeoForgeItems.BLACK_IRON_POUCH.get());
                output.accept(NeoForgeItems.BLUE_IRON_POUCH.get());
                output.accept(NeoForgeItems.BROWN_IRON_POUCH.get());
                output.accept(NeoForgeItems.CYAN_IRON_POUCH.get());
                output.accept(NeoForgeItems.GRAY_IRON_POUCH.get());
                output.accept(NeoForgeItems.GREEN_IRON_POUCH.get());
                output.accept(NeoForgeItems.LIGHT_BLUE_IRON_POUCH.get());
                output.accept(NeoForgeItems.LIGHT_GRAY_IRON_POUCH.get());
                output.accept(NeoForgeItems.LIME_IRON_POUCH.get());
                output.accept(NeoForgeItems.MAGENTA_IRON_POUCH.get());
                output.accept(NeoForgeItems.ORANGE_IRON_POUCH.get());
                output.accept(NeoForgeItems.PINK_IRON_POUCH.get());
                output.accept(NeoForgeItems.PURPLE_IRON_POUCH.get());
                output.accept(NeoForgeItems.RED_IRON_POUCH.get());
                output.accept(NeoForgeItems.WHITE_IRON_POUCH.get());
                output.accept(NeoForgeItems.YELLOW_IRON_POUCH.get());

                // Gold Colored Pouches
                output.accept(NeoForgeItems.GOLD_POUCH.get());
                output.accept(NeoForgeItems.BLACK_GOLD_POUCH.get());
                output.accept(NeoForgeItems.BLUE_GOLD_POUCH.get());
                output.accept(NeoForgeItems.BROWN_GOLD_POUCH.get());
                output.accept(NeoForgeItems.CYAN_GOLD_POUCH.get());
                output.accept(NeoForgeItems.GRAY_GOLD_POUCH.get());
                output.accept(NeoForgeItems.GREEN_GOLD_POUCH.get());
                output.accept(NeoForgeItems.LIGHT_BLUE_GOLD_POUCH.get());
                output.accept(NeoForgeItems.LIGHT_GRAY_GOLD_POUCH.get());
                output.accept(NeoForgeItems.LIME_GOLD_POUCH.get());
                output.accept(NeoForgeItems.MAGENTA_GOLD_POUCH.get());
                output.accept(NeoForgeItems.ORANGE_GOLD_POUCH.get());
                output.accept(NeoForgeItems.PINK_GOLD_POUCH.get());
                output.accept(NeoForgeItems.PURPLE_GOLD_POUCH.get());
                output.accept(NeoForgeItems.RED_GOLD_POUCH.get());
                output.accept(NeoForgeItems.WHITE_GOLD_POUCH.get());
                output.accept(NeoForgeItems.YELLOW_GOLD_POUCH.get());

                // Diamond Colored Pouches
                output.accept(NeoForgeItems.DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.BLACK_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.BLUE_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.BROWN_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.CYAN_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.GRAY_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.GREEN_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.LIGHT_BLUE_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.LIGHT_GRAY_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.LIME_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.MAGENTA_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.ORANGE_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.PINK_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.PURPLE_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.RED_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.WHITE_DIAMOND_POUCH.get());
                output.accept(NeoForgeItems.YELLOW_DIAMOND_POUCH.get());

                // Netherite Colored Pouches
                output.accept(NeoForgeItems.NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.BLACK_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.BLUE_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.BROWN_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.CYAN_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.GRAY_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.GREEN_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.LIGHT_BLUE_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.LIGHT_GRAY_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.LIME_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.MAGENTA_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.ORANGE_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.PINK_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.PURPLE_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.RED_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.WHITE_NETHERITE_POUCH.get());
                output.accept(NeoForgeItems.YELLOW_NETHERITE_POUCH.get());

                // Emerald Colored Pouches
                output.accept(NeoForgeItems.EMERALD_POUCH.get());
                output.accept(NeoForgeItems.BLACK_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.BLUE_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.BROWN_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.CYAN_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.GRAY_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.GREEN_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.LIGHT_BLUE_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.LIGHT_GRAY_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.LIME_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.MAGENTA_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.ORANGE_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.PINK_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.PURPLE_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.RED_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.WHITE_EMERALD_POUCH.get());
                output.accept(NeoForgeItems.YELLOW_EMERALD_POUCH.get());
            }).build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}

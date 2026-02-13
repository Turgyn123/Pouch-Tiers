package net.pouch.Items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.pouch.main.Main;

import java.util.function.Supplier;

public class ForgeTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);

    private static final CreativeModeTab.DisplayItemsGenerator MAIN_TAB_ITEMS = (params, output) -> {
        output.accept(ForgeItems.POUCH.get());
        output.accept(ForgeItems.WHITE_POUCH.get());
        output.accept(ForgeItems.LIGHT_GRAY_POUCH.get());
        output.accept(ForgeItems.GRAY_POUCH.get());
        output.accept(ForgeItems.BLACK_POUCH.get());
        output.accept(ForgeItems.BROWN_POUCH.get());
        output.accept(ForgeItems.RED_POUCH.get());
        output.accept(ForgeItems.ORANGE_POUCH.get());
        output.accept(ForgeItems.YELLOW_POUCH.get());
        output.accept(ForgeItems.LIME_POUCH.get());
        output.accept(ForgeItems.GREEN_POUCH.get());
        output.accept(ForgeItems.CYAN_POUCH.get());
        output.accept(ForgeItems.LIGHT_BLUE_POUCH.get());
        output.accept(ForgeItems.BLUE_POUCH.get());
        output.accept(ForgeItems.PURPLE_POUCH.get());
        output.accept(ForgeItems.MAGENTA_POUCH.get());
        output.accept(ForgeItems.PINK_POUCH.get());
        output.accept(ForgeItems.COPPER_POUCH.get());
        output.accept(ForgeItems.IRON_POUCH.get());
        output.accept(ForgeItems.GOLD_POUCH.get());
        output.accept(ForgeItems.DIAMOND_POUCH.get());
        output.accept(ForgeItems.NETHERITE_POUCH.get());
        output.accept(ForgeItems.EMERALD_POUCH.get());

        // Copper Colored Pouches
        output.accept(ForgeItems.BLACK_COPPER_POUCH.get());
        output.accept(ForgeItems.BLUE_COPPER_POUCH.get());
        output.accept(ForgeItems.BROWN_COPPER_POUCH.get());
        output.accept(ForgeItems.CYAN_COPPER_POUCH.get());
        output.accept(ForgeItems.GRAY_COPPER_POUCH.get());
        output.accept(ForgeItems.GREEN_COPPER_POUCH.get());
        output.accept(ForgeItems.LIGHT_BLUE_COPPER_POUCH.get());
        output.accept(ForgeItems.LIGHT_GRAY_COPPER_POUCH.get());
        output.accept(ForgeItems.LIME_COPPER_POUCH.get());
        output.accept(ForgeItems.MAGENTA_COPPER_POUCH.get());
        output.accept(ForgeItems.ORANGE_COPPER_POUCH.get());
        output.accept(ForgeItems.PINK_COPPER_POUCH.get());
        output.accept(ForgeItems.PURPLE_COPPER_POUCH.get());
        output.accept(ForgeItems.RED_COPPER_POUCH.get());
        output.accept(ForgeItems.WHITE_COPPER_POUCH.get());
        output.accept(ForgeItems.YELLOW_COPPER_POUCH.get());

        // Iron Colored Pouches
        output.accept(ForgeItems.BLACK_IRON_POUCH.get());
        output.accept(ForgeItems.BLUE_IRON_POUCH.get());
        output.accept(ForgeItems.BROWN_IRON_POUCH.get());
        output.accept(ForgeItems.CYAN_IRON_POUCH.get());
        output.accept(ForgeItems.GRAY_IRON_POUCH.get());
        output.accept(ForgeItems.GREEN_IRON_POUCH.get());
        output.accept(ForgeItems.LIGHT_BLUE_IRON_POUCH.get());
        output.accept(ForgeItems.LIGHT_GRAY_IRON_POUCH.get());
        output.accept(ForgeItems.LIME_IRON_POUCH.get());
        output.accept(ForgeItems.MAGENTA_IRON_POUCH.get());
        output.accept(ForgeItems.ORANGE_IRON_POUCH.get());
        output.accept(ForgeItems.PINK_IRON_POUCH.get());
        output.accept(ForgeItems.PURPLE_IRON_POUCH.get());
        output.accept(ForgeItems.RED_IRON_POUCH.get());
        output.accept(ForgeItems.WHITE_IRON_POUCH.get());
        output.accept(ForgeItems.YELLOW_IRON_POUCH.get());

        // Gold Colored Pouches
        output.accept(ForgeItems.BLACK_GOLD_POUCH.get());
        output.accept(ForgeItems.BLUE_GOLD_POUCH.get());
        output.accept(ForgeItems.BROWN_GOLD_POUCH.get());
        output.accept(ForgeItems.CYAN_GOLD_POUCH.get());
        output.accept(ForgeItems.GRAY_GOLD_POUCH.get());
        output.accept(ForgeItems.GREEN_GOLD_POUCH.get());
        output.accept(ForgeItems.LIGHT_BLUE_GOLD_POUCH.get());
        output.accept(ForgeItems.LIGHT_GRAY_GOLD_POUCH.get());
        output.accept(ForgeItems.LIME_GOLD_POUCH.get());
        output.accept(ForgeItems.MAGENTA_GOLD_POUCH.get());
        output.accept(ForgeItems.ORANGE_GOLD_POUCH.get());
        output.accept(ForgeItems.PINK_GOLD_POUCH.get());
        output.accept(ForgeItems.PURPLE_GOLD_POUCH.get());
        output.accept(ForgeItems.RED_GOLD_POUCH.get());
        output.accept(ForgeItems.WHITE_GOLD_POUCH.get());
        output.accept(ForgeItems.YELLOW_GOLD_POUCH.get());

        // Diamond Colored Pouches
        output.accept(ForgeItems.BLACK_DIAMOND_POUCH.get());
        output.accept(ForgeItems.BLUE_DIAMOND_POUCH.get());
        output.accept(ForgeItems.BROWN_DIAMOND_POUCH.get());
        output.accept(ForgeItems.CYAN_DIAMOND_POUCH.get());
        output.accept(ForgeItems.GRAY_DIAMOND_POUCH.get());
        output.accept(ForgeItems.GREEN_DIAMOND_POUCH.get());
        output.accept(ForgeItems.LIGHT_BLUE_DIAMOND_POUCH.get());
        output.accept(ForgeItems.LIGHT_GRAY_DIAMOND_POUCH.get());
        output.accept(ForgeItems.LIME_DIAMOND_POUCH.get());
        output.accept(ForgeItems.MAGENTA_DIAMOND_POUCH.get());
        output.accept(ForgeItems.ORANGE_DIAMOND_POUCH.get());
        output.accept(ForgeItems.PINK_DIAMOND_POUCH.get());
        output.accept(ForgeItems.PURPLE_DIAMOND_POUCH.get());
        output.accept(ForgeItems.RED_DIAMOND_POUCH.get());
        output.accept(ForgeItems.WHITE_DIAMOND_POUCH.get());
        output.accept(ForgeItems.YELLOW_DIAMOND_POUCH.get());

        // Netherite Colored Pouches
        output.accept(ForgeItems.BLACK_NETHERITE_POUCH.get());
        output.accept(ForgeItems.BLUE_NETHERITE_POUCH.get());
        output.accept(ForgeItems.BROWN_NETHERITE_POUCH.get());
        output.accept(ForgeItems.CYAN_NETHERITE_POUCH.get());
        output.accept(ForgeItems.GRAY_NETHERITE_POUCH.get());
        output.accept(ForgeItems.GREEN_NETHERITE_POUCH.get());
        output.accept(ForgeItems.LIGHT_BLUE_NETHERITE_POUCH.get());
        output.accept(ForgeItems.LIGHT_GRAY_NETHERITE_POUCH.get());
        output.accept(ForgeItems.LIME_NETHERITE_POUCH.get());
        output.accept(ForgeItems.MAGENTA_NETHERITE_POUCH.get());
        output.accept(ForgeItems.ORANGE_NETHERITE_POUCH.get());
        output.accept(ForgeItems.PINK_NETHERITE_POUCH.get());
        output.accept(ForgeItems.PURPLE_NETHERITE_POUCH.get());
        output.accept(ForgeItems.RED_NETHERITE_POUCH.get());
        output.accept(ForgeItems.WHITE_NETHERITE_POUCH.get());
        output.accept(ForgeItems.YELLOW_NETHERITE_POUCH.get());

        // Emerald Colored Pouches
        output.accept(ForgeItems.BLACK_EMERALD_POUCH.get());
        output.accept(ForgeItems.BLUE_EMERALD_POUCH.get());
        output.accept(ForgeItems.BROWN_EMERALD_POUCH.get());
        output.accept(ForgeItems.CYAN_EMERALD_POUCH.get());
        output.accept(ForgeItems.GRAY_EMERALD_POUCH.get());
        output.accept(ForgeItems.GREEN_EMERALD_POUCH.get());
        output.accept(ForgeItems.LIGHT_BLUE_EMERALD_POUCH.get());
        output.accept(ForgeItems.LIGHT_GRAY_EMERALD_POUCH.get());
        output.accept(ForgeItems.LIME_EMERALD_POUCH.get());
        output.accept(ForgeItems.MAGENTA_EMERALD_POUCH.get());
        output.accept(ForgeItems.ORANGE_EMERALD_POUCH.get());
        output.accept(ForgeItems.PINK_EMERALD_POUCH.get());
        output.accept(ForgeItems.PURPLE_EMERALD_POUCH.get());
        output.accept(ForgeItems.RED_EMERALD_POUCH.get());
        output.accept(ForgeItems.WHITE_EMERALD_POUCH.get());
        output.accept(ForgeItems.YELLOW_EMERALD_POUCH.get());
    };

    public static final Supplier<CreativeModeTab> POUCH_TIERS = TABS.register("pouch_tiers",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)  // Tab placement: top row, first position.
                    .title(Component.translatable("itemGroup.pouch.pouch_tiers"))  // Tab name.
                    .icon(() -> new ItemStack(ForgeItems.COPPER_POUCH.get()))  // Tab icon
                    .displayItems(MAIN_TAB_ITEMS)
                    .build()
    );

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}

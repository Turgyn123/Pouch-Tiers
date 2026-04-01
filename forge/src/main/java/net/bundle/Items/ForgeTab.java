package net.bundle.Items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.bundle.main.Main;

import java.util.function.Supplier;

public class ForgeTab {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);

    private static final CreativeModeTab.DisplayItemsGenerator MAIN_TAB_ITEMS = (params, output) -> {
        output.accept(ForgeItems.BUNDLE.get());
        output.accept(ForgeItems.WHITE_BUNDLE.get());
        output.accept(ForgeItems.LIGHT_GRAY_BUNDLE.get());
        output.accept(ForgeItems.GRAY_BUNDLE.get());
        output.accept(ForgeItems.BLACK_BUNDLE.get());
        output.accept(ForgeItems.BROWN_BUNDLE.get());
        output.accept(ForgeItems.RED_BUNDLE.get());
        output.accept(ForgeItems.ORANGE_BUNDLE.get());
        output.accept(ForgeItems.YELLOW_BUNDLE.get());
        output.accept(ForgeItems.LIME_BUNDLE.get());
        output.accept(ForgeItems.GREEN_BUNDLE.get());
        output.accept(ForgeItems.CYAN_BUNDLE.get());
        output.accept(ForgeItems.LIGHT_BLUE_BUNDLE.get());
        output.accept(ForgeItems.BLUE_BUNDLE.get());
        output.accept(ForgeItems.PURPLE_BUNDLE.get());
        output.accept(ForgeItems.MAGENTA_BUNDLE.get());
        output.accept(ForgeItems.PINK_BUNDLE.get());
        output.accept(ForgeItems.COPPER_BUNDLE.get());
        output.accept(ForgeItems.IRON_BUNDLE.get());
        output.accept(ForgeItems.GOLD_BUNDLE.get());
        output.accept(ForgeItems.DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.EMERALD_BUNDLE.get());

        // Copper Colored Bundles
        output.accept(ForgeItems.BLACK_COPPER_BUNDLE.get());
        output.accept(ForgeItems.BLUE_COPPER_BUNDLE.get());
        output.accept(ForgeItems.BROWN_COPPER_BUNDLE.get());
        output.accept(ForgeItems.CYAN_COPPER_BUNDLE.get());
        output.accept(ForgeItems.GRAY_COPPER_BUNDLE.get());
        output.accept(ForgeItems.GREEN_COPPER_BUNDLE.get());
        output.accept(ForgeItems.LIGHT_BLUE_COPPER_BUNDLE.get());
        output.accept(ForgeItems.LIGHT_GRAY_COPPER_BUNDLE.get());
        output.accept(ForgeItems.LIME_COPPER_BUNDLE.get());
        output.accept(ForgeItems.MAGENTA_COPPER_BUNDLE.get());
        output.accept(ForgeItems.ORANGE_COPPER_BUNDLE.get());
        output.accept(ForgeItems.PINK_COPPER_BUNDLE.get());
        output.accept(ForgeItems.PURPLE_COPPER_BUNDLE.get());
        output.accept(ForgeItems.RED_COPPER_BUNDLE.get());
        output.accept(ForgeItems.WHITE_COPPER_BUNDLE.get());
        output.accept(ForgeItems.YELLOW_COPPER_BUNDLE.get());

        // Iron Colored Bundles
        output.accept(ForgeItems.BLACK_IRON_BUNDLE.get());
        output.accept(ForgeItems.BLUE_IRON_BUNDLE.get());
        output.accept(ForgeItems.BROWN_IRON_BUNDLE.get());
        output.accept(ForgeItems.CYAN_IRON_BUNDLE.get());
        output.accept(ForgeItems.GRAY_IRON_BUNDLE.get());
        output.accept(ForgeItems.GREEN_IRON_BUNDLE.get());
        output.accept(ForgeItems.LIGHT_BLUE_IRON_BUNDLE.get());
        output.accept(ForgeItems.LIGHT_GRAY_IRON_BUNDLE.get());
        output.accept(ForgeItems.LIME_IRON_BUNDLE.get());
        output.accept(ForgeItems.MAGENTA_IRON_BUNDLE.get());
        output.accept(ForgeItems.ORANGE_IRON_BUNDLE.get());
        output.accept(ForgeItems.PINK_IRON_BUNDLE.get());
        output.accept(ForgeItems.PURPLE_IRON_BUNDLE.get());
        output.accept(ForgeItems.RED_IRON_BUNDLE.get());
        output.accept(ForgeItems.WHITE_IRON_BUNDLE.get());
        output.accept(ForgeItems.YELLOW_IRON_BUNDLE.get());

        // Gold Colored Bundles
        output.accept(ForgeItems.BLACK_GOLD_BUNDLE.get());
        output.accept(ForgeItems.BLUE_GOLD_BUNDLE.get());
        output.accept(ForgeItems.BROWN_GOLD_BUNDLE.get());
        output.accept(ForgeItems.CYAN_GOLD_BUNDLE.get());
        output.accept(ForgeItems.GRAY_GOLD_BUNDLE.get());
        output.accept(ForgeItems.GREEN_GOLD_BUNDLE.get());
        output.accept(ForgeItems.LIGHT_BLUE_GOLD_BUNDLE.get());
        output.accept(ForgeItems.LIGHT_GRAY_GOLD_BUNDLE.get());
        output.accept(ForgeItems.LIME_GOLD_BUNDLE.get());
        output.accept(ForgeItems.MAGENTA_GOLD_BUNDLE.get());
        output.accept(ForgeItems.ORANGE_GOLD_BUNDLE.get());
        output.accept(ForgeItems.PINK_GOLD_BUNDLE.get());
        output.accept(ForgeItems.PURPLE_GOLD_BUNDLE.get());
        output.accept(ForgeItems.RED_GOLD_BUNDLE.get());
        output.accept(ForgeItems.WHITE_GOLD_BUNDLE.get());
        output.accept(ForgeItems.YELLOW_GOLD_BUNDLE.get());

        // Diamond Colored Bundles
        output.accept(ForgeItems.BLACK_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.BLUE_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.BROWN_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.CYAN_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.GRAY_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.GREEN_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.LIGHT_BLUE_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.LIGHT_GRAY_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.LIME_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.MAGENTA_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.ORANGE_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.PINK_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.PURPLE_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.RED_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.WHITE_DIAMOND_BUNDLE.get());
        output.accept(ForgeItems.YELLOW_DIAMOND_BUNDLE.get());

        // Netherite Colored Bundles
        output.accept(ForgeItems.BLACK_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.BLUE_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.BROWN_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.CYAN_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.GRAY_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.GREEN_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.LIGHT_BLUE_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.LIGHT_GRAY_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.LIME_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.MAGENTA_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.ORANGE_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.PINK_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.PURPLE_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.RED_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.WHITE_NETHERITE_BUNDLE.get());
        output.accept(ForgeItems.YELLOW_NETHERITE_BUNDLE.get());

        // Emerald Colored Bundles
        output.accept(ForgeItems.BLACK_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.BLUE_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.BROWN_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.CYAN_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.GRAY_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.GREEN_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.LIGHT_BLUE_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.LIGHT_GRAY_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.LIME_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.MAGENTA_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.ORANGE_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.PINK_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.PURPLE_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.RED_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.WHITE_EMERALD_BUNDLE.get());
        output.accept(ForgeItems.YELLOW_EMERALD_BUNDLE.get());
    };

    public static final Supplier<CreativeModeTab> BUNDLE_TIERS = TABS.register("bundle_tiers",
            () -> CreativeModeTab.builder(CreativeModeTab.Row.TOP, 0)  // Tab placement: top row, first position.
                    .title(Component.translatable("itemGroup.bundle.bundle_tiers"))  // Tab name.
                    .icon(() -> new ItemStack(ForgeItems.COPPER_BUNDLE.get()))  // Tab icon
                    .displayItems(MAIN_TAB_ITEMS)
                    .build()
    );

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}

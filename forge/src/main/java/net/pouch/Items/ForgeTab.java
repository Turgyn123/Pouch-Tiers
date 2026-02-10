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

package net.pouch.main;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pouch.main.gui.ModMenuTypes;
import net.pouch.main.gui.PouchMenu;

public class NeoForgeMenus {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, Main.MOD_ID);

    public static final DeferredHolder<MenuType<?>, MenuType<PouchMenu>> POUCH_MENU = MENUS.register("pouch_menu",
            () -> new MenuType<>(PouchMenu::new, FeatureFlagSet.of()));

    public static void register(IEventBus bus) {
        MENUS.register(bus);
        bus.addListener((FMLCommonSetupEvent event) -> {
            ModMenuTypes.POUCH_MENU = POUCH_MENU.get();
        });
    }
}

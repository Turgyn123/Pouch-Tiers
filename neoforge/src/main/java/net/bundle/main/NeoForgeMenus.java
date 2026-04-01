package net.bundle.main;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.bundle.main.gui.ModMenuTypes;
import net.bundle.main.gui.BundleMenu;

public class NeoForgeMenus {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(Registries.MENU, Main.MOD_ID);

    public static final DeferredHolder<MenuType<?>, MenuType<BundleMenu>> BUNDLE_MENU = MENUS.register("bundle_menu",
            () -> new MenuType<>(BundleMenu::new, FeatureFlagSet.of()));

    public static void register(IEventBus bus) {
        MENUS.register(bus);
        bus.addListener((FMLCommonSetupEvent event) -> {
            ModMenuTypes.BUNDLE_MENU = BUNDLE_MENU.get();
        });
    }
}

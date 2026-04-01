package net.bundle.main;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.bundle.main.gui.ModMenuTypes;
import net.bundle.main.gui.BundleMenu;

public class ForgeMenus {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Main.MOD_ID);

    public static final RegistryObject<MenuType<BundleMenu>> BUNDLE_MENU = MENUS.register("bundle_menu",
            () -> new MenuType<>(BundleMenu::new, FeatureFlagSet.of()));

    public static void register(IEventBus bus) {
        MENUS.register(bus);
        bus.addListener((FMLCommonSetupEvent event) -> {
            ModMenuTypes.BUNDLE_MENU = BUNDLE_MENU.get();
        });
    }
}

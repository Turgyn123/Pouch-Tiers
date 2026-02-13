package net.pouch.main;

import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pouch.main.gui.ModMenuTypes;
import net.pouch.main.gui.PouchMenu;

public class ForgeMenus {
    public static final DeferredRegister<MenuType<?>> MENUS = DeferredRegister.create(ForgeRegistries.MENU_TYPES, Main.MOD_ID);

    public static final RegistryObject<MenuType<PouchMenu>> POUCH_MENU = MENUS.register("pouch_menu",
            () -> new MenuType<>(PouchMenu::new, FeatureFlagSet.of()));

    public static void register(IEventBus bus) {
        MENUS.register(bus);
        bus.addListener((FMLCommonSetupEvent event) -> {
            ModMenuTypes.POUCH_MENU = POUCH_MENU.get();
        });
    }
}

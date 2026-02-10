package net.pouch.main;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.pouch.Items.ForgeItems;
import net.pouch.Items.ForgeTab;

@Mod(Main.MOD_ID)
public class ForgeMain {

    public ForgeMain() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ForgeItems.register(eventBus);
        ForgeTab.register(eventBus);
        Main.init();
    }
}
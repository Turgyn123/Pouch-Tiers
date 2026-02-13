package net.pouch.main;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.pouch.main.Items.NeoForgeItems;
import net.pouch.main.Items.NeoForgeTab;

@Mod(Main.MOD_ID)
public class NeoForgeMain {

    public NeoForgeMain(IEventBus eventBus) {
        NeoForgeItems.register(eventBus);
        NeoForgeTab.register(eventBus);
        NeoForgeMenus.register(eventBus);
        Main.init();

    }
}
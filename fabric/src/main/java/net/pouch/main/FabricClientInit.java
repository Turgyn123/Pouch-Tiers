package net.pouch.main;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screens.MenuScreens;
import net.pouch.main.gui.ModMenuTypes;
import net.pouch.main.gui.PouchScreen;

public class FabricClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MenuScreens.register(ModMenuTypes.POUCH_MENU, PouchScreen::new);
    }
}

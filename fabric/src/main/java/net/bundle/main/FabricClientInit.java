package net.bundle.main;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.gui.screens.MenuScreens;
import net.bundle.main.gui.ModMenuTypes;
import net.bundle.main.gui.BundleScreen;

public class FabricClientInit implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        MenuScreens.register(ModMenuTypes.BUNDLE_MENU, BundleScreen::new);
    }
}

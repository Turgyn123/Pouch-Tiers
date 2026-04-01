package net.bundle.main;

import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.bundle.main.gui.ModMenuTypes;
import net.bundle.main.gui.BundleScreen;

@EventBusSubscriber(modid = Main.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class NeoForgeClientSetup {

    @SubscribeEvent
    public static void onRegisterMenuScreens(RegisterMenuScreensEvent event) {
        event.register(ModMenuTypes.BUNDLE_MENU, BundleScreen::new);
    }
}

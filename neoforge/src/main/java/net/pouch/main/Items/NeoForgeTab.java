package net.pouch.main.Items;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.pouch.main.Main;

public class NeoForgeTab {

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Main.MOD_ID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> POUCH_TIERS = TABS.register("pouch_tiers", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.pouch.pouch_tiers")) //The language key for the title of your CreativeModeTab
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(() -> NeoForgeItems.COPPER_POUCH.get().getDefaultInstance())
            .displayItems((parameters, output) -> {
                output.accept(NeoForgeItems.COPPER_POUCH.get());
            }).build());

    public static void register(IEventBus eventBus) {
        TABS.register(eventBus);
    }
}

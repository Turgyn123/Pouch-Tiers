package net.pouch.main.Items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.pouch.Items.PouchTiers.CopperPouch;
import net.pouch.main.Main;

public class NeoForgeItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MOD_ID);

    public static final DeferredItem<Item> COPPER_POUCH = ITEMS.register("copper_pouch", () -> new CopperPouch(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

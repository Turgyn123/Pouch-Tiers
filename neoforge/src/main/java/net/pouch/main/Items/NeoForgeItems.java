package net.pouch.main.Items;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.pouch.Items.PouchTiers.*;
import net.pouch.main.Main;

public class NeoForgeItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MOD_ID);

    public static final DeferredItem<Item> COPPER_POUCH = ITEMS.register("copper_pouch", () -> new CopperPouch(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> IRON_POUCH = ITEMS.register("iron_pouch", () -> new IronPouch(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> GOLD_POUCH = ITEMS.register("gold_pouch", () -> new GoldPouch(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> DIAMOND_POUCH = ITEMS.register("diamond_pouch", () -> new DiamondPouch(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> NETHERITE_POUCH = ITEMS.register("netherite_pouch", () -> new NetheritePouch(new Item.Properties().stacksTo(1)));
    public static final DeferredItem<Item> EMERALD_POUCH = ITEMS.register("emerald_pouch", () -> new EmeraldPouch(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

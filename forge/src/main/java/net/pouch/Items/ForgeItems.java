package net.pouch.Items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pouch.Items.PouchTiers.*;
import net.pouch.main.Main;

public class ForgeItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    public static final RegistryObject<Item> COPPER_POUCH = ITEMS.register(ModItems.COPPER_POUCH, () -> new CopperPouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> IRON_POUCH = ITEMS.register(ModItems.IRON_POUCH, () -> new IronPouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GOLD_POUCH = ITEMS.register(ModItems.GOLD_POUCH, () -> new GoldPouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> DIAMOND_POUCH = ITEMS.register(ModItems.DIAMOND_POUCH, () -> new DiamondPouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> NETHERITE_POUCH = ITEMS.register(ModItems.NETHERITE_POUCH, () -> new NetheritePouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> EMERALD_POUCH = ITEMS.register(ModItems.EMERALD_POUCH, () -> new EmeraldPouch(new Item.Properties().stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

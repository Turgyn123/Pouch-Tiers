package net.pouch.Items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.pouch.Items.PouchTiers.*;
import net.pouch.Items.PouchTiers.pouch.*;
import net.pouch.main.Main;

public class ForgeItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MOD_ID);

    //pouches
    public static final RegistryObject<Item> POUCH = ITEMS.register(ModItems.POUCH, () -> new Pouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> WHITE_POUCH = ITEMS.register(ModItems.WHITE_POUCH, () -> new WhitePouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LIGHT_GRAY_POUCH = ITEMS.register(ModItems.LIGHT_GRAY_POUCH, () -> new LightGrayPouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GRAY_POUCH = ITEMS.register(ModItems.GRAY_POUCH, () -> new GrayPouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLACK_POUCH = ITEMS.register(ModItems.BLACK_POUCH, () -> new BlackPouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BROWN_POUCH = ITEMS.register(ModItems.BROWN_POUCH, () -> new BrownPouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> RED_POUCH = ITEMS.register(ModItems.RED_POUCH, () -> new RedPouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> ORANGE_POUCH = ITEMS.register(ModItems.ORANGE_POUCH, () -> new OrangePouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> YELLOW_POUCH = ITEMS.register(ModItems.YELLOW_POUCH, () -> new YellowPouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LIME_POUCH = ITEMS.register(ModItems.LIME_POUCH, () -> new LimePouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> GREEN_POUCH = ITEMS.register(ModItems.GREEN_POUCH, () -> new GreenPouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> CYAN_POUCH = ITEMS.register(ModItems.CYAN_POUCH, () -> new CyanPouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> LIGHT_BLUE_POUCH = ITEMS.register(ModItems.LIGHT_BLUE_POUCH, () -> new LightBluePouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> BLUE_POUCH = ITEMS.register(ModItems.BLUE_POUCH, () -> new BluePouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PURPLE_POUCH = ITEMS.register(ModItems.PURPLE_POUCH, () -> new PurplePouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> MAGENTA_POUCH = ITEMS.register(ModItems.MAGENTA_POUCH, () -> new MagentaPouch(new Item.Properties().stacksTo(1)));
    public static final RegistryObject<Item> PINK_POUCH = ITEMS.register(ModItems.PINK_POUCH, () -> new PinkPouch(new Item.Properties().stacksTo(1)));

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

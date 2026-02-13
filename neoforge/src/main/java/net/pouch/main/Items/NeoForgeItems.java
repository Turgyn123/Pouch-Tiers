package net.pouch.main.Items;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.BundleContents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.pouch.Items.ModItems;
import net.pouch.Items.PouchTiers.*;
import net.pouch.Items.PouchTiers.pouch.*;
import net.pouch.main.Main;

public class NeoForgeItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MOD_ID);

    private static Item.Properties pouchProps() {
        return new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY);
    }

    private static Item.Properties netheritePouchProps() {
        return pouchProps().fireResistant();
    }

    //pouches
    public static final DeferredItem<Item> POUCH = ITEMS.register("pouch", () -> new Pouch(pouchProps()));
    public static final DeferredItem<Item> WHITE_POUCH = ITEMS.register("white_pouch", () -> new WhitePouch(pouchProps()));
    public static final DeferredItem<Item> LIGHT_GRAY_POUCH = ITEMS.register("light_gray_pouch", () -> new LightGrayPouch(pouchProps()));
    public static final DeferredItem<Item> GRAY_POUCH = ITEMS.register("gray_pouch", () -> new GrayPouch(pouchProps()));
    public static final DeferredItem<Item> BLACK_POUCH = ITEMS.register("black_pouch", () -> new BlackPouch(pouchProps()));
    public static final DeferredItem<Item> BROWN_POUCH = ITEMS.register("brown_pouch", () -> new BrownPouch(pouchProps()));
    public static final DeferredItem<Item> RED_POUCH = ITEMS.register("red_pouch", () -> new RedPouch(pouchProps()));
    public static final DeferredItem<Item> ORANGE_POUCH = ITEMS.register("orange_pouch", () -> new OrangePouch(pouchProps()));
    public static final DeferredItem<Item> YELLOW_POUCH = ITEMS.register("yellow_pouch", () -> new YellowPouch(pouchProps()));
    public static final DeferredItem<Item> LIME_POUCH = ITEMS.register("lime_pouch", () -> new LimePouch(pouchProps()));
    public static final DeferredItem<Item> GREEN_POUCH = ITEMS.register("green_pouch", () -> new GreenPouch(pouchProps()));
    public static final DeferredItem<Item> CYAN_POUCH = ITEMS.register("cyan_pouch", () -> new CyanPouch(pouchProps()));
    public static final DeferredItem<Item> LIGHT_BLUE_POUCH = ITEMS.register("light_blue_pouch", () -> new LightBluePouch(pouchProps()));
    public static final DeferredItem<Item> BLUE_POUCH = ITEMS.register("blue_pouch", () -> new BluePouch(pouchProps()));
    public static final DeferredItem<Item> PURPLE_POUCH = ITEMS.register("purple_pouch", () -> new PurplePouch(pouchProps()));
    public static final DeferredItem<Item> MAGENTA_POUCH = ITEMS.register("magenta_pouch", () -> new MagentaPouch(pouchProps()));
    public static final DeferredItem<Item> PINK_POUCH = ITEMS.register("pink_pouch", () -> new PinkPouch(pouchProps()));

    public static final DeferredItem<Item> COPPER_POUCH = ITEMS.register("copper_pouch", () -> new CopperPouch(pouchProps()));
    public static final DeferredItem<Item> IRON_POUCH = ITEMS.register("iron_pouch", () -> new IronPouch(pouchProps()));
    public static final DeferredItem<Item> GOLD_POUCH = ITEMS.register("gold_pouch", () -> new GoldPouch(pouchProps()));
    public static final DeferredItem<Item> DIAMOND_POUCH = ITEMS.register("diamond_pouch", () -> new DiamondPouch(pouchProps()));
    public static final DeferredItem<Item> NETHERITE_POUCH = ITEMS.register("netherite_pouch", () -> new NetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> EMERALD_POUCH = ITEMS.register("emerald_pouch", () -> new EmeraldPouch(pouchProps()));


    // Copper Colored Pouches
    public static final DeferredItem<Item> BLACK_COPPER_POUCH = ITEMS.register(ModItems.BLACK_COPPER_POUCH, () -> new BlackCopperPouch(pouchProps()));
    public static final DeferredItem<Item> BLUE_COPPER_POUCH = ITEMS.register(ModItems.BLUE_COPPER_POUCH, () -> new BlueCopperPouch(pouchProps()));
    public static final DeferredItem<Item> BROWN_COPPER_POUCH = ITEMS.register(ModItems.BROWN_COPPER_POUCH, () -> new BrownCopperPouch(pouchProps()));
    public static final DeferredItem<Item> CYAN_COPPER_POUCH = ITEMS.register(ModItems.CYAN_COPPER_POUCH, () -> new CyanCopperPouch(pouchProps()));
    public static final DeferredItem<Item> GRAY_COPPER_POUCH = ITEMS.register(ModItems.GRAY_COPPER_POUCH, () -> new GrayCopperPouch(pouchProps()));
    public static final DeferredItem<Item> GREEN_COPPER_POUCH = ITEMS.register(ModItems.GREEN_COPPER_POUCH, () -> new GreenCopperPouch(pouchProps()));
    public static final DeferredItem<Item> LIGHT_BLUE_COPPER_POUCH = ITEMS.register(ModItems.LIGHT_BLUE_COPPER_POUCH, () -> new LightBlueCopperPouch(pouchProps()));
    public static final DeferredItem<Item> LIGHT_GRAY_COPPER_POUCH = ITEMS.register(ModItems.LIGHT_GRAY_COPPER_POUCH, () -> new LightGrayCopperPouch(pouchProps()));
    public static final DeferredItem<Item> LIME_COPPER_POUCH = ITEMS.register(ModItems.LIME_COPPER_POUCH, () -> new LimeCopperPouch(pouchProps()));
    public static final DeferredItem<Item> MAGENTA_COPPER_POUCH = ITEMS.register(ModItems.MAGENTA_COPPER_POUCH, () -> new MagentaCopperPouch(pouchProps()));
    public static final DeferredItem<Item> ORANGE_COPPER_POUCH = ITEMS.register(ModItems.ORANGE_COPPER_POUCH, () -> new OrangeCopperPouch(pouchProps()));
    public static final DeferredItem<Item> PINK_COPPER_POUCH = ITEMS.register(ModItems.PINK_COPPER_POUCH, () -> new PinkCopperPouch(pouchProps()));
    public static final DeferredItem<Item> PURPLE_COPPER_POUCH = ITEMS.register(ModItems.PURPLE_COPPER_POUCH, () -> new PurpleCopperPouch(pouchProps()));
    public static final DeferredItem<Item> RED_COPPER_POUCH = ITEMS.register(ModItems.RED_COPPER_POUCH, () -> new RedCopperPouch(pouchProps()));
    public static final DeferredItem<Item> WHITE_COPPER_POUCH = ITEMS.register(ModItems.WHITE_COPPER_POUCH, () -> new WhiteCopperPouch(pouchProps()));
    public static final DeferredItem<Item> YELLOW_COPPER_POUCH = ITEMS.register(ModItems.YELLOW_COPPER_POUCH, () -> new YellowCopperPouch(pouchProps()));

    // Iron Colored Pouches
    public static final DeferredItem<Item> BLACK_IRON_POUCH = ITEMS.register(ModItems.BLACK_IRON_POUCH, () -> new BlackIronPouch(pouchProps()));
    public static final DeferredItem<Item> BLUE_IRON_POUCH = ITEMS.register(ModItems.BLUE_IRON_POUCH, () -> new BlueIronPouch(pouchProps()));
    public static final DeferredItem<Item> BROWN_IRON_POUCH = ITEMS.register(ModItems.BROWN_IRON_POUCH, () -> new BrownIronPouch(pouchProps()));
    public static final DeferredItem<Item> CYAN_IRON_POUCH = ITEMS.register(ModItems.CYAN_IRON_POUCH, () -> new CyanIronPouch(pouchProps()));
    public static final DeferredItem<Item> GRAY_IRON_POUCH = ITEMS.register(ModItems.GRAY_IRON_POUCH, () -> new GrayIronPouch(pouchProps()));
    public static final DeferredItem<Item> GREEN_IRON_POUCH = ITEMS.register(ModItems.GREEN_IRON_POUCH, () -> new GreenIronPouch(pouchProps()));
    public static final DeferredItem<Item> LIGHT_BLUE_IRON_POUCH = ITEMS.register(ModItems.LIGHT_BLUE_IRON_POUCH, () -> new LightBlueIronPouch(pouchProps()));
    public static final DeferredItem<Item> LIGHT_GRAY_IRON_POUCH = ITEMS.register(ModItems.LIGHT_GRAY_IRON_POUCH, () -> new LightGrayIronPouch(pouchProps()));
    public static final DeferredItem<Item> LIME_IRON_POUCH = ITEMS.register(ModItems.LIME_IRON_POUCH, () -> new LimeIronPouch(pouchProps()));
    public static final DeferredItem<Item> MAGENTA_IRON_POUCH = ITEMS.register(ModItems.MAGENTA_IRON_POUCH, () -> new MagentaIronPouch(pouchProps()));
    public static final DeferredItem<Item> ORANGE_IRON_POUCH = ITEMS.register(ModItems.ORANGE_IRON_POUCH, () -> new OrangeIronPouch(pouchProps()));
    public static final DeferredItem<Item> PINK_IRON_POUCH = ITEMS.register(ModItems.PINK_IRON_POUCH, () -> new PinkIronPouch(pouchProps()));
    public static final DeferredItem<Item> PURPLE_IRON_POUCH = ITEMS.register(ModItems.PURPLE_IRON_POUCH, () -> new PurpleIronPouch(pouchProps()));
    public static final DeferredItem<Item> RED_IRON_POUCH = ITEMS.register(ModItems.RED_IRON_POUCH, () -> new RedIronPouch(pouchProps()));
    public static final DeferredItem<Item> WHITE_IRON_POUCH = ITEMS.register(ModItems.WHITE_IRON_POUCH, () -> new WhiteIronPouch(pouchProps()));
    public static final DeferredItem<Item> YELLOW_IRON_POUCH = ITEMS.register(ModItems.YELLOW_IRON_POUCH, () -> new YellowIronPouch(pouchProps()));

    // Gold Colored Pouches
    public static final DeferredItem<Item> BLACK_GOLD_POUCH = ITEMS.register(ModItems.BLACK_GOLD_POUCH, () -> new BlackGoldPouch(pouchProps()));
    public static final DeferredItem<Item> BLUE_GOLD_POUCH = ITEMS.register(ModItems.BLUE_GOLD_POUCH, () -> new BlueGoldPouch(pouchProps()));
    public static final DeferredItem<Item> BROWN_GOLD_POUCH = ITEMS.register(ModItems.BROWN_GOLD_POUCH, () -> new BrownGoldPouch(pouchProps()));
    public static final DeferredItem<Item> CYAN_GOLD_POUCH = ITEMS.register(ModItems.CYAN_GOLD_POUCH, () -> new CyanGoldPouch(pouchProps()));
    public static final DeferredItem<Item> GRAY_GOLD_POUCH = ITEMS.register(ModItems.GRAY_GOLD_POUCH, () -> new GrayGoldPouch(pouchProps()));
    public static final DeferredItem<Item> GREEN_GOLD_POUCH = ITEMS.register(ModItems.GREEN_GOLD_POUCH, () -> new GreenGoldPouch(pouchProps()));
    public static final DeferredItem<Item> LIGHT_BLUE_GOLD_POUCH = ITEMS.register(ModItems.LIGHT_BLUE_GOLD_POUCH, () -> new LightBlueGoldPouch(pouchProps()));
    public static final DeferredItem<Item> LIGHT_GRAY_GOLD_POUCH = ITEMS.register(ModItems.LIGHT_GRAY_GOLD_POUCH, () -> new LightGrayGoldPouch(pouchProps()));
    public static final DeferredItem<Item> LIME_GOLD_POUCH = ITEMS.register(ModItems.LIME_GOLD_POUCH, () -> new LimeGoldPouch(pouchProps()));
    public static final DeferredItem<Item> MAGENTA_GOLD_POUCH = ITEMS.register(ModItems.MAGENTA_GOLD_POUCH, () -> new MagentaGoldPouch(pouchProps()));
    public static final DeferredItem<Item> ORANGE_GOLD_POUCH = ITEMS.register(ModItems.ORANGE_GOLD_POUCH, () -> new OrangeGoldPouch(pouchProps()));
    public static final DeferredItem<Item> PINK_GOLD_POUCH = ITEMS.register(ModItems.PINK_GOLD_POUCH, () -> new PinkGoldPouch(pouchProps()));
    public static final DeferredItem<Item> PURPLE_GOLD_POUCH = ITEMS.register(ModItems.PURPLE_GOLD_POUCH, () -> new PurpleGoldPouch(pouchProps()));
    public static final DeferredItem<Item> RED_GOLD_POUCH = ITEMS.register(ModItems.RED_GOLD_POUCH, () -> new RedGoldPouch(pouchProps()));
    public static final DeferredItem<Item> WHITE_GOLD_POUCH = ITEMS.register(ModItems.WHITE_GOLD_POUCH, () -> new WhiteGoldPouch(pouchProps()));
    public static final DeferredItem<Item> YELLOW_GOLD_POUCH = ITEMS.register(ModItems.YELLOW_GOLD_POUCH, () -> new YellowGoldPouch(pouchProps()));

    // Diamond Colored Pouches
    public static final DeferredItem<Item> BLACK_DIAMOND_POUCH = ITEMS.register(ModItems.BLACK_DIAMOND_POUCH, () -> new BlackDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> BLUE_DIAMOND_POUCH = ITEMS.register(ModItems.BLUE_DIAMOND_POUCH, () -> new BlueDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> BROWN_DIAMOND_POUCH = ITEMS.register(ModItems.BROWN_DIAMOND_POUCH, () -> new BrownDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> CYAN_DIAMOND_POUCH = ITEMS.register(ModItems.CYAN_DIAMOND_POUCH, () -> new CyanDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> GRAY_DIAMOND_POUCH = ITEMS.register(ModItems.GRAY_DIAMOND_POUCH, () -> new GrayDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> GREEN_DIAMOND_POUCH = ITEMS.register(ModItems.GREEN_DIAMOND_POUCH, () -> new GreenDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> LIGHT_BLUE_DIAMOND_POUCH = ITEMS.register(ModItems.LIGHT_BLUE_DIAMOND_POUCH, () -> new LightBlueDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> LIGHT_GRAY_DIAMOND_POUCH = ITEMS.register(ModItems.LIGHT_GRAY_DIAMOND_POUCH, () -> new LightGrayDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> LIME_DIAMOND_POUCH = ITEMS.register(ModItems.LIME_DIAMOND_POUCH, () -> new LimeDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> MAGENTA_DIAMOND_POUCH = ITEMS.register(ModItems.MAGENTA_DIAMOND_POUCH, () -> new MagentaDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> ORANGE_DIAMOND_POUCH = ITEMS.register(ModItems.ORANGE_DIAMOND_POUCH, () -> new OrangeDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> PINK_DIAMOND_POUCH = ITEMS.register(ModItems.PINK_DIAMOND_POUCH, () -> new PinkDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> PURPLE_DIAMOND_POUCH = ITEMS.register(ModItems.PURPLE_DIAMOND_POUCH, () -> new PurpleDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> RED_DIAMOND_POUCH = ITEMS.register(ModItems.RED_DIAMOND_POUCH, () -> new RedDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> WHITE_DIAMOND_POUCH = ITEMS.register(ModItems.WHITE_DIAMOND_POUCH, () -> new WhiteDiamondPouch(pouchProps()));
    public static final DeferredItem<Item> YELLOW_DIAMOND_POUCH = ITEMS.register(ModItems.YELLOW_DIAMOND_POUCH, () -> new YellowDiamondPouch(pouchProps()));

    // Netherite Colored Pouches
    public static final DeferredItem<Item> BLACK_NETHERITE_POUCH = ITEMS.register(ModItems.BLACK_NETHERITE_POUCH, () -> new BlackNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> BLUE_NETHERITE_POUCH = ITEMS.register(ModItems.BLUE_NETHERITE_POUCH, () -> new BlueNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> BROWN_NETHERITE_POUCH = ITEMS.register(ModItems.BROWN_NETHERITE_POUCH, () -> new BrownNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> CYAN_NETHERITE_POUCH = ITEMS.register(ModItems.CYAN_NETHERITE_POUCH, () -> new CyanNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> GRAY_NETHERITE_POUCH = ITEMS.register(ModItems.GRAY_NETHERITE_POUCH, () -> new GrayNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> GREEN_NETHERITE_POUCH = ITEMS.register(ModItems.GREEN_NETHERITE_POUCH, () -> new GreenNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> LIGHT_BLUE_NETHERITE_POUCH = ITEMS.register(ModItems.LIGHT_BLUE_NETHERITE_POUCH, () -> new LightBlueNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> LIGHT_GRAY_NETHERITE_POUCH = ITEMS.register(ModItems.LIGHT_GRAY_NETHERITE_POUCH, () -> new LightGrayNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> LIME_NETHERITE_POUCH = ITEMS.register(ModItems.LIME_NETHERITE_POUCH, () -> new LimeNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> MAGENTA_NETHERITE_POUCH = ITEMS.register(ModItems.MAGENTA_NETHERITE_POUCH, () -> new MagentaNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> ORANGE_NETHERITE_POUCH = ITEMS.register(ModItems.ORANGE_NETHERITE_POUCH, () -> new OrangeNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> PINK_NETHERITE_POUCH = ITEMS.register(ModItems.PINK_NETHERITE_POUCH, () -> new PinkNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> PURPLE_NETHERITE_POUCH = ITEMS.register(ModItems.PURPLE_NETHERITE_POUCH, () -> new PurpleNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> RED_NETHERITE_POUCH = ITEMS.register(ModItems.RED_NETHERITE_POUCH, () -> new RedNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> WHITE_NETHERITE_POUCH = ITEMS.register(ModItems.WHITE_NETHERITE_POUCH, () -> new WhiteNetheritePouch(netheritePouchProps()));
    public static final DeferredItem<Item> YELLOW_NETHERITE_POUCH = ITEMS.register(ModItems.YELLOW_NETHERITE_POUCH, () -> new YellowNetheritePouch(netheritePouchProps()));

    // Emerald Colored Pouches
    public static final DeferredItem<Item> BLACK_EMERALD_POUCH = ITEMS.register(ModItems.BLACK_EMERALD_POUCH, () -> new BlackEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> BLUE_EMERALD_POUCH = ITEMS.register(ModItems.BLUE_EMERALD_POUCH, () -> new BlueEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> BROWN_EMERALD_POUCH = ITEMS.register(ModItems.BROWN_EMERALD_POUCH, () -> new BrownEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> CYAN_EMERALD_POUCH = ITEMS.register(ModItems.CYAN_EMERALD_POUCH, () -> new CyanEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> GRAY_EMERALD_POUCH = ITEMS.register(ModItems.GRAY_EMERALD_POUCH, () -> new GrayEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> GREEN_EMERALD_POUCH = ITEMS.register(ModItems.GREEN_EMERALD_POUCH, () -> new GreenEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> LIGHT_BLUE_EMERALD_POUCH = ITEMS.register(ModItems.LIGHT_BLUE_EMERALD_POUCH, () -> new LightBlueEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> LIGHT_GRAY_EMERALD_POUCH = ITEMS.register(ModItems.LIGHT_GRAY_EMERALD_POUCH, () -> new LightGrayEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> LIME_EMERALD_POUCH = ITEMS.register(ModItems.LIME_EMERALD_POUCH, () -> new LimeEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> MAGENTA_EMERALD_POUCH = ITEMS.register(ModItems.MAGENTA_EMERALD_POUCH, () -> new MagentaEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> ORANGE_EMERALD_POUCH = ITEMS.register(ModItems.ORANGE_EMERALD_POUCH, () -> new OrangeEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> PINK_EMERALD_POUCH = ITEMS.register(ModItems.PINK_EMERALD_POUCH, () -> new PinkEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> PURPLE_EMERALD_POUCH = ITEMS.register(ModItems.PURPLE_EMERALD_POUCH, () -> new PurpleEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> RED_EMERALD_POUCH = ITEMS.register(ModItems.RED_EMERALD_POUCH, () -> new RedEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> WHITE_EMERALD_POUCH = ITEMS.register(ModItems.WHITE_EMERALD_POUCH, () -> new WhiteEmeraldPouch(pouchProps()));
    public static final DeferredItem<Item> YELLOW_EMERALD_POUCH = ITEMS.register(ModItems.YELLOW_EMERALD_POUCH, () -> new YellowEmeraldPouch(pouchProps()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

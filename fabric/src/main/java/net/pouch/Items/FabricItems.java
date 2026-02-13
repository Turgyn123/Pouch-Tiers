package net.pouch.Items;

import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.BundleContents;
import net.pouch.Items.PouchTiers.*;
import net.pouch.Items.PouchTiers.pouch.*;
import net.pouch.main.Main;

public class FabricItems {

    private static Item.Properties pouchProps() {
        return new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY);
    }

    private static Item.Properties netheritePouchProps() {
        return pouchProps().fireResistant();
    }

    //pouches
    public static final Item POUCH = register(ModItems.POUCH, new Pouch(pouchProps()));
    public static final Item WHITE_POUCH = register(ModItems.WHITE_POUCH, new WhitePouch(pouchProps()));
    public static final Item LIGHT_GRAY_POUCH = register(ModItems.LIGHT_GRAY_POUCH, new LightGrayPouch(pouchProps()));
    public static final Item GRAY_POUCH = register(ModItems.GRAY_POUCH, new GrayPouch(pouchProps()));
    public static final Item BLACK_POUCH = register(ModItems.BLACK_POUCH, new BlackPouch(pouchProps()));
    public static final Item BROWN_POUCH = register(ModItems.BROWN_POUCH, new BrownPouch(pouchProps()));
    public static final Item RED_POUCH = register(ModItems.RED_POUCH, new RedPouch(pouchProps()));
    public static final Item ORANGE_POUCH = register(ModItems.ORANGE_POUCH, new OrangePouch(pouchProps()));
    public static final Item YELLOW_POUCH = register(ModItems.YELLOW_POUCH, new YellowPouch(pouchProps()));
    public static final Item LIME_POUCH = register(ModItems.LIME_POUCH, new LimePouch(pouchProps()));
    public static final Item GREEN_POUCH = register(ModItems.GREEN_POUCH, new GreenPouch(pouchProps()));
    public static final Item CYAN_POUCH = register(ModItems.CYAN_POUCH, new CyanPouch(pouchProps()));
    public static final Item LIGHT_BLUE_POUCH = register(ModItems.LIGHT_BLUE_POUCH, new LightBluePouch(pouchProps()));
    public static final Item BLUE_POUCH = register(ModItems.BLUE_POUCH, new BluePouch(pouchProps()));
    public static final Item PURPLE_POUCH = register(ModItems.PURPLE_POUCH, new PurplePouch(pouchProps()));
    public static final Item MAGENTA_POUCH = register(ModItems.MAGENTA_POUCH, new MagentaPouch(pouchProps()));
    public static final Item PINK_POUCH = register(ModItems.PINK_POUCH, new PinkPouch(pouchProps()));

    public static final Item COPPER_POUCH = register(ModItems.COPPER_POUCH, new CopperPouch(pouchProps()));
    public static final Item IRON_POUCH = register(ModItems.IRON_POUCH, new IronPouch(pouchProps()));
    public static final Item GOLD_POUCH = register(ModItems.GOLD_POUCH, new GoldPouch(pouchProps()));
    public static final Item DIAMOND_POUCH = register(ModItems.DIAMOND_POUCH, new DiamondPouch(pouchProps()));
    public static final Item NETHERITE_POUCH = register(ModItems.NETHERITE_POUCH, new NetheritePouch(netheritePouchProps()));
    public static final Item EMERALD_POUCH = register(ModItems.EMERALD_POUCH, new EmeraldPouch(pouchProps()));


    // Copper Colored Pouches
    public static final Item BLACK_COPPER_POUCH = register(ModItems.BLACK_COPPER_POUCH, new BlackCopperPouch(pouchProps()));
    public static final Item BLUE_COPPER_POUCH = register(ModItems.BLUE_COPPER_POUCH, new BlueCopperPouch(pouchProps()));
    public static final Item BROWN_COPPER_POUCH = register(ModItems.BROWN_COPPER_POUCH, new BrownCopperPouch(pouchProps()));
    public static final Item CYAN_COPPER_POUCH = register(ModItems.CYAN_COPPER_POUCH, new CyanCopperPouch(pouchProps()));
    public static final Item GRAY_COPPER_POUCH = register(ModItems.GRAY_COPPER_POUCH, new GrayCopperPouch(pouchProps()));
    public static final Item GREEN_COPPER_POUCH = register(ModItems.GREEN_COPPER_POUCH, new GreenCopperPouch(pouchProps()));
    public static final Item LIGHT_BLUE_COPPER_POUCH = register(ModItems.LIGHT_BLUE_COPPER_POUCH, new LightBlueCopperPouch(pouchProps()));
    public static final Item LIGHT_GRAY_COPPER_POUCH = register(ModItems.LIGHT_GRAY_COPPER_POUCH, new LightGrayCopperPouch(pouchProps()));
    public static final Item LIME_COPPER_POUCH = register(ModItems.LIME_COPPER_POUCH, new LimeCopperPouch(pouchProps()));
    public static final Item MAGENTA_COPPER_POUCH = register(ModItems.MAGENTA_COPPER_POUCH, new MagentaCopperPouch(pouchProps()));
    public static final Item ORANGE_COPPER_POUCH = register(ModItems.ORANGE_COPPER_POUCH, new OrangeCopperPouch(pouchProps()));
    public static final Item PINK_COPPER_POUCH = register(ModItems.PINK_COPPER_POUCH, new PinkCopperPouch(pouchProps()));
    public static final Item PURPLE_COPPER_POUCH = register(ModItems.PURPLE_COPPER_POUCH, new PurpleCopperPouch(pouchProps()));
    public static final Item RED_COPPER_POUCH = register(ModItems.RED_COPPER_POUCH, new RedCopperPouch(pouchProps()));
    public static final Item WHITE_COPPER_POUCH = register(ModItems.WHITE_COPPER_POUCH, new WhiteCopperPouch(pouchProps()));
    public static final Item YELLOW_COPPER_POUCH = register(ModItems.YELLOW_COPPER_POUCH, new YellowCopperPouch(pouchProps()));

    // Iron Colored Pouches
    public static final Item BLACK_IRON_POUCH = register(ModItems.BLACK_IRON_POUCH, new BlackIronPouch(pouchProps()));
    public static final Item BLUE_IRON_POUCH = register(ModItems.BLUE_IRON_POUCH, new BlueIronPouch(pouchProps()));
    public static final Item BROWN_IRON_POUCH = register(ModItems.BROWN_IRON_POUCH, new BrownIronPouch(pouchProps()));
    public static final Item CYAN_IRON_POUCH = register(ModItems.CYAN_IRON_POUCH, new CyanIronPouch(pouchProps()));
    public static final Item GRAY_IRON_POUCH = register(ModItems.GRAY_IRON_POUCH, new GrayIronPouch(pouchProps()));
    public static final Item GREEN_IRON_POUCH = register(ModItems.GREEN_IRON_POUCH, new GreenIronPouch(pouchProps()));
    public static final Item LIGHT_BLUE_IRON_POUCH = register(ModItems.LIGHT_BLUE_IRON_POUCH, new LightBlueIronPouch(pouchProps()));
    public static final Item LIGHT_GRAY_IRON_POUCH = register(ModItems.LIGHT_GRAY_IRON_POUCH, new LightGrayIronPouch(pouchProps()));
    public static final Item LIME_IRON_POUCH = register(ModItems.LIME_IRON_POUCH, new LimeIronPouch(pouchProps()));
    public static final Item MAGENTA_IRON_POUCH = register(ModItems.MAGENTA_IRON_POUCH, new MagentaIronPouch(pouchProps()));
    public static final Item ORANGE_IRON_POUCH = register(ModItems.ORANGE_IRON_POUCH, new OrangeIronPouch(pouchProps()));
    public static final Item PINK_IRON_POUCH = register(ModItems.PINK_IRON_POUCH, new PinkIronPouch(pouchProps()));
    public static final Item PURPLE_IRON_POUCH = register(ModItems.PURPLE_IRON_POUCH, new PurpleIronPouch(pouchProps()));
    public static final Item RED_IRON_POUCH = register(ModItems.RED_IRON_POUCH, new RedIronPouch(pouchProps()));
    public static final Item WHITE_IRON_POUCH = register(ModItems.WHITE_IRON_POUCH, new WhiteIronPouch(pouchProps()));
    public static final Item YELLOW_IRON_POUCH = register(ModItems.YELLOW_IRON_POUCH, new YellowIronPouch(pouchProps()));

    // Gold Colored Pouches
    public static final Item BLACK_GOLD_POUCH = register(ModItems.BLACK_GOLD_POUCH, new BlackGoldPouch(pouchProps()));
    public static final Item BLUE_GOLD_POUCH = register(ModItems.BLUE_GOLD_POUCH, new BlueGoldPouch(pouchProps()));
    public static final Item BROWN_GOLD_POUCH = register(ModItems.BROWN_GOLD_POUCH, new BrownGoldPouch(pouchProps()));
    public static final Item CYAN_GOLD_POUCH = register(ModItems.CYAN_GOLD_POUCH, new CyanGoldPouch(pouchProps()));
    public static final Item GRAY_GOLD_POUCH = register(ModItems.GRAY_GOLD_POUCH, new GrayGoldPouch(pouchProps()));
    public static final Item GREEN_GOLD_POUCH = register(ModItems.GREEN_GOLD_POUCH, new GreenGoldPouch(pouchProps()));
    public static final Item LIGHT_BLUE_GOLD_POUCH = register(ModItems.LIGHT_BLUE_GOLD_POUCH, new LightBlueGoldPouch(pouchProps()));
    public static final Item LIGHT_GRAY_GOLD_POUCH = register(ModItems.LIGHT_GRAY_GOLD_POUCH, new LightGrayGoldPouch(pouchProps()));
    public static final Item LIME_GOLD_POUCH = register(ModItems.LIME_GOLD_POUCH, new LimeGoldPouch(pouchProps()));
    public static final Item MAGENTA_GOLD_POUCH = register(ModItems.MAGENTA_GOLD_POUCH, new MagentaGoldPouch(pouchProps()));
    public static final Item ORANGE_GOLD_POUCH = register(ModItems.ORANGE_GOLD_POUCH, new OrangeGoldPouch(pouchProps()));
    public static final Item PINK_GOLD_POUCH = register(ModItems.PINK_GOLD_POUCH, new PinkGoldPouch(pouchProps()));
    public static final Item PURPLE_GOLD_POUCH = register(ModItems.PURPLE_GOLD_POUCH, new PurpleGoldPouch(pouchProps()));
    public static final Item RED_GOLD_POUCH = register(ModItems.RED_GOLD_POUCH, new RedGoldPouch(pouchProps()));
    public static final Item WHITE_GOLD_POUCH = register(ModItems.WHITE_GOLD_POUCH, new WhiteGoldPouch(pouchProps()));
    public static final Item YELLOW_GOLD_POUCH = register(ModItems.YELLOW_GOLD_POUCH, new YellowGoldPouch(pouchProps()));

    // Diamond Colored Pouches
    public static final Item BLACK_DIAMOND_POUCH = register(ModItems.BLACK_DIAMOND_POUCH, new BlackDiamondPouch(pouchProps()));
    public static final Item BLUE_DIAMOND_POUCH = register(ModItems.BLUE_DIAMOND_POUCH, new BlueDiamondPouch(pouchProps()));
    public static final Item BROWN_DIAMOND_POUCH = register(ModItems.BROWN_DIAMOND_POUCH, new BrownDiamondPouch(pouchProps()));
    public static final Item CYAN_DIAMOND_POUCH = register(ModItems.CYAN_DIAMOND_POUCH, new CyanDiamondPouch(pouchProps()));
    public static final Item GRAY_DIAMOND_POUCH = register(ModItems.GRAY_DIAMOND_POUCH, new GrayDiamondPouch(pouchProps()));
    public static final Item GREEN_DIAMOND_POUCH = register(ModItems.GREEN_DIAMOND_POUCH, new GreenDiamondPouch(pouchProps()));
    public static final Item LIGHT_BLUE_DIAMOND_POUCH = register(ModItems.LIGHT_BLUE_DIAMOND_POUCH, new LightBlueDiamondPouch(pouchProps()));
    public static final Item LIGHT_GRAY_DIAMOND_POUCH = register(ModItems.LIGHT_GRAY_DIAMOND_POUCH, new LightGrayDiamondPouch(pouchProps()));
    public static final Item LIME_DIAMOND_POUCH = register(ModItems.LIME_DIAMOND_POUCH, new LimeDiamondPouch(pouchProps()));
    public static final Item MAGENTA_DIAMOND_POUCH = register(ModItems.MAGENTA_DIAMOND_POUCH, new MagentaDiamondPouch(pouchProps()));
    public static final Item ORANGE_DIAMOND_POUCH = register(ModItems.ORANGE_DIAMOND_POUCH, new OrangeDiamondPouch(pouchProps()));
    public static final Item PINK_DIAMOND_POUCH = register(ModItems.PINK_DIAMOND_POUCH, new PinkDiamondPouch(pouchProps()));
    public static final Item PURPLE_DIAMOND_POUCH = register(ModItems.PURPLE_DIAMOND_POUCH, new PurpleDiamondPouch(pouchProps()));
    public static final Item RED_DIAMOND_POUCH = register(ModItems.RED_DIAMOND_POUCH, new RedDiamondPouch(pouchProps()));
    public static final Item WHITE_DIAMOND_POUCH = register(ModItems.WHITE_DIAMOND_POUCH, new WhiteDiamondPouch(pouchProps()));
    public static final Item YELLOW_DIAMOND_POUCH = register(ModItems.YELLOW_DIAMOND_POUCH, new YellowDiamondPouch(pouchProps()));

    // Netherite Colored Pouches
    public static final Item BLACK_NETHERITE_POUCH = register(ModItems.BLACK_NETHERITE_POUCH, new BlackNetheritePouch(netheritePouchProps()));
    public static final Item BLUE_NETHERITE_POUCH = register(ModItems.BLUE_NETHERITE_POUCH, new BlueNetheritePouch(netheritePouchProps()));
    public static final Item BROWN_NETHERITE_POUCH = register(ModItems.BROWN_NETHERITE_POUCH, new BrownNetheritePouch(netheritePouchProps()));
    public static final Item CYAN_NETHERITE_POUCH = register(ModItems.CYAN_NETHERITE_POUCH, new CyanNetheritePouch(netheritePouchProps()));
    public static final Item GRAY_NETHERITE_POUCH = register(ModItems.GRAY_NETHERITE_POUCH, new GrayNetheritePouch(netheritePouchProps()));
    public static final Item GREEN_NETHERITE_POUCH = register(ModItems.GREEN_NETHERITE_POUCH, new GreenNetheritePouch(netheritePouchProps()));
    public static final Item LIGHT_BLUE_NETHERITE_POUCH = register(ModItems.LIGHT_BLUE_NETHERITE_POUCH, new LightBlueNetheritePouch(netheritePouchProps()));
    public static final Item LIGHT_GRAY_NETHERITE_POUCH = register(ModItems.LIGHT_GRAY_NETHERITE_POUCH, new LightGrayNetheritePouch(netheritePouchProps()));
    public static final Item LIME_NETHERITE_POUCH = register(ModItems.LIME_NETHERITE_POUCH, new LimeNetheritePouch(netheritePouchProps()));
    public static final Item MAGENTA_NETHERITE_POUCH = register(ModItems.MAGENTA_NETHERITE_POUCH, new MagentaNetheritePouch(netheritePouchProps()));
    public static final Item ORANGE_NETHERITE_POUCH = register(ModItems.ORANGE_NETHERITE_POUCH, new OrangeNetheritePouch(netheritePouchProps()));
    public static final Item PINK_NETHERITE_POUCH = register(ModItems.PINK_NETHERITE_POUCH, new PinkNetheritePouch(netheritePouchProps()));
    public static final Item PURPLE_NETHERITE_POUCH = register(ModItems.PURPLE_NETHERITE_POUCH, new PurpleNetheritePouch(netheritePouchProps()));
    public static final Item RED_NETHERITE_POUCH = register(ModItems.RED_NETHERITE_POUCH, new RedNetheritePouch(netheritePouchProps()));
    public static final Item WHITE_NETHERITE_POUCH = register(ModItems.WHITE_NETHERITE_POUCH, new WhiteNetheritePouch(netheritePouchProps()));
    public static final Item YELLOW_NETHERITE_POUCH = register(ModItems.YELLOW_NETHERITE_POUCH, new YellowNetheritePouch(netheritePouchProps()));

    // Emerald Colored Pouches
    public static final Item BLACK_EMERALD_POUCH = register(ModItems.BLACK_EMERALD_POUCH, new BlackEmeraldPouch(pouchProps()));
    public static final Item BLUE_EMERALD_POUCH = register(ModItems.BLUE_EMERALD_POUCH, new BlueEmeraldPouch(pouchProps()));
    public static final Item BROWN_EMERALD_POUCH = register(ModItems.BROWN_EMERALD_POUCH, new BrownEmeraldPouch(pouchProps()));
    public static final Item CYAN_EMERALD_POUCH = register(ModItems.CYAN_EMERALD_POUCH, new CyanEmeraldPouch(pouchProps()));
    public static final Item GRAY_EMERALD_POUCH = register(ModItems.GRAY_EMERALD_POUCH, new GrayEmeraldPouch(pouchProps()));
    public static final Item GREEN_EMERALD_POUCH = register(ModItems.GREEN_EMERALD_POUCH, new GreenEmeraldPouch(pouchProps()));
    public static final Item LIGHT_BLUE_EMERALD_POUCH = register(ModItems.LIGHT_BLUE_EMERALD_POUCH, new LightBlueEmeraldPouch(pouchProps()));
    public static final Item LIGHT_GRAY_EMERALD_POUCH = register(ModItems.LIGHT_GRAY_EMERALD_POUCH, new LightGrayEmeraldPouch(pouchProps()));
    public static final Item LIME_EMERALD_POUCH = register(ModItems.LIME_EMERALD_POUCH, new LimeEmeraldPouch(pouchProps()));
    public static final Item MAGENTA_EMERALD_POUCH = register(ModItems.MAGENTA_EMERALD_POUCH, new MagentaEmeraldPouch(pouchProps()));
    public static final Item ORANGE_EMERALD_POUCH = register(ModItems.ORANGE_EMERALD_POUCH, new OrangeEmeraldPouch(pouchProps()));
    public static final Item PINK_EMERALD_POUCH = register(ModItems.PINK_EMERALD_POUCH, new PinkEmeraldPouch(pouchProps()));
    public static final Item PURPLE_EMERALD_POUCH = register(ModItems.PURPLE_EMERALD_POUCH, new PurpleEmeraldPouch(pouchProps()));
    public static final Item RED_EMERALD_POUCH = register(ModItems.RED_EMERALD_POUCH, new RedEmeraldPouch(pouchProps()));
    public static final Item WHITE_EMERALD_POUCH = register(ModItems.WHITE_EMERALD_POUCH, new WhiteEmeraldPouch(pouchProps()));
    public static final Item YELLOW_EMERALD_POUCH = register(ModItems.YELLOW_EMERALD_POUCH, new YellowEmeraldPouch(pouchProps()));

    private static Item register(String name, Item item) {
        return Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, name), item);
    }

    /**
     * Call from mod initializer to trigger static field initialization (class loading).
     */
    public static void init() {
    }
}

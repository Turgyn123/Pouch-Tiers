package net.bundle.main.Items;

import net.minecraft.core.component.DataComponents;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.component.BundleContents;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import net.bundle.Items.ModItems;
import net.bundle.Items.BundleTiers.*;
import net.bundle.Items.BundleTiers.bundle.*;
import net.bundle.main.Main;

public class NeoForgeItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Main.MOD_ID);

    private static Item.Properties bundleProps() {
        return new Item.Properties().stacksTo(1).component(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY);
    }

    private static Item.Properties netheriteBundleProps() {
        return bundleProps().fireResistant();
    }

    //bundles
    public static final DeferredItem<Item> BUNDLE = ITEMS.register("bundle", () -> new Bundle(bundleProps()));
    public static final DeferredItem<Item> WHITE_BUNDLE = ITEMS.register("white_bundle", () -> new WhiteBundle(bundleProps()));
    public static final DeferredItem<Item> LIGHT_GRAY_BUNDLE = ITEMS.register("light_gray_bundle", () -> new LightGrayBundle(bundleProps()));
    public static final DeferredItem<Item> GRAY_BUNDLE = ITEMS.register("gray_bundle", () -> new GrayBundle(bundleProps()));
    public static final DeferredItem<Item> BLACK_BUNDLE = ITEMS.register("black_bundle", () -> new BlackBundle(bundleProps()));
    public static final DeferredItem<Item> BROWN_BUNDLE = ITEMS.register("brown_bundle", () -> new BrownBundle(bundleProps()));
    public static final DeferredItem<Item> RED_BUNDLE = ITEMS.register("red_bundle", () -> new RedBundle(bundleProps()));
    public static final DeferredItem<Item> ORANGE_BUNDLE = ITEMS.register("orange_bundle", () -> new OrangeBundle(bundleProps()));
    public static final DeferredItem<Item> YELLOW_BUNDLE = ITEMS.register("yellow_bundle", () -> new YellowBundle(bundleProps()));
    public static final DeferredItem<Item> LIME_BUNDLE = ITEMS.register("lime_bundle", () -> new LimeBundle(bundleProps()));
    public static final DeferredItem<Item> GREEN_BUNDLE = ITEMS.register("green_bundle", () -> new GreenBundle(bundleProps()));
    public static final DeferredItem<Item> CYAN_BUNDLE = ITEMS.register("cyan_bundle", () -> new CyanBundle(bundleProps()));
    public static final DeferredItem<Item> LIGHT_BLUE_BUNDLE = ITEMS.register("light_blue_bundle", () -> new LightBlueBundle(bundleProps()));
    public static final DeferredItem<Item> BLUE_BUNDLE = ITEMS.register("blue_bundle", () -> new BlueBundle(bundleProps()));
    public static final DeferredItem<Item> PURPLE_BUNDLE = ITEMS.register("purple_bundle", () -> new PurpleBundle(bundleProps()));
    public static final DeferredItem<Item> MAGENTA_BUNDLE = ITEMS.register("magenta_bundle", () -> new MagentaBundle(bundleProps()));
    public static final DeferredItem<Item> PINK_BUNDLE = ITEMS.register("pink_bundle", () -> new PinkBundle(bundleProps()));

    public static final DeferredItem<Item> COPPER_BUNDLE = ITEMS.register("copper_bundle", () -> new CopperBundle(bundleProps()));
    public static final DeferredItem<Item> IRON_BUNDLE = ITEMS.register("iron_bundle", () -> new IronBundle(bundleProps()));
    public static final DeferredItem<Item> GOLD_BUNDLE = ITEMS.register("gold_bundle", () -> new GoldBundle(bundleProps()));
    public static final DeferredItem<Item> DIAMOND_BUNDLE = ITEMS.register("diamond_bundle", () -> new DiamondBundle(bundleProps()));
    public static final DeferredItem<Item> NETHERITE_BUNDLE = ITEMS.register("netherite_bundle", () -> new NetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> EMERALD_BUNDLE = ITEMS.register("emerald_bundle", () -> new EmeraldBundle(bundleProps()));


    // Copper Colored Bundles
    public static final DeferredItem<Item> BLACK_COPPER_BUNDLE = ITEMS.register(ModItems.BLACK_COPPER_BUNDLE, () -> new BlackCopperBundle(bundleProps()));
    public static final DeferredItem<Item> BLUE_COPPER_BUNDLE = ITEMS.register(ModItems.BLUE_COPPER_BUNDLE, () -> new BlueCopperBundle(bundleProps()));
    public static final DeferredItem<Item> BROWN_COPPER_BUNDLE = ITEMS.register(ModItems.BROWN_COPPER_BUNDLE, () -> new BrownCopperBundle(bundleProps()));
    public static final DeferredItem<Item> CYAN_COPPER_BUNDLE = ITEMS.register(ModItems.CYAN_COPPER_BUNDLE, () -> new CyanCopperBundle(bundleProps()));
    public static final DeferredItem<Item> GRAY_COPPER_BUNDLE = ITEMS.register(ModItems.GRAY_COPPER_BUNDLE, () -> new GrayCopperBundle(bundleProps()));
    public static final DeferredItem<Item> GREEN_COPPER_BUNDLE = ITEMS.register(ModItems.GREEN_COPPER_BUNDLE, () -> new GreenCopperBundle(bundleProps()));
    public static final DeferredItem<Item> LIGHT_BLUE_COPPER_BUNDLE = ITEMS.register(ModItems.LIGHT_BLUE_COPPER_BUNDLE, () -> new LightBlueCopperBundle(bundleProps()));
    public static final DeferredItem<Item> LIGHT_GRAY_COPPER_BUNDLE = ITEMS.register(ModItems.LIGHT_GRAY_COPPER_BUNDLE, () -> new LightGrayCopperBundle(bundleProps()));
    public static final DeferredItem<Item> LIME_COPPER_BUNDLE = ITEMS.register(ModItems.LIME_COPPER_BUNDLE, () -> new LimeCopperBundle(bundleProps()));
    public static final DeferredItem<Item> MAGENTA_COPPER_BUNDLE = ITEMS.register(ModItems.MAGENTA_COPPER_BUNDLE, () -> new MagentaCopperBundle(bundleProps()));
    public static final DeferredItem<Item> ORANGE_COPPER_BUNDLE = ITEMS.register(ModItems.ORANGE_COPPER_BUNDLE, () -> new OrangeCopperBundle(bundleProps()));
    public static final DeferredItem<Item> PINK_COPPER_BUNDLE = ITEMS.register(ModItems.PINK_COPPER_BUNDLE, () -> new PinkCopperBundle(bundleProps()));
    public static final DeferredItem<Item> PURPLE_COPPER_BUNDLE = ITEMS.register(ModItems.PURPLE_COPPER_BUNDLE, () -> new PurpleCopperBundle(bundleProps()));
    public static final DeferredItem<Item> RED_COPPER_BUNDLE = ITEMS.register(ModItems.RED_COPPER_BUNDLE, () -> new RedCopperBundle(bundleProps()));
    public static final DeferredItem<Item> WHITE_COPPER_BUNDLE = ITEMS.register(ModItems.WHITE_COPPER_BUNDLE, () -> new WhiteCopperBundle(bundleProps()));
    public static final DeferredItem<Item> YELLOW_COPPER_BUNDLE = ITEMS.register(ModItems.YELLOW_COPPER_BUNDLE, () -> new YellowCopperBundle(bundleProps()));

    // Iron Colored Bundles
    public static final DeferredItem<Item> BLACK_IRON_BUNDLE = ITEMS.register(ModItems.BLACK_IRON_BUNDLE, () -> new BlackIronBundle(bundleProps()));
    public static final DeferredItem<Item> BLUE_IRON_BUNDLE = ITEMS.register(ModItems.BLUE_IRON_BUNDLE, () -> new BlueIronBundle(bundleProps()));
    public static final DeferredItem<Item> BROWN_IRON_BUNDLE = ITEMS.register(ModItems.BROWN_IRON_BUNDLE, () -> new BrownIronBundle(bundleProps()));
    public static final DeferredItem<Item> CYAN_IRON_BUNDLE = ITEMS.register(ModItems.CYAN_IRON_BUNDLE, () -> new CyanIronBundle(bundleProps()));
    public static final DeferredItem<Item> GRAY_IRON_BUNDLE = ITEMS.register(ModItems.GRAY_IRON_BUNDLE, () -> new GrayIronBundle(bundleProps()));
    public static final DeferredItem<Item> GREEN_IRON_BUNDLE = ITEMS.register(ModItems.GREEN_IRON_BUNDLE, () -> new GreenIronBundle(bundleProps()));
    public static final DeferredItem<Item> LIGHT_BLUE_IRON_BUNDLE = ITEMS.register(ModItems.LIGHT_BLUE_IRON_BUNDLE, () -> new LightBlueIronBundle(bundleProps()));
    public static final DeferredItem<Item> LIGHT_GRAY_IRON_BUNDLE = ITEMS.register(ModItems.LIGHT_GRAY_IRON_BUNDLE, () -> new LightGrayIronBundle(bundleProps()));
    public static final DeferredItem<Item> LIME_IRON_BUNDLE = ITEMS.register(ModItems.LIME_IRON_BUNDLE, () -> new LimeIronBundle(bundleProps()));
    public static final DeferredItem<Item> MAGENTA_IRON_BUNDLE = ITEMS.register(ModItems.MAGENTA_IRON_BUNDLE, () -> new MagentaIronBundle(bundleProps()));
    public static final DeferredItem<Item> ORANGE_IRON_BUNDLE = ITEMS.register(ModItems.ORANGE_IRON_BUNDLE, () -> new OrangeIronBundle(bundleProps()));
    public static final DeferredItem<Item> PINK_IRON_BUNDLE = ITEMS.register(ModItems.PINK_IRON_BUNDLE, () -> new PinkIronBundle(bundleProps()));
    public static final DeferredItem<Item> PURPLE_IRON_BUNDLE = ITEMS.register(ModItems.PURPLE_IRON_BUNDLE, () -> new PurpleIronBundle(bundleProps()));
    public static final DeferredItem<Item> RED_IRON_BUNDLE = ITEMS.register(ModItems.RED_IRON_BUNDLE, () -> new RedIronBundle(bundleProps()));
    public static final DeferredItem<Item> WHITE_IRON_BUNDLE = ITEMS.register(ModItems.WHITE_IRON_BUNDLE, () -> new WhiteIronBundle(bundleProps()));
    public static final DeferredItem<Item> YELLOW_IRON_BUNDLE = ITEMS.register(ModItems.YELLOW_IRON_BUNDLE, () -> new YellowIronBundle(bundleProps()));

    // Gold Colored Bundles
    public static final DeferredItem<Item> BLACK_GOLD_BUNDLE = ITEMS.register(ModItems.BLACK_GOLD_BUNDLE, () -> new BlackGoldBundle(bundleProps()));
    public static final DeferredItem<Item> BLUE_GOLD_BUNDLE = ITEMS.register(ModItems.BLUE_GOLD_BUNDLE, () -> new BlueGoldBundle(bundleProps()));
    public static final DeferredItem<Item> BROWN_GOLD_BUNDLE = ITEMS.register(ModItems.BROWN_GOLD_BUNDLE, () -> new BrownGoldBundle(bundleProps()));
    public static final DeferredItem<Item> CYAN_GOLD_BUNDLE = ITEMS.register(ModItems.CYAN_GOLD_BUNDLE, () -> new CyanGoldBundle(bundleProps()));
    public static final DeferredItem<Item> GRAY_GOLD_BUNDLE = ITEMS.register(ModItems.GRAY_GOLD_BUNDLE, () -> new GrayGoldBundle(bundleProps()));
    public static final DeferredItem<Item> GREEN_GOLD_BUNDLE = ITEMS.register(ModItems.GREEN_GOLD_BUNDLE, () -> new GreenGoldBundle(bundleProps()));
    public static final DeferredItem<Item> LIGHT_BLUE_GOLD_BUNDLE = ITEMS.register(ModItems.LIGHT_BLUE_GOLD_BUNDLE, () -> new LightBlueGoldBundle(bundleProps()));
    public static final DeferredItem<Item> LIGHT_GRAY_GOLD_BUNDLE = ITEMS.register(ModItems.LIGHT_GRAY_GOLD_BUNDLE, () -> new LightGrayGoldBundle(bundleProps()));
    public static final DeferredItem<Item> LIME_GOLD_BUNDLE = ITEMS.register(ModItems.LIME_GOLD_BUNDLE, () -> new LimeGoldBundle(bundleProps()));
    public static final DeferredItem<Item> MAGENTA_GOLD_BUNDLE = ITEMS.register(ModItems.MAGENTA_GOLD_BUNDLE, () -> new MagentaGoldBundle(bundleProps()));
    public static final DeferredItem<Item> ORANGE_GOLD_BUNDLE = ITEMS.register(ModItems.ORANGE_GOLD_BUNDLE, () -> new OrangeGoldBundle(bundleProps()));
    public static final DeferredItem<Item> PINK_GOLD_BUNDLE = ITEMS.register(ModItems.PINK_GOLD_BUNDLE, () -> new PinkGoldBundle(bundleProps()));
    public static final DeferredItem<Item> PURPLE_GOLD_BUNDLE = ITEMS.register(ModItems.PURPLE_GOLD_BUNDLE, () -> new PurpleGoldBundle(bundleProps()));
    public static final DeferredItem<Item> RED_GOLD_BUNDLE = ITEMS.register(ModItems.RED_GOLD_BUNDLE, () -> new RedGoldBundle(bundleProps()));
    public static final DeferredItem<Item> WHITE_GOLD_BUNDLE = ITEMS.register(ModItems.WHITE_GOLD_BUNDLE, () -> new WhiteGoldBundle(bundleProps()));
    public static final DeferredItem<Item> YELLOW_GOLD_BUNDLE = ITEMS.register(ModItems.YELLOW_GOLD_BUNDLE, () -> new YellowGoldBundle(bundleProps()));

    // Diamond Colored Bundles
    public static final DeferredItem<Item> BLACK_DIAMOND_BUNDLE = ITEMS.register(ModItems.BLACK_DIAMOND_BUNDLE, () -> new BlackDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> BLUE_DIAMOND_BUNDLE = ITEMS.register(ModItems.BLUE_DIAMOND_BUNDLE, () -> new BlueDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> BROWN_DIAMOND_BUNDLE = ITEMS.register(ModItems.BROWN_DIAMOND_BUNDLE, () -> new BrownDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> CYAN_DIAMOND_BUNDLE = ITEMS.register(ModItems.CYAN_DIAMOND_BUNDLE, () -> new CyanDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> GRAY_DIAMOND_BUNDLE = ITEMS.register(ModItems.GRAY_DIAMOND_BUNDLE, () -> new GrayDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> GREEN_DIAMOND_BUNDLE = ITEMS.register(ModItems.GREEN_DIAMOND_BUNDLE, () -> new GreenDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> LIGHT_BLUE_DIAMOND_BUNDLE = ITEMS.register(ModItems.LIGHT_BLUE_DIAMOND_BUNDLE, () -> new LightBlueDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> LIGHT_GRAY_DIAMOND_BUNDLE = ITEMS.register(ModItems.LIGHT_GRAY_DIAMOND_BUNDLE, () -> new LightGrayDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> LIME_DIAMOND_BUNDLE = ITEMS.register(ModItems.LIME_DIAMOND_BUNDLE, () -> new LimeDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> MAGENTA_DIAMOND_BUNDLE = ITEMS.register(ModItems.MAGENTA_DIAMOND_BUNDLE, () -> new MagentaDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> ORANGE_DIAMOND_BUNDLE = ITEMS.register(ModItems.ORANGE_DIAMOND_BUNDLE, () -> new OrangeDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> PINK_DIAMOND_BUNDLE = ITEMS.register(ModItems.PINK_DIAMOND_BUNDLE, () -> new PinkDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> PURPLE_DIAMOND_BUNDLE = ITEMS.register(ModItems.PURPLE_DIAMOND_BUNDLE, () -> new PurpleDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> RED_DIAMOND_BUNDLE = ITEMS.register(ModItems.RED_DIAMOND_BUNDLE, () -> new RedDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> WHITE_DIAMOND_BUNDLE = ITEMS.register(ModItems.WHITE_DIAMOND_BUNDLE, () -> new WhiteDiamondBundle(bundleProps()));
    public static final DeferredItem<Item> YELLOW_DIAMOND_BUNDLE = ITEMS.register(ModItems.YELLOW_DIAMOND_BUNDLE, () -> new YellowDiamondBundle(bundleProps()));

    // Netherite Colored Bundles
    public static final DeferredItem<Item> BLACK_NETHERITE_BUNDLE = ITEMS.register(ModItems.BLACK_NETHERITE_BUNDLE, () -> new BlackNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> BLUE_NETHERITE_BUNDLE = ITEMS.register(ModItems.BLUE_NETHERITE_BUNDLE, () -> new BlueNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> BROWN_NETHERITE_BUNDLE = ITEMS.register(ModItems.BROWN_NETHERITE_BUNDLE, () -> new BrownNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> CYAN_NETHERITE_BUNDLE = ITEMS.register(ModItems.CYAN_NETHERITE_BUNDLE, () -> new CyanNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> GRAY_NETHERITE_BUNDLE = ITEMS.register(ModItems.GRAY_NETHERITE_BUNDLE, () -> new GrayNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> GREEN_NETHERITE_BUNDLE = ITEMS.register(ModItems.GREEN_NETHERITE_BUNDLE, () -> new GreenNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> LIGHT_BLUE_NETHERITE_BUNDLE = ITEMS.register(ModItems.LIGHT_BLUE_NETHERITE_BUNDLE, () -> new LightBlueNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> LIGHT_GRAY_NETHERITE_BUNDLE = ITEMS.register(ModItems.LIGHT_GRAY_NETHERITE_BUNDLE, () -> new LightGrayNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> LIME_NETHERITE_BUNDLE = ITEMS.register(ModItems.LIME_NETHERITE_BUNDLE, () -> new LimeNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> MAGENTA_NETHERITE_BUNDLE = ITEMS.register(ModItems.MAGENTA_NETHERITE_BUNDLE, () -> new MagentaNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> ORANGE_NETHERITE_BUNDLE = ITEMS.register(ModItems.ORANGE_NETHERITE_BUNDLE, () -> new OrangeNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> PINK_NETHERITE_BUNDLE = ITEMS.register(ModItems.PINK_NETHERITE_BUNDLE, () -> new PinkNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> PURPLE_NETHERITE_BUNDLE = ITEMS.register(ModItems.PURPLE_NETHERITE_BUNDLE, () -> new PurpleNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> RED_NETHERITE_BUNDLE = ITEMS.register(ModItems.RED_NETHERITE_BUNDLE, () -> new RedNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> WHITE_NETHERITE_BUNDLE = ITEMS.register(ModItems.WHITE_NETHERITE_BUNDLE, () -> new WhiteNetheriteBundle(netheriteBundleProps()));
    public static final DeferredItem<Item> YELLOW_NETHERITE_BUNDLE = ITEMS.register(ModItems.YELLOW_NETHERITE_BUNDLE, () -> new YellowNetheriteBundle(netheriteBundleProps()));

    // Emerald Colored Bundles
    public static final DeferredItem<Item> BLACK_EMERALD_BUNDLE = ITEMS.register(ModItems.BLACK_EMERALD_BUNDLE, () -> new BlackEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> BLUE_EMERALD_BUNDLE = ITEMS.register(ModItems.BLUE_EMERALD_BUNDLE, () -> new BlueEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> BROWN_EMERALD_BUNDLE = ITEMS.register(ModItems.BROWN_EMERALD_BUNDLE, () -> new BrownEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> CYAN_EMERALD_BUNDLE = ITEMS.register(ModItems.CYAN_EMERALD_BUNDLE, () -> new CyanEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> GRAY_EMERALD_BUNDLE = ITEMS.register(ModItems.GRAY_EMERALD_BUNDLE, () -> new GrayEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> GREEN_EMERALD_BUNDLE = ITEMS.register(ModItems.GREEN_EMERALD_BUNDLE, () -> new GreenEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> LIGHT_BLUE_EMERALD_BUNDLE = ITEMS.register(ModItems.LIGHT_BLUE_EMERALD_BUNDLE, () -> new LightBlueEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> LIGHT_GRAY_EMERALD_BUNDLE = ITEMS.register(ModItems.LIGHT_GRAY_EMERALD_BUNDLE, () -> new LightGrayEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> LIME_EMERALD_BUNDLE = ITEMS.register(ModItems.LIME_EMERALD_BUNDLE, () -> new LimeEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> MAGENTA_EMERALD_BUNDLE = ITEMS.register(ModItems.MAGENTA_EMERALD_BUNDLE, () -> new MagentaEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> ORANGE_EMERALD_BUNDLE = ITEMS.register(ModItems.ORANGE_EMERALD_BUNDLE, () -> new OrangeEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> PINK_EMERALD_BUNDLE = ITEMS.register(ModItems.PINK_EMERALD_BUNDLE, () -> new PinkEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> PURPLE_EMERALD_BUNDLE = ITEMS.register(ModItems.PURPLE_EMERALD_BUNDLE, () -> new PurpleEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> RED_EMERALD_BUNDLE = ITEMS.register(ModItems.RED_EMERALD_BUNDLE, () -> new RedEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> WHITE_EMERALD_BUNDLE = ITEMS.register(ModItems.WHITE_EMERALD_BUNDLE, () -> new WhiteEmeraldBundle(bundleProps()));
    public static final DeferredItem<Item> YELLOW_EMERALD_BUNDLE = ITEMS.register(ModItems.YELLOW_EMERALD_BUNDLE, () -> new YellowEmeraldBundle(bundleProps()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

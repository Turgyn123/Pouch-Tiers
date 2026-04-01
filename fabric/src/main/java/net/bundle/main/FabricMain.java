package net.bundle.main;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.inventory.MenuType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.bundle.Items.FabricItems;
import net.bundle.Items.FabricTab;
import net.bundle.main.gui.ModMenuTypes;
import net.bundle.main.gui.BundleMenu;

import java.util.Optional;

public class FabricMain implements ModInitializer {
    
    @Override
    public void onInitialize() {
        
        Main.LOG.info("Hello Fabric world!");
        Main.init();

        // Register MenuType
        ModMenuTypes.BUNDLE_MENU = Registry.register(
            BuiltInRegistries.MENU,
            ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "bundle_menu"),
            new MenuType<>(BundleMenu::new, FeatureFlagSet.of())
        );

        // Register items and creative tab
        FabricItems.init();
        FabricTab.init();

        // Register Emerald Bundle villager trade (Leatherworker, master level 5)
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LEATHERWORKER, 5, factories -> {
            factories.add((entity, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    Optional.of(new ItemCost(FabricItems.DIAMOND_BUNDLE)),
                    new ItemStack(FabricItems.EMERALD_BUNDLE),
                    3,     // max uses before restock
                    30,    // villager XP
                    0.05f  // price multiplier
            ));
        });
    }
}

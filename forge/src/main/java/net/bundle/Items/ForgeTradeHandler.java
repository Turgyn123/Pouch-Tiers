package net.bundle.Items;

import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.bundle.main.Main;

import java.util.Optional;

/**
 * Registers the Emerald Bundle as a trade from max-level Leatherworker villagers.
 * Cost: 32 Emeralds + 1 Diamond Bundle → 1 Emerald Bundle
 */
@Mod.EventBusSubscriber(modid = Main.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ForgeTradeHandler {

    @SubscribeEvent
    public static void onVillagerTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.LEATHERWORKER) {
            // Level 5 = Master level
            event.getTrades().get(5).add((trader, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    Optional.of(new ItemCost(ForgeItems.DIAMOND_BUNDLE.get())),
                    new ItemStack(ForgeItems.EMERALD_BUNDLE.get()),
                    3,     // max uses before restock
                    30,    // villager XP
                    0.05f  // price multiplier
            ));
        }
    }
}

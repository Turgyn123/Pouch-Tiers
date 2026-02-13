package net.pouch.main.Items;

import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.ItemCost;
import net.minecraft.world.item.trading.MerchantOffer;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.pouch.main.Main;

import java.util.Optional;

/**
 * Registers the Emerald Pouch as a trade from max-level Leatherworker villagers.
 * Cost: 32 Emeralds + 1 Diamond Pouch → 1 Emerald Pouch
 */
@EventBusSubscriber(modid = Main.MOD_ID)
public class NeoForgeTradeHandler {

    @SubscribeEvent
    public static void onVillagerTrades(VillagerTradesEvent event) {
        if (event.getType() == VillagerProfession.LEATHERWORKER) {
            // Level 5 = Master level
            event.getTrades().get(5).add((trader, random) -> new MerchantOffer(
                    new ItemCost(Items.EMERALD, 32),
                    Optional.of(new ItemCost(NeoForgeItems.DIAMOND_POUCH.get())),
                    new ItemStack(NeoForgeItems.EMERALD_POUCH.get()),
                    3,     // max uses before restock
                    30,    // villager XP
                    0.05f  // price multiplier
            ));
        }
    }
}

package net.pouch.Items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.pouch.main.Main;

public class FabricTab {

    public static final ResourceKey<CreativeModeTab> CUSTOM_CREATIVE_TAB_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(),  ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "creative_tab"));

   // public static final CreativeModeTab CUSTOM_CREATIVE_TAB = FabricItemGroup.builder()
   //         .icon(() -> new ItemStack(FabricItems.COPPER_POUCH))
   //         .title(Component.translatable("itemGroup.example-mod"))
   //         .displayItems((params, output) -> {
   //             output.accept(FabricItems.COPPER_POUCH);
   //         })
   //         .build();
}

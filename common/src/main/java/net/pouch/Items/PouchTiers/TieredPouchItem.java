package net.pouch.Items.PouchTiers;

import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.core.component.DataComponents;
import net.minecraft.network.chat.Component;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.SimpleMenuProvider;
import net.minecraft.world.entity.SlotAccess;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.ClickAction;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.BundleItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.BundleContents;
import net.minecraft.world.level.Level;
import net.pouch.main.gui.PouchMenu;
import org.apache.commons.lang3.math.Fraction;

/**
 * A tiered pouch/bundle item. Each tier has a different capacity measured in "slots."
 * Internally this maps to the bundle weight system: N slots = weight limit of N
 * (since one full item stack = weight of 1).
 *
 * Slot counts:
 *   Base Pouch = 1, Copper = 2, Iron = 4, Gold = 8,
 *   Diamond = 16, Netherite = 32, Emerald = 64
 *
 * A companion Mixin on BundleContents$Mutable reads CURRENT_SLOT_COUNT
 * to adjust the capacity check during item insertion.
 */
public class TieredPouchItem extends BundleItem {

    /**
     * ThreadLocal used to communicate the current pouch's slot count
     * to the BundleContents.Mutable mixin during insertion operations.
     */
    public static final ThreadLocal<Integer> CURRENT_SLOT_COUNT = new ThreadLocal<>();

    private final int slotCount;

    public TieredPouchItem(Properties properties, int slotCount) {
        super(properties);
        this.slotCount = slotCount;
    }

    public int getSlotCount() {
        return slotCount;
    }

    @Override
    public boolean overrideStackedOnOther(ItemStack stack, Slot slot, ClickAction action, Player player) {
        CURRENT_SLOT_COUNT.set(slotCount);
        try {
            return super.overrideStackedOnOther(stack, slot, action, player);
        } finally {
            CURRENT_SLOT_COUNT.remove();
        }
    }

    @Override
    public boolean overrideOtherStackedOnMe(ItemStack stack, ItemStack other, Slot slot, ClickAction action, Player player, SlotAccess slotAccess) {
        CURRENT_SLOT_COUNT.set(slotCount);
        try {
            return super.overrideOtherStackedOnMe(stack, other, slot, action, player, slotAccess);
        } finally {
            CURRENT_SLOT_COUNT.remove();
        }
    }

    /**
     * Right-click opens the pouch GUI instead of dumping contents (vanilla behavior).
     */
    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        if (!level.isClientSide) {
            int slotIndex = hand == InteractionHand.MAIN_HAND ? player.getInventory().selected : 40;
            player.openMenu(new SimpleMenuProvider(
                (syncId, inv, p) -> new PouchMenu(syncId, inv, slotIndex),
                stack.getHoverName()
            ));
        }
        return InteractionResultHolder.success(stack);
    }

    /**
     * Tooltip showing "X / Y" where Y is this tier's real capacity (slotCount * 64)
     * instead of vanilla's hard-coded 64.
     */
    @Override
    public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag flag) {
        BundleContents contents = stack.get(DataComponents.BUNDLE_CONTENTS);
        if (contents != null) {
            int used = Mth.mulAndTruncate(contents.weight(), 64);
            int max = slotCount * 64;
            tooltipComponents.add(
                Component.translatable("item.minecraft.bundle.fullness", used, max)
                    .withStyle(ChatFormatting.GRAY)
            );
        }
    }

    /**
     * Fullness bar width scaled to this tier's capacity instead of vanilla's fixed 1.
     */
    @Override
    public int getBarWidth(ItemStack stack) {
        BundleContents contents = stack.getOrDefault(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY);
        float fullness = contents.weight().floatValue() / (float) slotCount;
        return Math.min(1 + (int) (fullness * 12), 13);
    }
}

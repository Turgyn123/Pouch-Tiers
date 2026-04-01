package net.bundle.main.gui;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.BundleItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.component.BundleContents;
import net.bundle.Items.BundleTiers.TieredBundleItem;

/**
 * Container menu for the Bundle GUI.
 * Reads items from BundleContents on open, writes them back on close.
 *
 * Slot layout matches vanilla chest conventions:
 *   1 slot  → 1 centered slot
 *   2 slots → 1 row of 2 (centered)
 *   4 slots → 1 row of 4 (centered)
 *   8 slots → 1 row of 8 (centered)
 *  16 slots → 2 rows of 9 (last row 7)
 *  32 slots → 4 rows of 9 (last row 5)
 *  64 slots → 8 rows of 9 (last row 1)
 */
public class BundleMenu extends AbstractContainerMenu {

    private final SimpleContainer bundleContainer;
    private final int bundleSlotIndex;
    private final int slotCount;
    private final int containerRows;
    private final int containerCols;
    private final BundleColor bundleColor;
    /** Reference to the original bundle stack for identity tracking across slot moves. */
    private final ItemStack trackedBundleStack;

    /**
     * Server-side constructor — called from TieredBundleItem.use().
     */
    public BundleMenu(int syncId, Inventory playerInv, int bundleSlotIndex) {
        super(ModMenuTypes.BUNDLE_MENU, syncId);
        this.bundleSlotIndex = bundleSlotIndex;

        ItemStack bundleStack = playerInv.getItem(bundleSlotIndex);
        this.trackedBundleStack = bundleStack;
        TieredBundleItem bundleItem = (TieredBundleItem) bundleStack.getItem();
        this.slotCount = bundleItem.getSlotCount();

        // For ≤8 slots use that many columns in 1 row; for 9+ use 9 columns
        this.containerCols = Math.min(9, slotCount);
        this.containerRows = (int) Math.ceil((double) slotCount / containerCols);

        String path = BuiltInRegistries.ITEM.getKey(bundleItem).getPath();
        this.bundleColor = BundleColor.fromItemPath(path);

        this.bundleContainer = new SimpleContainer(slotCount);

        // Load items from BundleContents into container slots
        BundleContents contents = bundleStack.getOrDefault(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY);
        int idx = 0;
        for (ItemStack item : contents.items()) {
            if (idx < slotCount) {
                bundleContainer.setItem(idx++, item.copy());
            }
        }

        buildSlots(playerInv);
    }

    /**
     * Client-side constructor — called by MenuType factory.
     * Determines the bundle slot by scanning the player's inventory.
     */
    public BundleMenu(int syncId, Inventory playerInv) {
        this(syncId, playerInv, findBundleSlot(playerInv));
    }

    private static int findBundleSlot(Inventory inv) {
        if (inv.getItem(inv.selected).getItem() instanceof TieredBundleItem) {
            return inv.selected;
        }
        if (inv.getItem(40).getItem() instanceof TieredBundleItem) {
            return 40;
        }
        for (int i = 0; i < inv.getContainerSize(); i++) {
            if (inv.getItem(i).getItem() instanceof TieredBundleItem) {
                return i;
            }
        }
        return inv.selected;
    }

    private void buildSlots(Inventory playerInv) {
        // Bundle inventory slots — exactly slotCount slots, each row centered
        int slotIdx = 0;
        for (int row = 0; row < containerRows; row++) {
            int slotsInRow = Math.min(containerCols, slotCount - row * containerCols);
            int rowXStart = 8 + ((9 - slotsInRow) * 18) / 2;
            for (int col = 0; col < slotsInRow; col++) {
                int x = rowXStart + col * 18;
                int y = 18 + row * 18;
                addSlot(new BundleSlot(bundleContainer, slotIdx++, x, y));
            }
        }

        // Player inventory (3 rows of 9) — vanilla chest y-formula
        int playerInvY = containerRows * 18 + 31;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                int invIdx = 9 + row * 9 + col;
                if (invIdx == bundleSlotIndex) {
                    addSlot(new LockedSlot(playerInv, invIdx, 8 + col * 18, playerInvY + row * 18));
                } else {
                    addSlot(new Slot(playerInv, invIdx, 8 + col * 18, playerInvY + row * 18));
                }
            }
        }

        // Hotbar (1 row of 9)
        int hotbarY = containerRows * 18 + 89;
        for (int col = 0; col < 9; col++) {
            if (col == bundleSlotIndex) {
                addSlot(new LockedSlot(playerInv, col, 8 + col * 18, hotbarY));
            } else {
                addSlot(new Slot(playerInv, col, 8 + col * 18, hotbarY));
            }
        }
    }

    @Override
    public boolean stillValid(Player player) {
        return findBundleStack(player) != null;
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        if (!player.level().isClientSide) {
            List<ItemStack> items = new ArrayList<>();
            for (int i = 0; i < bundleContainer.getContainerSize(); i++) {
                ItemStack stack = bundleContainer.getItem(i);
                if (!stack.isEmpty()) {
                    items.add(stack.copy());
                }
            }

            // Try to find the bundle and save contents back
            ItemStack bundleStack = findBundleStack(player);
            if (bundleStack != null) {
                bundleStack.set(DataComponents.BUNDLE_CONTENTS, new BundleContents(items));
            } else {
                // Bundle was removed from inventory — drop items so nothing is lost
                for (ItemStack item : items) {
                    player.drop(item, false);
                }
            }
        }
    }

    /**
     * Finds the original bundle stack in the player's inventory.
     * Tries reference identity at the expected slot first, then scans the entire inventory.
     */
    private ItemStack findBundleStack(Player player) {
        Inventory inv = player.getInventory();

        // 1. Check original slot by reference identity
        ItemStack atSlot = inv.getItem(bundleSlotIndex);
        if (atSlot == trackedBundleStack && atSlot.getItem() instanceof TieredBundleItem) {
            return atSlot;
        }

        // 2. The bundle may have moved — scan inventory by reference identity
        for (int i = 0; i < inv.getContainerSize(); i++) {
            ItemStack candidate = inv.getItem(i);
            if (candidate == trackedBundleStack && candidate.getItem() instanceof TieredBundleItem) {
                return candidate;
            }
        }

        // 3. Fallback: reference was lost (e.g. serialization); match any bundle at the original slot
        if (atSlot.getItem() instanceof TieredBundleItem) {
            return atSlot;
        }

        return null;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        Slot slot = this.slots.get(index);
        if (!slot.hasItem()) return ItemStack.EMPTY;

        ItemStack slotStack = slot.getItem();
        ItemStack result = slotStack.copy();

        if (index < slotCount) {
            // Shift-click from bundle → player inventory
            if (!moveItemStackTo(slotStack, slotCount, slotCount + 36, true)) {
                return ItemStack.EMPTY;
            }
        } else {
            // Shift-click from player → bundle
            if (!moveItemStackTo(slotStack, 0, slotCount, false)) {
                return ItemStack.EMPTY;
            }
        }

        if (slotStack.isEmpty()) {
            slot.set(ItemStack.EMPTY);
        } else {
            slot.setChanged();
        }
        return result;
    }

    public int getContainerRows() {
        return containerRows;
    }

    public int getContainerCols() {
        return containerCols;
    }

    public int getSlotCount() {
        return slotCount;
    }

    public BundleColor getBundleColor() {
        return bundleColor;
    }

    // ── Inner slot classes ──────────────────────────────────────────────

    /** Slot inside the bundle GUI. Prevents placing bundles/bundles (no nesting). */
    private static class BundleSlot extends Slot {
        BundleSlot(Container container, int slot, int x, int y) {
            super(container, slot, x, y);
        }

        @Override
        public boolean mayPlace(ItemStack stack) {
            return !(stack.getItem() instanceof BundleItem);
        }
    }

    /** Locked slot for the bundle's own inventory position — cannot be moved. */
    private static class LockedSlot extends Slot {
        LockedSlot(Container container, int slot, int x, int y) {
            super(container, slot, x, y);
        }

        @Override
        public boolean mayPickup(Player player) {
            return false;
        }

        @Override
        public boolean mayPlace(ItemStack stack) {
            return false;
        }
    }
}

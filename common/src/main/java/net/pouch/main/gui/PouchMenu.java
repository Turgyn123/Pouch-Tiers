package net.pouch.main.gui;

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
import net.pouch.Items.PouchTiers.TieredPouchItem;

/**
 * Container menu for the Pouch GUI.
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
public class PouchMenu extends AbstractContainerMenu {

    private final SimpleContainer pouchContainer;
    private final int pouchSlotIndex;
    private final int slotCount;
    private final int containerRows;
    private final int containerCols;
    private final PouchColor pouchColor;

    /**
     * Server-side constructor — called from TieredPouchItem.use().
     */
    public PouchMenu(int syncId, Inventory playerInv, int pouchSlotIndex) {
        super(ModMenuTypes.POUCH_MENU, syncId);
        this.pouchSlotIndex = pouchSlotIndex;

        ItemStack pouchStack = playerInv.getItem(pouchSlotIndex);
        TieredPouchItem pouchItem = (TieredPouchItem) pouchStack.getItem();
        this.slotCount = pouchItem.getSlotCount();

        // For ≤8 slots use that many columns in 1 row; for 9+ use 9 columns
        this.containerCols = Math.min(9, slotCount);
        this.containerRows = (int) Math.ceil((double) slotCount / containerCols);

        String path = BuiltInRegistries.ITEM.getKey(pouchItem).getPath();
        this.pouchColor = PouchColor.fromItemPath(path);

        this.pouchContainer = new SimpleContainer(slotCount);

        // Load items from BundleContents into container slots
        BundleContents contents = pouchStack.getOrDefault(DataComponents.BUNDLE_CONTENTS, BundleContents.EMPTY);
        int idx = 0;
        for (ItemStack item : contents.items()) {
            if (idx < slotCount) {
                pouchContainer.setItem(idx++, item.copy());
            }
        }

        buildSlots(playerInv);
    }

    /**
     * Client-side constructor — called by MenuType factory.
     * Determines the pouch slot by scanning the player's inventory.
     */
    public PouchMenu(int syncId, Inventory playerInv) {
        this(syncId, playerInv, findPouchSlot(playerInv));
    }

    private static int findPouchSlot(Inventory inv) {
        if (inv.getItem(inv.selected).getItem() instanceof TieredPouchItem) {
            return inv.selected;
        }
        if (inv.getItem(40).getItem() instanceof TieredPouchItem) {
            return 40;
        }
        for (int i = 0; i < inv.getContainerSize(); i++) {
            if (inv.getItem(i).getItem() instanceof TieredPouchItem) {
                return i;
            }
        }
        return inv.selected;
    }

    private void buildSlots(Inventory playerInv) {
        // Pouch inventory slots — exactly slotCount slots, each row centered
        int slotIdx = 0;
        for (int row = 0; row < containerRows; row++) {
            int slotsInRow = Math.min(containerCols, slotCount - row * containerCols);
            int rowXStart = 8 + ((9 - slotsInRow) * 18) / 2;
            for (int col = 0; col < slotsInRow; col++) {
                int x = rowXStart + col * 18;
                int y = 18 + row * 18;
                addSlot(new PouchSlot(pouchContainer, slotIdx++, x, y));
            }
        }

        // Player inventory (3 rows of 9) — vanilla chest y-formula
        int playerInvY = containerRows * 18 + 31;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                int invIdx = 9 + row * 9 + col;
                if (invIdx == pouchSlotIndex) {
                    addSlot(new LockedSlot(playerInv, invIdx, 8 + col * 18, playerInvY + row * 18));
                } else {
                    addSlot(new Slot(playerInv, invIdx, 8 + col * 18, playerInvY + row * 18));
                }
            }
        }

        // Hotbar (1 row of 9)
        int hotbarY = containerRows * 18 + 89;
        for (int col = 0; col < 9; col++) {
            if (col == pouchSlotIndex) {
                addSlot(new LockedSlot(playerInv, col, 8 + col * 18, hotbarY));
            } else {
                addSlot(new Slot(playerInv, col, 8 + col * 18, hotbarY));
            }
        }
    }

    @Override
    public boolean stillValid(Player player) {
        return player.getInventory().getItem(pouchSlotIndex).getItem() instanceof TieredPouchItem;
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        if (!player.level().isClientSide) {
            ItemStack pouchStack = player.getInventory().getItem(pouchSlotIndex);
            if (pouchStack.getItem() instanceof TieredPouchItem) {
                List<ItemStack> items = new ArrayList<>();
                for (int i = 0; i < pouchContainer.getContainerSize(); i++) {
                    ItemStack stack = pouchContainer.getItem(i);
                    if (!stack.isEmpty()) {
                        items.add(stack.copy());
                    }
                }
                pouchStack.set(DataComponents.BUNDLE_CONTENTS, new BundleContents(items));
            }
        }
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        Slot slot = this.slots.get(index);
        if (!slot.hasItem()) return ItemStack.EMPTY;

        ItemStack slotStack = slot.getItem();
        ItemStack result = slotStack.copy();

        if (index < slotCount) {
            // Shift-click from pouch → player inventory
            if (!moveItemStackTo(slotStack, slotCount, slotCount + 36, true)) {
                return ItemStack.EMPTY;
            }
        } else {
            // Shift-click from player → pouch
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

    public PouchColor getPouchColor() {
        return pouchColor;
    }

    // ── Inner slot classes ──────────────────────────────────────────────

    /** Slot inside the pouch GUI. Prevents placing bundles/pouches (no nesting). */
    private static class PouchSlot extends Slot {
        PouchSlot(Container container, int slot, int x, int y) {
            super(container, slot, x, y);
        }

        @Override
        public boolean mayPlace(ItemStack stack) {
            return !(stack.getItem() instanceof BundleItem);
        }
    }

    /** Locked slot for the pouch's own inventory position — cannot be moved. */
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

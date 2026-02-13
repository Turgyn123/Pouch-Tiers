package net.pouch.main.gui;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Inventory;

/**
 * Renders the Pouch GUI with a dynamically-colored background
 * matching the pouch's dye color. All rendering is programmatic
 * (no texture PNGs needed). Uses the vanilla chest height formula
 * so player inventory aligns perfectly with the hotbar.
 *
 * Small pouches (≤8 slots) center their slots horizontally.
 * Large pouches (9+) fill 9-column rows like a standard chest.
 */
public class PouchScreen extends AbstractContainerScreen<PouchMenu> {

    private final int rows;
    private final int cols;
    private final int slotCount;
    private final int baseColor;

    public PouchScreen(PouchMenu menu, Inventory playerInv, Component title) {
        super(menu, playerInv, title);
        this.rows = menu.getContainerRows();
        this.cols = menu.getContainerCols();
        this.slotCount = menu.getSlotCount();
        this.baseColor = 0xFF000000 | menu.getPouchColor().getRgb();

        // Vanilla chest formula: 114 + rows * 18
        this.imageHeight = 114 + rows * 18;
        this.imageWidth = 176;
        this.inventoryLabelY = this.imageHeight - 94;
    }

    @Override
    protected void renderBg(GuiGraphics g, float partialTick, int mouseX, int mouseY) {
        int x = this.leftPos;
        int y = this.topPos;

        int dark = darken(baseColor, 0.35f);
        int medium = darken(baseColor, 0.55f);
        int light = brighten(baseColor, 0.15f);

        // ═══ Pouch section ═══
        int pouchH = rows * 18 + 19;

        // Outer border (3D raised panel)
        g.fill(x, y, x + imageWidth, y + pouchH, dark);
        g.fill(x, y, x + imageWidth - 1, y + pouchH - 1, light);
        g.fill(x + 2, y + 2, x + imageWidth - 2, y + pouchH - 2, medium);

        // Title area
        g.fill(x + 4, y + 4, x + imageWidth - 4, y + 14, baseColor);

        // Inner panel for slots
        g.fill(x + 4, y + 15, x + imageWidth - 4, y + pouchH - 3, baseColor);

        // Pouch slot backgrounds — each row individually centered
        for (int row = 0; row < rows; row++) {
            int slotsInRow = Math.min(cols, slotCount - row * cols);
            int rowXStart = 8 + ((9 - slotsInRow) * 18) / 2;
            for (int col = 0; col < slotsInRow; col++) {
                int sx = x + rowXStart + col * 18;
                int sy = y + 18 + row * 18;
                drawSlotBackground(g, sx, sy, darken(baseColor, 0.25f), darken(baseColor, 0.6f));
            }
        }

        // ═══ Player inventory section ═══
        int playerY = y + pouchH;
        int playerH = imageHeight - pouchH;

        int grayBase = 0xFFC6C6C6;
        int grayDark = 0xFF555555;
        int grayLight = 0xFFFFFFFF;

        // 3D raised panel
        g.fill(x, playerY, x + imageWidth, playerY + playerH, grayDark);
        g.fill(x, playerY, x + imageWidth - 1, playerY + playerH - 1, grayLight);
        g.fill(x + 2, playerY + 2, x + imageWidth - 2, playerY + playerH - 2, grayBase);

        // Player inventory slot backgrounds (3 rows × 9)
        int invStartY = y + rows * 18 + 31;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                drawSlotBackground(g, x + 8 + col * 18, invStartY + row * 18,
                        0xFF8B8B8B, 0xFF373737);
            }
        }

        // Hotbar (1 row × 9)
        int hotbarY = y + rows * 18 + 89;
        for (int col = 0; col < 9; col++) {
            drawSlotBackground(g, x + 8 + col * 18, hotbarY,
                    0xFF8B8B8B, 0xFF373737);
        }
    }

    /** Draws a single slot background with a 3D inset look. */
    private void drawSlotBackground(GuiGraphics g, int x, int y, int bg, int shadow) {
        g.fill(x - 1, y - 1, x + 17, y, shadow);       // top edge
        g.fill(x - 1, y, x, y + 17, shadow);             // left edge
        g.fill(x, y + 16, x + 17, y + 17, 0xFFFFFFFF);  // bottom edge
        g.fill(x + 16, y, x + 17, y + 16, 0xFFFFFFFF);  // right edge
        g.fill(x, y, x + 16, y + 16, bg);                // interior
    }

    @Override
    public void render(GuiGraphics g, int mouseX, int mouseY, float partialTick) {
        super.render(g, mouseX, mouseY, partialTick);
        this.renderTooltip(g, mouseX, mouseY);
    }

    @Override
    protected void renderLabels(GuiGraphics g, int mouseX, int mouseY) {
        int titleColor = isColorDark(baseColor) ? 0xFFFFFF : 0x404040;
        g.drawString(this.font, this.title, this.titleLabelX, this.titleLabelY, titleColor, false);
        g.drawString(this.font, this.playerInventoryTitle, this.inventoryLabelX, this.inventoryLabelY, 0x404040, false);
    }

    // ── Color utilities ─────────────────────────────────────────────────

    private static int darken(int argb, float factor) {
        int a = (argb >> 24) & 0xFF;
        int r = (int) (((argb >> 16) & 0xFF) * factor);
        int g = (int) (((argb >> 8) & 0xFF) * factor);
        int b = (int) ((argb & 0xFF) * factor);
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private static int brighten(int argb, float amount) {
        int a = (argb >> 24) & 0xFF;
        int r = Math.min(255, (int) (((argb >> 16) & 0xFF) + 255 * amount));
        int g = Math.min(255, (int) (((argb >> 8) & 0xFF) + 255 * amount));
        int b = Math.min(255, (int) ((argb & 0xFF) + 255 * amount));
        return (a << 24) | (r << 16) | (g << 8) | b;
    }

    private static boolean isColorDark(int argb) {
        int r = (argb >> 16) & 0xFF;
        int g = (argb >> 8) & 0xFF;
        int b = argb & 0xFF;
        return (r * 0.299 + g * 0.587 + b * 0.114) < 128;
    }
}

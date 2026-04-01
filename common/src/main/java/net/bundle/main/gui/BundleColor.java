package net.bundle.main.gui;

/**
 * Maps each of the 16 Minecraft dye colors (+ default leather brown)
 * to an RGB value used for the bundle GUI background tinting.
 */
public enum BundleColor {
    DEFAULT(0x835432),
    WHITE(0xF9FFFE),
    LIGHT_GRAY(0x9D9D97),
    GRAY(0x474F52),
    BLACK(0x1D1D21),
    BROWN(0x835432),
    RED(0xB02E26),
    ORANGE(0xF9801D),
    YELLOW(0xFED83D),
    LIME(0x80C71F),
    GREEN(0x5E7C16),
    CYAN(0x169C9C),
    LIGHT_BLUE(0x3AB3DA),
    BLUE(0x3C44AA),
    PURPLE(0x8932B8),
    MAGENTA(0xC74EBD),
    PINK(0xF38BAA);

    private final int rgb;

    BundleColor(int rgb) {
        this.rgb = rgb;
    }

    public int getRgb() {
        return rgb;
    }

    /**
     * Derives the bundle GUI color from the item's registry path.
     * e.g. "red_bundle" → RED, "red_copper_bundle" → RED, "bundle" → DEFAULT.
     */
    public static BundleColor fromItemPath(String path) {
        // Check multi-word colors first to avoid partial matches
        if (path.startsWith("light_blue_")) return LIGHT_BLUE;
        if (path.startsWith("light_gray_")) return LIGHT_GRAY;
        if (path.startsWith("white_")) return WHITE;
        if (path.startsWith("gray_")) return GRAY;
        if (path.startsWith("black_")) return BLACK;
        if (path.startsWith("brown_")) return BROWN;
        if (path.startsWith("red_")) return RED;
        if (path.startsWith("orange_")) return ORANGE;
        if (path.startsWith("yellow_")) return YELLOW;
        if (path.startsWith("lime_")) return LIME;
        if (path.startsWith("green_")) return GREEN;
        if (path.startsWith("cyan_")) return CYAN;
        if (path.startsWith("blue_")) return BLUE;
        if (path.startsWith("purple_")) return PURPLE;
        if (path.startsWith("magenta_")) return MAGENTA;
        if (path.startsWith("pink_")) return PINK;
        return DEFAULT;
    }
}

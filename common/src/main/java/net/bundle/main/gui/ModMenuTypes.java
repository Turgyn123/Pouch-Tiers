package net.bundle.main.gui;

import net.minecraft.world.inventory.MenuType;

/**
 * Holds a static reference to the registered BundleMenu MenuType.
 * Each loader sets this during its registration phase.
 */
public class ModMenuTypes {

    private static MenuType<BundleMenu> bundleMenu;

    public static MenuType<BundleMenu> getBundleMenu() {
        return bundleMenu;
    }

    public static void setBundleMenu(MenuType<BundleMenu> menuType) {
        bundleMenu = menuType;
    }

    // Optional: helper method for screen registration
    public static MenuType<BundleMenu> BUNDLE_MENU = null; // Keep this for backward compatibility
}

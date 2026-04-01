package net.bundle.main.gui;

import net.minecraft.world.inventory.MenuType;

/**
 * Holds a static reference to the registered BundleMenu MenuType.
 * Each loader sets this during its registration phase.
 */
public class ModMenuTypes {
    public static MenuType<BundleMenu> BUNDLE_MENU;
}

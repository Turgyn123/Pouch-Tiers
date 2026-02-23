package net.pouch.main.gui;

import net.minecraft.world.inventory.MenuType;

/**
 * Holds a static reference to the registered PouchMenu MenuType.
 * Each loader sets this during its registration phase.
 */
public class ModMenuTypes {

    private static MenuType<PouchMenu> pouchMenu;

    public static MenuType<PouchMenu> getPouchMenu() {
        return pouchMenu;
    }

    public static void setPouchMenu(MenuType<PouchMenu> menuType) {
        pouchMenu = menuType;
    }

    // Optional: helper method for screen registration
    public static MenuType<PouchMenu> POUCH_MENU = null; // Keep this for backward compatibility
}

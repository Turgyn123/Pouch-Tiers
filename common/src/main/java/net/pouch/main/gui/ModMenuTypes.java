package net.pouch.main.gui;

import net.minecraft.world.inventory.MenuType;

/**
 * Holds a static reference to the registered PouchMenu MenuType.
 * Each loader sets this during its registration phase.
 */
public class ModMenuTypes {
    public static MenuType<PouchMenu> POUCH_MENU;
}

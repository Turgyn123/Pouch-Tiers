package net.pouch.Items.PouchTiers.pouch;

import net.pouch.Items.PouchTiers.TieredPouchItem;

/**
 * Base pouch - 1 slot (standard vanilla bundle capacity = 1/64).
 * This is the starter tier crafted from leather + string.
 */
public class Pouch extends TieredPouchItem {

    public Pouch(Properties properties) {
        super(properties, 1);
    }
}

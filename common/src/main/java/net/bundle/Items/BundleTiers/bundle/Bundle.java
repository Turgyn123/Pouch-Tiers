package net.bundle.Items.BundleTiers.bundle;

import net.bundle.Items.BundleTiers.TieredBundleItem;

/**
 * Base bundle - 1 slot (standard vanilla bundle capacity = 1/64).
 * This is the starter tier crafted from leather + string.
 */
public class Bundle extends TieredBundleItem {

    public Bundle(Properties properties) {
        super(properties, 1);
    }
}

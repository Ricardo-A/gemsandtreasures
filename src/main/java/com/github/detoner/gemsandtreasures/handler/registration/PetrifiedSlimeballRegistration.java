package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;

public class PetrifiedSlimeballRegistration extends BaseRegistration {

    /*
     * Items
     */
    public static ItemBase petrified_slimeball;

    public void init() {
        if (GemsSettings.settings.petrifiedSlimeEnabled) {
            petrified_slimeball = new ItemBase("petrified_slimeball");
            items.add(petrified_slimeball);
        }
    }
}

package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;

public class DiamondRegistration extends BaseRegistration {

    /*
     * Items
     */
    public static ItemBase blood_diamond;
    public static ItemBase golden_diamond;
    public static ItemBase perfect_diamond;
    public static ItemBase royal_diamond;

    public void init() {
        /*
         * Blood Diamond
         */

        if (GemsSettings.settings.bloodDiamondEnabled) {
            blood_diamond = new ItemBase("blood_diamond");
            items.add(blood_diamond);
        }

        /*
         * Golden Diamond
         */

        if (GemsSettings.settings.goldenDiamondEnabled) {
            golden_diamond = new ItemBase("golden_diamond");
            items.add(golden_diamond);
        }

        /*
         * Perfect Diamond
         */

        if (GemsSettings.settings.perfectDiamondEnabled) {
            perfect_diamond = new ItemBase("perfect_diamond");
            items.add(perfect_diamond);
        }

        /*
         * Royal Diamond
         */

        if (GemsSettings.settings.royalDiamondEnabled) {
            royal_diamond = new ItemBase("royal_diamond");
            items.add(royal_diamond);
        }
    }
}

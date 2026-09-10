package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.base.BlockBaseGlass;
import com.github.detoner.gemsandtreasures.block.ores.TigersEyeOre;
import com.github.detoner.gemsandtreasures.block.ores.TigersEyeSandOre;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.item.ItemScrollOfReturn;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import com.github.detoner.gemsandtreasures.settings.TigersEyeSettings;
import com.github.detoner.gemsandtreasures.settings.TreasuresSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TigersEyeRegistration extends BaseRegistration{

    /*
     * Items
     */
    public static ItemBase tigers_eye;
    public static ItemScrollOfReturn scroll_of_return;

    /*
     * Blocks
     */
    public static Block tigers_eye_block;
    public static Block tigers_eye_ore;
    public static Block tigers_eye_sand_ore;
    public static Block tigers_eye_glass;

    public void init() {
        if (!GemsSettings.settings.tigersEyeEnabled) {
            return;
        }

        /*
         * Item
         */

        tigers_eye = new ItemBase("tigers_eye");
        items.add(tigers_eye);

        /*
         * Scroll of Return
         */

        if (TreasuresSettings.settings.scrollOfReturnEnabled) {
            scroll_of_return = new ItemScrollOfReturn();
            items.add(scroll_of_return);
        }

        /*
         * Blocks
         */

        tigers_eye_block = new BlockBase(
                Material.ROCK,
                "tigers_eye_block"
        ).setHardness(5.0f).setResistance(8.0f);
        blocks.add(tigers_eye_block);

        tigers_eye_glass = new BlockBaseGlass(
                Material.GLASS,
                "tigers_eye_glass"
        ).setHardness(1f).setResistance(1f).setLightOpacity(15);
        blocks.add(tigers_eye_glass);

        /*
         * Stone Tiger's Eye Ore
         */

        if (TigersEyeSettings.settings.stoneTigersEyeEnabled) {
            tigers_eye_ore = new TigersEyeOre(
                    Material.ROCK,
                    "tigers_eye_ore"
            );
            blocks.add(tigers_eye_ore);
        }

        /*
         * Sand Tiger's Eye Ore
         */

        if (TigersEyeSettings.settings.sandTigersEyeEnabled) {
            tigers_eye_sand_ore = new TigersEyeSandOre(
                    Material.SAND,
                    "tigers_eye_sand_ore"
            );
            blocks.add(tigers_eye_sand_ore);
        }
    }
}

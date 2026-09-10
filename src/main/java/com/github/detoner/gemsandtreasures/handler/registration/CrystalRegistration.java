package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.ores.CrystalOre;
import com.github.detoner.gemsandtreasures.block.ores.MoonCrystalOre;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CrystalRegistration extends BaseRegistration{

    /*
     * Items
     */
    public static ItemBase crystal;
    public static ItemBase moon_crystal;

    /*
     * Blocks
     */
    public static Block crystal_block;
    public static Block crystal_ore;

    public static Block moon_crystal_block;
    public static Block moon_crystal_ore;

    public void init() {
        /*
         * Crystal
         */

        if (GemsSettings.settings.crystalEnabled) {

            /*
             * Item
             */

            crystal = new ItemBase("crystal");
            items.add(crystal);

            /*
             * Block
             */

            crystal_block = new BlockBase(
                    Material.ROCK,
                    "crystal_block"
            ).setHardness(5.0f).setResistance(8.0f);
            blocks.add(crystal_block);

            /*
             * Ore
             */

            crystal_ore = new CrystalOre(
                    Material.ROCK,
                    "crystal_ore"
            );
            blocks.add(crystal_ore);
        }

        /*
         * Moon Crystal
         */

        if (GemsSettings.settings.moonCrystalEnabled) {

            /*
             * Item
             */

            moon_crystal = new ItemBase("moon_crystal");
            items.add(moon_crystal);

            /*
             * Block
             */

            moon_crystal_block = new BlockBase(
                    Material.ROCK,
                    "moon_crystal_block"
            ).setHardness(5.0f).setResistance(8.0f);
            blocks.add(moon_crystal_block);

            /*
             * Ore
             */

            moon_crystal_ore = new MoonCrystalOre(
                    Material.ROCK,
                    "moon_crystal_ore"
            );
            blocks.add(moon_crystal_ore);
        }
    }
}

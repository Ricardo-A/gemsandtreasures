package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.ores.TopazDirtOre;
import com.github.detoner.gemsandtreasures.block.ores.TopazOre;
import com.github.detoner.gemsandtreasures.block.ores.TopazSoulSandOre;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class TopazRegistration extends BaseRegistration {

    /*
     * Items
     */
    public static ItemBase topaz;

    /*
     * Blocks
     */
    public static Block topaz_block;
    public static Block topaz_ore;
    public static Block topaz_dirt_ore;
    public static Block topaz_soul_sand_ore;

    public void init() {
        if (!GemsSettings.settings.topazEnabled) {
            return;
        }

        /*
         * Item
         */

        topaz = new ItemBase("topaz");
        items.add(topaz);

        /*
         * Block
         */

        topaz_block = new BlockBase(
                Material.ROCK,
                "topaz_block"
        ).setHardness(5.0f).setResistance(8.0f);
        blocks.add(topaz_block);

        /*
         * Ores
         */

        topaz_ore = new TopazOre(
                Material.ROCK,
                "topaz_ore"
        );
        blocks.add(topaz_ore);

        topaz_dirt_ore = new TopazDirtOre(
                Material.ROCK,
                "topaz_dirt_ore"
        );
        blocks.add(topaz_dirt_ore);

        topaz_soul_sand_ore = new TopazSoulSandOre(
                Material.SAND,
                "topaz_soul_sand_ore"
        );
        blocks.add(topaz_soul_sand_ore);
    }
}

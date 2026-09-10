package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.ores.PinkDiamondOre;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class PinkDiamondRegistration extends BaseRegistration {

    /*
     * Items
     */
    public static ItemBase pink_diamond;

    /*
     * Blocks
     */
    public static Block pink_diamond_block;
    public static Block pink_diamond_ore;

    public void init() {
        if (!GemsSettings.settings.pinkDiamondEnabled) {
            return;
        }

        /*
         * Item
         */

        pink_diamond = new ItemBase("pink_diamond");
        items.add(pink_diamond);

        /*
         * Block
         */

        pink_diamond_block = new BlockBase(
                Material.ROCK,
                "pink_diamond_block"
        ).setHardness(6.0f).setResistance(8.0f);
        blocks.add(pink_diamond_block);

        /*
         * Ore
         */

        pink_diamond_ore = new PinkDiamondOre(
                Material.ROCK,
                "pink_diamond_ore"
        );
        blocks.add(pink_diamond_ore);
    }
}

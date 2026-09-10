package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.ores.RubyOre;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RubyRegistration extends BaseRegistration{

    /*
     * Items
     */
    public static ItemBase ruby;

    /*
     * Blocks
     */
    public static Block ruby_block;
    public static Block ruby_ore;

    public void init() {
        if (!GemsSettings.settings.rubyEnabled) {
            return;
        }

        /*
         * Item
         */

        ruby = new ItemBase("ruby");
        items.add(ruby);

        /*
         * Blocks
         */

        ruby_block = new BlockBase(
                Material.ROCK,
                "ruby_block"
        ).setHardness(5.0f).setResistance(8.0f);
        blocks.add(ruby_block);

        /*
         * Ore
         */

        ruby_ore = new RubyOre(
                Material.ROCK,
                "ruby_ore"
        );
        blocks.add(ruby_ore);
    }
}

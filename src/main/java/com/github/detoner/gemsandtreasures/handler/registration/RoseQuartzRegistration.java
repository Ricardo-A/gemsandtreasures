package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.ores.RoseQuartzOre;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RoseQuartzRegistration extends BaseRegistration {

    /*
     * Items
     */
    public static ItemBase rose_quartz;

    /*
     * Blocks
     */
    public static Block rose_quartz_block;
    public static Block rose_quartz_ore;

    public void init() {
        if (GemsSettings.settings.roseQuartzEnabled) {
            rose_quartz = new ItemBase("rose_quartz");
            items.add(rose_quartz);

            rose_quartz_block = new BlockBase(
                    Material.ROCK,
                    "rose_quartz_block"
            ).setHardness(5.0f).setResistance(8.0f);
            blocks.add(rose_quartz_block);

            rose_quartz_ore = new RoseQuartzOre(
                    Material.ROCK,
                    "rose_quartz_ore"
            );
            blocks.add(rose_quartz_ore);
        }
    }
}

package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.ores.AmethystOre;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AmethystRegistration extends BaseRegistration{

    /*
     * Items
     */
    public static ItemBase amethyst;

    /*
     * Blocks
     */
    public static Block amethyst_block;
    public static Block amethyst_ore;

    public void init() {
        if (!GemsSettings.settings.amethystEnabled) {
            return;
        }
        amethyst = new ItemBase("amethyst");
        items.add(amethyst);

        amethyst_block = new BlockBase(
                Material.ROCK,
                "amethyst_block"
        ).setHardness(5.0f).setResistance(8.0f);
        blocks.add(amethyst_block);

        amethyst_ore = new AmethystOre(
                Material.ROCK,
                "amethyst_ore"
        );
        blocks.add(amethyst_ore);
    }
}

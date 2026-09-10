package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.ores.AquamarineClayOre;
import com.github.detoner.gemsandtreasures.block.ores.AquamarineOre;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class AquamarineRegistration extends BaseRegistration{

    /*
     * Items
     */
    public static ItemBase aquamarine;

    /*
     * Blocks
     */
    public static Block aquamarine_block;
    public static Block aquamarine_ore;
    public static Block aquamarine_clay_ore;

    public void init() {
        if (!GemsSettings.settings.aquamarineEnabled) {
            return;
        }

        aquamarine = new ItemBase("aquamarine");
        items.add(aquamarine);

        aquamarine_block = new BlockBase(
                Material.ROCK,
                "aquamarine_block"
        ).setHardness(5.0f).setResistance(8.0f);
        blocks.add(aquamarine_block);

        aquamarine_ore = new AquamarineOre(
                Material.ROCK,
                "aquamarine_ore"
        );
        blocks.add(aquamarine_ore);

        aquamarine_clay_ore = new AquamarineClayOre(
                Material.ROCK,
                "aquamarine_clay_ore"
        );
        blocks.add(aquamarine_clay_ore);
    }
}

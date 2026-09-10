package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.ores.OnyxOre;
import com.github.detoner.gemsandtreasures.block.ores.OnyxSoulSandOre;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class OnyxRegistration extends BaseRegistration{

    /*
     * Items
     */
    public static ItemBase onyx;

    /*
     * Blocks
     */
    public static Block onyx_block;
    public static Block onyx_ore;
    public static Block onyx_soulsand_ore;

    public void init() {
        if (GemsSettings.settings.onyxEnabled) {
            onyx = new ItemBase("onyx");
            items.add(onyx);

            onyx_block = new BlockBase(
                    Material.ROCK,
                    "onyx_block"
            ).setHardness(5.0f).setResistance(8.0f);
            blocks.add(onyx_block);

            onyx_ore = new OnyxOre(
                    Material.ROCK,
                    "onyx_ore"
            );
            blocks.add(onyx_ore);

            onyx_soulsand_ore = new OnyxSoulSandOre(
                    Material.ROCK,
                    "onyx_soulsand_ore"
            );
            blocks.add(onyx_soulsand_ore);
        }
    }
}

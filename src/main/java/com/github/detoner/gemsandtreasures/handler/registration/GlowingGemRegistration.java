package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.base.BlockBaseGlass;
import com.github.detoner.gemsandtreasures.block.ores.GlowingGemOre;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class GlowingGemRegistration extends BaseRegistration {

    /*
     * Items
     */
    public static ItemBase glowing_gem;

    /*
     * Blocks
     */
    public static Block glowing_gem_block;
    public static Block glowing_gem_ore;
    public static Block glowing_gem_glass;
    public static Block glowing_glass;

    public void init() {
        if (!GemsSettings.settings.glowingGemEnabled) {
            return;
        }

        /*
         * Item
         */

        glowing_gem = new ItemBase("glowing_gem");
        items.add(glowing_gem);

        /*
         * Block
         */

        glowing_gem_block = new BlockBase(
                Material.ROCK,
                "glowing_gem_block"
        ).setHardness(3.0f).setResistance(5.0f).setLightLevel(1f);
        blocks.add(glowing_gem_block);

        /*
         * Ore
         */

        glowing_gem_ore = new GlowingGemOre(
                Material.GLASS,
                "glowing_gem_ore"
        );
        blocks.add(glowing_gem_ore);

        /*
         * Glass
         */

        glowing_gem_glass = new BlockBaseGlass(
                Material.GLASS,
                "glowing_gem_glass"
        ).setHardness(2f).setResistance(2f).setLightLevel(1f).setLightOpacity(1);
        blocks.add(glowing_gem_glass);

        glowing_glass = new BlockBaseGlass(
                Material.GLASS,
                "glowing_glass"
        ).setHardness(1f).setResistance(1f).setLightOpacity(15).setLightLevel(1f);
        blocks.add(glowing_glass);
    }
}

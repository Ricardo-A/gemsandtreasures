package com.github.detoner.gemsandtreasures.handler.registration;

import java.util.ArrayList;
import java.util.List;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.base.ItemBlockBase;
import com.github.detoner.gemsandtreasures.block.ores.SapphireOre;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SapphireRegistration extends BaseRegistration {

    /*
     * Items
     */
    public static ItemBase sapphire;

    /*
     * Blocks
     */
    public static Block sapphire_block;
    public static Block sapphire_ore;

    public void init() {
        if (!GemsSettings.settings.sapphireEnabled) {
            return;
        }

        /*
         * Item
         */

        sapphire = new ItemBase("sapphire");
        items.add(sapphire);

        /*
         * Block
         */

        sapphire_block = new BlockBase(
                Material.ROCK,
                "sapphire_block"
        ).setHardness(5.0f).setResistance(8.0f);
        blocks.add(sapphire_block);

        /*
         * Ore
         */

        sapphire_ore = new SapphireOre(
                Material.ROCK,
                "sapphire_ore"
        );
        blocks.add(sapphire_ore);
    }
}

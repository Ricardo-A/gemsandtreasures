package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.ores.BlackMarbleOre;
import com.github.detoner.gemsandtreasures.block.ores.MarbleOre;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.AddonsSettings;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import com.github.detoner.gemsandtreasures.settings.MarbleSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.Loader;

import java.util.ArrayList;
import java.util.List;

public class MarbleRegistration extends BaseRegistration{

    /*
     * Items
     */
    public static ItemBase marble;
    public static ItemBase black_marble;

    /*
     * Blocks
     */
    public static Block marble_block;
    public static Block black_marble_block;

    public static Block marble_ore;
    public static Block black_marble_ore;

    public static List<Block> marbleChiselBlocks = new ArrayList<>();
    public static List<Block> blackMarbleChiselBlocks = new ArrayList<>();

    public static final int CHISEL_VARIANTS = 4;

    public void init() {
        if (!GemsSettings.settings.marbleEnabled) {
            return;
        }

        /*
         * White Marble
         */

        if (MarbleSettings.settings.whiteMarbleEnabled) {

            marble = new ItemBase("marble");
            items.add(marble);

            marble_block = new BlockBase(
                    Material.ROCK,
                    "marble_block"
            ).setHardness(2.0f).setResistance(6.0f);
            blocks.add(marble_block);

            marble_ore = new MarbleOre(
                    Material.ROCK,
                    "marble_ore"
            ).setHardness(3.0f).setResistance(5.0f);
            blocks.add(marble_ore);

            if(AddonsSettings.settings.chiselAddonEnabled && Loader.isModLoaded("chisel")) {
                for(int i = 1; i <= CHISEL_VARIANTS; i++) {
                    Block marbleVariant = new BlockBase(
                            Material.ROCK, "marble_block"+ i
                    ).setHardness(2.0f).setResistance(6.0f);

                    blocks.add(marbleVariant);
                    marbleChiselBlocks.add(marbleVariant);
                }
            }
        }

        /*
         * Black Marble
         */

        if (MarbleSettings.settings.blackMarbleEnabled) {

            black_marble = new ItemBase("black_marble");
            items.add(black_marble);

            black_marble_block = new BlockBase(
                    Material.ROCK,
                    "black_marble_block"
            ).setHardness(2.0f).setResistance(6.0f);
            blocks.add(black_marble_block);

            black_marble_ore = new BlackMarbleOre(
                    Material.ROCK,
                    "black_marble_ore"
            ).setHardness(3.0f).setResistance(5.0f);
            blocks.add(black_marble_ore);

            if(AddonsSettings.settings.chiselAddonEnabled && Loader.isModLoaded("chisel")) {
                for(int i = 1; i <= CHISEL_VARIANTS; i++) {
                    Block blackMarbleVariant = new BlockBase(
                            Material.ROCK, "black_marble_block"+ i
                    ).setHardness(2.0f).setResistance(6.0f);

                    blocks.add(blackMarbleVariant);
                    blackMarbleChiselBlocks.add(blackMarbleVariant);
                }
            }
        }
    }
}
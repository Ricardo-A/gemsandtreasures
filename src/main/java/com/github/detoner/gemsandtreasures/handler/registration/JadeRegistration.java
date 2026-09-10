package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.base.BlockBaseGlass;
import com.github.detoner.gemsandtreasures.block.ores.FireJadeOre;
import com.github.detoner.gemsandtreasures.block.ores.JadeOre;
import com.github.detoner.gemsandtreasures.block.ores.VoidJadeOre;
import com.github.detoner.gemsandtreasures.item.ItemJade;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import com.github.detoner.gemsandtreasures.settings.JadeSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class JadeRegistration extends BaseRegistration{

    /*
     * Items
     */
    public static ItemJade jade;
    public static ItemJade fire_jade;
    public static ItemJade void_jade;
    public static ItemJade white_jade;
    public static ItemJade golden_jade;
    public static ItemJade prismatic_jade;

    /*
     * Blocks
     */
    public static Block jade_block;
    public static Block fire_jade_block;
    public static Block void_jade_block;
    public static Block white_jade_block;
    public static Block golden_jade_block;
    public static Block prismatic_jade_block;

    /*
     * Ores
     */
    public static Block jade_ore;
    public static Block fire_jade_ore;
    public static Block void_jade_ore;

    /*
     * Raw Jade
     */
    public static Block jade_raw;
    public static Block jade_raw1;
    public static Block jade_raw2;

    public static Block fire_jade_raw;
    public static Block fire_jade_raw1;
    public static Block fire_jade_raw2;

    public static Block void_jade_raw;
    public static Block void_jade_raw1;
    public static Block void_jade_raw2;

    public static Block jade_raw_white;
    public static Block jade_raw_golden;

    /*
     * Glass
     */
    public static Block jade_glass;
    public static Block fire_jade_glass;
    public static Block void_jade_glass;
    public static Block white_jade_glass;
    public static Block golden_jade_glass;
    public static Block prismatic_jade_glass;

    public void init() {
        if (!GemsSettings.settings.jadeEnabled) {
            return;
        }

        /*
         * Green Jade
         */

        if (JadeSettings.settings.greenJadeEnabled) {

            jade = new ItemJade("jade");
            items.add(jade);

            jade_block = new BlockBase(
                    Material.ROCK,
                    "jade_block"
            ).setHardness(5.0f).setResistance(8.0f);
            blocks.add(jade_block);

            jade_glass = new BlockBaseGlass(
                    Material.GLASS,
                    "jade_glass"
            ).setHardness(1f).setResistance(1f).setLightOpacity(15);
            blocks.add(jade_glass);

            jade_ore = new JadeOre(
                    Material.ROCK,
                    "jade_ore"
            );
            blocks.add(jade_ore);

            jade_raw = new BlockBase(
                    Material.ROCK,
                    "jade_raw"
            );
            blocks.add(jade_raw);

            jade_raw1 = new BlockBase(
                    Material.ROCK,
                    "jade_raw1"
            );
            blocks.add(jade_raw1);

            jade_raw2 = new BlockBase(
                    Material.ROCK,
                    "jade_raw2"
            );
            blocks.add(jade_raw2);
        }

        /*
         * Fire Jade
         */

        if (JadeSettings.settings.fireJadeEnabled) {

            fire_jade = new ItemJade("fire_jade");
            items.add(fire_jade);

            fire_jade_block = new BlockBase(
                    Material.ROCK,
                    "fire_jade_block"
            ).setHardness(5.0f).setResistance(8.0f);
            blocks.add(fire_jade_block);

            fire_jade_glass = new BlockBaseGlass(
                    Material.GLASS,
                    "fire_jade_glass"
            ).setHardness(1f).setResistance(1f).setLightOpacity(15);
            blocks.add(fire_jade_glass);

            fire_jade_ore = new FireJadeOre(
                    Material.ROCK,
                    "fire_jade_ore"
            );
            blocks.add(fire_jade_ore);

            fire_jade_raw = new BlockBase(
                    Material.ROCK,
                    "fire_jade_raw"
            );
            blocks.add(fire_jade_raw);

            fire_jade_raw1 = new BlockBase(
                    Material.ROCK,
                    "fire_jade_raw1"
            );
            blocks.add(fire_jade_raw1);

            fire_jade_raw2 = new BlockBase(
                    Material.ROCK,
                    "fire_jade_raw2"
            );
            blocks.add(fire_jade_raw2);
        }

        /*
         * Void Jade
         */

        if (JadeSettings.settings.voidJadeEnabled) {

            void_jade = new ItemJade("void_jade");
            items.add(void_jade);

            void_jade_block = new BlockBase(
                    Material.ROCK,
                    "void_jade_block"
            ).setHardness(5.0f).setResistance(8.0f);
            blocks.add(void_jade_block);

            void_jade_glass = new BlockBaseGlass(
                    Material.GLASS,
                    "void_jade_glass"
            ).setHardness(1f).setResistance(1f).setLightOpacity(15);
            blocks.add(void_jade_glass);

            void_jade_ore = new VoidJadeOre(
                    Material.ROCK,
                    "void_jade_ore"
            );
            blocks.add(void_jade_ore);

            void_jade_raw = new BlockBase(
                    Material.ROCK,
                    "void_jade_raw"
            );
            blocks.add(void_jade_raw);

            void_jade_raw1 = new BlockBase(
                    Material.ROCK,
                    "void_jade_raw1"
            );
            blocks.add(void_jade_raw1);

            void_jade_raw2 = new BlockBase(
                    Material.ROCK,
                    "void_jade_raw2"
            );
            blocks.add(void_jade_raw2);
        }

        /*
         * White Jade
         */

        if (JadeSettings.settings.whiteJadeEnabled) {

            white_jade = new ItemJade("white_jade");
            items.add(white_jade);

            white_jade_block = new BlockBase(
                    Material.ROCK,
                    "white_jade_block"
            ).setHardness(5.0f).setResistance(8.0f);
            blocks.add(white_jade_block);

            white_jade_glass = new BlockBaseGlass(
                    Material.GLASS,
                    "white_jade_glass"
            ).setHardness(1f).setResistance(1f).setLightOpacity(15);
            blocks.add(white_jade_glass);

            jade_raw_white = new BlockBase(
                    Material.ROCK,
                    "jade_raw_white"
            );
            blocks.add(jade_raw_white);
        }

        /*
         * Golden Jade
         */

        if (JadeSettings.settings.goldenJadeEnabled) {

            golden_jade = new ItemJade("golden_jade");
            items.add(golden_jade);

            golden_jade_block = new BlockBase(
                    Material.ROCK,
                    "golden_jade_block"
            ).setHardness(5.0f).setResistance(8.0f);
            blocks.add(golden_jade_block);

            golden_jade_glass = new BlockBaseGlass(
                    Material.GLASS,
                    "golden_jade_glass"
            ).setHardness(1f).setResistance(1f).setLightOpacity(15);
            blocks.add(golden_jade_glass);

            jade_raw_golden = new BlockBase(
                    Material.ROCK,
                    "jade_raw_golden"
            );
            blocks.add(jade_raw_golden);
        }

        /*
         * Prismatic Jade
         */

        if (JadeSettings.settings.prismaticJadeEnabled) {

            prismatic_jade = new ItemJade("prismatic_jade");
            items.add(prismatic_jade);

            prismatic_jade_block = new BlockBase(
                    Material.ROCK,
                    "prismatic_jade_block"
            ).setHardness(5.0f).setResistance(8.0f);
            blocks.add(prismatic_jade_block);

            prismatic_jade_glass = new BlockBaseGlass(
                    Material.GLASS,
                    "prismatic_jade_glass"
            ).setHardness(1f).setResistance(1f).setLightOpacity(15);
            blocks.add(prismatic_jade_glass);
        }
    }
}

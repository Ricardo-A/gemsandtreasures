package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.base.BlockBaseGlass;
import com.github.detoner.gemsandtreasures.block.ores.CarbonadoOre;
import com.github.detoner.gemsandtreasures.item.*;
import com.github.detoner.gemsandtreasures.item.material.ModMaterial;
import com.github.detoner.gemsandtreasures.settings.CarbonadoSettings;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EntityEquipmentSlot;

public class CarbonadoRegistration extends BaseRegistration{

    /*
     * Items
     */
    public static ItemBase carbonado;
    public static ItemBase carbonado_cluster;
    public static ItemBase carbonado_raw;
    public static ItemBase carbonado_shard;

    /*
     * Tools
     */
    public static ItemBaseSword carbonado_sword;
    public static ItemBasePickaxe carbonado_pickaxe;
    public static ItemBaseAxe carbonado_axe;
    public static ItemBaseHoe carbonado_hoe;
    public static ItemBaseShovel carbonado_shovel;

    /*
     * Armor
     */
    public static ItemBaseArmor carbonado_helmet;
    public static ItemBaseArmor carbonado_chestplate;
    public static ItemBaseArmor carbonado_leggings;
    public static ItemBaseArmor carbonado_boots;

    /*
     * Blocks
     */
    public static Block carbonado_block;
    public static Block carbonado_ore;
    public static Block carbonado_glass;

    public void init() {
        if (!GemsSettings.settings.carbonadoEnabled) {
            return;
        }

        /*
         * Items
         */

        carbonado = new ItemBase("carbonado");
        items.add(carbonado);

        carbonado_cluster = new ItemBase("carbonado_cluster");
        items.add(carbonado_cluster);

        carbonado_raw = new ItemBase("carbonado_raw");
        items.add(carbonado_raw);

        carbonado_shard = new ItemBase("carbonado_shard");
        items.add(carbonado_shard);

        /*
         * Tools
         */

        if (CarbonadoSettings.settings.carbonadoToolsEnabled) {

            carbonado_sword = new ItemBaseSword(
                    "carbonado_sword",
                    ModMaterial.carbonadoToolMaterial,
                    CarbonadoSettings.advancedSettings.swordDamage,
                    CarbonadoSettings.advancedSettings.swordEfficiency,
                    CarbonadoSettings.advancedSettings.swordEnchantability,
                    CarbonadoSettings.advancedSettings.swordDurability
            );
            items.add(carbonado_sword);

            carbonado_pickaxe = new ItemBasePickaxe(
                    "carbonado_pickaxe",
                    ModMaterial.carbonadoToolMaterial,
                    CarbonadoSettings.advancedSettings.pickaxeEfficiency
            );
            items.add(carbonado_pickaxe);

            carbonado_shovel = new ItemBaseShovel(
                    "carbonado_shovel",
                    ModMaterial.carbonadoToolMaterial
            );
            items.add(carbonado_shovel);

            carbonado_hoe = new ItemBaseHoe(
                    "carbonado_hoe",
                    ModMaterial.carbonadoToolMaterial
            );
            items.add(carbonado_hoe);

            carbonado_axe = new ItemBaseAxe(
                    "carbonado_axe",
                    ModMaterial.carbonadoToolMaterial,
                    CarbonadoSettings.advancedSettings.axeDamage,
                    CarbonadoSettings.advancedSettings.axeEfficiency,
                    CarbonadoSettings.advancedSettings.axeEnchantability,
                    CarbonadoSettings.advancedSettings.axeDurability,
                    CarbonadoSettings.advancedSettings.axeSpeed
            );
            items.add(carbonado_axe);
        }

        /*
         * Armor
         */

        if (CarbonadoSettings.settings.carbonadoArmorEnabled) {

            carbonado_helmet = new ItemBaseArmor(
                    "carbonado_helmet",
                    ModMaterial.carbonadoArmorMaterial,
                    EntityEquipmentSlot.HEAD
            );
            items.add(carbonado_helmet);

            carbonado_chestplate = new ItemBaseArmor(
                    "carbonado_chestplate",
                    ModMaterial.carbonadoArmorMaterial,
                    EntityEquipmentSlot.CHEST
            );
            items.add(carbonado_chestplate);

            carbonado_leggings = new ItemBaseArmor(
                    "carbonado_leggings",
                    ModMaterial.carbonadoArmorMaterial,
                    EntityEquipmentSlot.LEGS
            );
            items.add(carbonado_leggings);

            carbonado_boots = new ItemBaseArmor(
                    "carbonado_boots",
                    ModMaterial.carbonadoArmorMaterial,
                    EntityEquipmentSlot.FEET
            );
            items.add(carbonado_boots);
        }

        /*
         * Extras
         */

        if (CarbonadoSettings.settings.carbonadoExtrasEnabled) {

        }

        /*
         * Blocks
         */

        carbonado_block = new BlockBase(
                Material.IRON,
                "carbonado_block"
        ).setHardness(10.0f).setResistance(14.0f);
        blocks.add(carbonado_block);

        carbonado_ore = new CarbonadoOre(
                Material.ROCK,
                "carbonado_ore"
        );
        blocks.add(carbonado_ore);

        carbonado_glass = new BlockBaseGlass(
                Material.GLASS,
                "carbonado_glass"
        ).setHardness(1f).setResistance(1f).setLightOpacity(15);
        blocks.add(carbonado_glass);
    }
}

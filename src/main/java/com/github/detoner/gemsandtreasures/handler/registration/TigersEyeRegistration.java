package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.block.base.BlockBaseGlass;
import com.github.detoner.gemsandtreasures.block.ores.TigersEyeOre;
import com.github.detoner.gemsandtreasures.block.ores.TigersEyeSandOre;
import com.github.detoner.gemsandtreasures.block.ores.TigersEyeShardOre;
import com.github.detoner.gemsandtreasures.item.*;
import com.github.detoner.gemsandtreasures.recipes.BookOfReturnRepairRecipe;
import com.github.detoner.gemsandtreasures.recipes.CorruptedBookRepairRecipe;
import com.github.detoner.gemsandtreasures.recipes.EscapeBookRepairRecipe;
import com.github.detoner.gemsandtreasures.recipes.NetherEscapeBookRepairRecipe;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import com.github.detoner.gemsandtreasures.settings.TigersEyeSettings;
import com.github.detoner.gemsandtreasures.settings.TreasuresSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.crafting.IRecipe;

public class TigersEyeRegistration extends BaseRegistration{

    /*
     * Items
     */
    public static ItemBase tigers_eye;
    public static ItemBase tigers_eye_dust;
    public static ItemBase tigers_eye_shard;
    public static ItemBase scroll_of_return;
    public static ItemBase book_of_return;
    public static ItemBase nether_escape_scroll;
    public static ItemBase nether_escape_book;
    public static ItemBase escape_scroll;
    public static ItemBase escape_book;
    public static ItemBase corrupted_book;
    public static ItemBase corrupted_scroll;

    /*
     * Blocks
     */
    public static Block tigers_eye_block;
    public static Block tigers_eye_ore;
    public static Block tigers_eye_sand_ore;
    public static Block tigers_eye_glass;
    public static Block tigers_eye_shard_ore;

    /*
     * Recipes
     */
    public static IRecipe book_of_return_repair_recipe;
    public static IRecipe corrupted_book_repair_recipe;
    public static IRecipe nether_escape_book_repair_recipe;
    public static IRecipe escape_book_repair_recipe;

    public void init() {
        if (!GemsSettings.settings.tigersEyeEnabled) {
            return;
        }

        /*
         * Items
         */

        tigers_eye = new ItemBase("tigers_eye");
        items.add(tigers_eye);
        tigers_eye_dust = new ItemBase("tigers_eye_dust");
        items.add(tigers_eye_dust);
        tigers_eye_shard = new ItemBase("tigers_eye_shard");
        items.add(tigers_eye_shard);

        /*
         * Treasures
         */

        if (TreasuresSettings.settings.tigersEyeTreasuresEnabled) {
            if (TreasuresSettings.settings.scrollOfReturnEnabled) {
                scroll_of_return = new ItemScrollOfReturn();
                items.add(scroll_of_return);
            }

            if (TreasuresSettings.settings.bookOfReturnEnabled) {
                book_of_return = new ItemBookOfReturn();
                items.add(book_of_return);

                if (TreasuresSettings.settings.bookOfReturnRepairRecipe) {
                    book_of_return_repair_recipe = new BookOfReturnRepairRecipe();
                    recipes.add(book_of_return_repair_recipe);
                }
            }

            if (TreasuresSettings.settings.corruptedScrollEnabled) {
                corrupted_scroll = new ItemCorruptedScroll();
                items.add(corrupted_scroll);
            }

            if (TreasuresSettings.settings.corruptedBookEnabled) {
                corrupted_book = new ItemCorruptedBook();
                items.add(corrupted_book);

                if (TreasuresSettings.settings.corruptedBookRepairRecipe) {
                    corrupted_book_repair_recipe = new CorruptedBookRepairRecipe();
                    recipes.add(corrupted_book_repair_recipe);
                }
            }

            if (TreasuresSettings.settings.netherEscapeScrollEnabled) {
                nether_escape_scroll = new ItemNetherEscapeScroll();
                items.add(nether_escape_scroll);
            }

            if (TreasuresSettings.settings.netherEscapeBookEnabled) {
                nether_escape_book = new ItemNetherEscapeBook();
                items.add(nether_escape_book);

                if (TreasuresSettings.settings.netherEscapeBookRepairRecipe) {
                    nether_escape_book_repair_recipe = new NetherEscapeBookRepairRecipe();
                    recipes.add(nether_escape_book_repair_recipe);
                }
            }

            if (TreasuresSettings.settings.escapeScrollEnabled) {
                escape_scroll = new ItemEscapeScroll();
                items.add(escape_scroll);
            }

            if (TreasuresSettings.settings.escapeBookEnabled) {
                escape_book = new ItemEscapeBook();
                items.add(escape_book);

                if (TreasuresSettings.settings.escapeBookRepairRecipe) {
                    escape_book_repair_recipe = new EscapeBookRepairRecipe();
                    recipes.add(escape_book_repair_recipe);
                }
            }
        }

        /*
         * Blocks
         */

        tigers_eye_block = new BlockBase(
                Material.ROCK,
                "tigers_eye_block"
        ).setHardness(5.0f).setResistance(8.0f);
        blocks.add(tigers_eye_block);

        tigers_eye_glass = new BlockBaseGlass(
                Material.GLASS,
                "tigers_eye_glass"
        ).setHardness(1f).setResistance(1f).setLightOpacity(15);
        blocks.add(tigers_eye_glass);

        /*
         * Stone Tiger's Eye Ore
         */

        if (TigersEyeSettings.settings.stoneTigersEyeEnabled) {
            tigers_eye_ore = new TigersEyeOre(
                    Material.ROCK,
                    "tigers_eye_ore"
            );
            blocks.add(tigers_eye_ore);
        }

        /*
         * Sand Tiger's Eye Ore
         */

        if (TigersEyeSettings.settings.sandTigersEyeEnabled) {
            tigers_eye_sand_ore = new TigersEyeSandOre(
                    Material.SAND,
                    "tigers_eye_sand_ore"
            );
            blocks.add(tigers_eye_sand_ore);

            tigers_eye_shard_ore = new TigersEyeShardOre(
                    Material.SAND,
                    "tigers_eye_shard_ore"
            );
            blocks.add(tigers_eye_shard_ore);
        }
    }
}

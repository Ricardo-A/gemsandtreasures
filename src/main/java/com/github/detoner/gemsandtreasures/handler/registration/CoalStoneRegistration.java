package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.ores.CoalStoneOre;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CoalStoneRegistration extends BaseRegistration {

    /*
     * Items
     */
    public static ItemBase coal_stone;

    /*
     * Blocks
     */
    public static Block coal_stone_ore;

    public void init() {
        if (GemsSettings.settings.coalStoneEnabled) {
            coal_stone = new ItemBase("coal_stone");
            items.add(coal_stone);

            coal_stone_ore = new CoalStoneOre(
                    Material.ROCK,
                    "coal_stone_ore"
            );
            blocks.add(coal_stone_ore);
        }
    }
}

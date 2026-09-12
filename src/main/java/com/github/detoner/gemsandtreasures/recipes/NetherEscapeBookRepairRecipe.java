package com.github.detoner.gemsandtreasures.recipes;

import com.github.detoner.gemsandtreasures.handler.registration.TigersEyeRegistration;
import com.github.detoner.gemsandtreasures.recipes.base.BaseBookRecipe;
import com.github.detoner.gemsandtreasures.settings.TreasuresSettings;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class NetherEscapeBookRepairRecipe extends BaseBookRecipe {

    public NetherEscapeBookRepairRecipe() {
        super("nether_escape_book_repair_recipe");
    }

    @Override
    protected Item getBook() {
        return TigersEyeRegistration.nether_escape_book;
    }

    @Override
    protected Item getRepairItem() {
        return Item.REGISTRY.getObject(
                new ResourceLocation(
                        TreasuresSettings.settings.netherEscapeBookRepairItem
                )
        );
    }

    @Override
    protected int getRepairCount() {
        return TreasuresSettings.settings.netherEscapeBookRepairCount;
    }
}
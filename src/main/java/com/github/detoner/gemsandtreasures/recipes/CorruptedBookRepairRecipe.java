package com.github.detoner.gemsandtreasures.recipes;

import com.github.detoner.gemsandtreasures.handler.registration.TigersEyeRegistration;
import com.github.detoner.gemsandtreasures.recipes.base.BaseBookRecipe;
import com.github.detoner.gemsandtreasures.settings.TreasuresSettings;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class CorruptedBookRepairRecipe extends BaseBookRecipe {

    public CorruptedBookRepairRecipe() {
        super("escape_book_repair_recipe");
    }

    @Override
    protected Item getBook() {
        return TigersEyeRegistration.corrupted_book;
    }

    @Override
    protected Item getRepairItem() {
        return Item.REGISTRY.getObject(
                new ResourceLocation(
                        TreasuresSettings.settings.corruptedBookRepairItem
                )
        );
    }

    @Override
    protected int getRepairCount() {
        return TreasuresSettings.settings.corruptedBookRepairCount;
    }
}
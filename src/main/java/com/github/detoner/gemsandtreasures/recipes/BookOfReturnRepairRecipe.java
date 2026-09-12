package com.github.detoner.gemsandtreasures.recipes;

import com.github.detoner.gemsandtreasures.handler.registration.TigersEyeRegistration;
import com.github.detoner.gemsandtreasures.recipes.base.BaseBookRecipe;
import com.github.detoner.gemsandtreasures.settings.TreasuresSettings;
import net.minecraft.item.Item;

public class BookOfReturnRepairRecipe extends BaseBookRecipe {

    public BookOfReturnRepairRecipe() {
        super("book_of_return_repair_recipe");
    }

    @Override
    protected Item getBook() {
        return TigersEyeRegistration.book_of_return;
    }

    @Override
    protected Item getRepairItem() {
        return Item.REGISTRY.getObject(
                new net.minecraft.util.ResourceLocation(
                        TreasuresSettings.settings.bookOfReturnRepairItem
                )
        );
    }

    @Override
    protected int getRepairCount() {
        return TreasuresSettings.settings.bookOfReturnRepairCount;
    }
}
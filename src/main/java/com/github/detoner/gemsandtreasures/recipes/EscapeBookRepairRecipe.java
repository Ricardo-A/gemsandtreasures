package com.github.detoner.gemsandtreasures.recipes;

import com.github.detoner.gemsandtreasures.handler.registration.TigersEyeRegistration;
import com.github.detoner.gemsandtreasures.recipes.base.BaseBookRecipe;
import com.github.detoner.gemsandtreasures.settings.TreasuresSettings;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;

public class EscapeBookRepairRecipe extends BaseBookRecipe {

    public EscapeBookRepairRecipe() {
        super("escape_book_repair_recipe");
    }

    @Override
    protected Item getBook() {
        return TigersEyeRegistration.escape_book;
    }

    @Override
    protected Item getRepairItem() {
        return Item.REGISTRY.getObject(
                new ResourceLocation(
                        TreasuresSettings.settings.escapeBookRepairItem
                )
        );
    }

    @Override
    protected int getRepairCount() {
        return TreasuresSettings.settings.escapeBookRepairCount;
    }
}
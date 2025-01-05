package com.github.detoner.gemsandtreasures.addon.jei;

import java.util.ArrayList;
import java.util.List;

import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.ingredients.VanillaTypes;
import mezz.jei.api.recipe.IRecipeWrapper;
import com.github.detoner.gemsandtreasures.fallinganvil.FallingAnvilRecipe;
import com.github.detoner.gemsandtreasures.fallinganvil.FallingAnvilRecipeResult;
import net.minecraft.item.ItemStack;

public class FallingAnvilRecipeWrapper implements IRecipeWrapper{

	private FallingAnvilRecipe recipe;
	
	public FallingAnvilRecipeWrapper(FallingAnvilRecipe recipe) {
		this.recipe = recipe;
	}
	
	@Override
	public void getIngredients(IIngredients ingredients) {
        List<ItemStack> results = new ArrayList<>();
        for(FallingAnvilRecipeResult result : recipe.getResults()) {
        	results.add(new ItemStack(result.getResult()));
        }
        ingredients.setOutputs(VanillaTypes.ITEM, results);
        
        List<ItemStack> ingredientInputs = new ArrayList<>();
        for(ItemStack ingredientInput : recipe.getIngredients()) {
        	ingredientInputs.add(ingredientInput);
        }
        ingredients.setInputs(VanillaTypes.ITEM, ingredientInputs);
	}

}
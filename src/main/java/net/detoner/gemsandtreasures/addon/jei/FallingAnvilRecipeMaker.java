package net.detoner.gemsandtreasures.addon.jei;

import java.util.ArrayList;
import java.util.List;

import net.detoner.gemsandtreasures.fallinganvil.FallingAnvilCrafting;
import net.detoner.gemsandtreasures.fallinganvil.FallingAnvilRecipe;

public class FallingAnvilRecipeMaker {
	private FallingAnvilRecipeMaker() {
	}

	public static List<FallingAnvilRecipeWrapper> getRecipes() {

		List<FallingAnvilRecipe> originalRecipes = FallingAnvilCrafting.recipes;
		List<FallingAnvilRecipeWrapper> recipes = new ArrayList<>();

		for (FallingAnvilRecipe entry : originalRecipes) {
			recipes.add(new FallingAnvilRecipeWrapper(entry));
		}

		return recipes;
	}
}

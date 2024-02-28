package net.detoner.gemsandtreasures.fallinganvil;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.item.ItemStack;

public class FallingAnvilRecipe{
	private List<ItemStack> ingredients;
	private int minimumHeight;
	private int maximumHeight;
	private List<FallingAnvilRecipeResult> results;
	
	public FallingAnvilRecipe(List<ItemStack> ingredients, List<FallingAnvilRecipeResult> results) {
		for(int i = 0; i < ingredients.size(); i++) {
			ItemStack ingredient = ingredients.get(i);
			if(ingredient.getCount() < 1) {
				ingredient.setCount(1);
				ingredients.set(i, ingredient);
			}
		}
		this.ingredients = ingredients;
		this.minimumHeight = 1;
		this.maximumHeight = 1;
		this.results = results;
	}
	
	public FallingAnvilRecipe(ItemStack ingredient, FallingAnvilRecipeResult result) {
		this.ingredients = new ArrayList<ItemStack>();
		if(ingredient.getCount() <= 0) {
			ingredient.setCount(1);
		}
		this.ingredients.add(ingredient);
		this.minimumHeight = 1;
		this.maximumHeight = 1;
		this.results = new ArrayList<FallingAnvilRecipeResult>();
		this.results.add(result);
	}
	
	/**
	 * @param ingredients - list of items needed to craft
	 * @param minimumHeight - minimum height the anvil needs to fall for the recipe to work
	 * @param maximumHeight - maximum effective height for the recipe
	 * @param results - items and quantities that will be dropped when the anvil falls in the ingredients
	 */
	public FallingAnvilRecipe(List<ItemStack> ingredients, int minimumHeight, int maximumHeight,
			List<FallingAnvilRecipeResult> results) {
		for(int i = 0; i < ingredients.size(); i++) {
			ItemStack ingredient = ingredients.get(i);
			if(ingredient.getCount() < 1) {
				ingredient.setCount(1);
				ingredients.set(i, ingredient);
			}
		}
		this.ingredients = ingredients;
		this.minimumHeight = minimumHeight;
		this.maximumHeight = maximumHeight;
		this.results = results;
	}

	public List<ItemStack> getIngredients() {
		return ingredients;
	}

	public void setIngredients(List<ItemStack> ingredients) {
		for(int i = 0; i < ingredients.size(); i++) {
			ItemStack ingredient = ingredients.get(i);
			if(ingredient.getCount() < 1) {
				ingredient.setCount(1);
				ingredients.set(i, ingredient);
			}
		}
		this.ingredients = ingredients;
	}
	
	public void addIngredient(ItemStack ingredient) {
		if(ingredient.getCount() < 1) {
			ingredient.setCount(1);
		}
		this.ingredients.add(ingredient);
	}

	public int getMinimumHeight() {
		return minimumHeight;
	}

	public void setMinimumHeight(int minimumHeight) {
		this.minimumHeight = minimumHeight;
	}

	public int getMaximumHeight() {
		return maximumHeight;
	}

	public void setMaximumHeight(int maximumHeight) {
		this.maximumHeight = maximumHeight;
	}

	public List<FallingAnvilRecipeResult> getResults() {
		return results;
	}

	public void setResults(List<FallingAnvilRecipeResult> results) {
		this.results = results;
	}
}

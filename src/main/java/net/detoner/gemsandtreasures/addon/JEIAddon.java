package net.detoner.gemsandtreasures.addon;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IModPlugin;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.JEIPlugin;
import mezz.jei.api.recipe.IRecipeCategoryRegistration;
import net.detoner.gemsandtreasures.addon.jei.FallingAnvilCategory;
import net.detoner.gemsandtreasures.addon.jei.FallingAnvilRecipeMaker;
import net.detoner.gemsandtreasures.addon.jei.FallingAnvilRecipeWrapper;
import net.detoner.gemsandtreasures.fallinganvil.FallingAnvilRecipe;
import net.detoner.gemsandtreasures.settings.AddonsSettings;

@JEIPlugin
public class JEIAddon implements IModPlugin {

	@Override
	public void register(IModRegistry registry) {
		if(AddonsSettings.settings.jeiAddonEnabled) {
			//registry.addRecipeCatalyst(new ItemStack(RegistrationHandler.carbonado), FallingAnvilCategory.NAME);
			registry.addRecipes(FallingAnvilRecipeMaker.getRecipes(), FallingAnvilCategory.NAME);
			//registry.handleRecipes(FallingAnvilRecipe.class, FallingAnvilRecipeWrapper::new, FallingAnvilCategory.NAME);
			registry.handleRecipes(FallingAnvilRecipe.class, recipe -> new FallingAnvilRecipeWrapper(recipe), FallingAnvilCategory.NAME);
			
			//registry.addIngredientInfo(new ItemStack(ItemRegistry.basicBackpack), ItemStack.class, "jei.description.backpack.basic", "jei.description.backpack.generic");
		}
	}
	
	
	@Override
	public void registerCategories(IRecipeCategoryRegistration registry) {
		if(AddonsSettings.settings.jeiAddonEnabled) {
			IGuiHelper guiHelper = registry.getJeiHelpers().getGuiHelper();
			registry.addRecipeCategories(new FallingAnvilCategory(guiHelper));
		}
	}
}

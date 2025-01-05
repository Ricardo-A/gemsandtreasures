package com.github.detoner.gemsandtreasures.addon.jei;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IGuiItemStackGroup;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ResourceLocation;

public class FallingAnvilCategory implements IRecipeCategory<FallingAnvilRecipeWrapper>{

	public static final String NAME = GemsAndTreasures.MODID + ".anvil";
    private final IDrawable background;
    private final IDrawable icon;
	
    public FallingAnvilCategory(IGuiHelper guiHelper) {
        ResourceLocation RL = new ResourceLocation(GemsAndTreasures.MODID, "textures/gui/falling_anvil.png");
        background = guiHelper.createDrawable(RL, 0, 0, 166, 110);
        icon = guiHelper.createDrawable(RL, 168, 0, 16, 16);
    }
	
	@Override
	public String getUid() {
		return NAME;
	}

	@Override
	public String getTitle() {
		return "Falling Anvil";
	}

	@Override
	public String getModName() {
		return GemsAndTreasures.MODID;
	}

	@Override
	public IDrawable getBackground() {
		return background;
	}

    @Override
    public IDrawable getIcon() {
        return icon;
    }
	
    @Override
    public void drawExtras(Minecraft minecraft) {

    }
    
	@Override
	public void setRecipe(IRecipeLayout recipeLayout, FallingAnvilRecipeWrapper recipeWrapper,
			IIngredients ingredients) {
		
		IGuiItemStackGroup guiItemStacks = recipeLayout.getItemStacks();
		
        //List<List<ItemStack>> inputs = ingredients.getInputs(VanillaTypes.ITEM);
        //List<List<ItemStack>> outputs = ingredients.getOutputs(VanillaTypes.ITEM);
        
        recipeLayout.getItemStacks().init(0, true, 23, 14);

        //input
		guiItemStacks.init(0, true, 10, 60);
		
		//output
		guiItemStacks.init(1, false, 105, 30);

		guiItemStacks.set(ingredients);

        //recipeLayout.getItemStacks().init(2, false, 119, 14);
        //recipeLayout.getItemStacks().set(2, ingredients.getOutputs(ItemStack.class).get(0));
	}

}
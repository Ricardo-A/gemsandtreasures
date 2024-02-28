package net.detoner.gemsandtreasures.fallinganvil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorldEventListener;
import net.minecraft.world.World;


public class FallingAnvilCrafting implements IWorldEventListener {
	
	public static final List<FallingAnvilRecipe> recipes = new ArrayList<FallingAnvilRecipe>();
	
	private World worldInstance;
	private BlockPos anvilPosition;
	
    private boolean isAnvil(Entity entity) {
        if(!(entity instanceof EntityFallingBlock)) {//if entity is not a falling block
        	return false;
        }else{
        	EntityFallingBlock entityFallingBlock = (EntityFallingBlock)entity;
            if (entityFallingBlock.getBlock().getBlock() == Blocks.ANVIL) { //if the falling block is an anvil
                return true;
            }
        }
        return false;
    }
    
    public static void addRecipe(FallingAnvilRecipe recipe) {
    	recipes.add(recipe);
    }
    
    private boolean hasItemAmountNeeded(ItemStack ingredient, List<EntityItem> itemsBelowAnvil){
    	int totalAmount = 0;
    	
    	if(ingredient.getCount() <= 0) {
    		ingredient.setCount(1);
    	}
    	
		for(EntityItem entityBelowAnvil : itemsBelowAnvil) {
			ItemStack itemBelowAnvil = entityBelowAnvil.getItem();
			if(itemBelowAnvil.getCount() <= 0) {
				itemBelowAnvil.setCount(1);
			}
			if (itemBelowAnvil.getItem().getRegistryName().equals(ingredient.getItem().getRegistryName())) {
				totalAmount += itemBelowAnvil.getCount();
			}
		}
		
		return totalAmount >= ingredient.getCount();
    }
    
    private boolean recipeMatchItemsBelowAnvil(FallingAnvilRecipe recipe, List<EntityItem> itemsBelowAnvil) {
    	List<ItemStack> ingredients = recipe.getIngredients();
    	for(ItemStack ingredient : ingredients) {
    		if(!hasItemAmountNeeded(ingredient, itemsBelowAnvil)) {
    			return false;
    		}
    	}
    	return true;
    }
    
    private boolean recipeMatchesFallHeight(FallingAnvilRecipe recipe, int fallHeight) {
    	return recipe.getMinimumHeight() <= fallHeight;
    }
    
    
	@Override
	public void onEntityRemoved(Entity entity) {
		if (!entity.getEntityWorld().isRemote && isAnvil(entity)) {
			EntityFallingBlock anvil = (EntityFallingBlock)entity;
			
			World world = entity.getEntityWorld();
			this.worldInstance = world;
			BlockPos pos = entity.getPosition();
			this.anvilPosition = pos;
			AxisAlignedBB aabb = new AxisAlignedBB(pos, pos.add(1, 1, 1));
			
			int fallHeight = 0;
			for (FallingAnvil fallingAnvil : fallingAnvils) {
				if (fallingAnvil.getEntity().equals(anvil)) {
					fallHeight = (int) (fallingAnvil.getStartingHeight() - anvil.posY);
				}
			}
			
			List<EntityItem> itemsBelowAnvil = world.getEntitiesWithinAABB(EntityItem.class, aabb);
			for(int i = 0; i < itemsBelowAnvil.size(); i++) {
				this.worldInstance.removeEntity(itemsBelowAnvil.get(i));
			}
			
			List<FallingAnvilRecipe> currentRecipes = recipes;
			if (!itemsBelowAnvil.isEmpty()) {
				for(FallingAnvilRecipe recipe : currentRecipes) {
					if(recipeMatchItemsBelowAnvil(recipe, itemsBelowAnvil) && !itemsBelowAnvil.isEmpty()) {
						if(recipeMatchesFallHeight(recipe, fallHeight)) {
							itemsBelowAnvil = craftItems(recipe, fallHeight, itemsBelowAnvil);
						}
					}
				}
			}
			if (!itemsBelowAnvil.isEmpty()) {
				dropNonUsedItems(itemsBelowAnvil);
			}
		}
	}
	
	private void dropNonUsedItems(List<EntityItem> itemsBelowAnvil) {
		for(int i = 0; i < itemsBelowAnvil.size(); i++) {
			if(!itemsBelowAnvil.get(i).getItem().isEmpty()) {
				dropItems(itemsBelowAnvil.get(i).getItem());
			}
		}
	}
	
	private List<FallingAnvilRecipeResult> checkProbabilities(List<FallingAnvilRecipeResult> results){
		List<FallingAnvilRecipeResult> newResults = new ArrayList<>();
		List<FallingAnvilRecipeResult> resultsWithWeight = new ArrayList<>();
		
		int totalWeight = 0;
		for(int i = 0; i < results.size(); i++) {
			FallingAnvilRecipeResult result = results.get(i);
			if(result.getWeight() > 0) {
				resultsWithWeight.add(result);
				totalWeight += result.getWeight();
			}else if(result.getProbabilityInt() > 0) {
				Random r = new Random();
				int dropProb = r.nextInt(9999) + 1;
				if(dropProb <= result.getProbabilityInt()) { //if can drop
					newResults.add(result);
				}
			}else{
				newResults.add(result);
			}
		}
		
		if(resultsWithWeight.size() > 0) {
			FallingAnvilRecipeResult choosenResult = null;
			Random r = new Random();
			int dropProb = r.nextInt(totalWeight) + 1;
			for(int i = 0; i < resultsWithWeight.size(); i++) {
				FallingAnvilRecipeResult result = resultsWithWeight.get(i);
				if(dropProb < totalWeight - result.getWeight()) {
					totalWeight -= result.getWeight();
				}else {
					choosenResult = result;
					break;
				}
			}
			
			newResults.add(choosenResult);
		}
		
		return newResults;
	}
	
	private List<EntityItem> craftItems(FallingAnvilRecipe recipe, int fallHeight, List<EntityItem> itemsBelowAnvil) {
		List<FallingAnvilRecipeResult> results = recipe.getResults();
		results = checkProbabilities(results);
		for(FallingAnvilRecipeResult result : results) {
			Random r = new Random();
			int dropCount = 1;
			if(result.getMaximumBaseResults() > 1) {
				dropCount = r.nextInt(result.getMaximumBaseResults()-result.getMinimumBaseResults()) + result.getMinimumBaseResults();
			}
			if(recipe.getMaximumHeight() > 1) {
				fallHeight -= recipe.getMinimumHeight();
				if(fallHeight > recipe.getMaximumHeight()) {
					fallHeight = recipe.getMaximumHeight();
				}
				for(int i = 0; i < fallHeight; i++) {
					dropCount += r.nextInt(result.getMaximumResultsPerHeight()-result.getMinimumResultsPerHeight() + result.getMinimumResultsPerHeight());
				}
			}
			dropItems(new ItemStack(result.getResult(), dropCount));
		}
				
		return new ArrayList<>();//removeItemsUsed(recipe, itemsBelowAnvil); //new ArrayList<>();
	}
	
	private List<EntityItem> removeItemsUsed(FallingAnvilRecipe recipe, List<EntityItem> itemsBelowAnvil){
		List<EntityItem> nonUsed = new ArrayList<>();
		List<ItemStack> ingredients = recipe.getIngredients();
		
		for(int i = 0; i < itemsBelowAnvil.size(); i++) {
			EntityItem entityItem = itemsBelowAnvil.get(i);
			for(int j = 0; j < ingredients.size(); i++) {
				ItemStack ingredient = ingredients.get(j);
				if(ingredient.getItem().getRegistryName().equals(entityItem.getItem().getItem().getRegistryName())) {
					ItemStack item = entityItem.getItem();
					if(item.getCount() > ingredient.getCount()) {
						if(!ingredient.isEmpty()) {
							item.setCount(item.getCount() - ingredient.getCount());
							ingredient.setCount(0);
						}
					}else if(item.getCount() < ingredient.getCount()){
						if(!item.isEmpty()) {
							ingredient.setCount(ingredient.getCount() - item.getCount());
							item.setCount(0);
						}
					}else {
						ingredient.setCount(0);
						item.setCount(0);
					}
					ingredients.set(j, ingredient);
					entityItem.setItem(item);
					itemsBelowAnvil.set(i, entityItem);
				}
			}
		}
		
		for(int i = 0; i < itemsBelowAnvil.size(); i++) {
			EntityItem entityItem = itemsBelowAnvil.get(i);
			if(!entityItem.getItem().isEmpty()) {
				nonUsed.add(entityItem);
			}
		}
		
		return nonUsed;
	}
	
	private void dropItems(ItemStack result) {
		EntityItem items = new EntityItem(this.worldInstance, (double)this.anvilPosition.getX() + .5d, (double)this.anvilPosition.getY() + .5d, 
        		(double)this.anvilPosition.getZ() + .5d, result);
		this.worldInstance.spawnEntity(items);
	}

	public static List<FallingAnvil> fallingAnvils = new ArrayList<FallingAnvil>();
	
	@Override
	public void onEntityAdded(Entity entity) {
		if (isAnvil(entity)) {
			EntityFallingBlock anvil = (EntityFallingBlock)entity;
			
			for (FallingAnvil fallingAnvil : fallingAnvils) {
				if (fallingAnvil.getEntity().equals(anvil)) {
					return;
				}
			}
	
			fallingAnvils.add(new FallingAnvil(anvil, anvil.posY));
		}
	}
	
	@Override
	public void notifyBlockUpdate(World worldIn, BlockPos pos, IBlockState oldState, IBlockState newState, int flags) {}

	@Override
	public void notifyLightSet(BlockPos pos) {}

	@Override
	public void markBlockRangeForRenderUpdate(int x1, int y1, int z1, int x2, int y2, int z2) {}

	@Override
	public void playSoundToAllNearExcept(EntityPlayer player, SoundEvent soundIn, SoundCategory category, double x,
			double y, double z, float volume, float pitch) {}

	@Override
	public void playRecord(SoundEvent soundIn, BlockPos pos) {}

	@Override
	public void spawnParticle(int particleID, boolean ignoreRange, double xCoord, double yCoord, double zCoord,
			double xSpeed, double ySpeed, double zSpeed, int... parameters) {}

	@Override
	public void spawnParticle(int p_190570_1_, boolean p_190570_2_, boolean p_190570_3_, double p_190570_4_,
			double p_190570_6_, double p_190570_8_, double p_190570_10_, double p_190570_12_, double p_190570_14_,
			int... p_190570_16_) {}

	@Override
	public void broadcastSound(int soundID, BlockPos pos, int data) {}

	@Override
	public void playEvent(EntityPlayer player, int type, BlockPos blockPosIn, int data) {}

	@Override
	public void sendBlockBreakProgress(int breakerId, BlockPos pos, int progress) {}
}
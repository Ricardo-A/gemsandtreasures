package com.github.detoner.gemsandtreasures.fallinganvil;

import java.util.ArrayList;
import java.util.List;

import com.github.detoner.gemsandtreasures.handler.RegistrationHandler;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class FallingAnvilRecipeRegistration {
	public static void register() {
		List<ItemStack> ingredients;
		List<FallingAnvilRecipeResult> results;
		FallingAnvilRecipeResult result;
		FallingAnvilRecipe recipe;
		
		//carbonado
		recipe = new FallingAnvilRecipe(new ItemStack(RegistrationHandler.carbonado_cluster, 1), new FallingAnvilRecipeResult(RegistrationHandler.carbonado_raw));
		FallingAnvilCrafting.addRecipe(recipe);
		
		//jade raw
		results = new ArrayList<>();
		result = new FallingAnvilRecipeResult(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:cobblestone")));
		result.setWeight(750);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.jade);
		result.setWeight(150);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.fire_jade);
		result.setWeight(30);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.void_jade);
		result.setWeight(30);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.white_jade);
		result.setWeight(29);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.golden_jade);
		result.setWeight(10);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.rainbow_jade);
		result.setWeight(1);
		results.add(result);
		
		ingredients = new ArrayList<>();
		ingredients.add(new ItemStack(RegistrationHandler.jade_raw, 1));
		recipe = new FallingAnvilRecipe(ingredients, results);
		
		FallingAnvilCrafting.addRecipe(recipe);
		
		//jade raw1
		results = new ArrayList<>();
		result = new FallingAnvilRecipeResult(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:cobblestone")));
		result.setWeight(500);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.jade);
		result.setWeight(350);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.fire_jade);
		result.setWeight(50);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.void_jade);
		result.setWeight(50);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.white_jade);
		result.setWeight(30);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.golden_jade);
		result.setWeight(15);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.rainbow_jade);
		result.setWeight(5);
		results.add(result);
		
		ingredients = new ArrayList<>();
		ingredients.add(new ItemStack(RegistrationHandler.jade_raw1, 1));
		recipe = new FallingAnvilRecipe(ingredients, results);
		
		FallingAnvilCrafting.addRecipe(recipe);
		
		//jade raw2
		results = new ArrayList<>();
		result = new FallingAnvilRecipeResult(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:cobblestone")));
		result.setWeight(25);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.jade);
		result.setWeight(40);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.fire_jade);
		result.setWeight(10);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.void_jade);
		result.setWeight(10);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.white_jade);
		result.setWeight(10);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.golden_jade);
		result.setWeight(4);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.rainbow_jade);
		result.setWeight(1);
		results.add(result);
		
		ingredients = new ArrayList<>();
		ingredients.add(new ItemStack(RegistrationHandler.jade_raw2, 1));
		recipe = new FallingAnvilRecipe(ingredients, results);
		
		FallingAnvilCrafting.addRecipe(recipe);
		
		//fire jade raw
		results = new ArrayList<>();
		result = new FallingAnvilRecipeResult(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:netherrack")));
		result.setWeight(500);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.jade);
		result.setWeight(225);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.fire_jade);
		result.setWeight(225);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.white_jade);
		result.setWeight(39);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.golden_jade);
		result.setWeight(10);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.rainbow_jade);
		result.setWeight(1);
		results.add(result);
		
		ingredients = new ArrayList<>();
		ingredients.add(new ItemStack(RegistrationHandler.fire_jade_raw, 1));
		recipe = new FallingAnvilRecipe(ingredients, results);
		
		FallingAnvilCrafting.addRecipe(recipe);
		
		//fire jade raw1
		results = new ArrayList<>();
		result = new FallingAnvilRecipeResult(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:netherrack")));
		result.setWeight(250);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.jade);
		result.setWeight(300);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.fire_jade);
		result.setWeight(300);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.white_jade);
		result.setWeight(100);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.golden_jade);
		result.setWeight(45);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.rainbow_jade);
		result.setWeight(5);
		results.add(result);
		
		ingredients = new ArrayList<>();
		ingredients.add(new ItemStack(RegistrationHandler.fire_jade_raw1, 1));
		recipe = new FallingAnvilRecipe(ingredients, results);
		
		FallingAnvilCrafting.addRecipe(recipe);
		
		//fire jade raw2
		results = new ArrayList<>();
		result = new FallingAnvilRecipeResult(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:netherrack")));
		result.setWeight(15);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.jade);
		result.setWeight(20);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.fire_jade);
		result.setWeight(40);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.white_jade);
		result.setWeight(19);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.golden_jade);
		result.setWeight(5);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.rainbow_jade);
		result.setWeight(1);
		results.add(result);
		
		ingredients = new ArrayList<>();
		ingredients.add(new ItemStack(RegistrationHandler.fire_jade_raw2, 1));
		recipe = new FallingAnvilRecipe(ingredients, results);
		
		FallingAnvilCrafting.addRecipe(recipe);
		
		//void jade raw
		results = new ArrayList<>();
		result = new FallingAnvilRecipeResult(ForgeRegistries.ITEMS.getValue(new ResourceLocation("end_stone")));
		result.setWeight(500);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.jade);
		result.setWeight(225);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.void_jade);
		result.setWeight(225);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.white_jade);
		result.setWeight(39);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.golden_jade);
		result.setWeight(10);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.rainbow_jade);
		result.setWeight(1);
		results.add(result);
		
		ingredients = new ArrayList<>();
		ingredients.add(new ItemStack(RegistrationHandler.void_jade_raw, 1));
		recipe = new FallingAnvilRecipe(ingredients, results);
		
		FallingAnvilCrafting.addRecipe(recipe);
		
		//void jade raw 1
		results = new ArrayList<>();
		result = new FallingAnvilRecipeResult(ForgeRegistries.ITEMS.getValue(new ResourceLocation("end_stone")));
		result.setWeight(250);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.jade);
		result.setWeight(300);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.fire_jade);
		result.setWeight(300);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.white_jade);
		result.setWeight(100);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.golden_jade);
		result.setWeight(45);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.rainbow_jade);
		result.setWeight(5);
		results.add(result);
		
		ingredients = new ArrayList<>();
		ingredients.add(new ItemStack(RegistrationHandler.void_jade_raw1, 1));
		recipe = new FallingAnvilRecipe(ingredients, results);
		
		FallingAnvilCrafting.addRecipe(recipe);
		
		//void jade raw2
		results = new ArrayList<>();
		result = new FallingAnvilRecipeResult(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:end_stone")));
		result.setWeight(15);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.jade);
		result.setWeight(20);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.void_jade);
		result.setWeight(40);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.white_jade);
		result.setWeight(19);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.golden_jade);
		result.setWeight(5);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.rainbow_jade);
		result.setWeight(1);
		results.add(result);
		
		ingredients = new ArrayList<>();
		ingredients.add(new ItemStack(RegistrationHandler.void_jade_raw2, 1));
		recipe = new FallingAnvilRecipe(ingredients, results);
		
		FallingAnvilCrafting.addRecipe(recipe);
		
		//jade raw white
		results = new ArrayList<>();
		result = new FallingAnvilRecipeResult(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:cobblestone")));
		result.setWeight(10);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.jade);
		result.setWeight(35);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.white_jade);
		result.setWeight(35);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.golden_jade);
		result.setWeight(15);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.rainbow_jade);
		result.setWeight(5);
		results.add(result);
		
		ingredients = new ArrayList<>();
		ingredients.add(new ItemStack(RegistrationHandler.jade_raw_white, 1));
		recipe = new FallingAnvilRecipe(ingredients, results);
		
		FallingAnvilCrafting.addRecipe(recipe);
		
		//jade raw golden
		results = new ArrayList<>();
		result = new FallingAnvilRecipeResult(RegistrationHandler.jade);
		result.setWeight(25);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.white_jade);
		result.setWeight(40);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.golden_jade);
		result.setWeight(25);
		results.add(result);
		
		result = new FallingAnvilRecipeResult(RegistrationHandler.rainbow_jade);
		result.setWeight(10);
		results.add(result);
		
		ingredients = new ArrayList<>();
		ingredients.add(new ItemStack(RegistrationHandler.jade_raw_golden, 1));
		recipe = new FallingAnvilRecipe(ingredients, results);
		
		FallingAnvilCrafting.addRecipe(recipe);
	}
}

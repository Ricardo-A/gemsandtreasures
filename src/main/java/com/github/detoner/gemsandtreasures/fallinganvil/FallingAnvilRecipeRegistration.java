package com.github.detoner.gemsandtreasures.fallinganvil;

import java.util.ArrayList;
import java.util.List;

import com.github.detoner.gemsandtreasures.handler.registration.CarbonadoRegistration;
import com.github.detoner.gemsandtreasures.handler.registration.JadeRegistration;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import com.github.detoner.gemsandtreasures.settings.JadeSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class FallingAnvilRecipeRegistration {
	public static void register() {
		List<ItemStack> ingredients;
		FallingAnvilRecipeResult result;
		FallingAnvilRecipe recipe;
		
		//carbonado
		if(GemsSettings.settings.carbonadoEnabled) {
			recipe = new FallingAnvilRecipe(
					new ItemStack(CarbonadoRegistration.carbonado_cluster, 1),
					new FallingAnvilRecipeResult(CarbonadoRegistration.carbonado_raw)
			);
			FallingAnvilCrafting.addRecipe(recipe);
		}

		if(GemsSettings.settings.jadeEnabled) {
			Item cobblestone = ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:cobblestone"));

			//jade raw
			List<FallingAnvilRecipeResult> results = new ArrayList<>();

			results.add(new FallingAnvilRecipeResult(cobblestone, 750));

			if(JadeSettings.settings.greenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.jade, 150));
			}

			if(JadeSettings.settings.fireJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.fire_jade, 30));
			}

			if(JadeSettings.settings.voidJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.void_jade, 30));
			}

			if(JadeSettings.settings.whiteJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.white_jade, 29));
			}

			if(JadeSettings.settings.goldenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.golden_jade, 10));
			}

			if(JadeSettings.settings.prismaticJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.prismatic_jade, 1));
			}

			FallingAnvilCrafting.addRecipe(
					new FallingAnvilRecipe(
							new ItemStack(JadeRegistration.jade_raw, 1),
							results
					)
			);

			//jade raw1
			results.clear();

			results.add(new FallingAnvilRecipeResult(cobblestone, 500));

			if(JadeSettings.settings.greenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.jade, 350));
			}

			if(JadeSettings.settings.fireJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.fire_jade, 50));
			}

			if(JadeSettings.settings.voidJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.void_jade, 50));
			}

			if(JadeSettings.settings.whiteJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.white_jade, 30));
			}

			if(JadeSettings.settings.goldenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.golden_jade, 15));
			}

			if(JadeSettings.settings.prismaticJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.prismatic_jade, 5));
			}

			FallingAnvilCrafting.addRecipe(
					new FallingAnvilRecipe(
							new ItemStack(JadeRegistration.jade_raw1, 1),
							results
					)
			);

			//jade raw2
			results.clear();

			results.add(new FallingAnvilRecipeResult(cobblestone, 24));

			if(JadeSettings.settings.greenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.jade, 40));
			}

			if(JadeSettings.settings.fireJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.fire_jade, 10));
			}

			if(JadeSettings.settings.voidJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.void_jade, 10));
			}

			if(JadeSettings.settings.whiteJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.white_jade, 10));
			}

			if(JadeSettings.settings.goldenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.golden_jade, 5));
			}

			if(JadeSettings.settings.prismaticJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.prismatic_jade, 1));
			}

			FallingAnvilCrafting.addRecipe(
					new FallingAnvilRecipe(
							new ItemStack(JadeRegistration.jade_raw2, 1),
							results
					)
			);

			//fire jade raw
			results.clear();
			Item netherrack = ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:netherrack"));

			results.add(new FallingAnvilRecipeResult(netherrack, 499));

			if(JadeSettings.settings.greenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.jade, 225));
			}

			if(JadeSettings.settings.fireJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.fire_jade, 225));
			}

			if(JadeSettings.settings.whiteJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.white_jade, 40));
			}

			if(JadeSettings.settings.goldenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.golden_jade, 10));
			}

			if(JadeSettings.settings.prismaticJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.prismatic_jade, 1));
			}

			FallingAnvilCrafting.addRecipe(
					new FallingAnvilRecipe(
							new ItemStack(JadeRegistration.fire_jade_raw, 1),
							results
					)
			);

			//fire jade raw1
			results.clear();

			results.add(new FallingAnvilRecipeResult(netherrack, 250));

			if(JadeSettings.settings.greenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.jade, 300));
			}

			if(JadeSettings.settings.fireJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.fire_jade, 300));
			}

			if(JadeSettings.settings.whiteJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.white_jade, 100));
			}

			if(JadeSettings.settings.goldenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.golden_jade, 45));
			}

			if(JadeSettings.settings.prismaticJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.prismatic_jade, 5));
			}

			FallingAnvilCrafting.addRecipe(
					new FallingAnvilRecipe(
							new ItemStack(JadeRegistration.fire_jade_raw1, 1),
							results
					)
			);

			//fire jade raw2
			results.clear();

			results.add(new FallingAnvilRecipeResult(netherrack, 14));

			if(JadeSettings.settings.greenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.jade, 20));
			}

			if(JadeSettings.settings.fireJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.fire_jade, 40));
			}

			if(JadeSettings.settings.whiteJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.white_jade, 20));
			}

			if(JadeSettings.settings.goldenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.golden_jade, 5));
			}

			if(JadeSettings.settings.prismaticJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.prismatic_jade, 1));
			}

			FallingAnvilCrafting.addRecipe(
					new FallingAnvilRecipe(
							new ItemStack(JadeRegistration.fire_jade_raw2, 1),
							results
					)
			);

			//void jade raw
			Item endstone = ForgeRegistries.ITEMS.getValue(new ResourceLocation("end_stone"));
			results.clear();

			results.add(new FallingAnvilRecipeResult(endstone, 499));

			if(JadeSettings.settings.greenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.jade, 225));
			}

			if(JadeSettings.settings.fireJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.void_jade, 225));
			}

			if(JadeSettings.settings.whiteJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.white_jade, 40));
			}

			if(JadeSettings.settings.goldenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.golden_jade, 10));
			}

			if(JadeSettings.settings.prismaticJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.prismatic_jade, 1));
			}

			FallingAnvilCrafting.addRecipe(
					new FallingAnvilRecipe(
							new ItemStack(JadeRegistration.void_jade_raw, 1),
							results
					)
			);

			//void jade raw 1
			results.clear();

			results.add(new FallingAnvilRecipeResult(endstone, 245));

			if(JadeSettings.settings.greenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.jade, 300));
			}

			if(JadeSettings.settings.fireJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.void_jade, 300));
			}

			if(JadeSettings.settings.whiteJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.white_jade, 100));
			}

			if(JadeSettings.settings.goldenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.golden_jade, 50));
			}

			if(JadeSettings.settings.prismaticJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.prismatic_jade, 5));
			}

			FallingAnvilCrafting.addRecipe(
					new FallingAnvilRecipe(
							new ItemStack(JadeRegistration.void_jade_raw1, 1),
							results
					)
			);

			//void jade raw2
			results.clear();

			results.add(new FallingAnvilRecipeResult(endstone, 14));

			if(JadeSettings.settings.greenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.jade, 20));
			}

			if(JadeSettings.settings.fireJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.void_jade, 40));
			}

			if(JadeSettings.settings.whiteJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.white_jade, 20));
			}

			if(JadeSettings.settings.goldenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.golden_jade, 5));
			}

			if(JadeSettings.settings.prismaticJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.prismatic_jade, 1));
			}

			FallingAnvilCrafting.addRecipe(
					new FallingAnvilRecipe(
							new ItemStack(JadeRegistration.void_jade_raw2, 1),
							results
					)
			);

			//jade raw white
			results.clear();

			results.add(new FallingAnvilRecipeResult(cobblestone, 10));

			if(JadeSettings.settings.greenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.jade, 35));
			}

			if(JadeSettings.settings.whiteJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.white_jade, 35));
			}

			if(JadeSettings.settings.goldenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.golden_jade, 15));
			}

			if(JadeSettings.settings.prismaticJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.prismatic_jade, 5));
			}

			FallingAnvilCrafting.addRecipe(
					new FallingAnvilRecipe(
							new ItemStack(JadeRegistration.jade_raw_white, 1),
							results
					)
			);

			//jade raw golden
			results.clear();

			if(JadeSettings.settings.greenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.jade, 24));
			}

			if(JadeSettings.settings.whiteJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.white_jade, 40));
			}

			if(JadeSettings.settings.goldenJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.golden_jade, 25));
			}

			if(JadeSettings.settings.prismaticJadeEnabled) {
				results.add(new FallingAnvilRecipeResult(JadeRegistration.prismatic_jade, 10));
			}

			FallingAnvilCrafting.addRecipe(
					new FallingAnvilRecipe(
							new ItemStack(JadeRegistration.jade_raw_golden, 1),
							results
					)
			);
		}
	}
}

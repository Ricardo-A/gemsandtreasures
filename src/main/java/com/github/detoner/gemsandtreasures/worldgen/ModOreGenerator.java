package com.github.detoner.gemsandtreasures.worldgen;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.github.detoner.gemsandtreasures.handler.RegistrationHandler;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import com.github.detoner.gemsandtreasures.settings.JadeSettings;
import com.github.detoner.gemsandtreasures.settings.MarbleSettings;
import com.github.detoner.gemsandtreasures.settings.TigersEyeSettings;

import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModOreGenerator implements IWorldGenerator {

	private List<WorldGen> worldGenList = new ArrayList<WorldGen>();
	
	public ModOreGenerator() {
		if(GemsSettings.settings.carbonadoEnabled) {
			worldGenList.add(new WorldGen(RegistrationHandler.carbonado_ore, Blocks.BEDROCK, 5, 1, 0, 10));
		}
		if(GemsSettings.settings.marbleEnabled) {
			if(MarbleSettings.settings.whiteMarbleEnabled) {
				worldGenList.add(new WorldGen(RegistrationHandler.marble_ore, Blocks.STONE, 15, 5, 0, 200));
			}
			if(MarbleSettings.settings.blackMarbleEnabled) {
				worldGenList.add(new WorldGen(RegistrationHandler.black_marble_ore, Blocks.STONE, 15, 5, 0, 200));
			}
		}
		if(GemsSettings.settings.tigersEyeEnabled) {
			if(TigersEyeSettings.settings.stoneTigersEyeEnabled) {
				worldGenList.add(new WorldGen(RegistrationHandler.tigers_eye_ore, Blocks.STONE, 20, 2, 0, 150));
			}
			if(TigersEyeSettings.settings.sandTigersEyeEnabled) {
				worldGenList.add(new WorldGen(RegistrationHandler.tigers_eye_sand_ore, Blocks.SAND, 30, 3, 0, 150));
			}
		}
		if(GemsSettings.settings.jadeEnabled) {
			if(JadeSettings.settings.greenJadeEnabled) {
				worldGenList.add(new WorldGen(RegistrationHandler.jade_ore, Blocks.STONE, 15, 4, 0, 100));
			}
			if(JadeSettings.settings.fireJadeEnabled) {
				worldGenList.add(new WorldGen(RegistrationHandler.fire_jade_ore, Blocks.NETHERRACK, 15, 4, 0, 255));
			}
			if(JadeSettings.settings.voidJadeEnabled) {
				worldGenList.add(new WorldGen(RegistrationHandler.void_jade_ore, Blocks.END_STONE, 15, 4, 5, 200));
			}
		}
		if(GemsSettings.settings.rubyEnabled) {
			worldGenList.add(new WorldGen(RegistrationHandler.ruby_ore, Blocks.STONE, 10, 3, 0, 30));
		}
		if(GemsSettings.settings.amethystEnabled) {
			worldGenList.add(new WorldGen(RegistrationHandler.amethyst_ore, Blocks.STONE, 5, 3, 0, 25));
		}
		if(GemsSettings.settings.glowingGemEnabled) {
			worldGenList.add(new WorldGen(RegistrationHandler.glowing_gem_ore, Blocks.GLOWSTONE, 20, 5, 0, 250));
		}
		if(GemsSettings.settings.coalStoneEnabled) {
			worldGenList.add(new WorldGen(RegistrationHandler.coal_stone_ore, Blocks.COAL_ORE, 20, 1, 0, 90));
		}
		if(GemsSettings.settings.crystalEnabled) {
			worldGenList.add(new WorldGen(RegistrationHandler.crystal_ore, Blocks.STONE, 25, 5, 0, 90));
		}
		if(GemsSettings.settings.moonCrystalEnabled) {
			worldGenList.add(new WorldGen(RegistrationHandler.moon_crystal_ore, Blocks.STONE, 25, 5, 0, 90));
		}
		if(GemsSettings.settings.roseQuartzEnabled) {
			worldGenList.add(new WorldGen(RegistrationHandler.rose_quartz_ore, Blocks.STONE, 25, 5, 0, 90));
		}
		if(GemsSettings.settings.aquamarineEnabled) {
			worldGenList.add(new WorldGen(RegistrationHandler.aquamarine_ore, Blocks.STONE, 25, 5, 0, 90));
			worldGenList.add(new WorldGen(RegistrationHandler.aquamarine_clay_ore, Blocks.CLAY, 25, 3, 0, 90));
		}
		if(GemsSettings.settings.sapphireEnabled) {
			worldGenList.add(new WorldGen(RegistrationHandler.sapphire_ore, Blocks.STONE, 25, 4, 0, 90));
		}
		if(GemsSettings.settings.topazEnabled) {
			worldGenList.add(new WorldGen(RegistrationHandler.topaz_ore, Blocks.STONE, 25, 4, 0, 90));
			worldGenList.add(new WorldGen(RegistrationHandler.topaz_dirt_ore, Blocks.DIRT, 25, 4, 1, 190));
			worldGenList.add(new WorldGen(RegistrationHandler.topaz_soul_sand_ore, Blocks.SOUL_SAND, 25, 4, 0, 120));
		}
		if(GemsSettings.settings.pinkDiamondEnabled) {
			worldGenList.add(new WorldGen(RegistrationHandler.pink_diamond_ore, Blocks.STONE, 10, 4, 0, 40));
		}
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		for(WorldGen element : worldGenList) {
			element.generate(world, random, chunkX, chunkZ);
		}
	}
}

package com.github.detoner.gemsandtreasures.worldgen;

import java.util.Random;

import com.github.detoner.gemsandtreasures.handler.RegistrationHandler;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import com.github.detoner.gemsandtreasures.settings.JadeSettings;
import com.github.detoner.gemsandtreasures.settings.MarbleSettings;
import com.github.detoner.gemsandtreasures.settings.TigersEyeSettings;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModOreGenerator implements IWorldGenerator {

	private WorldGenCarbonado worldGenCarbonado;
	private WorldGenMarble worldGenMarble;
	private WorldGenMarble worldGenBlackMarble;
	private WorldGenTigersEye worldGenTigersEye;
	private WorldGenTigersEye worldGenTigersEyeSand;
	private WorldGenJade worldGenJade;
	private WorldGenJade worldGenFireJade;
	private WorldGenJade worldGenVoidJade;
	private WorldGenRuby worldGenRuby;
	private WorldGenAmethyst worldGenAmethyst;
	private WorldGenGeneric worldGenGeneric = new WorldGenGeneric();
	
	public ModOreGenerator() {
		if(GemsSettings.settings.carbonadoEnabled) {
			worldGenCarbonado = new WorldGenCarbonado(RegistrationHandler.carbonado_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.BEDROCK));
		}
		if(GemsSettings.settings.marbleEnabled) {
			if(MarbleSettings.settings.whiteMarbleEnabled) {
				worldGenMarble = new WorldGenMarble(RegistrationHandler.marble_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE));
			}
			if(MarbleSettings.settings.blackMarbleEnabled) {
				worldGenBlackMarble = new WorldGenMarble(RegistrationHandler.black_marble_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE));
			}
		}
		if(GemsSettings.settings.tigersEyeEnabled) {
			if(TigersEyeSettings.settings.stoneTigersEyeEnabled) {
				worldGenTigersEye = new WorldGenTigersEye(RegistrationHandler.tigers_eye_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE));
			}
			if(TigersEyeSettings.settings.sandTigersEyeEnabled) {
				worldGenTigersEyeSand = new WorldGenTigersEye(RegistrationHandler.tigers_eye_sand_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.SAND));
			}
		}
		if(GemsSettings.settings.jadeEnabled) {
			if(JadeSettings.settings.greenJadeEnabled) {
				worldGenJade = new WorldGenJade(RegistrationHandler.jade_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE));
			}
			if(JadeSettings.settings.fireJadeEnabled) {
				worldGenFireJade = new WorldGenJade(RegistrationHandler.fire_jade_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.NETHERRACK));
			}
			if(JadeSettings.settings.voidJadeEnabled) {
				worldGenVoidJade = new WorldGenJade(RegistrationHandler.void_jade_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.END_STONE));
			}
		}
		if(GemsSettings.settings.rubyEnabled) {
			worldGenRuby = new WorldGenRuby(RegistrationHandler.ruby_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE));
		}
		if(GemsSettings.settings.amethystEnabled) {
			worldGenAmethyst = new WorldGenAmethyst(RegistrationHandler.amethyst_ore.getDefaultState(), BlockMatcher.forBlock(Blocks.STONE));
		}
		WorldGenGeneric.registerOreForGen(-1, RegistrationHandler.glowing_gem_ore, Blocks.GLOWSTONE, 350, 15, 1, 127);
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		if(GemsSettings.settings.carbonadoEnabled) {
			worldGenCarbonado.generate(random, chunkX, chunkZ, world);
		}
		if(GemsSettings.settings.marbleEnabled) {
			if(MarbleSettings.settings.whiteMarbleEnabled) {
				worldGenMarble.generate(world, random, chunkX, chunkZ);
			}
			if(MarbleSettings.settings.blackMarbleEnabled) {
				worldGenBlackMarble.generate(world, random, chunkX, chunkZ);
			}
		}
		if(GemsSettings.settings.tigersEyeEnabled) {
			if(TigersEyeSettings.settings.stoneTigersEyeEnabled) {
				worldGenTigersEye.generate(world, random, chunkX, chunkZ);
			}
			if(TigersEyeSettings.settings.sandTigersEyeEnabled) {
				worldGenTigersEyeSand.generate(world, random, chunkX, chunkZ);
			}
		}
		if(GemsSettings.settings.jadeEnabled) {
			if(JadeSettings.settings.greenJadeEnabled) {
				worldGenJade.generate(world, random, chunkX, chunkZ);
			}
			if(JadeSettings.settings.fireJadeEnabled) {
				worldGenFireJade.generate(world, random, chunkX, chunkZ);
			}
			if(JadeSettings.settings.voidJadeEnabled) {
				worldGenVoidJade.generate(world, random, chunkX, chunkZ);
			}
		}
		if(GemsSettings.settings.rubyEnabled) {
			worldGenRuby.generate(world, random, chunkX, chunkZ);
		}
		if(GemsSettings.settings.amethystEnabled) {
			worldGenAmethyst.generate(world, random, chunkX, chunkZ);
		}
		worldGenGeneric.generate(random, chunkX, chunkZ, world, chunkGenerator, chunkProvider);
	}
}

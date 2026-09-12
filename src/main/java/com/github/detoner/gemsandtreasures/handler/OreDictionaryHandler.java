package com.github.detoner.gemsandtreasures.handler;

import com.github.detoner.gemsandtreasures.handler.registration.*;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import com.github.detoner.gemsandtreasures.settings.JadeSettings;
import com.github.detoner.gemsandtreasures.settings.MarbleSettings;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {

	public static void registerDictionary() {
		if(GemsSettings.settings.carbonadoEnabled) {
			OreDictionary.registerOre("gemCarbonado", CarbonadoRegistration.carbonado);
			OreDictionary.registerOre("oreCarbonado", CarbonadoRegistration.carbonado_ore);
			OreDictionary.registerOre("blockCarbonado", CarbonadoRegistration.carbonado_block);
			OreDictionary.registerOre("shardCarbonado", CarbonadoRegistration.carbonado_shard);
		}
		
		if(GemsSettings.settings.marbleEnabled) {
			if(MarbleSettings.settings.whiteMarbleEnabled) {
				OreDictionary.registerOre("gemMarble", MarbleRegistration.marble);
				OreDictionary.registerOre("gemWhiteMarble", MarbleRegistration.marble);
				OreDictionary.registerOre("oreMarble", MarbleRegistration.marble_ore);
				OreDictionary.registerOre("oreWhiteMarble", MarbleRegistration.marble_ore);
				OreDictionary.registerOre("blockMarble", MarbleRegistration.marble_block);
				OreDictionary.registerOre("blockWhiteMarble", MarbleRegistration.marble_block);
			}
			if(MarbleSettings.settings.blackMarbleEnabled) {
				OreDictionary.registerOre("gemBlackMarble", MarbleRegistration.black_marble);
				OreDictionary.registerOre("gemMarble", MarbleRegistration.black_marble);
				OreDictionary.registerOre("oreBlackMarble", MarbleRegistration.black_marble_ore);
				OreDictionary.registerOre("oreMarble", MarbleRegistration.black_marble_ore);
				OreDictionary.registerOre("blockBlackMarble", MarbleRegistration.black_marble_block);
				OreDictionary.registerOre("blockMarble", MarbleRegistration.black_marble_block);
			}
		}
		
		if(GemsSettings.settings.tigersEyeEnabled) {
			OreDictionary.registerOre("gemTigersEye", TigersEyeRegistration.tigers_eye);
			OreDictionary.registerOre("oreTigersEye", TigersEyeRegistration.tigers_eye_ore);
			OreDictionary.registerOre("blockTigersEye", TigersEyeRegistration.tigers_eye_block);
			OreDictionary.registerOre("shardTigersEye", TigersEyeRegistration.tigers_eye_shard);
			OreDictionary.registerOre("dustTigersEye", TigersEyeRegistration.tigers_eye_dust);
		}
		
		if(GemsSettings.settings.jadeEnabled) {
			if(JadeSettings.settings.greenJadeEnabled) {
				OreDictionary.registerOre("gemJade", JadeRegistration.jade);
				OreDictionary.registerOre("gemGreenJade", JadeRegistration.jade);
				OreDictionary.registerOre("oreJade", JadeRegistration.jade_ore);
				OreDictionary.registerOre("blockGreenJade", JadeRegistration.jade_block);
				OreDictionary.registerOre("blockJade", JadeRegistration.jade_block);
			}
			if(JadeSettings.settings.fireJadeEnabled) {
				OreDictionary.registerOre("gemJade", JadeRegistration.fire_jade);
				OreDictionary.registerOre("gemFireJade", JadeRegistration.fire_jade);
				OreDictionary.registerOre("oreFireJade", JadeRegistration.fire_jade_ore);
				OreDictionary.registerOre("blockFireJade", JadeRegistration.fire_jade_block);
				OreDictionary.registerOre("blockJade", JadeRegistration.fire_jade_block);
			}
			if(JadeSettings.settings.voidJadeEnabled) {
				OreDictionary.registerOre("gemJade", JadeRegistration.void_jade);
				OreDictionary.registerOre("gemVoidJade", JadeRegistration.void_jade);
				OreDictionary.registerOre("oreVoidJade", JadeRegistration.void_jade_ore);
				OreDictionary.registerOre("blockVoidJade", JadeRegistration.void_jade_block);
				OreDictionary.registerOre("blockJade", JadeRegistration.void_jade_block);
			}
			if(JadeSettings.settings.whiteJadeEnabled) {
				OreDictionary.registerOre("gemJade", JadeRegistration.white_jade);
				OreDictionary.registerOre("gemWhiteJade", JadeRegistration.white_jade);
				OreDictionary.registerOre("blockWhiteJade", JadeRegistration.white_jade_block);
				OreDictionary.registerOre("blockJade", JadeRegistration.white_jade_block);
			}
			if(JadeSettings.settings.goldenJadeEnabled) {
				OreDictionary.registerOre("gemJade", JadeRegistration.golden_jade);
				OreDictionary.registerOre("gemGoldenJade", JadeRegistration.golden_jade);
				OreDictionary.registerOre("blockGoldenJade", JadeRegistration.golden_jade_block);
				OreDictionary.registerOre("blockJade", JadeRegistration.golden_jade_block);
			}
			if(JadeSettings.settings.prismaticJadeEnabled) {
				OreDictionary.registerOre("gemJade", JadeRegistration.prismatic_jade);
				OreDictionary.registerOre("gemPrismaticJade", JadeRegistration.prismatic_jade);
				OreDictionary.registerOre("blockPrismaticJade", JadeRegistration.prismatic_jade_block);
				OreDictionary.registerOre("blockJade", JadeRegistration.prismatic_jade_block);
			}
		}
		
		if(GemsSettings.settings.rubyEnabled) {
			OreDictionary.registerOre("gemRuby", RubyRegistration.ruby);
			OreDictionary.registerOre("oreRuby", RubyRegistration.ruby_ore);
			OreDictionary.registerOre("blockRuby", RubyRegistration.ruby_block);
		}
		
		if(GemsSettings.settings.amethystEnabled) {
			OreDictionary.registerOre("gemAmethyst", AmethystRegistration.amethyst);
			OreDictionary.registerOre("oreAmethyst", AmethystRegistration.amethyst_ore);
			OreDictionary.registerOre("blockAmethyst", AmethystRegistration.amethyst_block);
		}
		
		if(GemsSettings.settings.glowingGemEnabled) {
			OreDictionary.registerOre("gemGlowingGem", GlowingGemRegistration.glowing_gem);
			OreDictionary.registerOre("oreGlowingGem", GlowingGemRegistration.glowing_gem_ore);
			OreDictionary.registerOre("blockGlowingGem", GlowingGemRegistration.glowing_gem_block);
		}
		
		if(GemsSettings.settings.sapphireEnabled) {
			OreDictionary.registerOre("gemSapphire", SapphireRegistration.sapphire);
			OreDictionary.registerOre("oreSapphire", SapphireRegistration.sapphire_ore);
			OreDictionary.registerOre("blockSapphire", SapphireRegistration.sapphire_block);
		}
		
		if(GemsSettings.settings.crystalEnabled) {
			OreDictionary.registerOre("gemCrystal", CrystalRegistration.crystal);
			OreDictionary.registerOre("oreCrystal", CrystalRegistration.crystal_ore);
			OreDictionary.registerOre("blockCrystal", CrystalRegistration.crystal_block);
		}
		
		if(GemsSettings.settings.pinkDiamondEnabled) {
			OreDictionary.registerOre("gemPinkDiamond", PinkDiamondRegistration.pink_diamond);
		}
		
		if(GemsSettings.settings.aquamarineEnabled) {
			OreDictionary.registerOre("gemAquamarine", AquamarineRegistration.aquamarine);
			OreDictionary.registerOre("oreAquamarine", AquamarineRegistration.aquamarine_ore);
			OreDictionary.registerOre("blockAquamarine", AquamarineRegistration.aquamarine_block);
		}
		
		if(GemsSettings.settings.topazEnabled) {
			OreDictionary.registerOre("gemTopaz", TopazRegistration.topaz);
			OreDictionary.registerOre("oreTopaz", TopazRegistration.topaz_ore);
			OreDictionary.registerOre("blockTopaz", TopazRegistration.topaz_block);
		}
	}
}

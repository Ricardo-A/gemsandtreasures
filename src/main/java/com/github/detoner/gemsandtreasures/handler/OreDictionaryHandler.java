package com.github.detoner.gemsandtreasures.handler;

import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import com.github.detoner.gemsandtreasures.settings.JadeSettings;
import com.github.detoner.gemsandtreasures.settings.MarbleSettings;
import net.minecraftforge.oredict.OreDictionary;

public class OreDictionaryHandler {

	public static void registerDictionary() {
		if(GemsSettings.settings.carbonadoEnabled) {
			OreDictionary.registerOre("gemCarbonado", RegistrationHandler.carbonado);
			OreDictionary.registerOre("oreCarbonado", RegistrationHandler.carbonado_ore);
			OreDictionary.registerOre("blockCarbonado", RegistrationHandler.carbonado_block);
			OreDictionary.registerOre("shardCarbonado", RegistrationHandler.carbonado_shard);
		}
		
		if(GemsSettings.settings.marbleEnabled) {
			if(MarbleSettings.settings.whiteMarbleEnabled) {
				OreDictionary.registerOre("gemMarble", RegistrationHandler.marble);
				OreDictionary.registerOre("oreMarble", RegistrationHandler.marble_ore);
				OreDictionary.registerOre("blockMarble", RegistrationHandler.marble_block);
			}
			if(MarbleSettings.settings.blackMarbleEnabled) {
				OreDictionary.registerOre("gemBlackMarble", RegistrationHandler.black_marble);
				OreDictionary.registerOre("oreBlackMarble", RegistrationHandler.black_marble_ore);
				OreDictionary.registerOre("blockBlackMarble", RegistrationHandler.black_marble_block);
			}
		}
		
		if(GemsSettings.settings.tigersEyeEnabled) {
			OreDictionary.registerOre("gemTigersEye", RegistrationHandler.tigers_eye);
			OreDictionary.registerOre("oreTigersEye", RegistrationHandler.tigers_eye_ore);
			OreDictionary.registerOre("blockTigersEye", RegistrationHandler.tigers_eye_block);
		}
		
		if(GemsSettings.settings.jadeEnabled) {
			if(JadeSettings.settings.greenJadeEnabled) {
				OreDictionary.registerOre("gemJade", RegistrationHandler.jade);
				OreDictionary.registerOre("oreJade", RegistrationHandler.jade_ore);
				OreDictionary.registerOre("blockJade", RegistrationHandler.jade_block);
			}
			if(JadeSettings.settings.fireJadeEnabled) {
				OreDictionary.registerOre("gemFireJade", RegistrationHandler.fire_jade);
				OreDictionary.registerOre("oreFireJade", RegistrationHandler.fire_jade_ore);
				OreDictionary.registerOre("blockFireJade", RegistrationHandler.fire_jade_block);
			}
			if(JadeSettings.settings.voidJadeEnabled) {
				OreDictionary.registerOre("gemVoidJade", RegistrationHandler.void_jade);
				OreDictionary.registerOre("oreVoidJade", RegistrationHandler.void_jade_ore);
				OreDictionary.registerOre("blockVoidJade", RegistrationHandler.void_jade_block);
			}
			if(JadeSettings.settings.whiteJadeEnabled) {
				OreDictionary.registerOre("gemWhiteJade", RegistrationHandler.white_jade);
				OreDictionary.registerOre("blockWhiteJade", RegistrationHandler.white_jade_block);
			}
			if(JadeSettings.settings.goldenJadeEnabled) {
				OreDictionary.registerOre("gemGoldenJade", RegistrationHandler.golden_jade);
				OreDictionary.registerOre("blockGoldenJade", RegistrationHandler.golden_jade_block);
			}
			if(JadeSettings.settings.prismaticJadeEnabled) {
				OreDictionary.registerOre("gemPrismaticJade", RegistrationHandler.prismatic_jade);
				OreDictionary.registerOre("blockPrismaticJade", RegistrationHandler.prismatic_jade_block);
			}
		}
		
		if(GemsSettings.settings.rubyEnabled) {
			OreDictionary.registerOre("gemRuby", RegistrationHandler.ruby);
			OreDictionary.registerOre("oreRuby", RegistrationHandler.ruby_ore);
			OreDictionary.registerOre("blockRuby", RegistrationHandler.ruby_block);
		}
		
		if(GemsSettings.settings.amethystEnabled) {
			OreDictionary.registerOre("gemAmethyst", RegistrationHandler.amethyst);
			OreDictionary.registerOre("oreAmethyst", RegistrationHandler.amethyst_ore);
			OreDictionary.registerOre("blockAmethyst", RegistrationHandler.amethyst_block);
		}
		
		if(GemsSettings.settings.glowingGemEnabled) {
			OreDictionary.registerOre("gemGlowingGem", RegistrationHandler.glowing_gem);
			OreDictionary.registerOre("oreGlowingGem", RegistrationHandler.glowing_gem_ore);
			OreDictionary.registerOre("blockGlowingGem", RegistrationHandler.glowing_gem_block);
		}
		
		if(GemsSettings.settings.sapphireEnabled) {
			OreDictionary.registerOre("gemSapphire", RegistrationHandler.sapphire);
			OreDictionary.registerOre("oreSapphire", RegistrationHandler.sapphire_ore);
			OreDictionary.registerOre("blockSapphire", RegistrationHandler.sapphire_block);
		}
		
		if(GemsSettings.settings.crystalEnabled) {
			OreDictionary.registerOre("gemCrystal", RegistrationHandler.crystal);
			OreDictionary.registerOre("oreCrystal", RegistrationHandler.crystal_ore);
			OreDictionary.registerOre("blockCrystal", RegistrationHandler.crystal_block);
		}
		
		if(GemsSettings.settings.pinkDiamondEnabled) {
			OreDictionary.registerOre("gemPinkDiamond", RegistrationHandler.pink_diamond);
		}
		
		if(GemsSettings.settings.aquamarineEnabled) {
			OreDictionary.registerOre("gemAquamarine", RegistrationHandler.aquamarine);
			OreDictionary.registerOre("oreAquamarine", RegistrationHandler.aquamarine_ore);
			OreDictionary.registerOre("blockAquamarine", RegistrationHandler.aquamarine_block);
		}
		
		if(GemsSettings.settings.topazEnabled) {
			OreDictionary.registerOre("gemTopaz", RegistrationHandler.topaz);
			OreDictionary.registerOre("oreTopaz", RegistrationHandler.topaz_ore);
			OreDictionary.registerOre("blockTopaz", RegistrationHandler.topaz_block);
		}
	}
}

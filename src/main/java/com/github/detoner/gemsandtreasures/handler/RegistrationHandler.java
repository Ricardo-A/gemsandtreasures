package com.github.detoner.gemsandtreasures.handler;

import java.util.ArrayList;
import java.util.List;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import com.github.detoner.gemsandtreasures.block.AmethystOre;
import com.github.detoner.gemsandtreasures.block.AquamarineClayOre;
import com.github.detoner.gemsandtreasures.block.AquamarineOre;
import com.github.detoner.gemsandtreasures.block.BlockBase;
import com.github.detoner.gemsandtreasures.block.BlockBaseGlass;
import com.github.detoner.gemsandtreasures.block.CarbonadoOre;
import com.github.detoner.gemsandtreasures.block.CoalStoneOre;
import com.github.detoner.gemsandtreasures.block.CrystalOre;
import com.github.detoner.gemsandtreasures.block.FireJadeOre;
import com.github.detoner.gemsandtreasures.block.GlowingGemOre;
import com.github.detoner.gemsandtreasures.block.ItemBlockBase;
import com.github.detoner.gemsandtreasures.block.JadeOre;
import com.github.detoner.gemsandtreasures.block.MoonCrystalOre;
import com.github.detoner.gemsandtreasures.block.OnyxOre;
import com.github.detoner.gemsandtreasures.block.OnyxSoulSandOre;
import com.github.detoner.gemsandtreasures.block.RoseQuartzOre;
import com.github.detoner.gemsandtreasures.block.RubyOre;
import com.github.detoner.gemsandtreasures.block.SapphireOre;
import com.github.detoner.gemsandtreasures.block.TigersEyeOre;
import com.github.detoner.gemsandtreasures.block.TigersEyeSandOre;
import com.github.detoner.gemsandtreasures.block.TopazDirtOre;
import com.github.detoner.gemsandtreasures.block.TopazOre;
import com.github.detoner.gemsandtreasures.block.TopazSoulSandOre;
import com.github.detoner.gemsandtreasures.block.VoidJadeOre;
import com.github.detoner.gemsandtreasures.item.ItemBase;
import com.github.detoner.gemsandtreasures.item.ItemBaseArmor;
import com.github.detoner.gemsandtreasures.item.ItemBaseAxe;
import com.github.detoner.gemsandtreasures.item.ItemBaseHoe;
import com.github.detoner.gemsandtreasures.item.ItemBasePickaxe;
import com.github.detoner.gemsandtreasures.item.ItemBaseShovel;
import com.github.detoner.gemsandtreasures.item.ItemBaseSword;
import com.github.detoner.gemsandtreasures.item.ItemJade;
import com.github.detoner.gemsandtreasures.item.ItemScrollOfReturn;
import com.github.detoner.gemsandtreasures.item.material.ModMaterial;
import com.github.detoner.gemsandtreasures.settings.CarbonadoSettings;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import com.github.detoner.gemsandtreasures.settings.JadeSettings;
import com.github.detoner.gemsandtreasures.settings.MarbleSettings;
import com.github.detoner.gemsandtreasures.settings.TigersEyeSettings;
import com.github.detoner.gemsandtreasures.settings.TreasuresSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@EventBusSubscriber(modid = GemsAndTreasures.MODID)
public class RegistrationHandler {

	//start carbonado
	public static ItemBase carbonado;
	public static ItemBase carbonado_cluster;
	public static ItemBase carbonado_raw;
	public static ItemBase carbonado_shard;
	public static ItemBaseSword carbonado_sword;
	public static ItemBasePickaxe carbonado_pickaxe;
	public static ItemBaseAxe carbonado_axe;
	public static ItemBaseHoe carbonado_hoe;
	public static ItemBaseShovel carbonado_shovel;
	public static ItemBaseArmor carbonado_helmet;
	public static ItemBaseArmor carbonado_chestplate;
	public static ItemBaseArmor carbonado_leggings;
	public static ItemBaseArmor carbonado_boots;
	
	public static Block carbonado_block;
	public static Block carbonado_ore;
	public static Block carbonado_glass;
	//end carbonado
	
	//start tigers eye
	public static ItemBase tigers_eye;
	public static ItemScrollOfReturn scroll_of_return;
	
	public static Block tigers_eye_block;
	public static Block tigers_eye_ore;
	public static Block tigers_eye_sand_ore;
	public static Block tigers_eye_glass;
	//end tigers eye
	
	//start marble
	public static ItemBase marble;
	public static ItemBase black_marble;
	
	public static Block marble_block;
	public static Block black_marble_block;
	public static Block marble_ore;
	public static Block black_marble_ore;
	//end marble
	
	//start jade
	public static ItemJade jade;
	public static ItemJade fire_jade;
	public static ItemJade void_jade;
	public static ItemJade white_jade;
	public static ItemJade golden_jade;
	public static ItemJade prismatic_jade;
	
	public static Block jade_block;
	public static Block fire_jade_block;
	public static Block void_jade_block;
	public static Block white_jade_block;
	public static Block golden_jade_block;
	public static Block prismatic_jade_block;
	
	public static Block jade_ore;
	public static Block fire_jade_ore;
	public static Block void_jade_ore;
	
	public static Block jade_raw;
	public static Block jade_raw1;
	public static Block jade_raw2;
	public static Block fire_jade_raw;
	public static Block fire_jade_raw1;
	public static Block fire_jade_raw2;
	public static Block void_jade_raw;
	public static Block void_jade_raw1;
	public static Block void_jade_raw2;
	public static Block jade_raw_white;
	public static Block jade_raw_golden;
	
	public static Block jade_glass;
	public static Block fire_jade_glass;
	public static Block void_jade_glass;
	public static Block white_jade_glass;
	public static Block golden_jade_glass;
	public static Block prismatic_jade_glass;
	//end jade
	
	//start ruby
	public static ItemBase ruby;
	
	public static Block ruby_block;
	public static Block ruby_ore;
	//end ruby
	
	//start amethyst
	public static ItemBase amethyst;
	
	public static Block amethyst_block;
	public static Block amethyst_ore;
	//end amethyst
	
	//start topaz
	public static ItemBase topaz;
	
	public static Block topaz_block;
	public static Block topaz_ore;
	public static Block topaz_dirt_ore;
	public static Block topaz_soul_sand_ore;
	//end topaz
	
	//start sapphire
	public static ItemBase sapphire;
	
	public static Block sapphire_block;
	public static Block sapphire_ore;
	//end sapphire
	
	//start crystal
	public static ItemBase crystal;
	
	public static Block crystal_block;
	public static Block crystal_ore;
	//end crystal
	
	//start glowing gem
	public static ItemBase glowing_gem;
	
	public static Block glowing_gem_block;
	public static Block glowing_gem_ore;
	public static Block glowing_gem_glass;
	public static Block glowing_glass;
	//end glowing gem
	
	//start aquamarine
	public static ItemBase aquamarine;
	
	public static Block aquamarine_block;
	public static Block aquamarine_ore;
	public static Block aquamarine_clay_ore;
	//end aquamarine
	
	//start pink diamond
	public static ItemBase pink_diamond;
	public static Block pink_diamond_block;
	public static Block pink_diamond_ore;
	//end pink diamond
	
	//start blood diamond
	public static ItemBase blood_diamond;
	//end blood diamond
	
	//start golden diamond
	public static ItemBase golden_diamond;
	//end golden diamond
	
	//start perfect diamond
	public static ItemBase perfect_diamond;
	//end perfect diamond
	
	//start royal diamond
	public static ItemBase royal_diamond;
	//end royal diamond
	
	//start agate
	public static ItemBase agate;
	//end agate
	
	//start onyx
	public static ItemBase onyx;
	public static Block onyx_block;
	public static Block onyx_ore;
	public static Block onyx_soulsand_ore;
	//end onyx
	
	//start moon crystal
	public static ItemBase moon_crystal;
	public static Block moon_crystal_block;
	public static Block moon_crystal_ore;
	//end moon_crystal
	
	//start rose quartz
	public static ItemBase rose_quartz;
	public static Block rose_quartz_block;
	public static Block rose_quartz_ore;
	//end rose quartz
	
	//start coal_stone
	public static ItemBase coal_stone;
	public static Block coal_stone_ore;
	//end coal stone
	
	//start petrified sline
	public static ItemBase petrified_slimeball;
	//end petrified sline
	
	private final static List<Item> items = new ArrayList<Item>();
	private final static List<Block> blocks = new ArrayList<Block>();

	
	public static void initItems() {
		//start carbonado
		if(GemsSettings.settings.carbonadoEnabled) {
			carbonado = new ItemBase("carbonado");
			items.add(carbonado);
			carbonado_cluster = new ItemBase("carbonado_cluster");
			items.add(carbonado_cluster);
			carbonado_raw = new ItemBase("carbonado_raw");
			items.add(carbonado_raw);
			carbonado_shard = new ItemBase("carbonado_shard");
			items.add(carbonado_shard);
			if(CarbonadoSettings.settings.carbonadoToolsEnabled) {
				carbonado_sword = new ItemBaseSword("carbonado_sword", ModMaterial.carbonadoToolMaterial, CarbonadoSettings.advancedSettings.swordDamage, CarbonadoSettings.advancedSettings.swordEfficiency,
						CarbonadoSettings.advancedSettings.swordEnchantability, CarbonadoSettings.advancedSettings.swordDurability);
				items.add(carbonado_sword);
				carbonado_pickaxe = new ItemBasePickaxe("carbonado_pickaxe", ModMaterial.carbonadoToolMaterial, CarbonadoSettings.advancedSettings.pickaxeEfficiency);
				items.add(carbonado_pickaxe);
				carbonado_shovel = new ItemBaseShovel("carbonado_shovel", ModMaterial.carbonadoToolMaterial);
				items.add(carbonado_shovel);
				carbonado_hoe = new ItemBaseHoe("carbonado_hoe", ModMaterial.carbonadoToolMaterial);
				items.add(carbonado_hoe);
				carbonado_axe = new ItemBaseAxe("carbonado_axe", ModMaterial.carbonadoToolMaterial, CarbonadoSettings.advancedSettings.axeDamage, CarbonadoSettings.advancedSettings.axeEfficiency,
						CarbonadoSettings.advancedSettings.axeEnchantability, CarbonadoSettings.advancedSettings.axeDurability, CarbonadoSettings.advancedSettings.axeSpeed);
				items.add(carbonado_axe);
			}
			if(CarbonadoSettings.settings.carbonadoArmorEnabled) {
				carbonado_helmet = new ItemBaseArmor("carbonado_helmet", ModMaterial.carbonadoArmorMaterial, EntityEquipmentSlot.HEAD);
				items.add(carbonado_helmet);
				carbonado_chestplate = new ItemBaseArmor("carbonado_chestplate", ModMaterial.carbonadoArmorMaterial, EntityEquipmentSlot.CHEST);
				items.add(carbonado_chestplate);
				carbonado_leggings = new ItemBaseArmor("carbonado_leggings", ModMaterial.carbonadoArmorMaterial, EntityEquipmentSlot.LEGS);
				items.add(carbonado_leggings);
				carbonado_boots = new ItemBaseArmor("carbonado_boots", ModMaterial.carbonadoArmorMaterial, EntityEquipmentSlot.FEET);
				items.add(carbonado_boots);
			}
			if(CarbonadoSettings.settings.carbonadoExtrasEnabled) {
				
			}
		}
		//end carbonado
		
		//start marble
		if(GemsSettings.settings.marbleEnabled) {
			if(MarbleSettings.settings.whiteMarbleEnabled) {
				marble = new ItemBase("marble");
				items.add(marble);
			}
			if(MarbleSettings.settings.blackMarbleEnabled) {
				black_marble = new ItemBase("black_marble");
				items.add(black_marble);
			}
		}
		//end marble
		
		//start tigers eye
		if(GemsSettings.settings.tigersEyeEnabled) {
			tigers_eye = new ItemBase("tigers_eye");
			items.add(tigers_eye);
		}
		//end tigers eye
		
		//start jade
		if(GemsSettings.settings.jadeEnabled) {
			if(JadeSettings.settings.greenJadeEnabled) {
				jade = new ItemJade("jade");
				items.add(jade);
			}
			if(JadeSettings.settings.fireJadeEnabled) {
				fire_jade = new ItemJade("fire_jade");
				items.add(fire_jade);
			}
			if(JadeSettings.settings.voidJadeEnabled) {
				void_jade = new ItemJade("void_jade");
				items.add(void_jade);
			}
			if(JadeSettings.settings.whiteJadeEnabled) {
				white_jade = new ItemJade("white_jade");
				items.add(white_jade);
			}
			if(JadeSettings.settings.goldenJadeEnabled) {
				golden_jade = new ItemJade("golden_jade");
				items.add(golden_jade);
			}
			if(JadeSettings.settings.prismaticJadeEnabled) {
				prismatic_jade = new ItemJade("prismatic_jade");
				items.add(prismatic_jade);
			}
		}
		//end jade
		
		//start ruby
		if(GemsSettings.settings.rubyEnabled) {
			ruby = new ItemBase("ruby");
			items.add(ruby);
		}
		//end ruby
		
		//start amethyst
		if(GemsSettings.settings.amethystEnabled) {
			amethyst = new ItemBase("amethyst");
			items.add(amethyst);
		}
		//end amethyst
		
		//start glowing gem
		if(GemsSettings.settings.glowingGemEnabled) {
			glowing_gem = new ItemBase("glowing_gem");
			items.add(glowing_gem);
		}
		//end glowing gem
		
		//start topaz
		if(GemsSettings.settings.topazEnabled) {
			topaz = new ItemBase("topaz");
			items.add(topaz);
		}
		//end topaz
		
		//start sapphire
		if(GemsSettings.settings.sapphireEnabled) {
			sapphire = new ItemBase("sapphire");
			items.add(sapphire);
		}
		//end sapphire
		
		//start aquamarine
		if(GemsSettings.settings.aquamarineEnabled) {
			aquamarine = new ItemBase("aquamarine");
			items.add(aquamarine);
		}
		//end aquamarine
		
		//start pink diamond
		if(GemsSettings.settings.pinkDiamondEnabled) {
			pink_diamond = new ItemBase("pink_diamond");
			items.add(pink_diamond);
		}
		//end pink diamond
		
		//start crystal
		if(GemsSettings.settings.crystalEnabled) {
			crystal = new ItemBase("crystal");
			items.add(crystal);
		}
		//end crystal
		
		//start moon crystal
		if(GemsSettings.settings.moonCrystalEnabled) {
			moon_crystal = new ItemBase("moon_crystal");
			items.add(moon_crystal);
		}
		//end moon crystal
		
		//start agate
		if(GemsSettings.settings.agateEnabled) {
			agate = new ItemBase("agate");
			items.add(agate);
		}
		//end agate
		
		//start onyx
		if(GemsSettings.settings.onyxEnabled) {
			onyx = new ItemBase("onyx");
			items.add(onyx);
		}
		//end onyx
		
		//start rose quartz
		if(GemsSettings.settings.roseQuartzEnabled) {
			rose_quartz = new ItemBase("rose_quartz");
			items.add(rose_quartz);
		}
		//end rose quartz
		
		//start coal stone
		if(GemsSettings.settings.coalStoneEnabled) {
			coal_stone = new ItemBase("coal_stone");
			items.add(coal_stone);
		}
		//end coal stone
		
		//start petrified slime
		if(GemsSettings.settings.petrifiedSlimeEnabled) {
			petrified_slimeball = new ItemBase("petrified_slimeball");
			items.add(petrified_slimeball);
		}
		//end petrified slime
		
		//start blood diamond
		if(GemsSettings.settings.bloodDiamondEnabled) {
			blood_diamond = new ItemBase("blood_diamond");
			items.add(blood_diamond);
		}
		//end blood diamond
		
		//start perfect diamond
		if(GemsSettings.settings.perfectDiamondEnabled) {
			perfect_diamond = new ItemBase("perfect_diamond");
			items.add(perfect_diamond);
		}
		//end perfect diamond
		
		//start royal diamond
		if(GemsSettings.settings.royalDiamondEnabled) {
			royal_diamond = new ItemBase("royal_diamond");
			items.add(royal_diamond);
		}
		//end royal diamond
		
		//start golden diamond
		if(GemsSettings.settings.goldenDiamondEnabled) {
			golden_diamond = new ItemBase("golden_diamond");
			items.add(golden_diamond);
		}
		//end golden diamond
		
		//start treasures
		if(TreasuresSettings.settings.scrollOfReturnEnabled) {
			scroll_of_return = new ItemScrollOfReturn();
			items.add(scroll_of_return);
		}
		//end treasures
	}
	
	public static void initBlocks() {
		//start carbonado
		if(GemsSettings.settings.carbonadoEnabled) {
			carbonado_block = new BlockBase(Material.IRON, "carbonado_block").setHardness(10.0f).setResistance(14.0f);
			blocks.add(carbonado_block);
			carbonado_ore = new CarbonadoOre(Material.ROCK, "carbonado_ore");
			blocks.add(carbonado_ore);
			carbonado_glass = new BlockBaseGlass(Material.GLASS, "carbonado_glass").setHardness(1f).setResistance(1f).setLightOpacity(15);
			blocks.add(carbonado_glass);
		}
		//end carbonado
		
		//start marble
		if(GemsSettings.settings.marbleEnabled) {
			if(MarbleSettings.settings.whiteMarbleEnabled) {
				marble_block = new BlockBase(Material.ROCK, "marble_block").setHardness(2.0f).setResistance(6.0f);
				blocks.add(marble_block);
				marble_ore = new BlockBase(Material.ROCK, "marble_ore").setHardness(3.0f).setResistance(5.0f);
				blocks.add(marble_ore);
			}
			if(MarbleSettings.settings.blackMarbleEnabled) {
				black_marble_block = new BlockBase(Material.ROCK, "black_marble_block").setHardness(2.0f).setResistance(6.0f);
				blocks.add(black_marble_block);
				black_marble_ore = new BlockBase(Material.ROCK, "black_marble_ore").setHardness(3.0f).setResistance(5.0f);
				blocks.add(black_marble_ore);
			}
		}
		//end marble
		
		//start tigers eye
		if(GemsSettings.settings.tigersEyeEnabled) {
			tigers_eye_block = new BlockBase(Material.ROCK, "tigers_eye_block").setHardness(5.0f).setResistance(8.0f);
			blocks.add(tigers_eye_block);
			tigers_eye_glass = new BlockBaseGlass(Material.GLASS, "tigers_eye_glass").setHardness(1f).setResistance(1f).setLightOpacity(15);
			blocks.add(tigers_eye_glass);
			if(TigersEyeSettings.settings.stoneTigersEyeEnabled) {
				tigers_eye_ore = new TigersEyeOre(Material.ROCK, "tigers_eye_ore");
				blocks.add(tigers_eye_ore);
			}
			if(TigersEyeSettings.settings.sandTigersEyeEnabled) {
				tigers_eye_sand_ore = new TigersEyeSandOre(Material.SAND, "tigers_eye_sand_ore");
				blocks.add(tigers_eye_sand_ore);
			}
		}
		//end tigers eye
		
		//start jade
		if(GemsSettings.settings.jadeEnabled) {
			if(JadeSettings.settings.greenJadeEnabled) {
				jade_block = new BlockBase(Material.ROCK, "jade_block").setHardness(5.0f).setResistance(8.0f);
				blocks.add(jade_block);
				jade_glass = new BlockBaseGlass(Material.GLASS, "jade_glass").setHardness(1f).setResistance(1f).setLightOpacity(15);
				blocks.add(jade_glass);
				jade_ore = new JadeOre(Material.ROCK, "jade_ore");
				blocks.add(jade_ore);
				jade_raw = new BlockBase(Material.ROCK, "jade_raw");
				blocks.add(jade_raw);
				jade_raw1 = new BlockBase(Material.ROCK, "jade_raw1");
				blocks.add(jade_raw1);
				jade_raw2 = new BlockBase(Material.ROCK, "jade_raw2");
				blocks.add(jade_raw2);
			}

			if(JadeSettings.settings.fireJadeEnabled) {
				fire_jade_block = new BlockBase(Material.ROCK, "fire_jade_block").setHardness(5.0f).setResistance(8.0f);
				blocks.add(fire_jade_block);
				fire_jade_glass = new BlockBaseGlass(Material.GLASS, "fire_jade_glass").setHardness(1f).setResistance(1f).setLightOpacity(15);
				blocks.add(fire_jade_glass);
				fire_jade_ore = new FireJadeOre(Material.ROCK, "fire_jade_ore");
				blocks.add(fire_jade_ore);
				fire_jade_raw = new BlockBase(Material.ROCK, "fire_jade_raw");
				blocks.add(fire_jade_raw);
				fire_jade_raw1 = new BlockBase(Material.ROCK, "fire_jade_raw1");
				blocks.add(fire_jade_raw1);
				fire_jade_raw2 = new BlockBase(Material.ROCK, "fire_jade_raw2");
				blocks.add(fire_jade_raw2);
			}
			
			if(JadeSettings.settings.voidJadeEnabled) {
				void_jade_block = new BlockBase(Material.ROCK, "void_jade_block").setHardness(5.0f).setResistance(8.0f);
				blocks.add(void_jade_block);
				void_jade_glass = new BlockBaseGlass(Material.GLASS, "void_jade_glass").setHardness(1f).setResistance(1f).setLightOpacity(15);
				blocks.add(void_jade_glass);
				void_jade_ore = new VoidJadeOre(Material.ROCK, "void_jade_ore");
				blocks.add(void_jade_ore);
				void_jade_raw = new BlockBase(Material.ROCK, "void_jade_raw");
				blocks.add(void_jade_raw);
				void_jade_raw1 = new BlockBase(Material.ROCK, "void_jade_raw1");
				blocks.add(void_jade_raw1);
				void_jade_raw2 = new BlockBase(Material.ROCK, "void_jade_raw2");
				blocks.add(void_jade_raw2);
			}
			
			if(JadeSettings.settings.whiteJadeEnabled) {
				white_jade_block = new BlockBase(Material.ROCK, "white_jade_block").setHardness(5.0f).setResistance(8.0f);
				blocks.add(white_jade_block);
				white_jade_glass = new BlockBaseGlass(Material.GLASS, "white_jade_glass").setHardness(1f).setResistance(1f).setLightOpacity(15);
				blocks.add(white_jade_glass);
				jade_raw_white = new BlockBase(Material.ROCK, "jade_raw_white");
				blocks.add(jade_raw_white);
			}
			
			if(JadeSettings.settings.goldenJadeEnabled) {
				golden_jade_block = new BlockBase(Material.ROCK, "golden_jade_block").setHardness(5.0f).setResistance(8.0f);
				blocks.add(golden_jade_block);
				golden_jade_glass = new BlockBaseGlass(Material.GLASS, "golden_jade_glass").setHardness(1f).setResistance(1f).setLightOpacity(15);
				blocks.add(golden_jade_glass);
				jade_raw_golden = new BlockBase(Material.ROCK, "jade_raw_golden");
				blocks.add(jade_raw_golden);
			}
			
			if(JadeSettings.settings.prismaticJadeEnabled) {
				prismatic_jade_block = new BlockBase(Material.ROCK, "prismatic_jade_block").setHardness(5.0f).setResistance(8.0f);
				blocks.add(prismatic_jade_block);
				prismatic_jade_glass = new BlockBaseGlass(Material.GLASS, "prismatic_jade_glass").setHardness(1f).setResistance(1f).setLightOpacity(15);
				blocks.add(prismatic_jade_glass);
			}
		}
		//end jade
		
		//start ruby
		if(GemsSettings.settings.rubyEnabled) {
			ruby_block = new BlockBase(Material.ROCK, "ruby_block").setHardness(5.0f).setResistance(8.0f);
			blocks.add(ruby_block);
			ruby_ore = new RubyOre(Material.ROCK, "ruby_ore");
			blocks.add(ruby_ore);
		}
		//end ruby
		
		//start amethyst
		if(GemsSettings.settings.amethystEnabled) {
			amethyst_block = new BlockBase(Material.ROCK, "amethyst_block").setHardness(5.0f).setResistance(8.0f);
			blocks.add(amethyst_block);
			amethyst_ore = new AmethystOre(Material.ROCK, "amethyst_ore");
			blocks.add(amethyst_ore);
		}
		//end amethyst
		
		//start glowing gem
		if(GemsSettings.settings.glowingGemEnabled) {
			glowing_gem_block = new BlockBase(Material.ROCK, "glowing_gem_block").setHardness(3.0f).setResistance(5.0f).setLightLevel(1f);
			blocks.add(glowing_gem_block);
			glowing_gem_ore = new GlowingGemOre(Material.GLASS, "glowing_gem_ore");
			blocks.add(glowing_gem_ore);
			glowing_gem_glass = new BlockBaseGlass(Material.GLASS, "glowing_gem_glass").setHardness(2f).setResistance(2f).setLightLevel(1f).setLightOpacity(1);
			blocks.add(glowing_gem_glass);
			glowing_glass = new BlockBaseGlass(Material.GLASS, "glowing_glass").setHardness(1f).setResistance(1f).setLightOpacity(15).setLightLevel(1f);
			blocks.add(glowing_glass);
		}
		//end glowing gem
		
		//start topaz
		if(GemsSettings.settings.topazEnabled) {
			topaz_block = new BlockBase(Material.ROCK, "topaz_block").setHardness(5.0f).setResistance(8.0f);
			blocks.add(topaz_block);
			topaz_ore = new TopazOre(Material.ROCK, "topaz_ore");
			blocks.add(topaz_ore);
			topaz_ore = new TopazDirtOre(Material.CLAY, "topaz_dirt_ore");
			blocks.add(topaz_ore);
			topaz_ore = new TopazSoulSandOre(Material.SAND, "topaz_soul_sand_ore");
			blocks.add(topaz_ore);
		}
		//end topaz
		
		//start sapphire
		if(GemsSettings.settings.sapphireEnabled) {
			sapphire_block = new BlockBase(Material.ROCK, "sapphire_block").setHardness(5.0f).setResistance(8.0f);
			blocks.add(sapphire_block);
			sapphire_ore = new SapphireOre(Material.ROCK, "sapphire_ore");
			blocks.add(sapphire_ore);
		}
		//end sapphire
		
		//start crystal
		if(GemsSettings.settings.crystalEnabled) {
			crystal_block = new BlockBase(Material.ROCK, "crystal_block").setHardness(5.0f).setResistance(8.0f);
			blocks.add(crystal_block);
			crystal_ore = new CrystalOre(Material.ROCK, "crystal_ore");
			blocks.add(crystal_ore);
		}
		//end crystal
		
		//start pink diamond
		if(GemsSettings.settings.pinkDiamondEnabled) {
			pink_diamond_block = new BlockBase(Material.ROCK, "pink_diamond_block").setHardness(6.0f).setResistance(8.0f);
			blocks.add(pink_diamond_block);
			pink_diamond_ore = new AquamarineOre(Material.ROCK, "pink_diamond_ore");
			blocks.add(pink_diamond_ore);
		}
		//end pink diamond
		
		//start aquamarine
		if(GemsSettings.settings.aquamarineEnabled) {
			aquamarine_block = new BlockBase(Material.ROCK, "aquamarine_block").setHardness(5.0f).setResistance(8.0f);
			blocks.add(aquamarine_block);
			aquamarine_ore = new AquamarineOre(Material.ROCK, "aquamarine_ore");
			blocks.add(aquamarine_ore);
			aquamarine_clay_ore = new AquamarineClayOre(Material.ROCK, "aquamarine_clay_ore");
			blocks.add(aquamarine_clay_ore);
		}
		//end aquamarine
		
		//start moon crystal
		if(GemsSettings.settings.moonCrystalEnabled) {
			moon_crystal_block = new BlockBase(Material.ROCK, "moon_crystal_block").setHardness(5.0f).setResistance(8.0f);
			blocks.add(moon_crystal_block);
			moon_crystal_ore = new MoonCrystalOre(Material.ROCK, "moon_crystal_ore");
			blocks.add(moon_crystal_ore);
		}
		//end moon crystal
		
		//start onyx
		if(GemsSettings.settings.onyxEnabled) {
			onyx_block = new BlockBase(Material.ROCK, "onyx_block").setHardness(5.0f).setResistance(8.0f);
			blocks.add(onyx_block);
			onyx_ore = new OnyxOre(Material.ROCK, "onyx_ore");
			blocks.add(onyx_ore);
			onyx_soulsand_ore = new OnyxSoulSandOre(Material.ROCK, "onyx_soulsand_ore");
			blocks.add(onyx_soulsand_ore);
		}
		//end onyx
		
		//start rose quartz
		if(GemsSettings.settings.roseQuartzEnabled) {
			rose_quartz_block = new BlockBase(Material.ROCK, "rose_quartz_block").setHardness(5.0f).setResistance(8.0f);
			blocks.add(rose_quartz_block);
			rose_quartz_ore = new RoseQuartzOre(Material.ROCK, "rose_quartz_ore");
			blocks.add(rose_quartz_ore);
		}
		//end rose quartz
		
		//start coal stone
		if(GemsSettings.settings.coalStoneEnabled) {
			coal_stone_ore = new CoalStoneOre(Material.ROCK, "coal_stone_ore");
			blocks.add(coal_stone_ore);
		}
		//end coal stone
	}
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		for(Item item:items) {
			event.getRegistry().register(item);
		}
		
		for(Block block : blocks) {
			event.getRegistry().register(new ItemBlockBase(block));
		}
	}
	
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		for(Block block : blocks) {
			event.getRegistry().register(block);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		
		for(Item item:items) {
			ModelLoader.setCustomModelResourceLocation(item, 0, 
					new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
		
		for(Block block:blocks) {
			Item item = Item.getItemFromBlock(block);
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}
}
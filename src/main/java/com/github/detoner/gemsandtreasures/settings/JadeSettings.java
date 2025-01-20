package com.github.detoner.gemsandtreasures.settings;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Gems/Jade")
public class JadeSettings {
	
	@Name("jade")
	public static BasicSettingsClass settings = new BasicSettingsClass();
	
	@Name("exchangeSettings")
	public static JadeLootSettingsClass exchangeSettings = new JadeLootSettingsClass();
	
	public static class BasicSettingsClass {
		@Name("greenJadeEnabled")
		@Comment("True if green (the commom one) jade should be available in the game.")
		public boolean greenJadeEnabled = true;
		
		@Name("fireJadeEnabled")
		@Comment("True if fire (nether) jade should be available in the game.")
		public boolean fireJadeEnabled = true;
		
		@Name("voidJadeEnabled")
		@Comment("True if void (end) jade should be available in the game.")
		public boolean voidJadeEnabled = true;
		
		@Name("whiteJadeEnabled")
		@Comment("True if white (rare) jade should be available in the game.")
		public boolean whiteJadeEnabled = true;
		
		@Name("goldenJadeEnabled")
		@Comment("True if golden (epic) jade should be available in the game.")
		public boolean goldenJadeEnabled = true;
		
		@Name("prismaticJadeEnabled")
		@Comment("True if prismatic (legendary) jade should be available in the game.")
		public boolean prismaticJadeEnabled = true;
	}
	
	public static class JadeLootSettingsClass {
		@Name("jadeLoot")
		@Comment("These items can be exchanged for the jade upon right click.\n weight modid:item:metadata amount")
		public String[] jadeLoot = {
				"1 minecraft:emerald 1",
				"2 minecraft:gold_ingot 1",
				"4 minecraft:iron_ingot 2",
				"4 minecraft:wool:0 1",
				"2 minecraft:egg 1",
				"2 minecraft:apple 3",
				"1 minecraft:clock 1",
				"2 minecraft:tnt 1",
				"1 minecraft:diamond 1",
				"1 minecraft:obsidian 2",
				"1 minecraft:rabbit_foot 1",
				"1 minecraft:golden_apple:0 1",
				"3 minecraft:slime_ball 1",
				"3 minecraft:feather 2",
				"3 minecraft:string 3",
				"2 minecraft:flint 2",
				"1 minecraft:fishing_rod 1",
				"3 minecraft:leather 1",
				"2 minecraft:hay_bale 1",
				"1 gemsandtreasures:white_jade 1"
		};
		
		@Name("fireJadeLoot")
		@Comment("These items can be exchanged for the fire jade upon right click.\n weight modid:item:metadata amount")
		public String[] fireJadeLoot = {
				"1 minecraft:blaze_rod 1",
				"1 minecraft:blaze_powder 2",
				"2 minecraft:blaze_powder 1",
				"2 minecraft:nether_wart 1",
				"4 minecraft:nether_brick 3",
				"3 minecraft:glowstone_dust 4",
				"2 minecraft:glowstone 1",
				"1 minecraft:ghast_tear 1",
				"1 minecraft:brewing_stand 1",
				"2 minecraft:magma_cream 1",
				"2 minecraft:fire_charge 1",
				"4 minecraft:coal 3",
				"2 minecraft:coal_block 1",
				"1 minecraft:nether_star 1",
				"1 minecraft:beacon 1",
				"1 gemsandtreasures:jade 2",
				"1 gemsandtreasures:white_jade 1",
				"1 minecraft:cauldron 1",
		};
		
		@Name("voidJadeLoot")
		@Comment("These items can be exchanged for the void jade upon right click.\n weight modid:item:metadata amount")
		public String[] voidJadeLoot = {
				"1 minecraft:ender_pearl 2",
				"1 minecraft:ender_eye 1",
				"2 minecraft:ender_pearl 1",
				"4 minecraft:end_stone 1",
				"2 minecraft:chorus_fruit:0 4",
				"1 minecraft:elytra 1",
				"1 gemsandtreasures:scroll_of_return 1",
				"2 minecraft:purpur_block 3",
				"2 minecraft:end_stone 5",
				"4 gemsandtreasures:jade 1",
				"1 gemsandtreasures:white_jade 1",
				"2 minecraft:shulker_shell 1",
				"1 minecraft:shulker_shell 2"
		};
		
		@Name("whiteJadeLoot")
		@Comment("These items can be exchanged for the white jade upon right click.\n weight modid:item:metadata amount")
		public String[] whiteJadeLoot = {
				"3 minecraft:emerald 2",
				"5 minecraft:gold_ingot 2",
				"2 minecraft:iron_ingot 3",
				"2 minecraft:diamond 1",
				"1 minecraft:diamond 3",
				"2 minecraft:enchanting_table 1",
				"1 gemsandtreasures:carbonado 1",
				"1 gemsandtreasures:tigers_eye 1",
				"1 gemsandtreasures:golden_jade 1",
				"1 gemsandtreasures:jade 1",
				"1 gemsandtreasures:marble_block 1",
				"1 gemsandtreasures:black_marble_block 1",
				"4 gemsandtreasures:carbonado_shard 1",
				"1 minecraft:elytra 1",
				"2 minecraft:nether_star 1",
				"3 gemsandtreasures:scroll_of_return 1",
				"3 minecraft:packed_ice 3",
				"2 minecraft:tnt 1",
				"1 minecraft:beacon 1",
				"3 minecraft:prismarine_shard 2",
				"3 minecraft:prismarine_crystals 1",
				"1 minecraft:shulker_shell 1",
				"2 minecraft:gold_block 1",
				"2 minecraft:rabbit_hide 2",
				"2 minecraft:rabbit_foot 1"
		};
		
		@Name("goldenJadeLoot")
		@Comment("These items can be exchanged for the golden jade upon right click.\n weight modid:item:metadata amount")
		public String[] goldenJadeLoot = {
				"5 minecraft:emerald 3",
				"3 minecraft:gold_block 1",
				"5 minecraft:iron_block 1",
				"1 minecraft:diamond_block 1",
				"1 gemsandtreasures:jade_block 1",
				"1 gemsandtreasures:prismatic_jade 1",
				"1 gemsandtreasures:white_jade 2",
				"1 gemsandtreasures:fire_jade 1",
				"1 gemsandtreasures:void_jade 1",
				"3 gemsandtreasures:carbonado_sword 1",
				"1 gemsandtreasures:carbonado_block 1",
				"1 gemsandtreasures:tigers_eye_block 1",
				"3 gemsandtreasures:marble_block 3",
				"3 gemsandtreasures:black_marble_block 3",
				"5 gemsandtreasures:scroll_of_return 1",
				"3 minecraft:shulker_shell 2",
				"3 minecraft:beacon 1",
				"3 minecraft:nether_star 1",
				"4 minecraft:obsidian 5",
				"1 minecraft:emerald_block 1",
				"2 minecraft:slime_block 1",
				"1 minecraft:ender_chest 1",
				"2 minecraft:sea_lantern 1"
		};
		
		@Name("prismaticJadeLoot")
		@Comment("These items can be exchanged for the prismatic jade upon right click.\n weight modid:item:metadata amount")
		public String[] prismaticJadeLoot = {
				"5 minecraft:gold_block 2",
				"5 minecraft:iron_block 5",
				"3 minecraft:diamond_block 3",
				"2 gemsandtreasures:jade_block 3",
				"2 gemsandtreasures:white_jade_block 1",
				"2 gemsandtreasures:fire_jade_block 1",
				"2 gemsandtreasures:void_jade_block 1",
				"2 gemsandtreasures:carbonado_block 1",
				"1 gemsandtreasures:golden_jade_block 1",
				"3 gemsandtreasures:tigers_eye_block 2",
				"8 gemsandtreasures:scroll_of_return 1",
				"5 minecraft:shulker_shell 4",
				"5 minecraft:beacon 1",
				"5 minecraft:nether_star 2",
				"3 minecraft:obsidian 9",
				"5 minecraft:emerald_block 2",
				"4 minecraft:slime_block 4",
				"3 minecraft:ender_chest 2",
				"5 minecraft:sea_lantern 2",
				"3 minecraft:golden_apple:0 5",
				"1 minecraft:golden_apple:1 2"
		};
	}
}
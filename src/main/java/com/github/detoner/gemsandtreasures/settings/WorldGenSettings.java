package com.github.detoner.gemsandtreasures.settings;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/WorldGen")
public class WorldGenSettings {
	
	@Name("WorldGen")
	public static SettingsClass settings = new SettingsClass();
	
	public static class SettingsClass {
		@Name("Carbonado Weight (Overworld)")
		@Comment("How many carbonado ores spawn in a overworld chunk")
		public int carbonadoGenOverworld = 5;
		
		@Name("Carbonado Weight (Nether)")
		@Comment("How many carbonado ores spawn in a nether chunk. This includes both top and bottom of the nether")
		public int carbonadoGenNether = 5;
	}
}
package com.github.detoner.gemsandtreasures.settings;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Entities")
public class EntitiesSettings {
	
	@Name("entities")
	public static BasicSettingsClass settings = new BasicSettingsClass();
	
	public static class BasicSettingsClass {
		@Name("darkGhastEnabled")
		@Comment("True if dark ghast should spawn in the world.")
		public boolean darkGhastEnabled = true;
	}
}
package com.github.detoner.gemsandtreasures.settings;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Treasures")
public class TreasuresSettings {
	
	@Name("treasures")
	public static SettingsClass settings = new SettingsClass();
	
	public static class SettingsClass {
		@Name("scrollOfReturnEnabled")
		@Comment("True if the scroll of return should be available in the game.")
		public boolean scrollOfReturnEnabled = true;
	}
}

package com.github.detoner.gemsandtreasures.settings;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Gems/Marble")
public class MarbleSettings {
	
	@Name("marble")
	public static BasicSettingsClass settings = new BasicSettingsClass();
	
	public static class BasicSettingsClass {
		@Name("whiteMarbleEnabled")
		@Comment("True if white marble stuff should be available in the game.")
		public boolean whiteMarbleEnabled = true;
		
		@Name("blackMarbleEnabled")
		@Comment("True if black marble stuff should be available in the game.")
		public boolean blackMarbleEnabled = true;
	}
}
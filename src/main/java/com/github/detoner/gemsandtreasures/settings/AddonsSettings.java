package com.github.detoner.gemsandtreasures.settings;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Addons")
public class AddonsSettings {
	
	@Name("Addons")
	public static BasicSettingsClass settings = new BasicSettingsClass();
	
	public static class BasicSettingsClass {
		@Name("chiselAddonEnabled")
		@Comment("True if alternative versions of the mod blocks should be available in the game.")
		public boolean chiselAddonEnabled = true;
		
		@Name("jeiAddonEnabled")
		@Comment("True if falling anvil crafting recipes should be shown in JEI (Just Enough Items).")
		public boolean jeiAddonEnabled = true;
	}
}
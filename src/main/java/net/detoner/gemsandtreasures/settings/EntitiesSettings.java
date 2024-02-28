package net.detoner.gemsandtreasures.settings;

import net.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Entities")
public class EntitiesSettings {
	
	@Name("Entities")
	public static BasicSettingsClass settings = new BasicSettingsClass();
	
	public static class BasicSettingsClass {
		@Name("Enable Dark Ghast")
		@Comment("True if dark ghast should spawn in the world.")
		public boolean darkGhastEnabled = true;
	}
}
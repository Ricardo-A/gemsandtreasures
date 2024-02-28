package net.detoner.gemsandtreasures.settings;

import net.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Treasures")
public class TreasuresSettings {
	
	@Name("Treasures")
	public static SettingsClass settings = new SettingsClass();
	
	public static class SettingsClass {
		@Name("Enable Scroll of Return")
		@Comment("True if the scroll of return should be available in the game.")
		public boolean scrollOfReturnEnabled = true;
	}
}

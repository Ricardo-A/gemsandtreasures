package net.detoner.gemsandtreasures.settings;

import net.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Gems/TigersEye")
public class TigersEyeSettings {
	
	@Name("Tigers Eye")
	public static BasicSettingsClass settings = new BasicSettingsClass();
	
	public static class BasicSettingsClass {
		@Name("Enable Stone Tigers Eye")
		@Comment("True if tigers eye should generate on stone")
		public boolean stoneTigersEyeEnabled = true;
		
		@Name("Enable Sand Tigers Eye")
		@Comment("True if tigers eye should generate on sand")
		public boolean sandTigersEyeEnabled = true;
	}
}
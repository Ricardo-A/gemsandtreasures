package com.github.detoner.gemsandtreasures.settings;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Gems/TigersEye")
public class TigersEyeSettings {
	
	@Name("tigersEye")
	public static BasicSettingsClass settings = new BasicSettingsClass();
	
	public static class BasicSettingsClass {
		@Name("stoneTigersEyeEnabled")
		@Comment("True if tigers eye should generate on stone")
		public boolean stoneTigersEyeEnabled = true;
		
		@Name("sandTigersEyeEnabled")
		@Comment("True if tigers eye should generate on sand")
		public boolean sandTigersEyeEnabled = true;
	}
}
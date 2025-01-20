package com.github.detoner.gemsandtreasures.settings;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Gems")
public class GemsSettings {
	
	@Name("gems")
	public static SettingsClass settings = new SettingsClass();
	
	public static class SettingsClass {
		@Name("carbonadoEnabled")
		@Comment("True if carbonado stuff should be available in the game.")
		public boolean carbonadoEnabled = true;
		
		@Name("marbleEnabled")
		@Comment("True if marble stuff should be available in the game.")
		public boolean marbleEnabled = true;
		
		@Name("tigersEyeEnabled")
		@Comment("True if tiger's eye stuff should be available in the game.")
		public boolean tigersEyeEnabled = true;
		
		@Name("jadeEnabled")
		@Comment("True if jade stuff should be available in the game.")
		public boolean jadeEnabled = true;
		
		@Name("rubyEnabled")
		@Comment("True if ruby stuff should be available in the game.")
		public boolean rubyEnabled = true;
		
		@Name("amethystEnabled")
		@Comment("True if amethyst stuff should be available in the game.")
		public boolean amethystEnabled = true;
		
		@Name("glowingGemEnabled")
		@Comment("True if glowing gem stuff should be available in the game.")
		public boolean glowingGemEnabled = true;
		
		@Name("topazEnabled")
		@Comment("True if topaz stuff should be available in the game.")
		public boolean topazEnabled = true;
		
		@Name("crystalEnabled")
		@Comment("True if crystal stuff should be available in the game.")
		public boolean crystalEnabled = true;
		
		@Name("sapphireEnabled")
		@Comment("True if sapphire stuff should be available in the game.")
		public boolean sapphireEnabled = true;
		
		@Name("pinkDiamondEnabled")
		@Comment("True if pink diamond stuff should be available in the game.")
		public boolean pinkDiamondEnabled = true;
		
		@Name("aquamarineEnabled")
		@Comment("True if aquamarine stuff should be available in the game.")
		public boolean aquamarineEnabled = true;
		
		@Name("agateEnabled")
		@Comment("True if agate stuff should be available in the game.")
		public boolean agateEnabled = true;
		
		@Name("moonCrystalEnabled")
		@Comment("True if moon crystal stuff should be available in the game.")
		public boolean moonCrystalEnabled = true;
		
		@Name("onyxEnabled")
		@Comment("True if onyx stuff should be available in the game.")
		public boolean onyxEnabled = true;
		
		@Name("bloodDiamondEnabled")
		@Comment("True if blood diamond stuff should be available in the game.")
		public boolean bloodDiamondEnabled = true;
		
		@Name("goldenDiamondEnabled")
		@Comment("True if golden diamond stuff should be available in the game.")
		public boolean goldenDiamondEnabled = true;
		
		@Name("perfectDiamondEnabled")
		@Comment("True if perfect diamond stuff should be available in the game.")
		public boolean perfectDiamondEnabled = true;
		
		@Name("royalDiamondEnabled")
		@Comment("True if royal diamond stuff should be available in the game.")
		public boolean royalDiamondEnabled = true;
		
		@Name("roseQuartzEnabled")
		@Comment("True if rose quartz stuff should be available in the game.")
		public boolean roseQuartzEnabled = true;
		
		@Name("coalStoneEnabled")
		@Comment("True if coal stone stuff should be available in the game.")
		public boolean coalStoneEnabled = true;
		
		@Name("petrifiedSlimeEnabled")
		@Comment("True if petrified slime stuff should be available in the game.")
		public boolean petrifiedSlimeEnabled = true;
	}
}

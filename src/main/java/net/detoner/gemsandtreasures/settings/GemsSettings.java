package net.detoner.gemsandtreasures.settings;

import net.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Gems")
public class GemsSettings {
	
	@Name("Gems")
	public static SettingsClass settings = new SettingsClass();
	
	public static class SettingsClass {
		@Name("Enable Carbonado")
		@Comment("True if carbonado stuff should be available in the game.")
		public boolean carbonadoEnabled = true;
		
		@Name("Enable Marble")
		@Comment("True if marble stuff should be available in the game.")
		public boolean marbleEnabled = true;
		
		@Name("Enable Tiger's Eye")
		@Comment("True if tiger's eye stuff should be available in the game.")
		public boolean tigersEyeEnabled = true;
		
		@Name("Enable Jade")
		@Comment("True if jade stuff should be available in the game.")
		public boolean jadeEnabled = true;
		
		@Name("Enable Ruby")
		@Comment("True if ruby stuff should be available in the game.")
		public boolean rubyEnabled = true;
		
		@Name("Enable Amethyst")
		@Comment("True if amethyst stuff should be available in the game.")
		public boolean amethystEnabled = true;
		
		@Name("Enable Glowing Gem")
		@Comment("True if glowing gem stuff should be available in the game.")
		public boolean glowingGemEnabled = true;
		
		@Name("Enable Topaz")
		@Comment("True if topaz stuff should be available in the game.")
		public boolean topazEnabled = true;
		
		@Name("Enable Crystal")
		@Comment("True if crystal stuff should be available in the game.")
		public boolean crystalEnabled = true;
		
		@Name("Enable Sapphire")
		@Comment("True if sapphire stuff should be available in the game.")
		public boolean sapphireEnabled = true;
		
		@Name("Enable Pink Diamond")
		@Comment("True if pink diamond stuff should be available in the game.")
		public boolean pinkDiamondEnabled = true;
		
		@Name("Enable Aquamarine")
		@Comment("True if aquamarine stuff should be available in the game.")
		public boolean aquamarineEnabled = true;
		
		@Name("Enable Agate")
		@Comment("True if agate stuff should be available in the game.")
		public boolean agateEnabled = true;
		
		@Name("Enable Moon Crystal")
		@Comment("True if moon crystal stuff should be available in the game.")
		public boolean moonCrystalEnabled = true;
		
		@Name("Enable Onyx")
		@Comment("True if onyx stuff should be available in the game.")
		public boolean onyxEnabled = true;
		
		@Name("Enable Blood Diamond")
		@Comment("True if blood diamond stuff should be available in the game.")
		public boolean bloodDiamondEnabled = true;
		
		@Name("Enable Golden Diamond")
		@Comment("True if golden diamond stuff should be available in the game.")
		public boolean goldenDiamondEnabled = true;
		
		@Name("Enable Perfect Diamond")
		@Comment("True if perfect diamond stuff should be available in the game.")
		public boolean perfectDiamondEnabled = true;
		
		@Name("Enable Royal Diamond")
		@Comment("True if royal diamond stuff should be available in the game.")
		public boolean royalDiamondEnabled = true;
		
		@Name("Enable Rose Quartz")
		@Comment("True if rose quartz stuff should be available in the game.")
		public boolean roseQuartzEnabled = true;
		
		@Name("Enable Coal Stone")
		@Comment("True if coal stone stuff should be available in the game.")
		public boolean coalStoneEnabled = true;
		
		@Name("Enable Petrified Slime")
		@Comment("True if petrified slime stuff should be available in the game.")
		public boolean petrifiedSlimeEnabled = true;
	}
}

package com.github.detoner.gemsandtreasures.settings;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Gems/Carbonado")
public class CarbonadoSettings {
	
	@Name("carbonado")
	public static BasicSettingsClass settings = new BasicSettingsClass();
	
	@Name("advancedSettings")
	public static AdvancedSettingsClass advancedSettings = new AdvancedSettingsClass();
	
	public static class BasicSettingsClass {
		@Name("carbonadoArmorEnabled")
		@Comment("True if carbonado amor should be available in the game.")
		public boolean carbonadoArmorEnabled = true;
		
		@Name("carbonadoToolsEnabled")
		@Comment("True if carbonado tools (and sword) should be available in the game.")
		public boolean carbonadoToolsEnabled = true;
		
		@Name("carbonadoExtrasEnabled")
		@Comment("True if carbonado extra items (like shears, shield, bow, etc.) should be available in the game.")
		public boolean carbonadoExtrasEnabled = true;
		
		@Name("carbonadoMaterialDurability")
		@Comment("Basic durability for carbonado stuff.")
		public int carbonadoMaterialDurability = 2500;
		
		@Name("carbonadoMaterialDamage")
		@Comment("Basic attack damage for carbonado stuff.")
		public float carbonadoMaterialDamage = 6.0f;
		
		@Name("carbonadoMaterialEfficiency")
		@Comment("Basic efficiency for carbonado stuff.")
		public float carbonadoMaterialEfficiency = 10.0f;
		
		@Name("carbonadoMaterialEnchantability")
		@Comment("Basic enchantability for carbonado stuff.")
		public int carbonadoMaterialEnchantability = 12;
		
		@Name("carbonadoHarvestLevel")
		@Comment("Harvest level for carbonado tools. Diamond is 3.")
		public int carbonadoHarvestLevel = 4;
	}
	
	public static class AdvancedSettingsClass {
		@Name("swordDamage")
		@Comment("Sets the damage that the carbonado sword causes. 1 point of damage equals to half a heart. This should be a float number.")
		public float swordDamage = 9.0f;
		
		@Name("swordDurability")
		@Comment("Sets the durability (maxUses) of the carbonado sword. A diamond sword has 1562 durability. This should be a integer number.")
		public int swordDurability = 2500;
		
		@Name("swordEfficiency")
		@Comment("Sets the efficiency of the carbonado sword for cutting cob webs. Efficiency for cutting other things will be based on this. This should be a float number.")
		public float swordEfficiency = 15.0f;
		
		@Name("swordEnchantability")
		@Comment("Sets the enchantability of the carbonado sword. A diamond sword has 10 enchantability. This should be a integer number.")
		public int swordEnchantability = 12;
		
		@Name("axeDamage")
		@Comment("Sets the damage that the carbonado axe causes. 1 point of damage equals to half a heart")
		public float axeDamage = 14.0f;
		
		@Name("axeSpeed")
		@Comment("Sets the speed of carbonado axe in combat")
		public float axeSpeed = 0.8f;
		
		@Name("axeEfficiency")
		@Comment("Sets the efficiency of carbonado axe for cutting down trees. Diamond efficiency is 8, gold efficiency is 10.")
		public float axeEfficiency = 10.0f;
		
		@Name("axeDurability")
		@Comment("Sets the durability (maxUses) of the carbonado axe. A diamond axe has 1561 durability. This should be a integer number.")
		public int axeDurability = 2500;
		
		@Name("axeEnchantability")
		@Comment("Sets the enchantability of the carbonado axe. Higher numbers mean it can hold more enchantments. This should be a integer number.")
		public int axeEnchantability = 12;
		
		@Name("pickaxeEfficiency")
		@Comment("Sets the efficiency of carbonado pickaxe when mining. Diamond efficiency is 8, gold efficiency is 10.")
		public float pickaxeEfficiency = 10.0f;
	}
}
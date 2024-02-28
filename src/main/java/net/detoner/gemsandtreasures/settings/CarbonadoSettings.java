package net.detoner.gemsandtreasures.settings;

import net.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;

@Config(modid = GemsAndTreasures.MODID, category = "", name = "GemsAndTreasures/Gems/Carbonado")
public class CarbonadoSettings {
	
	@Name("Carbonado")
	public static BasicSettingsClass settings = new BasicSettingsClass();
	
	@Name("Carbonado Advanced")
	public static AdvancedSettingsClass advancedSettings = new AdvancedSettingsClass();
	
	public static class BasicSettingsClass {
		@Name("Enable Carbonado Armor")
		@Comment("True if carbonado amor should be available in the game.")
		public boolean carbonadoArmorEnabled = true;
		
		@Name("Enable Carbonado Tools")
		@Comment("True if carbonado tools (and sword) should be available in the game.")
		public boolean carbonadoToolsEnabled = true;
		
		@Name("Enable Carbonado Extras")
		@Comment("True if carbonado extra items (like shears, shield, bow, etc.) should be available in the game.")
		public boolean carbonadoExtrasEnabled = true;
		
		@Name("Carbonado Material Durability")
		@Comment("Basic durability for carbonado stuff.")
		public int carbonadoMaterialDurability = 2500;
		
		@Name("Carbonado Material Damage")
		@Comment("Basic attack damage for carbonado stuff.")
		public float carbonadoMaterialDamage = 6.0f;
		
		@Name("Carbonado Material Efficiency")
		@Comment("Basic efficiency for carbonado stuff.")
		public float carbonadoMaterialEfficiency = 10.0f;
		
		@Name("Carbonado Material Enchantability")
		@Comment("Basic enchantability for carbonado stuff.")
		public int carbonadoMaterialEnchantability = 12;
		
		@Name("Carbonado Material Enchantability")
		@Comment("Harvest level for carbonado tools. Diamond is 3.")
		public int carbonadoHarvestLevel = 4;
	}
	
	public static class AdvancedSettingsClass {
		@Name("Carbonado Sword Damage")
		@Comment("Sets the damage that the carbonado sword causes. 1 point of damage equals to half a heart. This should be a float number.")
		public float swordDamage = 9.0f;
		
		@Name("Carbonado Sword Durability")
		@Comment("Sets the durability (maxUses) of the carbonado sword. A diamond sword has 1562 durability. This should be a integer number.")
		public int swordDurability = 2500;
		
		@Name("Carbonado Sword Efficiency")
		@Comment("Sets the efficiency of the carbonado sword for cutting cob webs. Efficiency for cutting other things will be based on this. This should be a float number.")
		public float swordEfficiency = 15.0f;
		
		@Name("Carbonado Sword Enchantability")
		@Comment("Sets the enchantability of the carbonado sword. A diamond sword has 10 enchantability. This should be a integer number.")
		public int swordEnchantability = 12;
		
		@Name("Carbonado Axe Damage")
		@Comment("Sets the damage that the carbonado axe causes. 1 point of damage equals to half a heart")
		public float axeDamage = 14.0f;
		
		@Name("Carbonado Axe Speed")
		@Comment("Sets the speed of carbonado axe in combat")
		public float axeSpeed = 0.8f;
		
		@Name("Carbonado Axe Efficiency")
		@Comment("Sets the efficiency of carbonado axe for cutting down trees. Diamond efficiency is 8, gold efficiency is 10.")
		public float axeEfficiency = 10.0f;
		
		@Name("Carbonado Axe Durability")
		@Comment("Sets the durability (maxUses) of the carbonado axe. A diamond axe has 1561 durability. This should be a integer number.")
		public int axeDurability = 2500;
		
		@Name("Carbonado Sword Enchantability")
		@Comment("Sets the enchantability of the carbonado axe. Higher numbers mean it can hold more enchantments. This should be a integer number.")
		public int axeEnchantability = 12;
		
		@Name("Carbonado Pickaxe Efficiency")
		@Comment("Sets the efficiency of carbonado pickaxe when mining. Diamond efficiency is 8, gold efficiency is 10.")
		public float pickaxeEfficiency = 10.0f;
	}
}
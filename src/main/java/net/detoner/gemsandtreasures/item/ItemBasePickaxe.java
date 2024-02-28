package net.detoner.gemsandtreasures.item;

import net.detoner.gemsandtreasures.GemsAndTreasures;
import net.detoner.gemsandtreasures.handler.RegistrationHandler;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemBasePickaxe extends ItemPickaxe{
	
	private String name;
	
	/*public ItemBasePickaxe(ToolMaterial material) {
		super(material);
		setRegistryName(material.name()+"_pickaxe");
		setCreativeTab(GemsAndTreasures.MOD_TAB);
	}*/
	
	public ItemBasePickaxe(String name, ToolMaterial material, float efficiency) {
		super(material);
		this.name = name;
		this.efficiency = efficiency;
		setRegistryName(name);
		setCreativeTab(GemsAndTreasures.MOD_TAB);
	}

	@Override
	public String getTranslationKey(ItemStack stack) {
		return "item." + GemsAndTreasures.RESOURCE_PREFIX + this.name;
	}
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return ItemStack.areItemsEqualIgnoreDurability(repair, new ItemStack(RegistrationHandler.carbonado)) ? true : super.getIsRepairable(toRepair, repair);
  	}
}

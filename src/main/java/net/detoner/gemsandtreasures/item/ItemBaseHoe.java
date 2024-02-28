package net.detoner.gemsandtreasures.item;

import net.detoner.gemsandtreasures.GemsAndTreasures;
import net.detoner.gemsandtreasures.handler.RegistrationHandler;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemBaseHoe extends ItemHoe{
	
	private String name;
	
	/*public ItemBaseHoe(ToolMaterial material) {
		super(material);
		setRegistryName(material.name()+"_hoe");
		setCreativeTab(GemsAndTreasures.MOD_TAB);
	}*/
	
	public ItemBaseHoe(String name, ToolMaterial material) {
		super(material);
		this.name = name;
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

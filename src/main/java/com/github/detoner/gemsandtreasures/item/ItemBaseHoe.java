package com.github.detoner.gemsandtreasures.item;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import com.github.detoner.gemsandtreasures.handler.RegistrationHandler;
import com.github.detoner.gemsandtreasures.handler.registration.CarbonadoRegistration;
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
		return ItemStack.areItemsEqualIgnoreDurability(repair, new ItemStack(CarbonadoRegistration.carbonado)) ? true : super.getIsRepairable(toRepair, repair);
  	}
}

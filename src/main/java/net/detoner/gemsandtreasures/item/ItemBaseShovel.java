package net.detoner.gemsandtreasures.item;

import net.detoner.gemsandtreasures.GemsAndTreasures;
import net.detoner.gemsandtreasures.handler.RegistrationHandler;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemBaseShovel extends ItemSpade{
	
	private String name;
	
	/*public ItemBaseShovel(ToolMaterial material) {
		super(material);
		setRegistryName(material.name()+"_shovel");
		setCreativeTab(GemsAndTreasures.MOD_TAB);
	}*/
	
	public ItemBaseShovel(String name, ToolMaterial material) {
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

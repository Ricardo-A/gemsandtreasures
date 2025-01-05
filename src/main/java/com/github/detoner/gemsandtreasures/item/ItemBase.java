package com.github.detoner.gemsandtreasures.item;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemBase extends Item{
	
	protected String name;
	
	public ItemBase(String name, CreativeTabs tab) {
		this.name = name;
		setRegistryName(name);
		setTranslationKey(name);
		setCreativeTab(tab);
	}
	
	public ItemBase(String name) {
		this.name = name;
		setRegistryName(name);
		setTranslationKey(name);
		setCreativeTab(GemsAndTreasures.MOD_TAB);
	}
	
	@Override
	public String getTranslationKey(ItemStack stack) {
		return "item." + GemsAndTreasures.RESOURCE_PREFIX + this.name;
	}
}

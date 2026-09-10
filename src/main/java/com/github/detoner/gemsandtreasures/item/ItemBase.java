package com.github.detoner.gemsandtreasures.item;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

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
	public void addInformation(
			ItemStack stack,
			World world,
			List<String> tooltip,
			ITooltipFlag flag) {

		super.addInformation(stack, world, tooltip, flag);

		String key = stack.getTranslationKey() + ".tooltip";

		if (I18n.hasKey(key)) {
			tooltip.add(I18n.format(key));
		}
	}
	
	@Override
	public String getTranslationKey(ItemStack stack) {
		return "item." + GemsAndTreasures.RESOURCE_PREFIX + this.name;
	}
}

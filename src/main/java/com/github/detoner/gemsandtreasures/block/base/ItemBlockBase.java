package com.github.detoner.gemsandtreasures.block.base;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraft.block.Block;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

import java.util.List;

public class ItemBlockBase extends ItemBlock{
	
	private ResourceLocation name;

	public ItemBlockBase(Block block, CreativeTabs tab) {
		super(block);
		this.name = block.getRegistryName();
		setCreativeTab(tab);
		setRegistryName(name);
		setTranslationKey(name.getPath());
	}
	
	public ItemBlockBase(Block block) {
		super(block);
		this.name = block.getRegistryName();
		setCreativeTab(GemsAndTreasures.MOD_TAB);
		setRegistryName(name);
		setTranslationKey(name.getPath());
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
		return "tile." + this.name.toString();
	}
}

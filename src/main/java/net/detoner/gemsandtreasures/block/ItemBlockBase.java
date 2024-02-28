package net.detoner.gemsandtreasures.block;

import net.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

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
	public String getTranslationKey(ItemStack stack) {
		return "tile." + this.name.toString();
	}
}

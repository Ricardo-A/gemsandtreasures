package com.github.detoner.gemsandtreasures.block;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockBase extends Block{
	
	private String name;
	
	public BlockBase(Material material, String name, CreativeTabs tab) {
		super(material);
		this.name = name;
		setCreativeTab(tab);
		setRegistryName(name);
		setTranslationKey(name);
	}
	
	public BlockBase(Material material, String name) {
		super(material);
		this.name = name;
		setCreativeTab(GemsAndTreasures.MOD_TAB);
		setRegistryName(name);
		setTranslationKey(name);
	}
	
	@Override
	public String getTranslationKey() {
		super.getTranslationKey();
		return "tile." + GemsAndTreasures.RESOURCE_PREFIX + this.name;
	}
}

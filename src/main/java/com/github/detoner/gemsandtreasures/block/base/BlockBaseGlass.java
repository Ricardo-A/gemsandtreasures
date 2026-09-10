package com.github.detoner.gemsandtreasures.block.base;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.BlockRenderLayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockBaseGlass extends BlockGlass{
	
	private String name;
	
	public BlockBaseGlass(Material material, String name, CreativeTabs tab) {
		super(material, true);
		this.name = name;
		setCreativeTab(tab);
		setRegistryName(name);
		setTranslationKey(name);
	}
	
	public BlockBaseGlass(Material material, String name) {
		super(material, true);
		this.name = name;
		setCreativeTab(GemsAndTreasures.MOD_TAB);
		setRegistryName(name);
		setTranslationKey(name);
	}
	
	@Override
	public String getTranslationKey() {
		return "tile." + GemsAndTreasures.RESOURCE_PREFIX + this.name;
	}
	
	@SideOnly(Side.CLIENT)
    public BlockRenderLayer getBlockLayer()
    {
        return BlockRenderLayer.TRANSLUCENT;
    }
}

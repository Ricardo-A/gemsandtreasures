package com.github.detoner.gemsandtreasures.block;

import java.util.Random;

import com.github.detoner.gemsandtreasures.handler.RegistrationHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class MoonCrystalOre extends BlockBase{
	
	public MoonCrystalOre(Material material, String name) {
		super(material, name);
		setHardness(4.0f);
		setResistance(4.0f);
		setHarvestLevel("pickaxe", 2);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return RegistrationHandler.moon_crystal;
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		return new Random().nextInt(7) + 3;
	}
}

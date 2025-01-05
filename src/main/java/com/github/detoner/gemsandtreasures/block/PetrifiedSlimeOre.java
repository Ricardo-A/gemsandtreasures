package com.github.detoner.gemsandtreasures.block;

import java.util.Random;

import com.github.detoner.gemsandtreasures.handler.RegistrationHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class PetrifiedSlimeOre extends BlockBase{
	
	public PetrifiedSlimeOre(Material material, String name) {
		super(material, name);
		setHardness(3.0f);
		setResistance(4.0f);
		setHarvestLevel("pickaxe", 0);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return RegistrationHandler.petrified_slimeball;
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		return new Random().nextInt(5) + 4;
	}
}

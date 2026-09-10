package com.github.detoner.gemsandtreasures.block.ores;

import java.util.Random;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.handler.RegistrationHandler;
import com.github.detoner.gemsandtreasures.handler.registration.AgateRegistration;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class AgateOre extends BlockBase {
	
	public AgateOre(Material material, String name) {
		super(material, name);
		setHardness(50.0f);
		setResistance(1200.0f);
		setHarvestLevel("pickaxe", 3);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return AgateRegistration.agate;
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		return new Random().nextInt(5) + 4;
	}
}

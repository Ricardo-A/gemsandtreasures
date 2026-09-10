package com.github.detoner.gemsandtreasures.block.ores;

import java.util.Random;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.handler.RegistrationHandler;
import com.github.detoner.gemsandtreasures.handler.registration.RoseQuartzRegistration;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class RoseQuartzOre extends BlockBase {
	
	public RoseQuartzOre(Material material, String name) {
		super(material, name);
		setHardness(4.0f);
		setResistance(6.0f);
		setHarvestLevel("pickaxe", 1);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return RoseQuartzRegistration.rose_quartz;
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		return new Random().nextInt(5) + 4;
	}
}

package net.detoner.gemsandtreasures.block;

import java.util.Random;

import net.detoner.gemsandtreasures.handler.RegistrationHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class CrystalOre extends BlockBase{
	
	public CrystalOre(Material material, String name) {
		super(material, name);
		setHardness(2.0f);
		setResistance(2.0f);
		setHarvestLevel("pickaxe", 1);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return RegistrationHandler.crystal;
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		return new Random().nextInt(7) + 3;
	}
}

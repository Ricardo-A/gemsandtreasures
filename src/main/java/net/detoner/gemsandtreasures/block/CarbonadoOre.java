package net.detoner.gemsandtreasures.block;

import java.util.Random;

import net.detoner.gemsandtreasures.handler.RegistrationHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class CarbonadoOre extends BlockBase{
	
	public CarbonadoOre(Material material, String name) {
		super(material, name);
		setHardness(15.0f);
		setResistance(33.3f);
		setHarvestLevel("pickaxe", 3);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return RegistrationHandler.carbonado_cluster;
	}
	
	@Override
	public boolean canSilkHarvest(World worldIn, BlockPos pos, IBlockState state, EntityPlayer player) {
		return false;
	}
	
	@Override
	public void onPlayerDestroy(World worldIn, BlockPos pos, IBlockState state) {
		worldIn.setBlockState(pos, Blocks.BEDROCK.getDefaultState());
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		return new Random().nextInt(7) + 8;
	}
}

package com.github.detoner.gemsandtreasures.block.ores;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.handler.registration.TigersEyeRegistration;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TigersEyeShardOre extends BlockBase {

	public TigersEyeShardOre(Material material, String name) {
		super(material, name);
		setHardness(1.0f);
		setResistance(3.0f);
		setHarvestLevel("shovel", 0);
	}

	@Override
	public List<ItemStack> getDrops(
			IBlockAccess world,
			BlockPos pos,
			IBlockState state,
			int fortune) {

		List<ItemStack> drops = new ArrayList<>();

		Random rand = new Random();

		int dust = 1+rand.nextInt(3+fortune);
		int chance = 1+rand.nextInt(100);

		drops.add(new ItemStack(
				TigersEyeRegistration.tigers_eye_dust, dust
		));

		if(chance <= 30+(fortune*10)){
			int shards = 1+rand.nextInt(3+fortune);
			drops.add(new ItemStack(
					TigersEyeRegistration.tigers_eye_shard, shards
			));
		}

		return drops;
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		return new Random().nextInt(7) + 8;
	}
}

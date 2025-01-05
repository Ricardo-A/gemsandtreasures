package com.github.detoner.gemsandtreasures.worldgen;

import java.util.Random;

import com.google.common.base.Predicate;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WorldGenGlowingGem{

	private final IBlockState oreBlock;
    private final Predicate<IBlockState> predicate;

    public WorldGenGlowingGem(IBlockState state, Predicate<IBlockState> predicate)
    {
        this.oreBlock = state;
        this.predicate = predicate;
    }
    
    public void generate(Random random, int chunkX, int chunkZ, World world)
    {
		int dimension = world.provider.getDimension();

		if (dimension == -1) {
			BlockPos pos = new BlockPos(chunkX * 16, 0, chunkZ * 16);
			createOreVein(world, random, pos.add(random.nextInt(16), random.nextInt(255), random.nextInt(16)));
		}
    }

    public boolean createOreVein(World world, Random random, BlockPos position)
    {
    	position = position.add(8, 0, 8);
        IBlockState state = world.getBlockState(position);
        if (state.getBlock().isReplaceableOreGen(state, world, position, this.predicate))
        {
        	world.setBlockState(position, this.oreBlock, 2);
        }

        return true;
    }
}

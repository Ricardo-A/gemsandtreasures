package com.github.detoner.gemsandtreasures.worldgen;

import java.util.Random;

import com.google.common.base.Predicate;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenFireJade extends WorldGenMinable{

	private static final int VEIN_SIZE = 3;
	private static final int SPAWNTRIES = 4;
	
    public WorldGenFireJade(IBlockState state, Predicate<IBlockState> predicate){
    	super(state, VEIN_SIZE, predicate);
    }
    
    public void generate(World world, Random random, int chunkX, int chunkZ)
    {
    	int dimension = world.provider.getDimension();
    	if (dimension == -1) {
	    	generateLowNether(world, random, chunkX, chunkZ);
	    	generateHighNether(world, random, chunkX, chunkZ);
    	}
    }
    
    private void generateLowNether(World world, Random random, int chunkX, int chunkZ) {
    	int minHeight = 0;
    	int maxHeight = 125;
    	int spawnTries = SPAWNTRIES;
    	
        BlockPos chunkPosAsBlockPos = new BlockPos(chunkX << 4, 0, chunkZ << 4);
        int heightDiff = maxHeight - minHeight + 1;
     
        for (int i = 0; i < spawnTries; i++) {
            super.generate(world, random, 
            	chunkPosAsBlockPos.add(
            		random.nextInt(16),
            		minHeight + random.nextInt(heightDiff),
            		random.nextInt(16)
            	)
            );
        }
    }
    private void generateHighNether(World world, Random random, int chunkX, int chunkZ) {
    	int minHeight = 126;
    	int maxHeight = 255;
    	int spawnTries = SPAWNTRIES;
    	
        BlockPos chunkPosAsBlockPos = new BlockPos(chunkX << 4, 0, chunkZ << 4);
        int heightDiff = maxHeight - minHeight + 1;
     
        for (int i = 0; i < spawnTries; i++) {
            super.generate(world, random, 
            	chunkPosAsBlockPos.add(
            		random.nextInt(16),
            		minHeight + random.nextInt(heightDiff),
            		random.nextInt(16)
            	)
            );
        }
    }
}

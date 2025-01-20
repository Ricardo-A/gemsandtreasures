package com.github.detoner.gemsandtreasures.worldgen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGen extends WorldGenMinable{

	int veinSize = 4;
	int weight = 20;
	int minHeight = 0;
	int maxHeight = 90;
	
    public WorldGen(Block block, Block substitute, int weight, int veinSize, int minHeight, int maxHeight){
    	super(block.getDefaultState(), veinSize, BlockMatcher.forBlock(substitute));
    	this.veinSize = veinSize;
    	this.weight = weight;
    	this.minHeight = minHeight;
    	this.maxHeight = maxHeight;
    }
    
    public void generate(World world, Random random, int chunkX, int chunkZ)
    {
    	//null safety
        if(minHeight < 0) minHeight = 0;
        if(maxHeight > 255) maxHeight = 255;
        if(weight < 0) weight = 0;
        if(veinSize < 0) veinSize = 1;
     
        //makes maxHeight always greater than minHeight
        if(maxHeight < minHeight) {
            int i = minHeight;
            minHeight = maxHeight;
            maxHeight = i;
        } else if(maxHeight == minHeight) {
            if(maxHeight < 255) {
                maxHeight++;
            } else minHeight--;
        }
     
        BlockPos chunkPosAsBlockPos = new BlockPos(chunkX << 4, 0, chunkZ << 4);
        int heightDiff = maxHeight - minHeight + 1;
     
        for (int i = 0; i < weight; i++) {
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

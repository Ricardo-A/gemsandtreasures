package net.detoner.gemsandtreasures.worldgen;

import java.util.Random;

import com.google.common.base.Predicate;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class WorldGenJade extends WorldGenMinable{

	private static final int VEIN_SIZE = 4;
	private static final int SPAWNTRIES = 3;
	private static final int MIN_HEIGHT = 0;
	private static final int MAX_HEIGHT = 100;
	
    public WorldGenJade(IBlockState state, Predicate<IBlockState> predicate){
    	super(state, VEIN_SIZE, predicate);
    }
    
    public void generate(World world, Random random, int chunkX, int chunkZ)
    {
    	int minHeight = MIN_HEIGHT;
    	int maxHeight = MAX_HEIGHT;
    	int spawnTries = SPAWNTRIES;
    	
        if(minHeight < 0) minHeight = 0;
        if(maxHeight > 255) maxHeight = 255;
     
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

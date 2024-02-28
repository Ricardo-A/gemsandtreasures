package net.detoner.gemsandtreasures.worldgen;

import java.util.Random;

import com.google.common.base.Predicate;

import net.detoner.gemsandtreasures.settings.WorldGenSettings;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WorldGenCarbonado{

	private final IBlockState oreBlock;
    private final Predicate<IBlockState> predicate;

    public WorldGenCarbonado(IBlockState state, Predicate<IBlockState> predicate)
    {
        this.oreBlock = state;
        this.predicate = predicate;
    }
    
    public void generate(Random random, int chunkX, int chunkZ, World world)
    {
		BlockPos pos = new BlockPos(chunkX * 16, 0, chunkZ * 16);

		int dimension = world.provider.getDimension();

		if (dimension == 0 && WorldGenSettings.settings.carbonadoGenOverworld > 0) {
			for (int i = 0; i < WorldGenSettings.settings.carbonadoGenOverworld; i++) {
				createOreVein(world, random, pos.add(random.nextInt(16), random.nextInt(5), random.nextInt(16)));
			}
		}else if (dimension == -1 && WorldGenSettings.settings.carbonadoGenNether > 0) {
			for (int i = 0; i < WorldGenSettings.settings.carbonadoGenNether; i++) {
				createOreVein(world, random, pos.add(random.nextInt(16), random.nextInt(5), random.nextInt(16)));
				createOreVein(world, random, pos.add(random.nextInt(16), random.nextInt(4) + 123, random.nextInt(16)));
			}
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

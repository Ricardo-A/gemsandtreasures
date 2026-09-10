package com.github.detoner.gemsandtreasures.block.carpets;

import com.github.detoner.gemsandtreasures.block.base.BlockBaseCarpet;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.IMob;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockRubyCarpet extends BlockBaseCarpet {

    public BlockRubyCarpet(String name) {
        super(name);
    }

    @Override
    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
        world.scheduleUpdate(pos, this, 10);
    }

    @Override
    public void updateTick(World world, BlockPos pos, IBlockState state, Random rand) {
        AxisAlignedBB area = new AxisAlignedBB(pos);

        List<EntityLivingBase> entities =
                world.getEntitiesWithinAABB(EntityLivingBase.class, area);

        for (EntityLivingBase entity : entities) {
            if (entity instanceof IMob) {
                entity.setFire(3);
            }
        }

        world.scheduleUpdate(pos, this, 10);
    }
}
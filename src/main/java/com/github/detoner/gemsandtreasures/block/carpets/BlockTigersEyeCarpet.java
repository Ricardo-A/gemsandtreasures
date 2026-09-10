package com.github.detoner.gemsandtreasures.block.carpets;

import com.github.detoner.gemsandtreasures.block.base.BlockBaseCarpet;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public class BlockTigersEyeCarpet extends BlockBaseCarpet {

    public BlockTigersEyeCarpet(String name) {
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
            entity.addPotionEffect(new PotionEffect(
                    MobEffects.BLINDNESS,
                    60,
                    0
            ));
        }

        world.scheduleUpdate(pos, this, 10);
    }
}
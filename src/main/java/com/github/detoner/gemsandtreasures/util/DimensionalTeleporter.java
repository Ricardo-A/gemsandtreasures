package com.github.detoner.gemsandtreasures.util;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class DimensionalTeleporter extends Teleporter {

    private final BlockPos targetPos;

    public DimensionalTeleporter(WorldServer world, BlockPos targetPos) {
        super(world);
        this.targetPos = targetPos;
    }

    @Override
    public void placeInPortal(Entity entity, float rotationYaw) {
        BlockPos safePos = findSafePosition();

        entity.setLocationAndAngles(
                safePos.getX() + 0.5D,
                safePos.getY(),
                safePos.getZ() + 0.5D,
                0.0F,
                0.0F
        );
    }

    private BlockPos findSafePosition() {
        BlockPos pos = targetPos;

        while (pos.getY() < world.getHeight() - 1
                && !isSafePosition(pos)) {

            pos = pos.up();
        }

        return pos;
    }

    private boolean isSafePosition(BlockPos pos) {
        BlockPos head = pos.up();
        BlockPos ground = pos.down();

        return world.getBlockState(ground).getMaterial().isSolid()
                && !world.getBlockState(pos).getMaterial().blocksMovement()
                && !world.getBlockState(head).getMaterial().blocksMovement();
    }
}
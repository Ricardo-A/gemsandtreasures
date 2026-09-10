package com.github.detoner.gemsandtreasures.block.base;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockBaseCarpet extends Block {

    protected String name;

    public BlockBaseCarpet(String name) {
        super(Material.CLOTH);

        this.name = name;

        setCreativeTab(GemsAndTreasures.MOD_TAB);
        setRegistryName(name);
        setTranslationKey(name);

        setHardness(0.1F);
        setSoundType(SoundType.CLOTH);
    }

    @Override
    public String getTranslationKey() {
        return "tile." + GemsAndTreasures.RESOURCE_PREFIX + this.name;
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean isOpaqueCube(IBlockState state) {
        return false;
    }

    @SuppressWarnings("deprecation")
    @Override
    public boolean isFullCube(IBlockState state) {
        return false;
    }

    @SuppressWarnings("deprecation")
    @Override
    public AxisAlignedBB getBoundingBox(
            IBlockState state,
            IBlockAccess source,
            BlockPos pos) {

        return new AxisAlignedBB(
                0.0D, 0.0D, 0.0D,
                1.0D, 0.0625D, 1.0D
        );
    }
}
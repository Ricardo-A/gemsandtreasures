package com.github.detoner.gemsandtreasures.item;

import com.github.detoner.gemsandtreasures.settings.TreasuresSettings;
import com.github.detoner.gemsandtreasures.util.ModUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

public class ItemCorruptedBook extends ItemBase{

    public ItemCorruptedBook(CreativeTabs tab) {
        super("corrupted_book", tab);
        setAttributes();
    }

    public ItemCorruptedBook() {
        super("corrupted_book");
        setAttributes();
    }

    private void setAttributes(){
        setMaxDamage(TreasuresSettings.settings.corruptedBookMaxUses);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityPlayer, EnumHand handIn)
    {
        ItemStack heldItem = entityPlayer.getHeldItem(handIn);
        if (!world.isRemote)
        {
            heldItem.damageItem(1, entityPlayer);
            ModUtil.playSoundAtPlayer(entityPlayer, SoundEvents.ENTITY_ENDERMEN_TELEPORT);
            ModUtil.spawnExplosionParticleAtEntity(entityPlayer);

            BlockPos randomPos = findRandomPosition(world, entityPlayer);

            entityPlayer.rotationPitch = 0.0F;
            entityPlayer.rotationYaw = 0.0F;
            entityPlayer.setPositionAndUpdate(
                    randomPos.getX() + 0.5D,
                    randomPos.getY(),
                    randomPos.getZ() + 0.5D
            );

            ModUtil.playSoundAtPlayer(entityPlayer, SoundEvents.ENTITY_ENDERMEN_TELEPORT);
            ModUtil.spawnExplosionParticleAtEntity(entityPlayer);

            return new ActionResult<>(EnumActionResult.SUCCESS, heldItem);
        }else {
            return super.onItemRightClick(world, entityPlayer, handIn);
        }
    }

    private BlockPos findRandomPosition(World world, EntityPlayer entityPlayer) {
        Random random = new Random();

        BlockPos pos = entityPlayer.getPosition();

        for (int attempts = 0; attempts < 10; attempts++) {
            int x = entityPlayer.getPosition().getX() + random.nextInt(6000) - 3000;
            int z = entityPlayer.getPosition().getZ() + random.nextInt(6000) - 3000;
            int y = random.nextInt(world.getHeight() - 2) + 1;

            pos = new BlockPos(x, y, z);

            if (!world.getBlockState(pos).getMaterial().blocksMovement()
                    && !world.getBlockState(pos.up()).getMaterial().blocksMovement()) {
                return pos;
            }
        }

        return pos;
    }
}

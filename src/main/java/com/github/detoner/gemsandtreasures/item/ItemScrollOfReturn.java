package com.github.detoner.gemsandtreasures.item;

import com.github.detoner.gemsandtreasures.util.ModUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ItemScrollOfReturn extends ItemBase{
	
	private EntityPlayer remotePlayer;
	
	public ItemScrollOfReturn(CreativeTabs tab) {
		super("scroll_of_return", tab);
	}
	
	public ItemScrollOfReturn() {
		super("scroll_of_return");
	}
	
	@Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityPlayer, EnumHand handIn)
    {
		ItemStack heldItem = entityPlayer.getHeldItem(handIn);
        if (heldItem != null && !world.isRemote)
        {
        	heldItem.shrink(1);
            if (entityPlayer.dimension == -1)
            {
            	entityPlayer.inventory.addItemStackToInventory(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:gunpowder")), 1));
            	if(remotePlayer != null) {
            		ModUtil.playSoundAtPlayer(remotePlayer, SoundEvents.BLOCK_FIRE_EXTINGUISH);
            	}
            }else {
            	if(remotePlayer != null) {
            		ModUtil.playSoundAtPlayer(remotePlayer, SoundEvents.ENTITY_ENDERMEN_TELEPORT);
                    ModUtil.spawnExplosionParticleAtEntity(remotePlayer);
            	}
            	BlockPos chunkCoords = entityPlayer.getBedLocation();

                if (chunkCoords == null) {
                    chunkCoords = world.getSpawnPoint();
                }

                entityPlayer.rotationPitch = 0.0F;
                entityPlayer.rotationYaw = 0.0F;
                entityPlayer.setPositionAndUpdate(chunkCoords.getX(), chunkCoords.getY() + 0.1D, chunkCoords.getZ());
                remotePlayer.setPositionAndUpdate(chunkCoords.getX(), chunkCoords.getY() + 0.1D, chunkCoords.getZ());

                while (!world.getCollisionBoxes(entityPlayer, entityPlayer.getEntityBoundingBox()).isEmpty()){
                    entityPlayer.setPositionAndUpdate(entityPlayer.posX, entityPlayer.posY + 1.0D, entityPlayer.posZ);
                    remotePlayer.setPositionAndUpdate(entityPlayer.posX, entityPlayer.posY + 1.0D, entityPlayer.posZ);
                }
                
                if(remotePlayer != null) {
            		ModUtil.playSoundAtPlayer(remotePlayer, SoundEvents.ENTITY_ENDERMEN_TELEPORT);
                    ModUtil.spawnExplosionParticleAtEntity(remotePlayer);
            	}
                
                entityPlayer.inventory.addItemStackToInventory(new ItemStack(ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft:paper")), 1));
            }
            remotePlayer = null;
            return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, heldItem);
        }else {
        	remotePlayer = entityPlayer;
        	return super.onItemRightClick(world, entityPlayer, handIn);
        }
    }
}

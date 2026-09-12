package com.github.detoner.gemsandtreasures.item;

import com.github.detoner.gemsandtreasures.handler.registration.TigersEyeRegistration;
import com.github.detoner.gemsandtreasures.settings.TreasuresSettings;
import com.github.detoner.gemsandtreasures.util.ModUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemBookOfReturn extends ItemBase{

	public ItemBookOfReturn(CreativeTabs tab) {
		super("book_of_return", tab);
        setAttributes();
	}

	public ItemBookOfReturn() {
        super("book_of_return");
        setAttributes();
	}

    private void setAttributes(){
        setMaxDamage(TreasuresSettings.settings.bookOfReturnMaxUses);
    }
	
	@Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityPlayer, EnumHand handIn)
    {
		ItemStack heldItem = entityPlayer.getHeldItem(handIn);
        if (!world.isRemote)
        {
            if (entityPlayer.dimension == -1)
            {
                if (TreasuresSettings.settings.corruptedScrollEnabled) {
                    ItemStack corruptedBook = new ItemStack(TigersEyeRegistration.corrupted_book);
                    corruptedBook.setItemDamage(heldItem.getItemDamage());
                    entityPlayer.inventory.addItemStackToInventory(corruptedBook);
                }else{
                    if (heldItem.getItemDamage() + 1 >= heldItem.getMaxDamage()) {
                        entityPlayer.setHeldItem(handIn, new ItemStack(Items.GUNPOWDER));
                    } else {
                        heldItem.damageItem(1, entityPlayer);
                    }
                }

                ModUtil.playSoundAtPlayer(entityPlayer, SoundEvents.BLOCK_FIRE_EXTINGUISH);
            }else {
                ModUtil.playSoundAtPlayer(entityPlayer, SoundEvents.ENTITY_ENDERMEN_TELEPORT);
                ModUtil.spawnExplosionParticleAtEntity(entityPlayer);

                BlockPos spawnPos = EntityPlayer.getBedSpawnLocation(
                        world,
                        entityPlayer.getBedLocation(),
                        true
                );

                if (spawnPos == null) {
                    spawnPos = world.getSpawnPoint();
                }

                entityPlayer.rotationPitch = 0.0F;
                entityPlayer.rotationYaw = 0.0F;
                entityPlayer.setPositionAndUpdate(spawnPos.getX(), spawnPos.getY() + 0.1D, spawnPos.getZ());

                int attempts = 0;

                while (!world.getCollisionBoxes(
                        entityPlayer,
                        entityPlayer.getEntityBoundingBox()
                ).isEmpty() && attempts < 256) {

                    entityPlayer.setPositionAndUpdate(
                            entityPlayer.posX,
                            entityPlayer.posY + 1.0D,
                            entityPlayer.posZ
                    );

                    attempts++;
                }

                ModUtil.playSoundAtPlayer(entityPlayer, SoundEvents.ENTITY_ENDERMEN_TELEPORT);
                ModUtil.spawnExplosionParticleAtEntity(entityPlayer);

                if (heldItem.getItemDamage() + 1 >= heldItem.getMaxDamage()) {
                    entityPlayer.setHeldItem(handIn, new ItemStack(Items.BOOK));
                } else {
                    heldItem.damageItem(1, entityPlayer);
                }
            }
            return new ActionResult<>(EnumActionResult.SUCCESS, heldItem);
        }else {
            return super.onItemRightClick(world, entityPlayer, handIn);
        }
    }
}

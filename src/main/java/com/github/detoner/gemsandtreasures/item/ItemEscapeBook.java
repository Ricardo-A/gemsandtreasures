package com.github.detoner.gemsandtreasures.item;

import com.github.detoner.gemsandtreasures.settings.TreasuresSettings;
import com.github.detoner.gemsandtreasures.util.DimensionalTeleporter;
import com.github.detoner.gemsandtreasures.util.ModUtil;
import mcp.MethodsReturnNonnullByDefault;
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
import net.minecraft.world.WorldServer;

import javax.annotation.Nonnull;

public class ItemEscapeBook extends ItemBase{

	public ItemEscapeBook(CreativeTabs tab) {
		super("escape_book", tab);
        setAttributes();
	}

	public ItemEscapeBook() {
        super("escape_book");
        setAttributes();
	}

    private void setAttributes(){
        setMaxDamage(TreasuresSettings.settings.escapeBookMaxUses);
    }
	
	@Override
    @MethodsReturnNonnullByDefault
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityPlayer, @Nonnull EnumHand handIn)
    {
        ItemStack heldItem = entityPlayer.getHeldItem(handIn);

        if (!world.isRemote) {

            ModUtil.playSoundAtPlayer(
                    entityPlayer,
                    SoundEvents.ENTITY_ENDERMEN_TELEPORT
            );
            ModUtil.spawnExplosionParticleAtEntity(entityPlayer);

            if (entityPlayer.dimension == 0) {
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
            } else {

                WorldServer overworld =
                        world.getMinecraftServer().getWorld(0);

                BlockPos spawnPos = EntityPlayer.getBedSpawnLocation(
                        overworld,
                        entityPlayer.getBedLocation(),
                        true
                );

                if (spawnPos == null) {
                    spawnPos = overworld.getSpawnPoint();
                }

                entityPlayer.rotationPitch = 0.0F;
                entityPlayer.rotationYaw = 0.0F;

                entityPlayer.changeDimension(
                        0,
                        new DimensionalTeleporter(
                                overworld,
                                spawnPos
                        )
                );
            }

            ModUtil.playSoundAtPlayer(
                    entityPlayer,
                    SoundEvents.ENTITY_ENDERMEN_TELEPORT
            );

            ModUtil.spawnExplosionParticleAtEntity(entityPlayer);

            if (heldItem.getItemDamage() + 1 >= heldItem.getMaxDamage()) {
                entityPlayer.setHeldItem(handIn, new ItemStack(Items.BOOK));
            } else {
                heldItem.damageItem(1, entityPlayer);
            }

            return new ActionResult<>(
                    EnumActionResult.SUCCESS,
                    entityPlayer.getHeldItem(handIn)
            );
        } else {
            return super.onItemRightClick(
                    world,
                    entityPlayer,
                    handIn
            );
        }
    }
}

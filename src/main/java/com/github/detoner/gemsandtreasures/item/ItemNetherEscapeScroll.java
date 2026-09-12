package com.github.detoner.gemsandtreasures.item;

import com.github.detoner.gemsandtreasures.handler.registration.TigersEyeRegistration;
import com.github.detoner.gemsandtreasures.settings.TreasuresSettings;
import com.github.detoner.gemsandtreasures.util.ModUtil;
import com.github.detoner.gemsandtreasures.util.DimensionalTeleporter;
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

public class ItemNetherEscapeScroll extends ItemBase {

    public ItemNetherEscapeScroll(CreativeTabs tab) {
        super("nether_escape_scroll", tab);
    }

    public ItemNetherEscapeScroll() {
        super("nether_escape_scroll");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(
            World world,
            EntityPlayer entityPlayer,
            EnumHand handIn) {

        ItemStack heldItem = entityPlayer.getHeldItem(handIn);

        if (!world.isRemote) {
            heldItem.shrink(1);

            if (entityPlayer.dimension != -1) {
                if (TreasuresSettings.settings.corruptedScrollEnabled) {
                    entityPlayer.inventory.addItemStackToInventory(
                            new ItemStack(TigersEyeRegistration.corrupted_scroll)
                    );
                } else {
                    entityPlayer.inventory.addItemStackToInventory(
                            new ItemStack(Items.GUNPOWDER)
                    );
                }

                ModUtil.playSoundAtPlayer(
                        entityPlayer,
                        SoundEvents.BLOCK_FIRE_EXTINGUISH
                );

            } else {
                ModUtil.playSoundAtPlayer(
                        entityPlayer,
                        SoundEvents.ENTITY_ENDERMEN_TELEPORT
                );

                ModUtil.spawnExplosionParticleAtEntity(entityPlayer);

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

                ModUtil.playSoundAtPlayer(
                        entityPlayer,
                        SoundEvents.ENTITY_ENDERMEN_TELEPORT
                );

                ModUtil.spawnExplosionParticleAtEntity(entityPlayer);

                entityPlayer.inventory.addItemStackToInventory(
                        new ItemStack(Items.BOOK)
                );
            }

            return new ActionResult<>(
                    EnumActionResult.SUCCESS,
                    heldItem
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

package net.detoner.gemsandtreasures.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModUtil {
	
	@SideOnly(Side.CLIENT)
    public static void spawnExplosionParticleAtEntity(Entity entity)
    {
        for (int i = 0; i < 20; ++i)
        {
            double d0 = entity.world.rand.nextGaussian() * 0.02D;
            double d1 = entity.world.rand.nextGaussian() * 0.02D;
            double d2 = entity.world.rand.nextGaussian() * 0.02D;
            double d3 = 10.0D;
            entity.world.spawnParticle(EnumParticleTypes.EXPLOSION_NORMAL, (entity.posX + (entity.world.rand.nextFloat() * entity.width * 2.0F)) - entity.width - (d0 * d3), (entity.posY + (entity.world.rand.nextFloat() * entity.height)) - (d1 * d3), (entity.posZ + (entity.world.rand.nextFloat() * entity.width * 2.0F)) - entity.width - (d2 * d3), d0, d1, d2);
        }
    }
	
	@SideOnly(Side.CLIENT)
	public static void playSoundAtPlayer(EntityPlayer entity, SoundEvent event) {
		entity.playSound(event, 1, 1);
	}
}

package net.detoner.gemsandtreasures.entity;

import net.detoner.gemsandtreasures.GemsAndTreasures;
import net.detoner.gemsandtreasures.handler.LootHandler;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class EntityDarkGhast extends EntityGhast{

	private String name = "dark_ghast";
	
	public EntityDarkGhast(World world) {
		super(world);
        this.setSize(4.0F, 4.0F);
	}

	@Override
	public String getName() {
		super.getName();
		return "entity." + GemsAndTreasures.RESOURCE_PREFIX + this.name;
	}
	
	@Override
	protected ResourceLocation getLootTable() {
		return LootHandler.dark_ghast_loot;
	}
}

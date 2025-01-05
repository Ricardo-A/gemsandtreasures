package com.github.detoner.gemsandtreasures.fallinganvil;

import net.minecraft.entity.item.EntityFallingBlock;

public class FallingAnvil {
	private EntityFallingBlock entity;
	private double startingHeight;
	
	public FallingAnvil(EntityFallingBlock entity, double startingHeight) {
		this.entity = entity;
		this.startingHeight = startingHeight;
	}

	public EntityFallingBlock getEntity() {
		return entity;
	}

	public void setEntity(EntityFallingBlock entity) {
		this.entity = entity;
	}

	public double getStartingHeight() {
		return startingHeight;
	}

	public void setStartingHeight(double startingHeight) {
		this.startingHeight = startingHeight;
	}
}
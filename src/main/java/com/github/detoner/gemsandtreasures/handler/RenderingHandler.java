package com.github.detoner.gemsandtreasures.handler;

import com.github.detoner.gemsandtreasures.entity.EntityDarkGhast;
import com.github.detoner.gemsandtreasures.render.RenderDarkGhast;
import com.github.detoner.gemsandtreasures.settings.EntitiesSettings;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderingHandler{
	public static void render() {
		if(EntitiesSettings.settings.darkGhastEnabled) {
			RenderingRegistry.registerEntityRenderingHandler(EntityDarkGhast.class, new RenderDarkGhast());
		}
	}
}

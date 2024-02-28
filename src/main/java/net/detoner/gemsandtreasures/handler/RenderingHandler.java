package net.detoner.gemsandtreasures.handler;

import net.detoner.gemsandtreasures.entity.EntityDarkGhast;
import net.detoner.gemsandtreasures.render.RenderDarkGhast;
import net.detoner.gemsandtreasures.settings.EntitiesSettings;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class RenderingHandler{
	public static void render() {
		/*RenderingRegistry.registerEntityRenderingHandler(EntityDarkGhast.class, new IRenderFactory<EntityDarkGhast>() {

			@Override
			public Render<? super EntityDarkGhast> createRenderFor(RenderManager manager) {
				return new RenderDarkGhast(manager);
			}
			
		});*/
		if(EntitiesSettings.settings.darkGhastEnabled) {
			RenderingRegistry.registerEntityRenderingHandler(EntityDarkGhast.class, new RenderDarkGhast());
		}
	}
}

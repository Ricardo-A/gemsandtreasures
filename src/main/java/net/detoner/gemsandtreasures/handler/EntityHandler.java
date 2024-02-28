package net.detoner.gemsandtreasures.handler;

import java.util.ArrayList;
import java.util.List;

import net.detoner.gemsandtreasures.GemsAndTreasures;
import net.detoner.gemsandtreasures.entity.EntityDarkGhast;
import net.detoner.gemsandtreasures.settings.EntitiesSettings;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;

@EventBusSubscriber(modid = GemsAndTreasures.MODID)
public class EntityHandler {
	
	private static int id = 0;
	
	private static List<EntityEntry> entityList;
	
	public static EntityEntry dark_ghast;
	
	public static void initEntities() {
		entityList = new ArrayList<EntityEntry>();
		
		if(EntitiesSettings.settings.darkGhastEnabled) {
			dark_ghast = EntityEntryBuilder.create().entity(EntityDarkGhast.class).id(new ResourceLocation(GemsAndTreasures.MODID, "dark_ghast"), id++).name("dark_ghast").egg(0x111111, 0xAAAAAA).tracker(64, 2, false).build();
			entityList.add(dark_ghast);
		}
	}
	
	@SubscribeEvent
	public static void registerEntities(RegistryEvent.Register<EntityEntry> e) {
		for(EntityEntry entity : entityList) {
			e.getRegistry().register(entity);
		}
	}
	
}

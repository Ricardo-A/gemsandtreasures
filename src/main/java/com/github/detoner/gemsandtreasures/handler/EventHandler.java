package com.github.detoner.gemsandtreasures.handler;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import com.github.detoner.gemsandtreasures.fallinganvil.FallingAnvilCrafting;
import net.minecraft.world.IWorldEventListener;
import net.minecraftforge.event.world.WorldEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = GemsAndTreasures.MODID)
public class EventHandler {
	
	 @SubscribeEvent
	 public static void WorldEventLoad(WorldEvent.Load event) {
		 IWorldEventListener worldEventListener = new FallingAnvilCrafting();
		 event.getWorld().addEventListener(worldEventListener);
	 }
}

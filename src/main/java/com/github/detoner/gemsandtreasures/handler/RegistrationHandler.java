package com.github.detoner.gemsandtreasures.handler;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import com.github.detoner.gemsandtreasures.handler.registration.*;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

@EventBusSubscriber(modid = GemsAndTreasures.MODID)
public class RegistrationHandler {

	private static final List<BaseRegistration> registrations =
            new ArrayList<>();

	public static void init() {
		registrations.add(new CarbonadoRegistration());
		registrations.add(new TigersEyeRegistration());
		registrations.add(new MarbleRegistration());
		registrations.add(new JadeRegistration());
		registrations.add(new RubyRegistration());
		registrations.add(new AmethystRegistration());
		registrations.add(new TopazRegistration());
		registrations.add(new SapphireRegistration());
		registrations.add(new CrystalRegistration());
		registrations.add(new GlowingGemRegistration());
		registrations.add(new AquamarineRegistration());
		registrations.add(new PinkDiamondRegistration());
		registrations.add(new DiamondRegistration());
		registrations.add(new AgateRegistration());
		registrations.add(new OnyxRegistration());
		registrations.add(new RoseQuartzRegistration());
		registrations.add(new CoalStoneRegistration());
		registrations.add(new PetrifiedSlimeballRegistration());
		registrations.add(new CarpetRegistration());

		for (BaseRegistration registration : registrations) {
			registration.init();
		}
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		for (BaseRegistration registration : registrations) {
			registration.registerItems(event);
		}
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		for (BaseRegistration registration : registrations) {
			registration.registerBlocks(event);
		}
	}

	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		for (BaseRegistration registration : registrations) {
			registration.registerModels(event);
		}
	}
}

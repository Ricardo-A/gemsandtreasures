package net.detoner.gemsandtreasures.handler;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingHandler {
	public static void registerSmeltingRecipes() {
		GameRegistry.addSmelting(new ItemStack(RegistrationHandler.carbonado_raw), new ItemStack(RegistrationHandler.carbonado), 3.0f);
		GameRegistry.addSmelting(new ItemStack(RegistrationHandler.jade_raw2), new ItemStack(RegistrationHandler.jade), 3.0f);
		GameRegistry.addSmelting(new ItemStack(RegistrationHandler.fire_jade_raw2), new ItemStack(RegistrationHandler.fire_jade), 4.0f);
		GameRegistry.addSmelting(new ItemStack(RegistrationHandler.void_jade_raw2), new ItemStack(RegistrationHandler.void_jade), 4.0f);
		GameRegistry.addSmelting(new ItemStack(RegistrationHandler.jade_raw_white), new ItemStack(RegistrationHandler.white_jade), 6.0f);
		GameRegistry.addSmelting(new ItemStack(RegistrationHandler.jade_raw_golden), new ItemStack(RegistrationHandler.golden_jade), 10.0f);
	}
}

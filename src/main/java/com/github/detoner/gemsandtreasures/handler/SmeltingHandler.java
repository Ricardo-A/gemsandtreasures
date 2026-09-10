package com.github.detoner.gemsandtreasures.handler;

import com.github.detoner.gemsandtreasures.handler.registration.CarbonadoRegistration;
import com.github.detoner.gemsandtreasures.handler.registration.JadeRegistration;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class SmeltingHandler {
	public static void registerSmeltingRecipes() {
		GameRegistry.addSmelting(new ItemStack(CarbonadoRegistration.carbonado_raw), new ItemStack(CarbonadoRegistration.carbonado), 3.0f);
		GameRegistry.addSmelting(new ItemStack(JadeRegistration.jade_raw2), new ItemStack(JadeRegistration.jade), 3.0f);
		GameRegistry.addSmelting(new ItemStack(JadeRegistration.fire_jade_raw2), new ItemStack(JadeRegistration.fire_jade), 4.0f);
		GameRegistry.addSmelting(new ItemStack(JadeRegistration.void_jade_raw2), new ItemStack(JadeRegistration.void_jade), 4.0f);
		GameRegistry.addSmelting(new ItemStack(JadeRegistration.jade_raw_white), new ItemStack(JadeRegistration.white_jade), 6.0f);
		GameRegistry.addSmelting(new ItemStack(JadeRegistration.jade_raw_golden), new ItemStack(JadeRegistration.golden_jade), 10.0f);
	}
}

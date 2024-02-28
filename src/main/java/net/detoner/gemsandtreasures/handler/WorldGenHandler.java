package net.detoner.gemsandtreasures.handler;

import net.detoner.gemsandtreasures.worldgen.ModOreGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class WorldGenHandler {
	public static void init() {
		GameRegistry.registerWorldGenerator(new ModOreGenerator(), 0);
	}
}

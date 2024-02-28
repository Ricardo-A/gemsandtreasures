package net.detoner.gemsandtreasures.handler;

import net.detoner.gemsandtreasures.GemsAndTreasures;
import net.detoner.gemsandtreasures.settings.JadeSettings;
import net.detoner.gemsandtreasures.util.JadeLoot;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class LootHandler {
	public static ResourceLocation dark_ghast_loot = LootTableList.register(new ResourceLocation(GemsAndTreasures.MODID, "dark_ghast"));
	public static JadeLoot jadeLoot;
	public static JadeLoot fireJadeLoot;
	public static JadeLoot voidJadeLoot;
	public static JadeLoot whiteJadeLoot;
	public static JadeLoot goldenJadeLoot;
	public static JadeLoot rainbowJadeLoot;
	
	public static void loadJadeLoot() {
		jadeLoot = new JadeLoot(JadeSettings.exchangeSettings.jadeLoot);
		fireJadeLoot = new JadeLoot(JadeSettings.exchangeSettings.fireJadeLoot);
		voidJadeLoot = new JadeLoot(JadeSettings.exchangeSettings.voidJadeLoot);
		whiteJadeLoot = new JadeLoot(JadeSettings.exchangeSettings.whiteJadeLoot);
		goldenJadeLoot = new JadeLoot(JadeSettings.exchangeSettings.goldenJadeLoot);
		rainbowJadeLoot = new JadeLoot(JadeSettings.exchangeSettings.rainbowJadeLoot);
	}
}

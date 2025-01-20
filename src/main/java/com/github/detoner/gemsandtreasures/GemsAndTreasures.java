package com.github.detoner.gemsandtreasures;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.detoner.gemsandtreasures.addon.ChiselAddon;
import com.github.detoner.gemsandtreasures.fallinganvil.FallingAnvilRecipeRegistration;
import com.github.detoner.gemsandtreasures.handler.EntityHandler;
import com.github.detoner.gemsandtreasures.handler.LootHandler;
import com.github.detoner.gemsandtreasures.handler.OreDictionaryHandler;
import com.github.detoner.gemsandtreasures.handler.RegistrationHandler;
import com.github.detoner.gemsandtreasures.handler.RenderingHandler;
import com.github.detoner.gemsandtreasures.handler.SmeltingHandler;
import com.github.detoner.gemsandtreasures.handler.WorldGenHandler;
import com.github.detoner.gemsandtreasures.item.material.ModMaterial;
import com.github.detoner.gemsandtreasures.settings.AddonsSettings;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


@Mod(modid = GemsAndTreasures.MODID, name = GemsAndTreasures.NAME, version = GemsAndTreasures.VERSION, acceptedMinecraftVersions = GemsAndTreasures.MINECRAFT_VERSIONS)
public class GemsAndTreasures
{
    public static final String MODID = "gemsandtreasures";
    public static final String NAME = "Gems and Treasures";
    public static final String VERSION = "0.1.0";
    public static final String MINECRAFT_VERSIONS = "[1.12.2]";
    public static final String RESOURCE_PREFIX = MODID.toLowerCase() + ":";

    public static final CreativeTabs MOD_TAB = new ModTab();
    
    public static Logger logger = LogManager.getLogger(MODID);
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ModMaterial.initMaterials();
    	RegistrationHandler.initItems();
    	RegistrationHandler.initBlocks();
    	if(AddonsSettings.settings.chiselAddonEnabled) {
    		ChiselAddon.preInit();
    	}
    	FallingAnvilRecipeRegistration.register();
    	EntityHandler.initEntities();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	WorldGenHandler.init();
    	RenderingHandler.render();
    	OreDictionaryHandler.registerDictionary();
    	SmeltingHandler.registerSmeltingRecipes();
    }
    
    @EventHandler
	public void postInit(FMLPostInitializationEvent event) {
    	if(AddonsSettings.settings.chiselAddonEnabled) {
    		ChiselAddon.postInit();
    	}
    	LootHandler.loadJadeLoot();
	}
}

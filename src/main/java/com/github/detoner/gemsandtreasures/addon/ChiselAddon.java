package com.github.detoner.gemsandtreasures.addon;

import java.util.ArrayList;
import java.util.List;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import com.github.detoner.gemsandtreasures.block.BlockBase;
import com.github.detoner.gemsandtreasures.block.ItemBlockBase;
import com.github.detoner.gemsandtreasures.settings.GemsSettings;
import com.github.detoner.gemsandtreasures.settings.MarbleSettings;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import team.chisel.api.carving.CarvingUtils;
import team.chisel.api.carving.ICarvingGroup;
import team.chisel.api.carving.ICarvingRegistry;
import team.chisel.api.carving.ICarvingVariation;

@EventBusSubscriber(modid = GemsAndTreasures.MODID)
public class ChiselAddon {
	
	private final static List<Block> blocks = new ArrayList<Block>();
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		for(Block block : blocks) {
			event.getRegistry().register(new ItemBlockBase(block));
		}
	}
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		for(Block block : blocks) {
			event.getRegistry().register(block);
		}
	}
	
	@SideOnly(Side.CLIENT)
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		for(Block block:blocks) {
			Item item = Item.getItemFromBlock(block);
			ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		}
	}
	
	public static void preInit() {
		if(GemsSettings.settings.marbleEnabled) {
			if(MarbleSettings.settings.whiteMarbleEnabled) {
				for(int i = 1; i <= 4; i++) {
					blocks.add(new BlockBase(Material.ROCK, "marble_block"+i).setHardness(2.0f).setResistance(6.0f));
				}
			}
			if(MarbleSettings.settings.blackMarbleEnabled) {
				for(int i = 1; i <= 4; i++) {
					blocks.add(new BlockBase(Material.ROCK, "black_marble_block"+i).setHardness(2.0f).setResistance(6.0f));
				}
			}
		}
	}
	
    public static void postInit(){
    	if(Loader.isModLoaded("chisel")) {
    		if(GemsSettings.settings.marbleEnabled) {
    			if(MarbleSettings.settings.whiteMarbleEnabled) {
    				addActAddBlockToGroup(GemsAndTreasures.MODID+":marble_group", new ResourceLocation(GemsAndTreasures.MODID, "marble_block"));
    				for(int i = 1; i <= 4; i++) {
    					addActAddBlockToGroup(GemsAndTreasures.MODID+":marble_group", new ResourceLocation(GemsAndTreasures.MODID, "marble_block"+i));
    				}
    			}
    			if(MarbleSettings.settings.blackMarbleEnabled) {
    				addActAddBlockToGroup(GemsAndTreasures.MODID+":black_marble_group", new ResourceLocation(GemsAndTreasures.MODID, "black_marble_block"));
    				for(int i = 1; i <= 4; i++) {
    					addActAddBlockToGroup(GemsAndTreasures.MODID+":black_marble_group", new ResourceLocation(GemsAndTreasures.MODID, "black_marble_block"+i));
    				}
    			}
    		}
    	}
    }
	
    private static void addActAddBlockToGroup(String group, ResourceLocation registryName, NBTTagCompound nbt, int... metas){
        Block block = Block.REGISTRY.getObject(registryName);
        Item item = Item.REGISTRY.getObject(registryName);
        if(block != Blocks.AIR || item != null && !(item instanceof ItemBlock)){
            ICarvingRegistry chisel = CarvingUtils.getChiselRegistry();
            if(chisel != null){
                if(metas.length == 0){
                    metas = new int[]{0};
                }
                for(int meta : metas){
                    ItemStack stack = block != Blocks.AIR ? new ItemStack(block, 1, meta) : new ItemStack(item, 1, meta);
                    if(nbt != null){
                        stack.setTagCompound(nbt);
                    }
                    int order = 0;
                    ICarvingGroup carvingGroup = chisel.getGroup(group);
                    if(carvingGroup != null){
                        order = carvingGroup.getVariations().size();
                    }
                    ICarvingVariation variation = CarvingUtils.variationFor(stack, order);
                    chisel.addVariation(group, variation);
                }
            }
        }
    }
    
    private static void addActAddBlockToGroup(String group, ResourceLocation blockRegistryName, int... metas){
        addActAddBlockToGroup(group, blockRegistryName, null, metas);
    }
}

package com.github.detoner.gemsandtreasures.addon;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import com.github.detoner.gemsandtreasures.handler.registration.MarbleRegistration;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import team.chisel.api.carving.CarvingUtils;
import team.chisel.api.carving.ICarvingGroup;
import team.chisel.api.carving.ICarvingRegistry;
import team.chisel.api.carving.ICarvingVariation;

import static com.github.detoner.gemsandtreasures.handler.registration.MarbleRegistration.*;

@EventBusSubscriber(modid = GemsAndTreasures.MODID)
public class ChiselAddon {
	
    public static void postInit(){
        if (!Loader.isModLoaded("chisel")) {
            return;
        }

        addToExistingChiselGroup(
                "marble",
                marble_block.getRegistryName()
        );
        for (Block marbleChiselBlock : marbleChiselBlocks) {
            addToExistingChiselGroup(
                    "marble",
                    marbleChiselBlock.getRegistryName()
            );
        }

		addCustomChiselGroup(
				GemsAndTreasures.MODID+":black_marble_group",
                black_marble_block.getRegistryName()
		);

        for (Block blackMarbleChiselBlock : blackMarbleChiselBlocks) {
            addCustomChiselGroup(
                    GemsAndTreasures.MODID + ":black_marble_group",
                    blackMarbleChiselBlock.getRegistryName()
            );
        }
    }

    private static void addToExistingChiselGroup(String group, ResourceLocation registryName, int... metas) {
        Block block = Block.REGISTRY.getObject(registryName);
        Item item = Item.REGISTRY.getObject(registryName);

        if (block != Blocks.AIR || item != null && !(item instanceof ItemBlock)) {
            ICarvingRegistry chisel = CarvingUtils.getChiselRegistry();

            if (chisel != null) {
                ICarvingGroup carvingGroup = chisel.getGroup(group);

                if (carvingGroup != null) {
                    if (metas.length == 0) {
                        metas = new int[]{0};
                    }

                    for (int meta : metas) {
                        ItemStack stack = block != Blocks.AIR
                                ? new ItemStack(block, 1, meta)
                                : new ItemStack(item, 1, meta);

                        int order = carvingGroup.getVariations().size();

                        ICarvingVariation variation =
                                CarvingUtils.variationFor(stack, order);

                        chisel.addVariation(group, variation);
                    }
                }
            }
        }
    }
	
    private static void addCustomChiselGroup(String group, ResourceLocation registryName, NBTTagCompound nbt, int... metas){
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
    
    private static void addCustomChiselGroup(String group, ResourceLocation blockRegistryName, int... metas){
		addCustomChiselGroup(group, blockRegistryName, null, metas);
    }
}

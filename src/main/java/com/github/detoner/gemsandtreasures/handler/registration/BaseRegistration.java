package com.github.detoner.gemsandtreasures.handler.registration;

import com.github.detoner.gemsandtreasures.block.base.ItemBlockBase;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseRegistration {

    protected final List<Item> items = new ArrayList<>();
    protected final List<Block> blocks = new ArrayList<>();
    protected final List<IRecipe> recipes = new ArrayList<>();

    public abstract void init();

    public void registerItems(RegistryEvent.Register<Item> event) {
        for (Item item : items) {
            event.getRegistry().register(item);
        }

        for (Block block : blocks) {
            event.getRegistry().register(new ItemBlockBase(block));
        }
    }

    public void registerBlocks(RegistryEvent.Register<Block> event) {
        for (Block block : blocks) {
            event.getRegistry().register(block);
        }
    }

    public void registerRecipes(RegistryEvent.Register<IRecipe> event) {
        for (IRecipe recipe : recipes) {
            event.getRegistry().register(recipe);
        }
    }

    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        for (Item item : items) {
            ModelLoader.setCustomModelResourceLocation(
                    item,
                    0,
                    new ModelResourceLocation(
                            item.getRegistryName(),
                            "inventory"
                    )
            );
        }

        for (Block block : blocks) {
            Item item = Item.getItemFromBlock(block);

            ModelLoader.setCustomModelResourceLocation(
                    item,
                    0,
                    new ModelResourceLocation(
                            item.getRegistryName(),
                            "inventory"
                    )
            );
        }
    }
}

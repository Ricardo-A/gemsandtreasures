package com.github.detoner.gemsandtreasures.recipes.base;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.registries.IForgeRegistryEntry;

public abstract class BaseBookRecipe
        extends IForgeRegistryEntry.Impl<IRecipe>
        implements IRecipe {

    protected BaseBookRecipe(String id) {
        setRegistryName(
                new ResourceLocation(
                        GemsAndTreasures.MODID,
                        id
                )
        );
    }

    protected abstract Item getBook();

    protected abstract Item getRepairItem();

    protected abstract int getRepairCount();

    @Override
    public boolean matches(InventoryCrafting inventory, World world) {

        boolean foundBook = false;
        boolean foundRepairItem = false;

        Item book = getBook();
        Item repairItem = getRepairItem();

        for (int i = 0; i < inventory.getSizeInventory(); i++) {
            ItemStack stack = inventory.getStackInSlot(i);

            if (stack.isEmpty()) {
                continue;
            }

            if (stack.getItem() == book) {

                if (stack.getItemDamage() <= 0) {
                    return false;
                }

                if (foundBook) {
                    return false;
                }

                foundBook = true;

            } else if (stack.getItem() == repairItem) {

                if (foundRepairItem) {
                    return false;
                }

                foundRepairItem = true;

            } else {
                return false;
            }
        }

        return foundBook && foundRepairItem;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inventory) {

        Item book = getBook();

        for (int i = 0; i < inventory.getSizeInventory(); i++) {
            ItemStack stack = inventory.getStackInSlot(i);

            if (!stack.isEmpty() && stack.getItem() == book) {

                ItemStack result = stack.copy();

                result.setItemDamage(
                        Math.max(
                                0,
                                result.getItemDamage() - getRepairCount()
                        )
                );

                return result;
            }
        }

        return ItemStack.EMPTY;
    }

    @Override
    public boolean canFit(int width, int height) {
        return width * height >= 2;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return new ItemStack(getBook());
    }
}
package com.github.detoner.gemsandtreasures.item;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import com.github.detoner.gemsandtreasures.handler.RegistrationHandler;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemBaseSword extends ItemSword{
	
	private String name;
	private float damage;
	private float efficiency;
	private int enchantability;
	private int durability;
	
	public ItemBaseSword(String name, ToolMaterial material, float attackDamage, float efficiency, int enchantability, int durability) {
		super(material);
		this.name = name;
		this.damage = attackDamage;
		this.efficiency = efficiency;
		this.enchantability = enchantability;
		this.durability = durability;
		this.setMaxDamage(durability);
		setRegistryName(name);
		setCreativeTab(GemsAndTreasures.MOD_TAB);
	}

	@Override
	public String getTranslationKey(ItemStack stack) {
		return "item." + GemsAndTreasures.RESOURCE_PREFIX + this.name;
	}
	
	@Override
    public float getAttackDamage()
    {
        return this.damage;
    }
	
	@Override
    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Block block = state.getBlock();

        if (block == Blocks.WEB)
        {
            return efficiency;
        }
        else
        {
            Material material = state.getMaterial();
            return material != Material.PLANTS && material != Material.VINE && material != Material.CORAL && material != Material.LEAVES && material != Material.GOURD ? efficiency/15 : efficiency/10;
        }
    }
	
	@Override
    public int getItemEnchantability()
    {
        return this.enchantability;
    }
	
    /**
     * Returns the durability of the item.
     */
	@Override
    public int getMaxDamage()
    {
        return this.durability;
    }
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return ItemStack.areItemsEqualIgnoreDurability(repair, new ItemStack(RegistrationHandler.carbonado)) ? true : super.getIsRepairable(toRepair, repair);
  	}
}

package net.detoner.gemsandtreasures.item;

import net.detoner.gemsandtreasures.GemsAndTreasures;
import net.detoner.gemsandtreasures.handler.RegistrationHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemBaseAxe extends ItemAxe{
	
	private String name;
	private int enchantability;
	private int durability;
	
	public ItemBaseAxe(String name, ToolMaterial material, float attackDamage, float efficiency, int enchantability, int durability, float attackSpeed) {
		super(material, attackDamage, attackSpeed-4);
		this.name = name;
		this.efficiency = efficiency;
		this.enchantability = enchantability;
		this.durability = durability;
		//this.attackSpeed = attackSpeed;
		//this.attackDamage = attackDamage;
		setRegistryName(name);
		setCreativeTab(GemsAndTreasures.MOD_TAB);
	}

	@Override
	public String getTranslationKey(ItemStack stack) {
		return "item." + GemsAndTreasures.RESOURCE_PREFIX + this.name;
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
    public float getDestroySpeed(ItemStack stack, IBlockState state)
    {
        Material material = state.getMaterial();
        return material != Material.WOOD && material != Material.PLANTS && material != Material.VINE ? super.getDestroySpeed(stack, state) : this.efficiency;
    }
	
	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		return ItemStack.areItemsEqualIgnoreDurability(repair, new ItemStack(RegistrationHandler.carbonado)) ? true : super.getIsRepairable(toRepair, repair);
  	}
}

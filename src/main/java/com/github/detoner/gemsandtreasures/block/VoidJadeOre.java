package com.github.detoner.gemsandtreasures.block;

import java.util.Random;

import com.github.detoner.gemsandtreasures.handler.RegistrationHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class VoidJadeOre extends BlockBase{
	
	public VoidJadeOre(Material material, String name) {
		super(material, name);
		setHardness(3.0f);
		setResistance(9.0f);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0.5f);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		int dropChance = rand.nextInt(99) + 1;
		
		if(dropChance <= 50) {
			return Item.getItemFromBlock(RegistrationHandler.void_jade_raw);
		}else if(dropChance <= 85) {
			return Item.getItemFromBlock(RegistrationHandler.void_jade_raw1);
		}else{
			return Item.getItemFromBlock(RegistrationHandler.void_jade_raw2);
		}
	}
}

package com.github.detoner.gemsandtreasures.block.ores;

import java.util.Random;

import com.github.detoner.gemsandtreasures.block.base.BlockBase;
import com.github.detoner.gemsandtreasures.handler.RegistrationHandler;
import com.github.detoner.gemsandtreasures.handler.registration.JadeRegistration;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class FireJadeOre extends BlockBase {
	
	public FireJadeOre(Material material, String name) {
		super(material, name);
		setHardness(1.0f);
		setResistance(1.0f);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0.5f);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		int dropChance = rand.nextInt(99) + 1;
		
		if(dropChance <= 50) {
			return Item.getItemFromBlock(JadeRegistration.fire_jade_raw);
		}else if(dropChance <= 85) {
			return Item.getItemFromBlock(JadeRegistration.fire_jade_raw1);
		}else{
			return Item.getItemFromBlock(JadeRegistration.fire_jade_raw2);
		}
	}
}

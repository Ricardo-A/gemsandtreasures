package net.detoner.gemsandtreasures.block;

import java.util.Random;

import net.detoner.gemsandtreasures.handler.RegistrationHandler;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class JadeOre extends BlockBase{
	
	public JadeOre(Material material, String name) {
		super(material, name);
		setHardness(3.0f);
		setResistance(4.0f);
		setHarvestLevel("pickaxe", 1);
		setLightLevel(0.5f);
	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		int dropChance = rand.nextInt(99) + 1;
		
		if(dropChance <= 40) {
			return Item.getItemFromBlock(RegistrationHandler.jade_raw);
		}else if(dropChance <= 70) {
			return Item.getItemFromBlock(RegistrationHandler.jade_raw1);
		}else if(dropChance <= 90){
			return Item.getItemFromBlock(RegistrationHandler.jade_raw2);
		}else if(dropChance <= 99){
			return Item.getItemFromBlock(RegistrationHandler.jade_raw_white);
		}else{
			return Item.getItemFromBlock(RegistrationHandler.jade_raw_golden);
		}
	}
}

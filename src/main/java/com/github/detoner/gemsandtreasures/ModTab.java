package com.github.detoner.gemsandtreasures;

import com.github.detoner.gemsandtreasures.handler.RegistrationHandler;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModTab extends CreativeTabs {
	public ModTab() {
		super(GemsAndTreasures.MODID);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(Item.getItemFromBlock(RegistrationHandler.golden_jade_block));
	}
}

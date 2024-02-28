package net.detoner.gemsandtreasures.item;

import net.detoner.gemsandtreasures.handler.LootHandler;
import net.detoner.gemsandtreasures.util.ModUtil;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class ItemJade extends ItemBase{
	
	public ItemJade(String name) {
		super(name);
	}

	@Override
    public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer entityPlayer, EnumHand handIn)
    {
		ItemStack itemStack = null;
		switch(this.name) {
			case "jade":
				itemStack = LootHandler.jadeLoot.getRandomItem();
				break;
			case "fire_jade":
				itemStack = LootHandler.fireJadeLoot.getRandomItem();
				break;
			case "void_jade":
				itemStack = LootHandler.voidJadeLoot.getRandomItem();
				break;
			case "white_jade":
				itemStack = LootHandler.whiteJadeLoot.getRandomItem();
				break;
			case "golden_jade":
				itemStack = LootHandler.goldenJadeLoot.getRandomItem();
				break;
			case "rainbow_jade":
				itemStack = LootHandler.rainbowJadeLoot.getRandomItem();
				break;
		}
		if(itemStack != null && !world.isRemote) {
			entityPlayer.inventory.addItemStackToInventory(new ItemStack(itemStack.getItem(), itemStack.getCount()));
			ItemStack heldItem = entityPlayer.getHeldItem(handIn);
			heldItem.shrink(1);
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, heldItem);
		}else {
			ModUtil.playSoundAtPlayer(entityPlayer, SoundEvents.BLOCK_GLASS_BREAK);
			return super.onItemRightClick(world, entityPlayer, handIn);
		}
    }
}

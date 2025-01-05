package com.github.detoner.gemsandtreasures.util;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Nullable;

import com.github.detoner.gemsandtreasures.GemsAndTreasures;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

public class JadeLoot{
	private List<WeightedItem> loot = new ArrayList<WeightedItem>();
	private int totalWeight;
	
	public JadeLoot(String[] jadeLoot) {
		
		for (String s : jadeLoot) {
			String[] itemData = s.split(" ");
			if (itemData.length < 2) {
				continue;
			}

			double weight = Double.parseDouble(itemData[0]);
			MetadataCustom meta = getMetadata(itemData[1]);

			if (meta == null || !Item.REGISTRY.containsKey(meta.getId())) {
				GemsAndTreasures.logger.warn("Item {} is invalid.", itemData[1]);
				continue;
			}

			int amount = 1;
			if (itemData.length >= 3) {
				try {
					amount = Integer.parseInt(itemData[2]);
				} catch (NumberFormatException ignore) {
				}
			}

			loot.add(new WeightedItem(meta, amount, weight));
			totalWeight += weight;
		}
	}
	
	public ItemStack getRandomItem() {
		double randomWeight = totalWeight * Math.random();
		double countedWeight = 0.0;

		for (WeightedItem weightedItem : loot) {
			countedWeight += weightedItem.getWeight();

			if (countedWeight < randomWeight) {
				continue;
			}

			Item item = Item.REGISTRY.getObject(weightedItem.getMeta().getId());
			if (item != null) {
				return new ItemStack(item, weightedItem.getAmount(), weightedItem.getMeta().getMeta());
			}
		}

		return null;
	}
	
	@Nullable
	private MetadataCustom getMetadata(String id) {
		String[] split = id.split(":");
		if (split.length < 2) {
			return null;
		}

		int meta = 0;
		if (split.length >= 3) {
			try {
				meta = Integer.parseInt(split[2]);
			} catch (NumberFormatException ignore) {
			}
		}

		return new MetadataCustom(new ResourceLocation(split[0], split[1]), meta);
	}
}
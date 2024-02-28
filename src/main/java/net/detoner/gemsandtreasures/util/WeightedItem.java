package net.detoner.gemsandtreasures.util;

public class WeightedItem {
	private final MetadataCustom meta;
	private final int amount;
	private final double weight;

	public WeightedItem(MetadataCustom meta, int amount, double weight) {
		this.meta = meta;
		this.amount = amount;
		this.weight = weight;
	}

	public MetadataCustom getMeta() {
		return meta;
	}

	public int getAmount() {
		return amount;
	}

	public double getWeight() {
		return weight;
	}
}

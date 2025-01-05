package com.github.detoner.gemsandtreasures.fallinganvil;

import net.minecraft.item.Item;

public class FallingAnvilRecipeResult{
	private Item result;
	private int minimumBaseResults;
	private int maximumBaseResults;
	private int minimumResultsPerHeight;
	private int maximumResultsPerHeight;
	/**
	 * probability based on the sum of weight of all results. If weight is used, the probability parameter will be ignored.
	 * Using weight, only one of the results that has weight will be given
	 */
	private int weight;
	/**
	 * between 1 and 10.000, if probability is used, weight will be ignored.
	 * Using probability, many items could be given, as each one will have his own probability of being acquired 
	 */
	private int probability;
	
	public FallingAnvilRecipeResult(Item result) {
		this.result = result;
		this.minimumBaseResults = 1;
		this.maximumBaseResults = 1;
		this.minimumResultsPerHeight = 0;
		this.maximumResultsPerHeight = 0;
		this.weight = 0;
		this.probability = 0;
	}

	/**
	 * @param result - item that you will get after the anvil smash the ingredient
	 * @param minimumBaseResults - minimum amount of items that can be crafted at minimum height
	 * @param maximumBaseResults - maximum amount of items that can be crafted at minimum height
	 * @param minimumResultsPerHeight - minimum amount of items that will be increased for each block higher
	 * @param maximumResultsPerHeight - maximum amount of items that will be increased for each block higher
	 * @param weight - chance to get the item based on the sum of weight of all results
	 */
	public FallingAnvilRecipeResult(Item result, int minimumHeight, int maximumHeight,
			int minimumBaseResults, int maximumBaseResults, int minimumResultsPerHeight, int maximumResultsPerHeight, int weight) {
		super();
		this.result = result;
		this.minimumBaseResults = minimumBaseResults;
		this.maximumBaseResults = maximumBaseResults;
		this.minimumResultsPerHeight = minimumResultsPerHeight;
		this.maximumResultsPerHeight = maximumResultsPerHeight;
		this.weight = weight;
	}
	
	/**
	 * @param result - item that you will get after the anvil smash the ingredient
	 * @param minimumBaseResults - minimum amount of items that can be crafted at minimum height
	 * @param maximumBaseResults - maximum amount of items that can be crafted at minimum height
	 * @param minimumResultsPerHeight - minimum amount of items that will be increased for each block higher
	 * @param maximumResultsPerHeight - maximum amount of items that will be increased for each block higher
	 * @param probability - probability/100, the value should be between 0.01 and 100
	 */
	public FallingAnvilRecipeResult(Item result, int minimumHeight, int maximumHeight,
			int minimumBaseResults, int maximumBaseResults, int minimumResultsPerHeight, int maximumResultsPerHeight, float probability) {
		super();
		this.result = result;
		this.minimumBaseResults = minimumBaseResults;
		this.maximumBaseResults = maximumBaseResults;
		this.minimumResultsPerHeight = minimumResultsPerHeight;
		this.maximumResultsPerHeight = maximumResultsPerHeight;
		probability = Math.round(probability*100);
	}

	public Item getResult() {
		return result;
	}

	public void setResult(Item result) {
		this.result = result;
	}

	public int getMinimumBaseResults() {
		return minimumBaseResults;
	}

	public void setMinimumBaseResults(int minimumBaseResults) {
		this.minimumBaseResults = minimumBaseResults;
	}

	public int getMaximumBaseResults() {
		return maximumBaseResults;
	}

	public void setMaximumBaseResults(int maximumBaseResults) {
		this.maximumBaseResults = maximumBaseResults;
	}

	public int getMinimumResultsPerHeight() {
		return minimumResultsPerHeight;
	}

	public void setMinimumResultsPerHeight(int minimumResultsPerHeight) {
		this.minimumResultsPerHeight = minimumResultsPerHeight;
	}

	public int getMaximumResultsPerHeight() {
		return maximumResultsPerHeight;
	}

	public void setMaximumResultsPerHeight(int maximumResultsPerHeight) {
		this.maximumResultsPerHeight = maximumResultsPerHeight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public float getProbabilityFloat() {
		return probability/100;
	}

	/**
	 * @param probability in 100, should be between 0.01 and 100
	 */
	public void setProbability(float probability) {
		this.probability = Math.round(probability*100);
	}
	
	public float getProbabilityInt() {
		return probability;
	}

	/**
	 * @param probability in 10000, should be between 1 and 10000
	 */
	public void setProbability(int probability) {
		this.probability = probability;
	}
}
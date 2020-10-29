package com.carbonfootprint;

public class Bicycle extends CarbonFootprint {
	private double averageMilesYearly;
	private double caloriesPerMile;
	
	public Bicycle(double averageMilesYearly, double caloriesPerMile) {
		super();
		this.averageMilesYearly = averageMilesYearly;
		this.caloriesPerMile = caloriesPerMile;
	}

	public double getAverageMilesYearly() {
		return averageMilesYearly;
	}

	public void setAverageMilesYearly(double averageMilesYearly) {
		this.averageMilesYearly = averageMilesYearly;
	}

	public double getCaloriesPerMile() {
		return caloriesPerMile;
	}

	public void setCaloriesPerMile(double caloriesPerMile) {
		this.caloriesPerMile = caloriesPerMile;
	}

	@Override
	public double getCarbonFootprint() {
		return getAverageMilesYearly() * getCaloriesPerMile();
	}

	@Override
	public String toString() {
		return "Bicycle.\nAverage Miles Yearly: " + getAverageMilesYearly() + " miles a year\nCalories per Mile: " + getCaloriesPerMile() + " calories";
	}
	
	
}

package com.carbonfootprint;

public class Car extends CarbonFootprint {
	private double averageMilesYearly;
	private double averageMilesPerGallon;
	
	public Car(double averageMilesYearly, double averageMilesPerGallon) {
		super();
		this.averageMilesYearly = averageMilesYearly;
		this.averageMilesPerGallon = averageMilesPerGallon;
	}

	public double getAverageMilesYearly() {
		return averageMilesYearly;
	}

	public void setAverageMilesYearly(double averageMilesYearly) {
		this.averageMilesYearly = averageMilesYearly;
	}

	public double getAverageMilesPerGallon() {
		return averageMilesPerGallon;
	}

	public void setAverageMilesPerGallon(double averageMilesPerGallon) {
		this.averageMilesPerGallon = averageMilesPerGallon;
	}

	@Override
	public double getCarbonFootprint() {
		return (getAverageMilesPerGallon() * getAverageMilesYearly()) * 9;
	}

	@Override
	public String toString() {
		return "Car.\nAverage Miles Yearly: " + getAverageMilesYearly() + " miles a year\nAverage Miles per Gallon: " + getAverageMilesPerGallon() + " mpg";
	}
	
	
}

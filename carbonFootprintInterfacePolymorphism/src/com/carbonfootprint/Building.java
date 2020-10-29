package com.carbonfootprint;

public class Building extends CarbonFootprint {
	private double dailyElectricity;
	private double daysUsage;
	
	public Building(double dailyElectricity, double dailyUsage) {
		super();
		this.dailyElectricity = dailyElectricity;
		this.daysUsage = dailyUsage;
	}

	public double getDailyElectricity() {
		return dailyElectricity;
	}

	public void setDailyElectricity(double dailyElectricity) {
		this.dailyElectricity = dailyElectricity;
	}

	public double getDaysUsage() {
		return daysUsage;
	}

	public void setDaysUsage(double daysUsage) {
		this.daysUsage = daysUsage;
	}

	@Override
	public double getCarbonFootprint() {
		return getDailyElectricity() * getDaysUsage();
	}

	@Override
	public String toString() {
		return "Building.\nDaily Electricity: " + getDailyElectricity() + " kWh\nDays Usage: " + getDaysUsage() + " days";
	}
}

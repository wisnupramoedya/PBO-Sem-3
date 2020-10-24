package com.employee;

public class HourlyEmployee extends Employee {
	private double hours;
	private double wage;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double hours, double wage) {
		super(firstName, lastName, socialSecurityNumber);
		
		if (wage < 0.0)
			throw new IllegalArgumentException("Wage must be >= 0.0");
		
		if (hours <= 0.0 || hours >= 168.0)
			throw new IllegalArgumentException("Hours must be > 0.0 and < 168.0");
		
		this.hours = hours;
		this.wage = wage;
	}

	public double getHours() {
		return hours;
	}

	public void setHours(double hours) {
		if (hours <= 0.0 || hours >= 168.0)
			throw new IllegalArgumentException("Hours must be > 0.0 and < 168.0");
		
		this.hours = hours;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage < 0.0)
			throw new IllegalArgumentException("Wage must be >= 0.0");
		
		this.wage = wage;
	}
	
	public double earnings() {
		return 1.5 * wage * hours;
	}
	
	@Override
	public String toString() {
		return String.format("%sHours: %s%nWage: %s%nEarnings: %s%n", super.toString(), hours, wage, earnings());
	}
	
	
}

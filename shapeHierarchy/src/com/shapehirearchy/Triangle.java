package com.shapehirearchy;

public class Triangle extends TwoDimensionalShape {
	private double height;
	private double base;
	
	public Triangle(double height, double base) {
		super();
		this.height = height;
		this.base = base;
	}
	
	@Override
	public double getArea() {
		return 0.5 * this.height * this.base;
	}
	
	@Override
	public String toString() {
		return "This is a Triangle\nWith:\nHeight: " + this.height + "\nBase: " + this.base + "\n";
	}
}

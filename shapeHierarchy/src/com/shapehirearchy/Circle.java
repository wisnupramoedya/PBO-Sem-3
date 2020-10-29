package com.shapehirearchy;

public class Circle extends TwoDimensionalShape {
	private double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return 3.14 * Math.pow(this.radius, 2);
	}
	
	@Override
	public String toString() {
		return "This is a Circle\nWith:\nRadius: " + this.radius + "\n";
	}
}

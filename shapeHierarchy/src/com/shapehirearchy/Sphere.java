package com.shapehirearchy;

public class Sphere extends ThreeDimensionalShape {
	private double radius;
	
	public Sphere(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return 4 * 3.14 * Math.pow(this.radius, 2);
	}

	@Override
	public double getVolume() {
		return (4/3) * Math.pow(this.radius, 3);
	}
	
	@Override
	public String toString() {
		return "This is a Sphere\nWith:\nRadius: " + this.radius + "\n";
	}
	
}

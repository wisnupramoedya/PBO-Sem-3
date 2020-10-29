package com.shapehirearchy;

public class Cube extends ThreeDimensionalShape {
	private double edge;

	public Cube(double edge) {
		super();
		this.edge = edge;
	}

	@Override
	public double getArea() {
		return 6 * Math.pow(this.edge, 2);
	}

	@Override
	public double getVolume() {
		return Math.pow(this.edge, 3);
	}
	
	@Override
	public String toString() {
		return "This is a Cube\nWith:\nEdge: " + this.edge + "\n";
	}
}

package com.shapehirearchy;

public class Tetrahedron extends ThreeDimensionalShape{
	private double edge;
	
	public Tetrahedron(double edge) {
		super();
		this.edge = edge;
	}

	@Override
	public double getArea() {
		return Math.sqrt(3) * Math.pow(this.edge, 2);
	}

	@Override
	public double getVolume() {
		return Math.pow(this.edge, 3) / (6 * Math.sqrt(2));
	}

	@Override
	public String toString() {
		return "This is a Tetrahedron\nWith:\nEdge: " + this.edge + "\n";
	}
	
}

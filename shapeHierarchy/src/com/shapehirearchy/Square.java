package com.shapehirearchy;

public class Square extends TwoDimensionalShape {
	private double side;
	
	public Square(double side) {
		super();
		this.side = side;
	}

	@Override
	public double getArea() {
		return Math.pow(this.side, 2);
	}
	
	@Override
	public String toString() {
		return "This is a Square\nWith:\nSide: " + this.side + "\n";
	}
}

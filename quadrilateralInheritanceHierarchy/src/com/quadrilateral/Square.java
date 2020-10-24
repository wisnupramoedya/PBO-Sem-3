package com.quadrilateral;

public class Square extends Quadrilateral {
	private double side;
	
	public Square(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		this.side = Math.sqrt(Math.pow(getP1().getX() - getP2().getX(), 2) + Math.pow(getP1().getY() - getP2().getY(), 2));
	}
	
	public double area() {
		return Math.pow(this.side, 2);
	}
	
	@Override
	public String toString() {
		String text = "Square\n"
				+ "With coordinates: " + super.toString()
				+ "\nSide: " + this.side
				+ "\nArea: " + this.area() + "\n";
		return text;
	}
	
}

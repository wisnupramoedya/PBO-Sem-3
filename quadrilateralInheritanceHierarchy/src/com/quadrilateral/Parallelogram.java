package com.quadrilateral;

public class Parallelogram extends Quadrilateral {
	private double height, width;
	
	public Parallelogram(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		this.width = Math.sqrt(Math.pow(getP1().getX() - getP2().getX(), 2) + Math.pow(getP1().getY() - getP2().getY(), 2));
		this.height = Math.abs(getP1().getY() - getP4().getY());
	}
	
	public double area() {
		return this.width * this.height;
	}
	
	@Override
	public String toString() {
		String text = "Parallelogram\n"
				+ "With coordinates: " + super.toString()
				+ "\nHeight: " + this.height
				+ "\nWidth: " + this.width
				+ "\nArea: " + this.area() + "\n";
		return text;
	}
}

package com.quadrilateral;

public class Trapezoid extends Quadrilateral {
	private double base1, base2, height;
	
	public Trapezoid(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		this.base1 = Math.sqrt(Math.pow(getP1().getX() - getP2().getX(), 2) + Math.pow(getP1().getY() - getP2().getY(), 2));
		this.base2 = Math.sqrt(Math.pow(getP3().getX() - getP4().getX(), 2) + Math.pow(getP3().getY() - getP4().getY(), 2));
		this.height = Math.abs(getP1().getY() - getP4().getY());
	}
	
	public double area() {
		return (this.base1 + this.base2) * this.height * 0.5;
	}
	
	@Override
	public String toString() {
		String text = "Trapezoid\n"
				+ "With coordinates: " + super.toString()
				+ "\nHeight: " + this.height
				+ "\nBase Lower: " + this.base1
				+ "\nBase Upper: " + this.base2
				+ "\nArea: " + this.area() + "\n";
		return text;
	}
	
}

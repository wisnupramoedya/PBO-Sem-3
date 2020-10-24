package com.quadrilateral;

public class Rectangle extends Quadrilateral {
	private double height, width;
	
	public Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		super(x1, y1, x2, y2, x3, y3, x4, y4);
		this.width = Math.sqrt(Math.pow(getP1().getX() - getP2().getX(), 2) + Math.pow(getP1().getY() - getP2().getY(), 2));
		this.height = Math.sqrt(Math.pow(getP1().getX() - getP4().getX(), 2) + Math.pow(getP1().getY() - getP4().getY(), 2));
	}
	
	public double area() {
		return this.width * this.height;
	}
	
	@Override
	public String toString() {
		String text = "Rectangle\n"
				+ "With coordinates: " + super.toString()
				+ "\nHeight: " + this.height
				+ "\nWidth: " + this.width
				+ "\nArea: " + this.area() + "\n";
		return text;
	}

	

}

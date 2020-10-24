package com.quadrilateral;

public class Quadrilateral {
	private Point p1;
	private Point p2;
	private Point p3;
	private Point p4;
	
	public Quadrilateral(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
		this.p3 = new Point(x3, y3);
		this.p4 = new Point(x4, y4);
	}
	
	protected Point getP1() {
		return p1;
	}
	
	protected void setP1(Point p1) {
		this.p1 = p1;
	}
	
	protected Point getP2() {
		return p2;
	}
	
	protected void setP2(Point p2) {
		this.p2 = p2;
	}
	
	protected Point getP3() {
		return p3;
	}
	
	protected void setP3(Point p3) {
		this.p3 = p3;
	}
	
	protected Point getP4() {
		return p4;
	}
	
	protected void setP4(Point p4) {
		this.p4 = p4;
	}
	
	@Override
	public String toString() {
		return p1 + ", " + p2 + ", " + p3 + ", " + p4;
	}
	
}

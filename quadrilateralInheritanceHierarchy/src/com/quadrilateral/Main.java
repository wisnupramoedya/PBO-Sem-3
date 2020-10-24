package com.quadrilateral;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(0.0, 0.0, 5.0, 0.0, 5.0, 9.0, 0.0, 9.0);
		System.out.println(rectangle);
		
		Square square = new Square(0.0, 0.0, 3.0, 0.0, 3.0, 3.0, 0.0, 3.0);
		System.out.println(square);
		
		Parallelogram parallelogram = new Parallelogram(0.0, 0.0, 5.0, 0.0, 6.0, 4.0, 1.0, 4.0);
		System.out.println(parallelogram);
		
		Trapezoid trapezoid = new Trapezoid(0.0, 0.0, 7.0, 0.0, 2.0, 4.0, 5.0, 4.0);
		System.out.println(trapezoid);
	}

}

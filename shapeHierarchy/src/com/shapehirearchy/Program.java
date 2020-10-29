package com.shapehirearchy;

import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		
		shapes.add(new Circle(7));
		shapes.add(new Square(10));
		shapes.add(new Triangle(4, 10));
		shapes.add(new Sphere(7));
		shapes.add(new Cube(10));
		shapes.add(new Tetrahedron(10));
		
		for(Shape a: shapes) {
			if(a instanceof TwoDimensionalShape) {
				System.out.print(a);
				System.out.println("Area: " + ((TwoDimensionalShape) a).getArea());
			}
			else {
				System.out.print(a);
				System.out.println("Area: " + ((ThreeDimensionalShape) a).getArea());
				System.out.println("Volume: " + ((ThreeDimensionalShape) a).getVolume());
			}
			System.out.println("");
		}

	}

}

package com.carbonfootprint;

import java.util.ArrayList;

public class CarbonFootprintTest {

	public static void main(String[] args) {
		ArrayList<CarbonFootprint> categories = new ArrayList<CarbonFootprint>();
		categories.add(new Bicycle(200, 34));
		categories.add(new Building(400, 300));
		categories.add(new Car(5845, 20));
		
		System.out.println("Data each object:");
		for(CarbonFootprint category: categories) {
			System.out.println(category);
			System.out.printf("Carbon footprint produced: %,.2f%n%n", category.getCarbonFootprint());
			
		}

	}

}

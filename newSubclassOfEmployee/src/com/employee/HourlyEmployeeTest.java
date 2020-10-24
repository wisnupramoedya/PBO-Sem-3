package com.employee;

public class HourlyEmployeeTest {

	public static void main(String[] args) {
		HourlyEmployee employee = new HourlyEmployee("Sue", "Jones", "222-22-2222", 100, 1.0);
		
		System.out.println("Employee information obtained by get methods:");
		System.out.printf("%s %s%n", "First name is", employee.getFirstName());
		System.out.printf("%s %s%n", "Last name is", employee.getLastName());
		System.out.printf("%s %s%n", "Social security number is", employee.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n", "Hours is", employee.getHours());
		System.out.printf("%s %.2f%n", "Wage is", employee.getWage());
		
		employee.setHours(150);
		employee.setWage(2.0);
		
		System.out.printf("%n%s:%n%s%n", "Updated employee information obtained by toString", employee);
	}

}

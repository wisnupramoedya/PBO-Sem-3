package com.wisnupram;

class Employee{
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	Employee(String firstName, String lastName, double monthlySalary){
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = (monthlySalary > 0) ? monthlySalary : 0.0;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public double getMonthlySalary() {
		return monthlySalary;
	}
	
	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = (monthlySalary > 0) ? monthlySalary : this.monthlySalary;
	}
	
	public void displayYearlySalary() {
		System.out.printf("%s %s's yearly salary is %.4f\n", this.firstName, this.lastName, this.monthlySalary * 12);
	}
	
	public void displayNextYearlySalary() {
		System.out.printf("%s %s's next yearly salary is %.4f\n", this.firstName, this.lastName, this.monthlySalary * 12 * 1.1);		
	}
}

public class EmployeeTest {

	public static void main(String[] args) {
		Employee object1 = new Employee("Wisnu", "Pram", -1000000);
		Employee object2 = new Employee("Mas", "Bintang", 1000000);
		
		System.out.println("First Salary:");
		object1.displayYearlySalary();
		object2.displayYearlySalary();
		
		System.out.println("\nNext Salary:");
		object1.displayNextYearlySalary();
		object2.displayNextYearlySalary();

	}

}

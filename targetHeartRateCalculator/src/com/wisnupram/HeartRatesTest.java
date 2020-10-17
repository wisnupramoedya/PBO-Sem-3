package com.wisnupram;

import java.time.Year;

class HeartRates{
	private String firstName;
	private String lastName;
	private int month;
	private int day;
	private int yearOfBirth;
	
	HeartRates(String firstName, String lastName, int month, int day, int yearOfBirth){
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setMonth(month);
		this.setDay(day);
		this.setYearOfBirth(yearOfBirth);
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

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	public int getPersonAge() {
		int age = Year.now().getValue() - this.yearOfBirth;
		return (age > 0) ? age : 0;
	}
	
	public int getMaximumHeartRate() {
		return 220 - this.getPersonAge();
	}
	
	public String getTargetHeartRate() {
		int maximumHeartRate = this.getMaximumHeartRate();
		return 50*maximumHeartRate/100 + " - " + 85*maximumHeartRate/100 + " bpm"; 
	}
	
}

public class HeartRatesTest {
	
	public static void printAll(HeartRates person) {
		String text = "=== Person ==="
				+ "\nFirst Name is " + person.getFirstName()
				+ "\nLast Name is " + person.getLastName()
				+ "\nDate of Birth is " + person.getMonth() + "/" + person.getDay() + "/" + person.getYearOfBirth()
				+ "\nWith result:"
				+ "\nPerson's Age: " + person.getPersonAge()
				+ "\nPerson's Maximum Heart Rate: " + person.getMaximumHeartRate()
				+ "\nPerson's Target Heart Rate Range: " + person.getTargetHeartRate() + "\n";
		System.out.println(text);
	}
	
	public static void main(String[] args) {
		HeartRates person = new HeartRates("Wisnu", "Pramoedya", 2, 6, 2001);
		person.setFirstName("Mas Bintang");
		person.setLastName("Nuralamsyah");
		person.setDay(1);
		person.setMonth(1);
		person.setYearOfBirth(1999);
		printAll(person);
	}

}

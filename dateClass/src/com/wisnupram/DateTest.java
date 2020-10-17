package com.wisnupram;

class Date{
	private int month;
	private int day;
	private int year;
	
	Date(int month, int day, int year){
		this.setMonth(month);
		this.setDay(day);
		this.setYear(year);
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

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void displayDate() {
		System.out.println("Recorded date is " + this.month + "/" + this.day +"/" + this.year);
	}
	
	
}

public class DateTest {
	
	public static void main(String[] args) {
		Date test = new Date(10, 9, 2020);
		test.setDay(1);
		test.setMonth(2);
		test.setYear(2021);
		test.displayDate();

	}

}

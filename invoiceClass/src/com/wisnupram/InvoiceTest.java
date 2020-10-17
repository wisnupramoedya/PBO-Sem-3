package com.wisnupram;

class Invoice{
	private String number;
	private String description;
	private int itemPurchased;
	private double itemPrice;
	
	Invoice(String number, String description, int itemPurchased, double itemPrice){
		this.setNumber(number);
		this.setDescription(description);
		this.setItemPurchased(itemPurchased);
		this.setItemPrice(itemPrice);
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getItemPurchased() {
		return itemPurchased;
	}

	public void setItemPurchased(int itemPurchased) {
		this.itemPurchased = itemPurchased;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	
	public double getInvoiceAmount() {
		this.itemPurchased = (this.itemPurchased > 0) ? this.itemPurchased : 0;
		this.itemPrice = (this.itemPrice > 0) ? this.itemPrice : 0.0;
		return this.itemPurchased * this.itemPrice;
	}
}

public class InvoiceTest {
	
	public static void printAll(Invoice test) {
		String text = "Invoice example:"
				+ "\nIts number: " + test.getNumber()
				+ "\nIts description: " + test.getDescription()
				+ "\nIts item purchased: " + test.getItemPurchased()
				+ "\nIts item price: " + test.getItemPrice();
		System.out.println(text);
	}
		
	public static void main(String[] args) {
		Invoice test = new Invoice("0909", "It is just a test", 10, 5.0);
		test.setNumber("9090");
		test.setDescription("The desc has been changed");
		test.setItemPurchased(11);
		test.setItemPrice(20.0);
		printAll(test);
		System.out.println("The invoice result is " + test.getInvoiceAmount());
	}

}

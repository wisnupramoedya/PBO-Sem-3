package com.employee;

public class PieceWorker extends Employee {
	private double wage;
	private double pieces;
	
	public PieceWorker(String firstName, String lastName, String socialSecurityNumber, double wage, double pieces) {
		super(firstName, lastName, socialSecurityNumber);
		if (wage < 0.0) // validate wage
			throw new IllegalArgumentException("Wage per piece must be >= 0.0");
		if (pieces < 0.0) // validate pieces
			throw new IllegalArgumentException("Pieces must be >= 0.0");
		this.wage = wage;
		this.pieces = pieces;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) {
		if (wage < 0.0) // validate wage
			throw new IllegalArgumentException("Wage per piece must be >= 0.0");
		this.wage = wage;
	}

	public double getPieces() {
		return pieces;
	}

	public void setPieces(double pieces) {
		if (pieces < 0.0) // validate pieces
			throw new IllegalArgumentException("Pieces must be >= 0.0");
		this.pieces = pieces;
	}

	@Override
	public double earnings() {
		return getWage() * getPieces();
	}

	@Override
	public String toString() {
		return String.format("piece worker: %s%n%s: $%,.2f; %s: %,.2f", super.toString(), "wage per piece", getWage(), "pieces produced", getPieces());
	}

}

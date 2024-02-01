package com.bptn.course.week2.customException1;

public class InsufficientFundsException extends Exception {

	
	private double amount;

	
	//constructor
	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}


	//getter method for amount
	public double getAmount() {
		return amount;
	}
	
	
}

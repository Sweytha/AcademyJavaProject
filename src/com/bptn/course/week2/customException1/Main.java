package com.bptn.course.week2.customException1;

public class Main {

	
	public static void main(String[] args) {
		BankAccount ba= new BankAccount("12345",1000);
		
		
		try {
			ba.withdraw(2000);
		} catch (InsufficientFundsException e) {
			System.out.println(
					"Error: Insufficient funds. You need $" + e.getAmount() + " more to complete this transaction.");
		}
	}
}


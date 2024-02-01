package com.bptn.course.week2.customException1;

public class BankAccount {

	
	private double balance;
	private String accountNumber;
	
	public BankAccount(String accountNumber,double balance) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	public void withdraw(double amount) throws InsufficientFundsException{
		
		if(amount>balance) {
			double needs= amount -balance; //2000-1000= 1000
			throw new InsufficientFundsException(needs); //create an instance InsufficientFundsException class with a custom parameter
		}
		
		balance= balance-amount; 
		System.out.println("Withdrawal of $" + amount + " successful. New balance: $" + balance);
	}
	
	
	
}

//throws in withdraw method signature is indicating the exception type that can be thrown when the method is called
//throw to a new instance of Exception class
//throw is used within a method
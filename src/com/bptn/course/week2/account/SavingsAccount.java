package com.bptn.course.week2.account;


public class SavingsAccount extends Account {
	   

    //declare instance variable
	double rate;

	//add parameterized constructor - use super keyword to call parent constructor
	public SavingsAccount(String name, double balance, double rate) {
		super(name, balance);
		this.rate = rate;
	}
	
    //override the toString method

    //override the equals method


	@Override
	public String toString() {
		return super.toString() + ", " + this.rate;
	}


	@Override
	public boolean equals(Object other) {
		SavingsAccount otherObj = (SavingsAccount) other;
		return super.equals(otherObj) && this.rate== otherObj.rate;
	}

   


    
}
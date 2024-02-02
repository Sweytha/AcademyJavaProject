package com.bptn.course.week2.solidPrinciples.srp;

//User class should be only responsible to hold the properties for user
class UserClass{
	
	//instance variables
	private String name;
	private String email;
	
	//constructor
	public UserClass(String name, String email) {
		this.name=name;
		this.email=email;
	}
	
	//generate getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}

//Compliant with SRP principle
class UserRepository{
	
	public void saveUser() {		
		System.out.println("Saving user into the database");
		//logic to save user details into the database
	}
	//method- responsible for delete the user details into a database
	public void deleteUser() {
		System.out.println("Deleting user from the database");
		//logic to delete user details from the database
	}
	
	//method- responsible for retrieving the user details into a database
	public void retrieveUser() {
		System.out.println("Retrieving user from the database");
		//logic to retrieve user details from the database
	}
	
}

public class Main1 {

	public static void main(String[] args) {
		

	}

}

//Refactored code
//1. The user class is only responsible for holding the user properties such as name and email. It is a simple data carrier 
//2. The user responsibility class takes over the additional responsibilities of saving the user, deleting the user and retrieving the 
//user details from the database 
//3. The user responsibility class can be further expanded without impacting the User class design

package com.bptn.course.week2.solidPrinciples.srp;

//User class should be only responsible to hold the properties for user
class User{
	
	//instance variables
	private String name;
	private String email;
	
	//constructor
	public User(String name, String email) {
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
	//violating SRP principle by adding more responsibilites to the same User class
	//method- responsible for saving the user details into a database
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

public class Main {

	public static void main(String[] args) {
		

	}

}

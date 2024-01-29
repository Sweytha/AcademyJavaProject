package com.bptn.course.week2;


public class Employee {

	// define instance variables
	String name;
	int id;
	int age;

	// 1st parameterized constructor
	public Employee(String name, int id) {
		this.name = name; // using "this" to refer to the instance variable
		this.id = id; // using "this" to refer to the instance variable
	}

	// 2nd parameterized constructor
	public Employee(String name, int id, int age) {
		this(name, id); // calling the 1st parameterized constructor using "this" keyword
		this.age = age;
	}

	// create a instance method to print the name and id
	public void printInfo() {

		System.out.println("Employee name: " + this.name);
		System.out.println("Employee id: " + this.id);
	}

	public void printInfoWithAge() {
		this.printInfo(); // "this" keyword is used to access the instance method present within a class
		System.out.println("Employee age: " + this.age);
	}

	public static void main(String[] args) {

		// create an object of the Employee class
		Employee firstEmployee = new Employee("John", 23);
		firstEmployee.printInfo();

		Employee secondEmployee = new Employee("Sweytha", 24, 25); // created an object with the 2nd parameterized
																	// constructor

		secondEmployee.printInfoWithAge();

	}

}

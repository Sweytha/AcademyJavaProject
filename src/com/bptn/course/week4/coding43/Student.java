package com.bptn.course.week4.coding43;

public class Student {

	// Define instance variables name and rollNumber
	private String name;
	private int rollNumber;

	// Create parameterized constructor
	public Student(int rollNumber, String name) {

		this.name = name;
		this.rollNumber = rollNumber;
	}

	// Create getter method for name variable which returns name
	public String getName() {
		return name;
	}

	// Create getter method for roll number variable which returns rollNumber
	public int getRollNumber() {
		return rollNumber;
	}

}
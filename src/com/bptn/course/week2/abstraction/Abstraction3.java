package com.bptn.course.week2.abstraction;

//implementation of interface after Java 8 version

interface Operations {
	// from java 8 version, an interface can consist of abstract methods, default
	// methods and static methods

	void draw(); // no implementation-abstract method

	//default method 
	default int add(int a, int b) {
		return a + b;
	}

	//static method
	static double getRandomNumber() {
		return Math.random();
	}
}

class Calculator implements Operations{

	@Override
	public void draw() {
		
		System.out.println("Calculator");
		
	}
	
//- No need to implement default methods as it is already implemented - it can override it
//static methods cannot be overridden
	
}

public class Abstraction3 {

	public static void main(String[] args) {
		
		//create an object from the Calculator class
		Calculator c1= new Calculator();
		c1.draw();
		
		int result = c1.add(2, 3); 
		System.out.println("Result: " +result);
		
		//call the static method using the interface name
		System.out.println("Random number "+ Operations.getRandomNumber());

	}

}

//Major keytakeaways
//1. After Java 8 version, interface can consist of abstract , default and static methods
//2. cannot be instantiated
//3. cannot consist of instance variables, but it can consist of constants 
//4. it cannot consist of constructors
//5. it supports multiple inheritance 

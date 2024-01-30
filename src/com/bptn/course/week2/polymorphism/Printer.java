package com.bptn.course.week2.polymorphism;

public class Printer {
	
	//method overloading/compile time polymorphism
	//methods have the same name but it has different types of parameters as well as number of parameters
	
	void print(int integer) {
		System.out.println("Printing an integer " + integer);
	}
	
	void print(String s) {
		System.out.println("Printing a string "+ s);
	}
	
	void print(double number) {
		System.out.println("Printing a double value "+ number);
	}
	
	int print(int number1, int number2) {
		return(number1 + number2);
	}

	public static void main(String[] args) {
		
		//create an object from printer class
		Printer p1= new Printer();
		p1.print(20);
		
		p1.print("Hello world");
		
		p1.print(2.53);
		
		System.out.println("The sum of both numbers is " + p1.print(10, 20));
		

	}

}
//Method overloading
//method should have the same name
//methods can have different number parameters
//methods can have different types of parameters
//methods can have different return types
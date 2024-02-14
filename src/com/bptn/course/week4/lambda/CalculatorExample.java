package com.bptn.course.week4.lambda;


//create a functional interface
@FunctionalInterface
interface Calculator{
	
	//adding an abstract method
	int calculate(int a, int b);
	
	
	//adding a default method- which has an implementation
	default void displayResult(int result) {
		System.out.println("Result: " +result);
	}
}

public class CalculatorExample {

	public static void main(String[] args) {
		
		//using a lambda expression to implement the calculate method in the Calculator functional interface
		//functional interface SAM implemented in different ways
		Calculator addition= (a,b)-> a+b; // One way
		
		Calculator subtraction = (a,b)-> a-b; //Second way
		
		Calculator multiplication =(a, b) -> a*b; //Third day
		
		int result1= addition.calculate(2, 3);
		int result2= subtraction.calculate(3, 2);
		int result3= multiplication.calculate(3, 2);
		
		System.out.println("Addition result: "+ result1); //to display the result without using the default method
		
		//using default method to display the result
		addition.displayResult(result1);
		subtraction.displayResult(result2);
		multiplication.displayResult(result3);

	}

}

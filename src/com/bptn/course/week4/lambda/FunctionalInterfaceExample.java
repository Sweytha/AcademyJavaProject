package com.bptn.course.week4.lambda;


@FunctionalInterface
interface A{
	
	//abstract method - a method which has no implementation
	void print(String name);
	

}

@FunctionalInterface
interface C{
	
	//abstract method- a method which has no implementation
	int add(int a, int b);
	
}

////traditional way 
//class B implements A{
//
//	@Override
//	public void print() {
//		System.out.println("Hello java");
//	}
//	
//}

////traditional way 
//class B implements C{
//
//	@Override
//	public int add(int a, int b) {
//		
//		return a+b;
//	}
//	
//}


public class FunctionalInterfaceExample {

	public static void main(String[] args) {
		
		//We cannot have objects from the functional interface
		//We are implemented the SAM(single abstract method) by using anonymous inner class
		//If we have a block of code within a lambda, its represented within the curly brace and semicolon at the end 
		//The parameter type may or may not be mentioned
		
		A myObj = (name) ->{
			System.out.println("Hello java");
			System.out.println(name);
		};
			
		myObj.print("Sweytha");
		
		//using lambda syntax
		//without the return keyword , it does not throw an error as the compiler knows you are returning a value
		//Passing the input type in the parameter is optional
		//Passing the same number of parameters as how its defined in the interface is important
		C myobj1= (a, b)-> a+b; 
		
		
		System.out.println("Addition result: " + myobj1.add(2, 3));

	}

}

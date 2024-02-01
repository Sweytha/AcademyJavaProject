package com.bptn.course.week2.customException;

//user defined custom exception class
class CustomException extends Exception {

	public CustomException(String message) {
		super(message);
	}
}


public class CustomExceptionExample1{
	
	
	//creating a method which throws the CustomException
	public static void exampleMethod(int value) throws CustomException {
		
		if(value<0) {
			//Using a throw keyword to create an instance of the CustomException class
			throw new CustomException("Negative value is not allowed");
		}
		else {
			System.out.println("Value is: " +value);
		}
		
	}
	
	public static void main(String[] args) {
		try {
			exampleMethod(-2); //this method has a throws in the method signature
		} catch (CustomException e) {
			
			//handling the messsage that was thrown 
			System.out.println("Caught the exception message "+e.getMessage());
		}
		
	}
}

//1. throw is used to create a custom error
//2. throws keyword is used in method signature to indicate what exception type can be thrown the method

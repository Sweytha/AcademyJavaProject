package com.bptn.course.week2.exceptionHandling;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {

		try {
			int result = 10 / 0; // critical statement
		} catch (ArithmeticException e) {
            System.out.println("Error has occured "+e.getMessage());
		}
		
		System.out.println("Statements to be executed after the try catch");

	}

}

//1. Arithmetic exceptions are unchecked exception- programmer handles the exception and it is not enforced by Java compiler 
//2. It occurs when we divide a number by zero
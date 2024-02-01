package com.bptn.course.week2.exceptionHandling;

public class ArrayExceptionExample {

	public static void main(String[] args) {

		// declare an array
		int[] a = { 1, 2, 3, 4 };

		try {
			System.out.println(a[4]); //critical statement
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The array index is out of range " + e.getMessage());
		}
		
		System.out.println("Statements to be executed after the try catch");
	}

}
//1. ArrayIndexOutOfBoundsException exceptions are unchecked exception- programmer handles the exception and it is not enforced by Java compiler 
//2. It occurs when we access array index out of range
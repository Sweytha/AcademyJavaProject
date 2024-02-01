package com.bptn.course.week2.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {

	public static void main(String[] args) {

		try {
			readFile("file.txt");
		} catch (FileNotFoundException e) {
			System.out.println("File not found " +e.getMessage());
		}
		 
			
	}
		


	private static void readFile(String fileName) throws FileNotFoundException {

	 
			FileReader fileReader = new FileReader(fileName);
		

	}

}

//Checked exceptions are exceptions where Java compiler enforces you to deal with the exception some way or the other

//Creating a method to read a file 

//you can deal with the error by surrounding it with a try-catch within the the declared method

//throws keyword specifies the exception that may be thrown by the method
//throws keyword is used in the method signature
//throws keyword can declare multiple exceptions

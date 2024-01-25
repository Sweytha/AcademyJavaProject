package com.bptn.course.week1;

import java.util.Scanner;

public class NegNumbers {

	public static void main(String[] args) {
		
		//Create a scanner object from the scanner class
		Scanner myObj= new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		
		//receive the input and store it inside a variable
		int number =myObj.nextInt();
		
	     if(number >0 ) {
	    	 System.out.println(number + " is positive");
	     }
	     else if(number <0 ) {
	    	 System.out.println(number + " is negative");
	     }
	     else {
	    	 System.out.println(number + " is zero");
	     }
		
	     myObj.close();

	}

}

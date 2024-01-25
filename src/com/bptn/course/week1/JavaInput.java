package com.bptn.course.week1;

import java.util.Scanner;

public class JavaInput {

	public static void main(String[] args) {
		
		//Step 1: Declare a scanner object
		
		Scanner myObj = new Scanner(System.in);
	
		
		
		//Step 2: create a variable to store the input value
		String userName;
		
		
		//Step 3: Reading the input value from the user and store it on the variable created in the previous step 2
		System.out.println("Please enter the username: ");
		
		userName = myObj.nextLine();
		
		
		//Step 4: Print the value of the variable onto the console
		System.out.println("The username entered is " + userName);
		
		
		//Step 5: Close the scanner
		myObj.close();
		
		

	}

}

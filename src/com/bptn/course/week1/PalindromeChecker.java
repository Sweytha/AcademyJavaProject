package com.bptn.course.week1;

import java.util.Scanner;

public class PalindromeChecker {

	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter the string to check for palindrome(make sure to keep note of case sensitivity");

		// reading the input and storing it inside a variable
		String input = myObj.nextLine();

		// initialized a variable to store the reversed word
		String reverseInput = "";

		// reverse the word by using a for loop and charAt() string method
		// length =5 // i= 4, 3 ,2 , 1 ,0
		for (int i = input.length() - 1; i >= 0; i--) {

			reverseInput += input.charAt(i);

		}

		System.out.println("The reversed word is " + reverseInput);

		if (input.equals(reverseInput)) {

			System.out.println("The word " + input + " is a palindrome");
		} else {
			System.out.println("The word " + input + " is not a palindrome");
		}
		
		myObj.close();

	}

}

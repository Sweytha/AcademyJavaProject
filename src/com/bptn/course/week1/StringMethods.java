package com.bptn.course.week1;


public class StringMethods {

	public static void main(String[] args) {
		
		//String methods
		String s="Hello World!";
		
		String reverseWord="";
		
		//returns the total number of characters in the string
		int len= s.length();
		
		System.out.println("The length of the string is "+len);
		
		//Substring method - to get a part of the string
		String sub =s.substring(6,11);
		
		System.out.println("The substring is "+sub);
		
		System.out.println("The lowercase of the string is " + s.toLowerCase());
		System.out.println("The uppercase of the string is " + s.toUpperCase());
		
		int index= s.indexOf("World");
		
		System.out.println("The index of substring "+ index);
		
		char c= s.charAt(0);
		
		System.out.println("The character at the position 0 is: "+ c);
		
		//reverse the word using decrement for-loop and charAt() method
		
		
		for(int i=len-1; i>=0; i--)	{
			
			reverseWord += s.charAt(i);
		}
		
		System.out.println("The reversed word is " +reverseWord);
		
		
	}

}
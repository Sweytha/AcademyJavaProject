package com.bptn.course.week1;

import java.util.Scanner;

public class UserInfo {

	public static void main(String[] args) {
		
		
		//Create an object from scanner class
		Scanner myObj= new Scanner(System.in);
		
		//print a statement on the console
		System.out.println("Enter you name , favourite city, age and salary");
		
		//String input for name
		String name= myObj.nextLine();
				
		//String input for fav city
		String favCity = myObj.nextLine();
		
		//Numerical input to get the user's age
		int age = myObj.nextInt();
		
		//Numerical input to get the user's salary
		double salary= myObj.nextDouble();
		
		//Output of all the inputs provided by the user
		System.out.println("Name: "+ name);
		System.out.println("Favourite city : "+ favCity);
		System.out.println("Age : "+ age);
		System.out.println("Salary : "+ salary);
		
		
		myObj.close();
				

	}

}
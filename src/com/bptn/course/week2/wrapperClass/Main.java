package com.bptn.course.week2.wrapperClass;

public class Main {

	public static void main(String[] args) {
		
		//convert int to Integer--convert a primitive type to wrapper class object (Autoboxing)
		Integer intObject= Integer.valueOf(20);
		
		//Alternatively to convert int to Integer as below
		Integer intObject1= 20; //commonly used
		
		
		
		//Unboxing-convert Integer to int- convert wrapper class object to primitive type
		int intPrimitive= intObject; //commonly used
		
		//Alternatively to convert Integer to int as below
		int intPrimitive1= intObject1.intValue();
		
		//Convert a string value to int , you can use parseInt() method of Integer class
		int num= Integer.parseInt("100");
		
	

	}

}

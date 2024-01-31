package com.bptn.course.week2.packageA;

public class ClassA {

	// declare private variable
	private int privateVar;

	// declare a private method
	private void privateMethod() {

		System.out.println("This is a private method");
	}
	
	//declare a default variable
	int defaultVar;
	
	//declare a default method
	void defaultMethod() {
		System.out.println("This is a default method");
	}
	
	//declare a protected variable
	protected int protectedVar;
	
	//declare a protected method
	protected void protectedMethod() {
		System.out.println("This is a protected method");
	}

	public static void main(String[] args) {
		
		//create an object from ClassA
		ClassA myObj = new ClassA();
		
		myObj.privateMethod();// yes, you can access private method within the same class
		
		System.out.println("This is a private variable " + myObj.privateVar); //yes, you can access private variable within the same class

		myObj.defaultMethod();// yes, you can access default method within the same class
		System.out.println("This is a default variable " + myObj.defaultVar);//yes, you can access default variable within the same class
		
		myObj.protectedMethod();//yes, you can access protected method within the same class
		System.out.println("This is a protected variable " + myObj.protectedVar);//yes, you can access protected variable within the same class
		
	}

}

//Major key takeways: private, default
//1. you can access private variables, methods within the same class
//2.you can access default variables, methods within the same class
//3. you can access protected variables, methods within the same class
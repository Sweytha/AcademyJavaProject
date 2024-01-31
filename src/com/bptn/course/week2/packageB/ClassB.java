package com.bptn.course.week2.packageB;

import com.bptn.course.week2.packageA.ClassA;

public class ClassB extends ClassA{

	public static void main(String[] args) {

		ClassB myObj2 = new ClassB();

	//	System.out.println("This is a default variable from Class A" + myObj2.defaultVar);

	//	myObj2.defaultMethod();
		
		
		System.out.println("This is a protected variable from Class A" + myObj2.protectedVar);
		
		myObj2.protectedMethod();
		
		
		

	}

}

//Key takeway
//1. We cannot access default variables and methods in another class outside the package
//2. We cannot access protected variables and methods in another class outside the package
//3. We can access protected variables and methods in another class outside the package by creating a subclass
//4. We cannot access default variables and methods in another class outside the package by creating a subclass
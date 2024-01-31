package com.bptn.course.week2.packageA;

public class AnotherClassA {

	public static void main(String[] args) {

		// create an object from Class A
		ClassA myObj1 = new ClassA();

		// System.out.println("This is a private variable from Class A" +
		// myObj1.privateVar);// we cannot access private variable from ClassA

		// myObj1.privateMethod();//No, you cannot access private method from ClassA

		// yes, we can access default from a different class in the same package
		System.out.println("This is a default variable from Class A" + myObj1.defaultVar);

		myObj1.defaultMethod();

		// yes, we can access protected from a different class in the same package
		System.out.println("This is a protected variable from Class A" + myObj1.protectedVar);

		myObj1.protectedMethod();;

	}

}

//Major key takeaway: private,default
//1. Private variables and methods cannot be access from ClassA( another class) but within the same package
//2. Default variables and methods can be accessed from Class A( another class) but within the same package
//3. Protected variables and methods can be accessed from Class A( another class) but within the same package
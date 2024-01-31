package com.bptn.course.week2.staticConcepts;

public class ClassName {
	
	//declare a static variable
	static int staticVariable =100;
	
	//declare an instance variable
	int instanceVariable;
	
	//declare static method
	static void staticMethod() {
		
		System.out.println("Static method is called");
		//can we access instance variable within a static method?- NO
		//instanceVariable=100;
		
		//this.instanceMethod();
	}
	
	//declare an instance method
	void instanceMethod() {
		System.out.println("Instance method is called");
		
		System.out.println("Print static variable "+ staticVariable); //YES
		staticMethod();
		
	}
	

	public static void main(String[] args) {
		
		//create an object of a class
		ClassName myObj= new ClassName();
		
		//Static variable is directly called using classname
		System.out.println(ClassName.staticVariable);
		
		//Static method is directly called using classname
		ClassName.staticMethod(); 
		
		
	}

}

//1. Static variables are called using ClassName.staticVariable
//2. Static methods are called using ClassName.staticMethod(); 
//3. We cannot access instance variables within a static method
//4. we cannot access instance method within a static method
//5. We can access a static variable within a instance method
//5. We can access a static method within a instance method
//6. We declare static variables/ methods by placing a "static" keyword before it
//7. Static variables and methods cannot be referenced using this keyword 

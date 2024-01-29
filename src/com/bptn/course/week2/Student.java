package com.bptn.course.week2;

public class Student {

	//this keyword in java is used to refer to current instance of the class. it can be used to distinguish between
	//instance variables, local variables and parameter variables with exactly the same name
	
	// declare instance variables
	// class level scope
	private String name;
	private int age;
	
	//default constructor
	public Student() {
		this.name= "Sarah"; //Using 'this' to refer to instance variable "name"
		this.age=30;      //Using 'this' to refer to instance variable "age"
	}
	// constructor- same name as the class name
	// do not have any return type
	// 1st parameterized constructor
	public Student(String name, int age) {
		this.name = name;   //Using 'this' to refer to instance variable "name"
		this.age = age;    //Using 'this' to refer to instance variable "age"
	}


	// declare a method to print the information
	public void printInfo() {
		System.out.println("Name: "+this.name);  //Using 'this' to refer to instance variable "name"
		System.out.println("Age " + this.age);   //Using 'this' to refer to instance variable "age"
	}

	public static void main(String[] args) {
            
		
		//create object with the first constructor
		Student student1= new Student("John" , 20);
		student1.printInfo(); //this is pointing to student1
		
		
		Student student2= new Student("Alice" ,30);
		student2.printInfo(); //this is pointing to student2
		

	}

}

//1. this is binding/reference to the current instance of the class
//2. Instance variables and parameter variables of the same name by using this for the instance variables

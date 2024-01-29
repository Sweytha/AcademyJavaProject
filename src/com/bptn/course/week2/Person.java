package com.bptn.course.week2;

public class Person {
	//class level scope
	//declare instance variables
	String name;
	int age;
	String location;
	
	//default constructor- it has no parameters set
	public Person() {
		this.name="Sweytha";
		this.age=20;
		this.location="Toronto";
	}
	
	//parameterized constructor
	public Person(String name, int age, String location) {
		this.name= name;
		this.age= age;
		this.location=location;
	}
	
	//method to print the info-instance method
	public void printInfo() {
		System.out.println("Name :" +this.name +" Age: " + this.age + " location: " +this.location);
	}
	

	public static void main(String[] args) {
		
		//create the object
		Person p1= new Person();
		p1.printInfo();
		
		Person p2= new Person("John Doe", 25, "Vancouver");
		p2.printInfo();
		

	}

}

package com.bptn.course.week2.abstraction;

//creating an abstract class
//cannot be used to create objects
abstract class Shape {

	// non-abstract method(concrete method)
	void moveTo(int x, int y) {
		System.out.println("Move to " + x + y);
	}

	// abstract methods- has no implementation
	abstract void draw();

	abstract void print();

}

class Circle extends Shape {

	// child class should implement all the abstract methods(unimplemented methods)
	// of the parent class
	@Override
	void draw() {
		System.out.println("Draw a circle");

	}

	@Override
	void print() {
		System.out.println("Print a circle");

	}

}

class Rectangle extends Shape {

	// child class should implement all the abstract methods(unimplemented methods)
	// of the parent class
	@Override
	void draw() {
		System.out.println("Draw a rectangle");

	}

	@Override
	void print() {
		System.out.println("Print a rectangle");

	}

}

public class Abstraction1 {

	public static void main(String[] args) {

		// create objects from the Circle class
		Circle c1 = new Circle();
		c1.draw();

		c1.moveTo(2, 3);

		c1.print();

		// create objects from the Rectangle class
		Rectangle r1 = new Rectangle();
		r1.draw();

		r1.moveTo(5, 6);
		r1.print();
	}

}
//Major takeway: 
//1. Abstract class cannot be instantiated 
//2. Abstract class can consist of abstract and non-abstract methods(concrete methods)
//3. Abstract methods have no implementation- which means the subclass should provide its own implementation when extending parent class
//4. Abstract class is a base class which provides a shared functionality and a common structure for all of its sub classes
//5. Abstract class leaves the abstract methods so that it can be implemented by the child class.

package com.bptn.course.week2.solidPrinciples.ocp;

abstract class ShapeClass{
	//abstract method
	abstract double area(); //no implementation 
}

class CircleClass extends ShapeClass{

	private double radius;
	
	CircleClass(double radius){
		this.radius=radius; 
	}
	
	//it has its own implementation for area
	@Override
	double area() {
		
		return Math.PI *radius * radius;
	}
	
}

class SquareClass extends ShapeClass{
	
	private double side;
	
	SquareClass(double side){
		this.side=side;
	}
	
	//it has its own implementation for area
	@Override
	double area() {
		
		return side * side;
	}
	
}

public class Main {
	public static void main(String[] args) {
		ShapeClass circle= new CircleClass(10.5);
		ShapeClass square = new SquareClass(12.5);
		
		
		System.out.println("Area of circle " +circle.area());
		System.out.println("Area of square " +square.area());
	}
}
/*
 * We have an abstract Shape class with an area method that is overridden by concrete subclasses (Circle and Square).
The Main class can create different shapes and calculate their areas without modifying the existing code. New shape types can be added by creating new subclasses of Shape without changing the existing code.
This adheres to the OCP because we can extend the system's behavior (by adding new shapes) without modifying the existing code.
*/

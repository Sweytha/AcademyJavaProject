package com.bptn.course.week2.abstraction;

//create an interface
interface ShapeInterface {

	// before Java 8, interface has only abstract methods and constants
	void draw();

	double getArea();
}

class CircleClass implements ShapeInterface{

	private double radius;

	@Override
	public void draw() {
		System.out.println("Draw a circle");
	}

	@Override
	public double getArea() {

		return (Math.PI * radius * radius);
	}

}

class RectangleClass implements ShapeInterface{
	
	private double width;
	private double height;

	@Override
	public void draw() {
		System.out.println("Draw a rectangle");
		
	}

	@Override
	public double getArea() {
		
		return width * height;
	}
	
}

public class Abstraction2 {

	public static void main(String[] args) {
      
		//Create objects from CircleClass
		CircleClass c1= new CircleClass();
		c1.draw();

		RectangleClass r1= new RectangleClass();
		r1.draw();
		
	}

}

//Major takeways
//Interface - cannot be instantiated
//1. declare constants and cannot have instance variables 
//2. cannot have constructors 
//3. Supports multiple inheritance . A class can implement multiple interfaces
//4. Before Java 8 interfaces had only abstract methods and constants
//5. After Java 8, interfaces has Abstract methods, default methods and static methods

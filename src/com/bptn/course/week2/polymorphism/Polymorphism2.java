package com.bptn.course.week2.polymorphism;

//parent class
class Shape {

	void draw() {
		System.out.println("Drawing a shape");
	}

}

//sub class- Rectangle
class Rectangle extends Shape {

	@Override
	void draw() {
		System.out.println("Drawing a rectangle");
	}

}

//sub class- Circle
class Circle extends Shape {
	@Override
	void draw() {
		System.out.println("Drawing a circle");
	}
}

public class Polymorphism2 {

	public static void main(String[] args) {
		
		Rectangle r1= new Rectangle();
		r1.draw();
		
		Circle c1= new Circle();
		c1.draw();

	}

}

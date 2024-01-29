package com.bptn.course.week2.car;

public class Car {

	// Fill in the code for Step 2
	// declare instance variables
	String color;
	String brand;
	int price;

	public Car(String color, String brand, int price) {
		// Fill in the code for Step 4
		this.color = color;
		this.brand = brand;
		this.price = price;

	}

	void printCarDetails() {
        this.print(); // "this" keyword is used to access the instance method present within a class
	}

	private void print() {
		System.out.println("Car{" + "color='" + this.color + '\'' + ", brand='" + this.brand + '\'' + ", price="
				+ this.price + '}');
	}

}
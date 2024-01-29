package com.bptn.course.week2.car1;

class Car {

	// Declare a String color, String brand, int price
	String color;
	String brand;
	int price;

	public Car() {
		// calls the parameterized constructor
		this("Black", "Tesla", 9000);
	}

	public Car(String color, String brand, int price) {
		this.color = color;
		this.brand = brand;
		this.price = price;
	}

	void printCarDetails() {
		this.print();
	}

	private void print() {
		System.out.println("Car{" + "color='" + this.color + '\'' + ", brand='" + this.brand + '\'' + ", price="
				+ this.price + '}');
	}
}

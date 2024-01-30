package com.bptn.course.week2.polymorphism;

//parent class
class Animal{
	
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}

//sub classes
//Dog class extends Animal parent class
class Dog extends Animal{
	
	@Override
	void makeSound() {
		System.out.println("Dog barks");
	}
	
	//it's own methods
	
}

//Cat class extends Animal parent class
class Cat extends Animal{
	
	@Override
	void makeSound() {
		System.out.println("Cats meows");
	}
	
	//it's own methods
	
}

public class Polymorphism1 {

	public static void main(String[] args) {
		
		//Create an object from the Dog class
		Dog d1= new Dog();
		d1.makeSound();
		
		//Create an object from thr Cat class
		Cat c1= new Cat();
		c1.makeSound();

	}

}

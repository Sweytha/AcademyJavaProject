package com.bptn.course.week4.generics;


class Box<T>{
	
	//instance variable
	private T value;
	
	//constructor
	public Box(T value) {
		this.value= value;
	}
	
	//getter method
	public T getValue() {
		return this.value;
	}
}


public class GenericExample {

	public static void main(String[] args) {
		  
		
		//create an object of IntegerBox
		Box<Integer> intBox =new Box<>(20);
		
		Box<Double> doubleBox =new Box<>(20.22);
		
		Box<String> stringBox= new Box<>("Hello world");
		
		Box rawType =new Box ("Hi Java"); // if we do not mention the type T, it behaves as a raw type
		
		String content = (String) rawType.getValue(); // Needs extra step of casting which is not a safe method
		
		System.out.println("Printing the integer value "+ intBox.getValue());
		
		System.out.println("Printing the double value "+ doubleBox.getValue());
		
		System.out.println("Printing the string value "+ stringBox.getValue());
		
		

	}

}

//1. Generics improves the reusability of a class by accepting objects of any type T
//2. It provides type safety 
//3. Eliminate the need for casting
//4. Improves readability of the code
//5. Generic classes allows you to create Objects of any type rather than restricting it to a specific type
//6. Its most commonly used in Java collections
//7. Diamond operators are used to mention the type T

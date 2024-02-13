package com.bptn.course.week4.generics;

public class BoundedGenericExample <T extends Number>{
	
	
	//instance variable
	private T value;
	
	//constructor
	public BoundedGenericExample(T value) {
		this.value= value;
	}
	
	//getter method
	public T getValue() {
		return this.value;
	}

	public static void main(String[] args) {
		
		BoundedGenericExample<Integer> intExample= new BoundedGenericExample<>(20);
		
		BoundedGenericExample<Double> doubleExample= new BoundedGenericExample<>(20.22);
		
//		BoundedGenericExample<String> stringExample= new BoundedGenericExample<>("Hello Java");
		
		
		System.out.println("Integer value : "+ intExample.getValue());
		
		System.out.println("Double value : "+ doubleExample.getValue());
		
//		System.out.println("String value : "+ stringExample.getValue());
		
		

	}

}

//1. public class ClassName<T extends SuperClass>
//2. The above syntax makes T bounded to the SuperClass -in this case SuperClass is Number
//3. As a result of which, in above code step 25 throws a compilation error when we create an object of String type
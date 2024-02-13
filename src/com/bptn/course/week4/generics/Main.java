package com.bptn.course.week4.generics;

import java.util.ArrayList;

//Main class accepts type T as objects but T is bounded to Number superclass
public class Main<T extends Number> {

	// instance variable
	private ArrayList<T> list = new ArrayList<>();

	// create an add method
	public void add(T num) {
		list.add(num);
	}

	// access the element using get method
	public T get(Integer index) {
		return list.get(index);
	}

	// sum up all the elements in the list
	public double sum() {

		double sum = 0;
		for (T num : list) {
			sum += num.doubleValue();
		}
		return sum;
	}

	public static void main(String[] args) {
		
		//Create a list of type integer and add integer values inside it
		Main<Integer> intList = new Main<>();
		
		intList.add(10);
		intList.add(20);
		intList.add(30);
		
		System.out.println("Access the first element of Integer list: "+ intList.get(0));
		
		System.out.println("Sum of all elements from Integer list: " +intList.sum());
		
		Main<Double> doubleList = new Main<>();
		
		doubleList.add(20.23);
		doubleList.add(20.22);
		doubleList.add(20.24);
		
		System.out.println("Access the first element of Double list: "+ doubleList.get(0));
		
		System.out.println("Sum of all elements from Double list: " +doubleList.sum());
		
	//	Main<String> stringList = new Main<>();
    //- Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type 
		

	}

}

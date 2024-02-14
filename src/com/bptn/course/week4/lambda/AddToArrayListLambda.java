package com.bptn.course.week4.lambda;

import java.util.ArrayList;

public class AddToArrayListLambda {

	public static void main(String[] args) {
		
		//declare an arraylist
		ArrayList<String> colors= new ArrayList<>();
		colors.add("red");
		colors.add("green");
		colors.add("blue");
		
		//print out the elements of the list using traditional for each loop
		for(String element: colors) {
			System.out.println(element);
		}
		
		//forEach() method
		colors.forEach((element)-> System.out.println("Colors: " + element) );

	}

}

//1. forEach(Consumer->functional interface)- this had accept(T t) as abstract method
//2. accept method had return type void
//3. accept method had only 1 parameter which of type T
//4. Using the lambdas syntax makes the code readable and also concise
//https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
//https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#forEach-java.util.function.Consumer-
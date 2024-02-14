package com.bptn.course.week4.lambda;

import java.util.ArrayList;

public class RemoveToArrayListLambda {

	public static void main(String[] args) {
		
		ArrayList<String> fruits= new ArrayList<>();
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("mango");
		
		//forEach method
		fruits.forEach((fruit)-> System.out.println(fruit));
		
		//removeIf method
		fruits.removeIf((fruit)-> fruit.equals("banana"));
		
		//forEach method 
		fruits.forEach((fruit)-> System.out.println(fruit));
		

	}

}

//1. removeIf method uses Predicate functional interface which has one abstract method test(T t) and return type is boolean
//2. forEach(Consumer->functional interface)- this had accept(T t) as abstract method
//3. accept method had return type void
//4. accept method had only 1 parameter which of type T
//5. Using the lambdas syntax makes the code readable and also concise
//https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
//https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#forEach-java.util.function.Consumer-
//https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
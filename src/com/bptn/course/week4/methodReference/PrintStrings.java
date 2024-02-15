package com.bptn.course.week4.methodReference;

import java.util.Arrays;
import java.util.List;

public class PrintStrings {

	public static void main(String[] args) {
		 //Declare and initialize a list of strings using an ArrayList and the Arrays.asList method
    	List<String> strings = Arrays.asList("foo", "bar", "baz", "qux", "quux");
    	
    	//print the list of strings using forEach method and lambda expression
    	strings.forEach((element) -> System.out.println(element));
    	
    	//print the list of strings using method reference ClassName :: staticMethodName
    	strings.forEach(System.out :: println);
    	
    	

	}

}

//void	accept(T t) present within the Consumer functional interface

//Use cases -
//1. Use a method reference operator when a lambda expression simply calls one method from another class/same class
//2.Use a lambda expression for more complex operations and that cannot be expressed by a single method call
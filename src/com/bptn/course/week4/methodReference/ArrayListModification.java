package com.bptn.course.week4.methodReference;

import java.util.ArrayList;

public class ArrayListModification {
    public static void main(String[] args) {
        // Create an ArrayList
         ArrayList<String> languages = new ArrayList<>();

        // Add elements to the ArrayList
         languages.add("java");
         languages.add("javascript");
         languages.add("swift");
         languages.add("python");
        
        
        System.out.println("Original ArrayList:");
        // Print the original ArrayList using forEach and a lambda
        languages.forEach((element)-> System.out.println(element));
        

        // Modify all elements to uppercase using replaceAll() - lambda expression
        languages.replaceAll((element)->element.toUpperCase());
        
        //Method reference operator for arbitrary object --> ClassName :: instanceMethodName
        languages.replaceAll(String :: toUpperCase);
      

        
        System.out.println("\nUpdated ArrayList:");
         // Print the updated ArrayList using forEach and a lambda
        languages.forEach((element)-> System.out.println(element));
    }
}

//1. Unary operator is a functional interface which has one abstract method R apply(T t)
//2. to implement this apply method we use another toUpperCase method from the String class
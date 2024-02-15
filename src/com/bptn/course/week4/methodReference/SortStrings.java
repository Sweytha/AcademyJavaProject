package com.bptn.course.week4.methodReference;

import java.util.Arrays;
import java.util.List;

public class SortStrings {
    public static void main(String[] args) {
        //Declare and initialize a list of strings using an ArrayList and the Arrays.asList method
    	List<String> strings = Arrays.asList("foo", "bar", "baz", "qux", "quux");
        
        //Print the string without sorting
        System.out.println("Before sorting " + strings);

        // Sort the list of strings in ascending order using a lambda expression
        strings.sort((a, b)-> a.compareTo(b));
        
        //Sort the list of strings in ascending order using a lambda expression with method reference operator
        //ClassName :: instanceMethodName
        strings.sort(String :: compareTo);
        

        // Print the sorted list of strings
        System.out.println("After sorting " + strings);
    }
}

//https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html#sort-java.util.Comparator-
//https://docs.oracle.com/javase/8/docs/api/java/util/Comparator.html
//1. sort method uses Comparator interface in its parameter
//2. this as one abstract method which is compare method
//3. int compare(T o1,T o2)
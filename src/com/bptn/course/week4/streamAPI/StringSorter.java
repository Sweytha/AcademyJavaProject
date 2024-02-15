package com.bptn.course.week4.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringSorter {

	public static void main(String[] args) {
		
		// Declare and initialize a list of strings
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));

		//sort the words in ascending order
		List<String> sortedList= list.stream()
									  .sorted((a, b)-> a.compareTo(b))
									  .collect(Collectors.toList());
		
		System.out.println("Sorted List: (ascending order)"+ sortedList);
		
		
		
		
	}

}

//1. int compare(T t1, T t2) SAM of comparator functional interface
//2. sorted is an intermediate operation
//3. collect is a terminal operation
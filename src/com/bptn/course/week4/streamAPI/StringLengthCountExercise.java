package com.bptn.course.week4.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringLengthCountExercise {

	public static void main(String[] args) {
		
		// Declare and initialize a list of strings
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));
		int length =5;
		
		//1. Convert the list to a stream
		//2. filter operation for words with length greater than 5
		//3. count operation
		
		long count=list.stream()
		               .filter((word)-> word.length()> length)
		               .count();
		
		System.out.println("Number of elements in the stream: "+ count);
				

	}

}

//1. filter() method has a predicate which is a functional interface and SAM boolean test(T t)
//2. filter is intermediate operation
//3. count is a terminal operation
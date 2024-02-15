package com.bptn.course.week4.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;

public class ToMapExample {

	public static void main(String[] args) {
		
		//created a list of strings
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "cherry", "date", "elderberry"));
		
		Map<String, Integer> fruitsMap= list.stream()
											.collect(Collectors.toMap((fruit)->fruit, String::length));
		
		System.out.println("Fruit Map: "+ fruitsMap);

	}

}

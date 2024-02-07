package com.bptn.course.week3.coding37;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> numbers = new HashMap<>();

		numbers.put(1, "one");
		numbers.put(2, "two");
		numbers.put(3, "three");
		numbers.put(4, "four");
		numbers.put(5, "five");
		numbers.put(6, "six");
		numbers.put(7, "seven");
		numbers.put(8, "eight");
		numbers.put(9, "nine");
		numbers.put(10, "ten");

		// print out the map using entrySet() method
		for (Map.Entry<Integer, String> entry : numbers.entrySet()) {

			// print the key and value from each entry<K,V>
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

		// remove method removes key-value pair using the key
		numbers.remove(7);

		// add a key-value pair using put method
		numbers.put(11, "eleven");

		// print out the map using entrySet() method
		for (Map.Entry<Integer, String> entry : numbers.entrySet()) {

			// print the key and value from each entry<K,V>
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}

package com.bptn.course.week3.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedMapExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map= new LinkedHashMap<>();
		map.put("Jack", 25);
		map.put("Jane", 30);
		map.put("John", 20);
		map.put("Mike", null);
		map.put("Sweytha", 25);
		map.put("Charlie", null);
		
		
		//iterate over this map using entrySet() method
		for(Map.Entry<String,Integer> entry : map.entrySet()) {
			
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}
		
		//iterate over this map using iterator
		Iterator<Map.Entry<String, Integer>> iterator= map.entrySet().iterator();
		while(iterator.hasNext()) {
			
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
		}

	}

}
//1. LinkedHashMap preserves insertion order
//2. It cannot have duplicate keys 
//3. It allows one null value for a key
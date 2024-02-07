package com.bptn.course.week3.map;

import java.util.HashMap;
import java.util.Map;


public class HashMapExample {

	public static void main(String[] args) {
		
		//creating a hashmap
		Map<String,Integer> map= new HashMap<>();
		
		//populate with key-value pairs
		map.put("John", 25);
		map.put("Jack", 20);
		map.put("Jane", 30);
		
		//get the value for "John"
		System.out.println(map.get("John"));
		
		//Iterating through the HashMap using keySet() method
		for(String key: map.keySet()) {
			//print the keys and its values
			System.out.println("Key: " + key + " Value: " + map.get(key));
		}
		
		//Using get and put methods to update value of an existing key
		map.put("John", map.get("John")+ 5);
	
		//Using replace method to update value of an existing key
		map.replace("Jack", 25);
		
		
		System.out.println("John's new age: " + map.get("John"));
		
		System.out.println("Jack's new age: " + map.get("Jack"));
		
		//check if a key is present in a map using containsKey(Object key)
		if(map.containsKey("Jane")) {
			System.out.println("The key 'Jane' exists in the map");
		}
		
		//check if a value is present in a map using containsValue(Object value)
		if(map.containsValue(30)) {
			System.out.println("The value '30' exists in the map");
		}
		
		
		//Using a _____ method to add a key value pair if the key is not present in the map
		map.putIfAbsent("Mike", 40);
		System.out.println("Mike's age " + map.get("Mike"));
		
		//Iterating through the HashMap using entrySet() method
		for(Map.Entry<String,Integer> entry : map.entrySet()) {
			
			System.out.println("Key: " + entry.getKey() + " Value: "+ entry.getValue());
		}
		
		map.put("Jack", null);
		
		System.out.println("Jack's age is " + map.get("Jack"));
		

	}

}

//1. Hashmap do not preserve insertion order

//2. Keys cannot have duplicates

//3. It allows one null "value" for a key

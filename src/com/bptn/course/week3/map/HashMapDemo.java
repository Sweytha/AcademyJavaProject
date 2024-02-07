package com.bptn.course.week3.map;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		 
		HashMap<String, Integer> people= new HashMap<>();
		people.put("Angie", 33);
		people.put("Steve", 30);
		people.put("John", 32);
		
		for(String name: people.keySet()) {
			System.out.println("Name: "+ name + ", " + "Age: " + people.get(name));
		}

	}

}

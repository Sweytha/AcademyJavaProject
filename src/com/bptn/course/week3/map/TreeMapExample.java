package com.bptn.course.week3.map;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		 
		TreeMap<String, Integer> map= new TreeMap<>();
		
		
		//put some values into treemap
		map.put("Toronto",1000);
		map.put("Ottawa", 2000);
		map.put("London", 500);
		map.put("Burlington", 4000);
		map.put("Brampton", null);
		
		
		System.out.println("Population of Toronto: " + map.get("Toronto"));
		
		//Using remove method to remove key and value pair
		map.remove("Burlington");
		
		//Traverse it using a for loop and keySet() method
		for(String key : map.keySet()) {
			
			System.out.println("Key: "+ key + " Value: " + map.get(key));
		}
		
		//Get the first key of the treemap
		System.out.println("First key in the tree map : "+ map.firstKey());
		
		//subMap() method of the map
		System.out.println("Submap of the treemap: "+ map.subMap("Brampton", "Toronto"));
		
		//headMap() method of the map
		System.out.print("Headmap of the treemap: "+ map.headMap("Toronto"));
		
		//tailMap() method of the map
		System.out.println("Tailmap of the treemap: "+ map.tailMap("Ottawa"));
		
		
		

	}

}

//1. Treemap sorts the elements in ascending order of keys
//2. Treemap can insert null value for a particular key
//3. It cannot consist of duplicate keys

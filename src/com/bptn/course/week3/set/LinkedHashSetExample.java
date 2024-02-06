package com.bptn.course.week3.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		//declare a LinkedHashSet
		Set<String> linkedHashSet= new LinkedHashSet<>();
		
		linkedHashSet.add("banana");
		linkedHashSet.add("apple");
		linkedHashSet.add("cherry");
		linkedHashSet.add("mango");
		linkedHashSet.add("banana"); // does not allow duplicates
		
		linkedHashSet.add(null);//it allows max one null value
		
		System.out.println(linkedHashSet);
		

	}

}

//1. It preserves insertion order
//2. Does not allow duplicates
//3. it allows max one null value
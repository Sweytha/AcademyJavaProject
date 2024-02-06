package com.bptn.course.week3.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		
		Set<String> hashSet= new HashSet<>();
		
		hashSet.add("apple");
		hashSet.add("banana");
		hashSet.add("cherry");
		hashSet.add("mango");
		hashSet.add("apple"); //it does not allow duplicates
		
		//it adds max one null value
		hashSet.add(null);
		
		
		System.out.println(hashSet);

	}

}

//1. Order is not preserved in a HashSet
//2. HashSet adds max one null value
//3. HashSet does not allow duplicates

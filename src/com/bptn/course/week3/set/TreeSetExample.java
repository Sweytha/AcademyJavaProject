package com.bptn.course.week3.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		
		Set<String> treeSet = new TreeSet<>();
		
		treeSet.add("banana");
		treeSet.add("apple");
		treeSet.add("cherry");
		treeSet.add("mango");
		
		treeSet.add("Mango"); //do not allow duplicates
		treeSet.add("Apple");
		
	//	treeSet.add(null); // it throws an exception
		
		System.out.println(treeSet);
		
		

	}

}
//1. TreeSet do not allow duplicates
//2. It orders the collection and stores it in natural ascending order
//3. TreeSet do not allow null value, if we try adding it throws a null pointer exception
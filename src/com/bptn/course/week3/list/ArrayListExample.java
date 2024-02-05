package com.bptn.course.week3.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		//create an ArrayList of integers
		//declare an ArrayList -of Type Integer
		List<Integer> arrayList = new ArrayList<>();
		
		//add some elements into this ArrayList
		//add() method adds the element to the end of the ArrayList
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		arrayList.add(20);
		
		
		System.out.println(arrayList);
		
		//Size of arrayList
		System.out.println("Size of the Arraylist "+ arrayList.size()); //array.length-->to find the length of an array
		
		//Access the first element
		System.out.println("Access the first element " +arrayList.get(0)); //array[0]-->this accesses the element in an array at position 0
		
		//update an element at position 2
		arrayList.set(2, 60);
		
		System.out.println("Access the third element " +arrayList.get(2));
		
		//remove an element from position 0
		arrayList.remove(0);
		
		//Access the first element
	    System.out.println("Access the first element " +arrayList.get(0));
	    
		System.out.println("Size of the Arraylist "+ arrayList.size());
		
		
		//access the elements of arrayList using for-each loop
		for(int element : arrayList) {
			System.out.println(element);
		}
		
       //access the elements of arrayList using for loop
		 for(int i=0 ;i <arrayList.size(); i++) {
			 System.out.println(arrayList.get(i));
		 }
		

	}

}
//1. ArrayList can grow or shrink dynamically in size |  Array has a fixed size
//2. To find the length - arrayList.size()   | array.length
//3. To access an element - arrayList.get(int index) | array[int index]
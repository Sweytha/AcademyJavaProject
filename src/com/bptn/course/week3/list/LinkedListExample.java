package com.bptn.course.week3.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		
		
		//creating an object from the LinkedList class
		LinkedList<String> colors= new LinkedList<>();
		
		//add items to the beginning of the list
		colors.addFirst("red");
		
		//add item to the end of the list
		colors.addLast("green");
		
		System.out.println("LinkedList after adding items " +colors);
		
		//remove element from the beginning of the list
		colors.removeFirst();
		
		//remove element from the end of the list
		colors.removeLast();
		
		System.out.println("LinkedList after removing items " +colors);
		
		colors.add("blue");
		colors.add("green");
		colors.add("blue");
		colors.add("pink");
		colors.add("orange");
		
		System.out.println("LinkedList after adding new colors "+colors);
		
		//removing element from a specific index
		colors.remove(1);
		System.out.println("LinkedList after removing items " +colors);
		
		//adding the element at index 1
		colors.add(1, "Purple");
		
		System.out.println("LinkedList after adding new colors "+colors);
		
		//replacing element at specific index 1
		colors.set(1, "Violet");
		
		System.out.println("LinkedList after replacing color "+colors);
		
		//accessing elements of the LinkedList using for loop
		System.out.println("Accessing the elements using for loop");
		for(int i=0 ; i < colors.size() ;i++) {
			System.out.println(colors.get(i));
		}
		
		//accessing elements of the LinkedList using for each loop
		System.out.println("Accessing the elements using for each loop");
		for(String c: colors) {
			System.out.println(c);
		}
		
		
		//accessing elements of the LinkedList using an iterator
		System.out.println("Accessing the elements using an iterator");
		Iterator<String> iterator= colors.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		//remove an element using an iterator
		System.out.println("Removing an element using an iterator");
		Iterator<String> it= colors.iterator();
		while(it.hasNext()) {
			String color= it.next(); //returning a type String
			if(color.equals("pink")) {
				it.remove();
				System.out.println("Element is removed successfully");
			}
		}
		
		 // Accessing elements and adding a new color using a ListIterator
        ListIterator<String> listIterator = colors.listIterator();
        while (listIterator.hasNext()) {
            String color = listIterator.next();
            
            
            if (color.equals("Violet")) {
              
                listIterator.add("purple");
            }
        }
        
        System.out.println("LinkedList after adding 'purple' after 'pink': " + colors);
		
		
	}

}

//1. It allows duplicates
//2. Preserves insertion order

//3. for and for each loop is useful for accessing the elements using index
//4. Iterator is useful for accessing the elements in a collection by looping over it using and iterator along with hasNext and next methods
//5. It is safe to add or remove elements from a collection using Iterator unlike the for /for each loop where we may encounter 
//concurrent modification exception
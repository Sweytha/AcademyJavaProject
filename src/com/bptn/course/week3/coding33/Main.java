package com.bptn.course.week3.coding33;

import java.util.List;
import java.util.ArrayList;

//Coding 3.3
public class Main {
    
    // Complete the functionality of the method below
    public static  List<String> convertArrayToList(String[] inputArray) {
        
        // Create a new ArrayList of String. 
    	ArrayList<String> nameList= new ArrayList<>();

        // Iterate inputArray using a for-each loop and add the elements to the new ArrayList. 
    	//Hint: Use add() method to add elements to ArrayList.
    	for(String element : inputArray) {
    		
    		//looping over the elements of an array and adding it to the nameList
    		nameList.add(element);
    	}

        // return the new list with elements.
    	return nameList;
    }
 
   
    // Do not modify the code below
    public static void main(String[] args) {

        String [] cars = {"Volvo","Honda","Ford"};

        List<String> arraylist = convertArrayToList(cars);

        System.out.println(arraylist);
    }
}


package com.bptn.course.week3.coding33;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//Different approach to convert array to ArrayList
public class Main1 {

	public static void main(String[] args) {
		
		//declare the array
		 String [] cars = {"Volvo","Honda","Ford"};
		 
		 List<String> nameList= new ArrayList<>(Arrays.asList(cars));
		 
		 System.out.println(nameList);

	    
	}

}

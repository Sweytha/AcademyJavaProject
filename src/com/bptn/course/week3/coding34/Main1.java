package com.bptn.course.week3.coding34;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//different approach to convert ArrayList to an Array
public class Main1 {

	public static void main(String[] args) {
		
		 List<String> nameList = new ArrayList<>();

	       nameList.add("Robert");
	       nameList.add("Samson");
	       nameList.add("Alex");
	       nameList.add("William");
	       
	     
	     String[] output=new String[nameList.size()];
	     
	     output= nameList.toArray(output);
	     
	     //toString() method is a static method present within the Arrays class
	     System.out.println(Arrays.toString(output));
	     
	     

	}

}

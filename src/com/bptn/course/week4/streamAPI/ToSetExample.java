package com.bptn.course.week4.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToSetExample {

	public static void main(String[] args) {
		
		//created a list of strings
		List<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "apple", "date", "banana"));
		
	    Set<String> setFruits=	list.stream()
			                    .collect(Collectors.toSet());
	    
	    System.out.println("Set fruits: "+ setFruits);
	 
	 
	}

}

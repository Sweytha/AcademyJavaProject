package com.bptn.course.week4.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapReduceExample {

	public static void main(String[] args) {
		
		List<Integer> numbers =Arrays.asList(1,2,3,4,5);
		
		
		//use the map method to square all the numbers in the list
		List<Integer> squareNumbers= numbers.stream()
											.map((x)-> x * x)
											.collect(Collectors.toList());
		
		
		System.out.println("Square of numbers: "+ squareNumbers);
		
		int sumOfSquares= squareNumbers.stream()
										.reduce(0, (a, e)-> a+e);
		
		System.out.println("Sum of squares: "+ sumOfSquares);

	}

}

//R apply(T t) SAM of Function functional interface

//R apply(T t, U u) SAM of BiFunction functional interface

//0+1 =1
//1+4= 5
//5+9= 14
//14+16= 30
//30+ 25= 55
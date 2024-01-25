package com.bptn.course.week1;

public class PrintEvenFrom0To100 {

	public static void main(String[] args) {
		
		//print even numbers between 0 -100 and exclude 0
		for(int i=0; i<=100; i++) {
			
			if(i% 2==0) {
				System.out.println(i);
			}
		}
		
	}

}

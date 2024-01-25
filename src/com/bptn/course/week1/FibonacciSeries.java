package com.bptn.course.week1;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		// 0 1 1 2 3 5 8 13 21 34....
		// declare a scanner object
		Scanner myObj = new Scanner(System.in);

		System.out.println("Enter the number of elements for the fibonnaci sequence: ");
		// get the number of elements and store it inside n
		int n = myObj.nextInt();// n=20

		int first = 0;
		int second = 1;

		int next;

		// count =0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19
		for (int count = 0; count < n; count++) {

			System.out.print(first + " ");

			// the next number is sum of first and second number ( previous 2 consecutive
			// numbers)
			next = first + second; // 1+2=3
			first = second; // first =1
			second = next; // second= 2

		}

		myObj.close();

	}
}
package com.bptn.course.week1;

public class ArrayFindSmallest {

	public static void main(String[] args) {

		// declare an array
		int[] theArray = { -30, -5, 8, 23, 46 };

		System.out.println(
				"Last index of element smaller than 50: " + getIndexOfLastElementSmallerThanTarget(theArray, 50));
		System.out.println(
				"Last index of element smaller than 30: " + getIndexOfLastElementSmallerThanTarget(theArray, 30));
		System.out.println(
				"Last index of element smaller than 10: " + getIndexOfLastElementSmallerThanTarget(theArray, 10));
		System.out.println(
				"Last index of element smaller than 0: " + getIndexOfLastElementSmallerThanTarget(theArray, 0));
		System.out.println(
				"Last index of element smaller than -20: " + getIndexOfLastElementSmallerThanTarget(theArray, -20));
		System.out.println(
				"Last index of element smaller than -30: " + getIndexOfLastElementSmallerThanTarget(theArray, -30));
		
		// Call the method you create here and print it in the console.
	    // To pass the test case please use target value as 10
		System.out.println(
				"Last index of element greater than 10: " + getIndexOfLastElementGreaterThanTarget(theArray, 10));

	}

	// define a method
	// Element which is smaller than the target value, and return it's index
	// If it does not find an element smaller than the target value, it will return
	// -1
	// Loop backwards

	public static int getIndexOfLastElementSmallerThanTarget(int[] valueArray, int target) {

		for (int i = valueArray.length - 1; i >= 0; i--) {

			if (valueArray[i] < target) {
				return i;
			}

		}
		return -1;

	}

	// define a method
	// Element which is larger than the target value, and return it's index
	// If it does not find an element larger than the target value, it will return
	// -1
	// Loop backwards
	public static int getIndexOfLastElementGreaterThanTarget(int[] valueArray, int target) {

		for (int i = valueArray.length - 1; i >= 0; i--) {

			if (valueArray[i] > target) {
				return i;
			}
		}
		return -1;

	}

}

package com.bptn.course.week4.sortingAlgorithm;

public class InsertionSortExample {
	
	//method which perform insertion sort
	public static void insertionSort(int[] arr) {
		
		//actual logic of insertion sort
		for(int i=1; i<arr.length; i++) {
			
			//store my current element into temp
			int temp = arr[i];
			
			//initialization condition
			int j=i-1;
			
			
			//use a while inner loop to go over all the elements to be compared with temp
			while(j>=0 && arr[j]> temp) {
				
				arr[j+1] =arr[j];
				
				//j should move backwards
				j--;
				
			}
			arr[j+1] =temp;
		}
		
	}

	public static void main(String[] args) {
	
		//initialize an array
		int[] arr= {6, 1, 7, 4, 2, 9, 8, 5, 3};
		
		//print the elements of the array before sorting 
		System.out.println("Elements of the array before sorting : " );
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		//call the insertionSort method to sort the array
		insertionSort(arr);
		
		System.out.println("\n Elements of the array after sorting : " );
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}

}

//1. Best case scenario-The array is already sorted and it would linearly move to find if the element is at the right position
//Time complexity for best case scenario -O(n)
//2. Worst case and average case scenario- it will be having quadratic time complexity because it has a inner loop within a loop
//which executes total of n^2 time
//Time complexity for worst and average case scenario -O(n^2)
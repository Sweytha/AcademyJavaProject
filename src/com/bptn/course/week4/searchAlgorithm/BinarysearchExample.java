package com.bptn.course.week4.searchAlgorithm;

import java.util.ArrayList;

public class BinarysearchExample {

	// this method to perform binary search on my arrayList
	private static int binarySearch(ArrayList<Integer> nums, int target) {
		
		int low= 0;
		int high= nums.size()-1;
		
		while(low <=high) {
		//calculate my middle index
		int mid =(low +high)/ 2;
		
		if(nums.get(mid) ==target) {
			return mid; //target is exactly in the middle of the list
		}
		else if(nums.get(mid)> target) {
			//the target element is present before the middle element 
			high =mid -1;
		}
		else if(nums.get(mid) <target) {
			//the target element is present after the middle element 
			low = mid +1; 
		}
		}
		
		//the target element is not found
		return -1;
	}

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		nums.add(40);
		nums.add(50);
		nums.add(60);
		nums.add(70);

		int target = 10;

		int index = binarySearch(nums, target);

		if (index != -1) {
			System.out.println("Element is found");
		} else {
			System.out.println("Element is not found");
		}

	}

}

//1. Binary search - best case scenario is if the element is in the middle
//2. Binary search - worst case scenario is if the element is not found
//3. Binary search - average cause scenario could be the element found at the beginning , or end of somewhere nearby the middle position


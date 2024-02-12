package com.bptn.course.week4.searchAlgorithm;

//Linear Search on an Array
public class ArraySearcher {
	
	//method which can perform the sequential search
	public static int sequentialSearch(int[] numArray, int target) {
		
		//loop over the elements in the array
		for(int i=0; i< numArray.length; i++) {
			
			//if the element matches with the target
			if(numArray[i] == target) {
				//return the index of the element, if the target is found
				return i;
			}
		}
		return -1; //target is not found
		
	}

	public static void main(String[] args) {
		
		int[] numArray= {3,-2, 9,38,-23};
		System.out.println("Test outcome of the sequential search");
		System.out.println(sequentialSearch(numArray,3)); // lowest execution element - best case
		
		
		System.out.println(sequentialSearch(numArray,-23)); // highest execution element - worst case
		
		System.out.println(sequentialSearch(numArray,99)); // highest execution element - worst case
		
		System.out.println(sequentialSearch(numArray,9));  // Average case scenario

	}

}

//1. Linear search has lowest execution time for the first element -best case scenario
//2. Linear search has highest execution time for the last element -worst case scenario
//3. Linear search has highest execution time for the element which does not exist -worst case scenario
//4. Linear search has average case scenario for the element in the middle or the its not towards the beginning or the towards the end
//5. As the size of the data increases , the complexity of the data linearly increases 
//6. As the size of the data increases , the execution time also linearly increases 

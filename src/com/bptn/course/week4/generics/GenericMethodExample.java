package com.bptn.course.week4.generics;

//Example for Generic Method
public class GenericMethodExample {
	
	//create a generic method to find the index of the first occurrence in any array of Type T
	private static <T>int findIndex(T[] numArray, T target) {
		
		for(int i=0; i<numArray.length; i++) {
			
			if(numArray[i]== target || numArray[i].equals(target)) {
				//if the target is found in the array, return the index
				return i;
			}
		}
		//if the element is not found return -1
		return -1;
	}



	public static void main(String[] args) {
		
		
		//Create an integer array
		Integer[] numArray= {1,2,3,4,5};
		
		String[] stringArray= {"apple" ,"banana" ,"cherry" ,"grapes"};
		
		Double[] doubleArray= {10.1,20.1,30.1,40.1};
		
		
		
		
		int index1= findIndex(numArray, 3);
		
		int index2= findIndex(stringArray, "cherry");
		
		int index3= findIndex(doubleArray, 30.1);
		
		 
		
	
		
		System.out.println("The index of 3 is: "+ index1);
		
		System.out.println("The index of cherry is: "+ index2);
		
	
		System.out.println("The index of 30.1 is: "+ index3);
	

	}


}

//1. We do not have to create a new method just to make it work for different types of Objects
//2. Generic method improves the reusability of the code for any Object of type T

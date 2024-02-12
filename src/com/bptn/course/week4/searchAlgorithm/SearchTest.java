package com.bptn.course.week4.searchAlgorithm;

public class SearchTest {
	
	//method which can perform the sequential search
		public static int sequentialSearch(String[] stringArray, String target) {
			
			//loop over the elements in the array
			for(int i=0; i< stringArray.length; i++) {
				
				//if the element matches with the target
				if(stringArray[i].equals(target)) {
					//return the index of the element, if the target is found
					return i;
				}
			}
			return -1; //target is not found
			
		}

	public static void main(String[] args) {
		
		//declare an array of strings
		String[] stringArray= {"blue", "red","green","pink","purple"};
		
		System.out.println(sequentialSearch(stringArray, "red"));

	}

}

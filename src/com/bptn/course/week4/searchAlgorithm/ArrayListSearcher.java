package com.bptn.course.week4.searchAlgorithm;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSearcher {
	
	//method which can perform the sequential search
		public static int sequentialSearch(List<Integer> numList, int target) {
			
			//loop over the elements in the arrayList
			for(int i=0; i< numList.size(); i++) {
				
				//if the element matches with the target
				if(numList.get(i) == target) {
					//return the index of the element, if the target is found
					return i;
				}
			}
			return -1; //target is not found
			
		}

	public static void main(String[] args) {
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(3);
        numList.add(-2);
        numList.add(9);
        numList.add(38);
        numList.add(-23);
        System.out.println("Tests of sequentialSearch");
        System.out.println(sequentialSearch(numList,3));
        System.out.println(sequentialSearch(numList,9));
        System.out.println(sequentialSearch(numList,-23));
        System.out.println(sequentialSearch(numList,99));

	}

}

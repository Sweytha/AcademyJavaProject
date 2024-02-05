package com.bptn.course.week3.list;

import java.util.ArrayList;

public class Test {
    public static void moveSmallest(ArrayList<Integer> list) {
        int smallestIndex = 0;
        
        int smallestNumber = list.get(0);
        
        for (int i=1 ; i< list.size() ;i++) {
            if (list.get(i)<smallestNumber) {
            	smallestNumber = list.get(i);
                smallestIndex = i;
               
            }
        }
        //move smallest to front
        list.remove(smallestIndex);
        list.add(0, smallestNumber);
    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {3, 11, 54, 7, 1, 22};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        moveSmallest(values);
        System.out.println("Expected Result: [1, 3, 11, 54, 7, 22]");
        System.out.println("Your Result: " + values);
    }
}

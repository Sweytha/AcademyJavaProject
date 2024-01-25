package com.bptn.course.week1;

public class ArrayExample {

	public static void main(String[] args) {
		
	 // declared an array
     // int[] myArray= new int[5];   
       
       int[] myArray= {10,20,30,40,50};
       
       System.out.println("The length of the array: "+ myArray.length);
       
       //replace the first element
       myArray[0]=15;
       
       System.out.println("The element at first position is: "+myArray[0]);
       
       //i=0,1,2,3,4
       for(int i=0; i<5;i++) {
    	   
    	   System.out.println("The elements present inside the array "+ myArray[i]);
    	   
       }
       
  
	}

}

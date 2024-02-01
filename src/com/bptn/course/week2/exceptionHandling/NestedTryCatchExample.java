package com.bptn.course.week2.exceptionHandling;

public class NestedTryCatchExample {

	public static void main(String[] args) {
		
		//outer try block
		
		try {
			
			int[] num= {1,2,3,4};
			int divisor =0;
			
		//	int output= num[2]/divisor; //critical statement 
			//inner try-catch block 1
			   try {
				   
				   int result = num[1]/0; //diving a number by zero
			   }
			   catch(ArithmeticException e) {
				   
				   System.out.println("Arithmetic exception has occured "+e.getMessage());
			   }
			
			   String text= null;
			
			//inner try-catch block 2
			   try {
				   System.out.println(text.length());// fails here because text is null
			   }
			   catch(NullPointerException e) {
				   System.out.println("Null pointer exception has occurred " + e.getMessage());
			   }
			
			
			//inner try-catch block 3
			   try {
				   System.out.println(num[4]); //critical statement
			   }
			   catch(ArrayIndexOutOfBoundsException e) {
				   System.out.println("The array index is out of range " + e.getMessage());
			   }
			
			
		}
		catch(Exception e) {
			//outer catch block
			System.out.println("General exception has occurred " +e.getMessage());
		}

	}

}

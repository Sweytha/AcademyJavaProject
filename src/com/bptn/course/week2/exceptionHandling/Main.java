package com.bptn.course.week2.exceptionHandling;

public class Main {
    
    // Method to demonstrate exception propagation
	void method1() {
		//declare an array 
		int[] num= {1,2,3,4};
		System.out.println(num[4]);
	}
     
    
    // Method to handle exception and demonstrate propagation
	void method2() {
		try {
			method1();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Method2: ArrayIndexOutOfBoundsException handled");
		}
	}
    
    
    // main() method to run the program
    public static void main(String args[]) {
        Main exceptionSolutionObject = new Main();
        exceptionSolutionObject.method2(); // Calling method2 to demonstrate exception propagation
    }
}

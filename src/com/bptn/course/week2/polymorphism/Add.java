package com.bptn.course.week2.polymorphism;

public class Add {

	   // Create your code here:
	    //this add method adds two integers
        int add(int a, int b) {
        	return (a+b);
        }
         
       //this add method adds three integers
        int add(int a, int b, int c) {
        	return (a+b+c);
        }
        
       //this add method adds two double values
        double add(double a, double b) {
        	return (a+b);
        }



	   // Do not modify the code below. The code below gives you the idea of how the different methods are called.
	   public static void main(String args[]) {
	       Add obj = new Add();
	       System.out.println(obj.add(12, 21));
	       System.out.println(obj.add(11, 23, 10));
	       System.out.println(obj.add(100.10, 200.5));
	   }
	}

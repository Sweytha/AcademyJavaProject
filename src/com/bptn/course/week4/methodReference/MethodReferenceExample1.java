package com.bptn.course.week4.methodReference;


@FunctionalInterface
interface JavaInterface{
	
	int findMax (int a, int b);
}

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		
		//using a lambda expression to implement the abstract method
		JavaInterface obj = (a, b)-> Math.max(a, b);
		
		int objResult= obj.findMax(2, 3);
		
		System.out.println(objResult);
		
		//using the static method reference | ClassName:: staticMethodName	
		JavaInterface myObj = Math :: max;
		
		int myObjResult= myObj.findMax(2, 3);
		
		System.out.println(myObjResult);

	}

}

//1. findMax method is implemented by using a lambda expression
//2. findMax method is implemented by using a static method max present inside the Math class
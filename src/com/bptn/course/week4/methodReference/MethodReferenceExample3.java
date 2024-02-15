package com.bptn.course.week4.methodReference;

@FunctionalInterface
interface B{
	
	void showInterfaceInfo(String message);
}


public class MethodReferenceExample3 {
	
	//instance method
	public void show(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		
		
		//created an object of MethodReferenceExample3 class
		MethodReferenceExample3 demo = new MethodReferenceExample3();
		
		//implementation using lambda expression
		B myObj= (message)->demo.show(message);
		myObj.showInterfaceInfo("Hello java");
		
		
		//implementation using method reference | objectName :: instanceMethodName
		
		B myObj1= demo :: show;
		myObj1.showInterfaceInfo("Hello world");
		
		

	}

}

//1. We are implementing the showInterfaceInfo method by using the show instance method
//2. Method reference for instance method looks like objectName :: instanceMethodName 
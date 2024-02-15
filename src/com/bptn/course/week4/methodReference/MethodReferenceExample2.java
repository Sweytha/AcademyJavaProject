package com.bptn.course.week4.methodReference;

@FunctionalInterface
interface A{
	
	void showInterfaceInfo(String message);
}

public class MethodReferenceExample2 {
	
	public static void show(String message) {
		System.out.println(message);
	}

	public static void main(String[] args) {
		
		//using the lambda expression ClassName.staticMethodName
		A obj= (message)-> MethodReferenceExample2.show(message);
		obj.showInterfaceInfo("hello java");
		
		
		//using method reference operator | ClassName:: staticMethodName
		A obj1= MethodReferenceExample2:: show;
		obj1.showInterfaceInfo("Hello world");
		
	}

}

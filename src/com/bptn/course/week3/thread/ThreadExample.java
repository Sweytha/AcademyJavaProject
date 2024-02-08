package com.bptn.course.week3.thread;

//now class A is a thread class
class A extends Thread{
	
	@Override
	public void run() {
		
		for( int i=0;i<100; i++) {
			System.out.println("hi java");
		}
	}
}
//now class B is a thread class
class B extends Thread{
	
	@Override
	public void run() {
		
		for( int i=0;i<100; i++) {
			System.out.println("hello java");
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		
		
		A myObj1= new A();
		//call the run method is not recommended because it runs within the context of the main thread
		//myObj1.run();
		//created a new thread and then executes the run program
		myObj1.start();
		
		B myObj2= new B();
		myObj2.start();

	}

}

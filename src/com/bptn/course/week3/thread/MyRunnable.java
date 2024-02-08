package com.bptn.course.week3.thread;

//1. Create a class that implements Runnable interface and implement the run() method
public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		System.out.println("Run() method is executed");

	}
	
	public static void main(String[] args) {
		
		//2. create an object from MyRunnable class
		MyRunnable myRunnable = new MyRunnable();
		
		//3. created an object from Thread class and passed myRunnable object as an argument to the constructor
		Thread thread = new Thread(myRunnable);
		
		//4. start the thread
		thread.start();
		
	}

}
//Steps involved in creating a  thread using Runnable interface
//Key difference-
//1. Inheritance- Java do not support multiple inheritance but implementing runnable interface supports multiple inheritance
//2. Preferred way to create a thread- is by implementing the Runnable interface because of abstraction, code reusability
//it provides more flexibility and better design practises
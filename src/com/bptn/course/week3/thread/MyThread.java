package com.bptn.course.week3.thread;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		
		for (int i=0 ;i<5;i++) {
			System.out.println("Thread:" +i);
			
			try {
				//delay of 1 second- which is 1000 milliseconds 
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				System.out.println("Thread is interrupted");
			}
			
		}
	}

	public static void main(String[] args) {
		
		MyThread t1= new MyThread();
		MyThread t2= new MyThread();
		
		
		//it is running both the threads at the same time parallely
		t1.start();
		t2.start();
		

	}

}
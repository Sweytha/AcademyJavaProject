package com.bptn.course.week3.thread;

public class ThreadExample2 extends Thread{
	
	public ThreadExample2(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		System.out.println(getName() +" is starting");
		
		//perform some work 
		
		for(int i=0;i<5;i++) {
			
			System.out.println( getName()+ " " +i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				System.out.println(getName() +" is interrupted");
			}
		}
		
		System.out.println(getName() +" is finished");
	}

	public static void main(String[] args) throws InterruptedException {
		
		ThreadExample2 t1= new ThreadExample2("Thread1");
		ThreadExample2 t2= new ThreadExample2("Thread2");
		
		
		t1.start();
		t2.start();

	
		//check the thread names
		String t1Name= t1.getName();
		String t2Name= t2.getName();

		
		t1.join();
		t2.join();
		
		//check the thread is alive
		System.out.println(t1Name +" is alive " + t1.isAlive());
		System.out.println(t2Name +" is alive " + t2.isAlive());
		
		System.out.println("Thread1name " +t1Name);
		System.out.println("Thread2name " +t2Name);
		
		
		System.out.println("Hello world");
		
		

	}

}
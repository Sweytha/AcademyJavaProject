package com.bptn.course.week2.solidPrinciples.isp;

//Interface for work-related actions
interface Workable {
	void work();
	
	
}

//Interface for eat-related actions
interface Eatable {
	void eat();
}




//Worker class implements both Workable and Eatable interfaces
class Worker implements Workable,Eatable{
	@Override
	public void work() {
		System.out.println("Worker is working.");
	}

	@Override
	public void eat() {
		
		
	}

}

public class Main {
	public static void main(String[] args) {
		Worker worker = new Worker();
		worker.work();
		worker.eat();
	}
}
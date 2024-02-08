package com.bptn.course.week3.coding311;

public class Main {
    
    public static void main(String[] args)  {
        
        SynchronizedPrinter printer = new SynchronizedPrinter();

        // use same printer object in both threads
        MyThread t1 = new MyThread(printer);
        MyThread t2 = new MyThread(printer);

        //start the threads t1 and t2
        System.out.println("Start thread1");
        t1.start();
        System.out.println("Start thread2");
        t2.start();
        
    
    
        
    }    
}

//1. Synchronized block only tries to place a lock on the thread that is accessing the block. In this we have t1 and t2
//accessing the synchronized block
//2. When t1 accesses the synchronized block, it places a lock on the object and only after t1 completes the task
//t2 is able to access the synchronized block
//3. Main thread is not accessing any synchronized block, so it continues its parallel execution 
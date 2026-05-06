package com.parijat.oops_concept.multiThreading;

// Main Thread and other Thread in same class

public class SamePlace extends Thread{

    @Override
    public void run(){
        System.out.println("Thread 1 Running");
        try {
            Thread.sleep(10);
            System.out.println("Thread 1 Last Line");
        }catch (InterruptedException ignored){

        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main Thread is Running");

        SamePlace t1 = new SamePlace(); // New Thread
        System.out.println("T1 state " + t1.getState()); // New

        // t1.run(); -> Can do this But this is normal method calling
        // .start() method Create new Thread, and then it execute run() method in that new Thread.
        t1.start(); // Thread started

        Thread.sleep(1); // Checked Exception -> InterruptedException
        // main thread paused and Ran after Timed Waiting

        System.out.println("T1 state " + t1.getState()); // main thread knows everything about t1

        System.out.println("Main Thread Running"); // main ran and waiting for t1 to terminate

        // Main thread Terminates once all threads Initiated by main are Terminated...

        t1.join(); // Pause the Execution of Main Thread
        // Next Line Only Run Once t1 is Terminated

        System.out.println("T1 state " + t1.getState());

        System.out.println("Main Thread Terminated");
    }
}

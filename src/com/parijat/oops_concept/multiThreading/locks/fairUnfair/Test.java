package com.parijat.oops_concept.multiThreading.locks.fairUnfair;

public class Test {
    public static void main(String[] args) {
        FairUnfairLock example = new FairUnfairLock();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                example.accessResource();
            }
        };

        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}

package com.parijat.oops_concept.multiThreading.locks.manualLocks;

public class Test {
    public static void main(String[] args) {

        // Initialize Resource
        BankAccount acc = new BankAccount();

        // Create Work to be done in Resource by threads
        Runnable task = new Runnable(){

            @Override
            public void run() {
                acc.withdrawAmount(50);
            }
        };

        // Create thread
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        Thread t3 = new Thread(task, "Thread 3");

        // Start Threads
        t1.start();
        t2.start();
        t3.start();
    }

}

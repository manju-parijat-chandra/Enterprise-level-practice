package com.parijat.oops_concept.multiThreading.locks.readWriteLock;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ReadWriteExample example = new ReadWriteExample();

        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++){
                    example.increment();
                    System.out.println(Thread.currentThread().getName() + " has successfully incremented to " + example.getCount());
                }
            }
        };

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 30; i++){
                    System.out.println(Thread.currentThread().getName() + " read : " + example.getCount());
                }
            }
        };

        Thread t1 = new Thread(writeTask, "Thread 1");
        Thread t2 = new Thread(readTask, "Thread 2");
        Thread t3 = new Thread(readTask, "Thread 3");


        t1.start();
        t2.start();
        t3.start();


        // All thread should be over
        t1.join();
        t2.join();
        t3.join();

        System.out.println("Final Count: " + example.getCount());
    }
}

package com.parijat.oops_concept.volatileAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {

    public static void main(String[] args) throws InterruptedException {
        SharedResourceCounter counter = new SharedResourceCounter();

        // Create two thread having shared resource to access

        // Incremented 1000 times
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                counter.incrementCounter();
            }
        });

        // Incremented 1000 times
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                counter.incrementCounter();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.getCounter());


        //  ******* Apply Thread Safety by using Atomic Classes *********
        // Without using Locks -> Simplified our requirement
        SharedResourceAtomic sharedResource = new SharedResourceAtomic();

        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                sharedResource.incrementCounter();
            }
        });

        Thread t4 = new Thread(() -> {
            for (int i = 0; i < 1000; i++){
                sharedResource.incrementCounter();
            }
        });

        t3.start();
        t4.start();

        t3.join();
        t4.join();

        System.out.println(sharedResource.getCounter());
    }
}

class SharedResourceCounter{

    // private int counter = 0;  -> less than 2000
    // private volatile int counter = 0; -> Will not work ** Complex ** -> Multiple thread can still access

    private int counter = 0;

    public int getCounter() {
        return counter;
    }

    public void incrementCounter() {
        counter++;
    }
}


class SharedResourceAtomic {

    // Have atomic Variable Instead of Primitive
    // Every thread will be Isolated -> Only one thread can access at a time

    // Ensures Atomicity without using Locks

    private AtomicInteger counter = new AtomicInteger(0);

    public int getCounter(){
        return counter.get();
    }

    public void incrementCounter(){
        counter.incrementAndGet();
    }

}

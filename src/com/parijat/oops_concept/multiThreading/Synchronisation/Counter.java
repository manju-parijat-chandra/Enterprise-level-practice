package com.parijat.oops_concept.multiThreading.Synchronisation;

public class Counter {

    private int count = 0;

    // Critical section
    public synchronized void increment()
    {
        // Synchronize the Critical Block.
//        synchronized (this) {
//            count++;
//        }

        // *** Or *** -> Method itself
        count++;
    }

    public int getCount(){
        return count;
    }

}

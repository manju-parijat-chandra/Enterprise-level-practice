package com.parijat.oops_concept.multiThreading.Synchronisation;

public class Test {

    public static void main(String[] args) {

        // Create Object of Counter Class -> Initial count Value = 0
        Counter counter = new Counter(); // One Object is Shared by Both thread Below

        // Create 2 Thread which will be sharing the same Resource -> counter -> Object of Counter
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);

        t1.start(); // Increase count 1000 times
        t2.start(); // Increase count 1000 times

        // Once Both threads are finished
        // Total increment should be 2000 -> Ideal Condition

        // Pause main thread until all child threads are done
        try {
            // Both should Finish first
            t1.join();
            t2.join();
        }catch (Exception ignored){
        }

        System.out.println(counter.getCount());

        // Race Condition

        // Got 1768
        // Got 1858
        // Got 1727
        // Got 1675
        // Got 1955

        // Always Different count
        // Because Both Threads are running simultaneously
        // Both thread Read (103) same Count at a time And incremented by 1 to (104)  ==> in some cases.
        // so we are missing those count.

        // Solution -> Use synchronisation
    }
}

package com.parijat.oops_concept.multiThreading.threading;

public class Hello {
    public static void main(String[] args) {

        // Method 1

        World world = new World(); // New Thread

        world.start(); // Start Thread 1

        // Method 2

        Worlds worlds = new Worlds(); // New Runnable
        Thread t2 = new Thread(worlds); // Now thread is Generated

        t2.start(); // start Thread 2


        for (int i = 0; i < 100000 ; i++ ){
            System.out.println("Hello");
        }

        // main thread started thread 1 and thread 2.  (as main is starting point)
        // thread1 , thread2 and main thread are running Simultaneously.
    }
}

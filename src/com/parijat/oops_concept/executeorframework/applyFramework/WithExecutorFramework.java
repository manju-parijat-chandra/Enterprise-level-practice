package com.parijat.oops_concept.executeorframework.applyFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Executors is a Utility class

public class WithExecutorFramework {
    public static void main(String[] args) {

        // Standard millisecond time
        long startTime = System.currentTimeMillis(); // Since 1st Jan 1970 -> Total Milliseconds till present

        // Executors.newSingleThreadExecutor(); // Single Thread
        ExecutorService executor = Executors.newFixedThreadPool(3); // Creating Pool of Threads.
        // if Thread is lesser than task -> Thread will be reused

        // With the help of executor service we do all our Task
        // Whatever we were doing with Threads will be Handled by executor service

        for (int i = 1; i < 10; i++) {
            // Now we do Multithreading
            int finalI = i; // Should take variables that are constant for this single process

            // Pass runnable object to submit .. Like we were doing with threads
            executor.submit(() -> {
                long result = factorial(finalI); // Effectively Final
                System.out.println(result);
            });

        }
        // If we do not need threads for other task then shutdown.
        executor.shutdown(); // Need to shut down Manually. Otherwise, it'll keep running
        // Orderly Shutdown started
        // Can't Submit anything anymore

        // ** Main thread doesn't wait for Shutdown to finish

        // *********** Limited wait *************
        // Pause main for fixed Time -> if Work is done then Ok otherwise Move Ahead
//        try {
//            executor.awaitTermination(100, TimeUnit.SECONDS);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // for Unlimited Wait Time
        try {
            while (!executor.awaitTermination(300, TimeUnit.MILLISECONDS)){ // Returns false Until work done and ready to Terminate
            System.out.println("Waiting...");}

        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Calculate Time Taken
        System.out.println("Time taken To Execute is :- " + (System.currentTimeMillis() - startTime));
    }

    public static int factorial(int num) {

        try {
            Thread.sleep(1000); // To pretend like we have to do soo much computation
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int fact = 1;
        while (num > 1) {
            fact *= num--;
        }
        return fact;
    }
}
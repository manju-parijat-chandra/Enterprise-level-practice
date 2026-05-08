package com.parijat.oops_concept.executeorframework;

public class Main {
    public static void main(String[] args) {

        // Standard millisecond time
        long startTime = System.currentTimeMillis(); // Since 1st Jan 1970 -> Total Milliseconds till present
        Thread[] threads = new Thread[9]; // Number of threads -> No reusing of Threads

        for (int i = 1; i < 10; i++){
            // Now we do Multithreading
            int finalI = i; // Should take variables that are constant for this single process
            // as i is changing fast . we might get error
            threads[i-1] = new Thread(() -> {long result = factorial(finalI); // Effectively Final
                System.out.println(result);});
            threads[i-1].start();
        }

        // Wait for all the thread to be finished
        for (Thread thread : threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        // Calculate Time Taken
        System.out.println("Time taken To Execute is :- " + (System.currentTimeMillis() - startTime));
    }

    public static int factorial(int num){

        try {
            Thread.sleep(1000); // To pretend like we have to do soo much computation
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        int fact = 1;
        while (num > 1){
            fact *= num--;
        }
        return fact;
    }
}

package com.parijat.oops_concept.executeorframework;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class WithExecutorParent {
    public static void main(String[] args) {

        Executor executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i < 10; i++){
            int fInal = i;
            executor.execute(() -> {
                long result = factorial(fInal);
                System.out.println(result);
            });
        }

        // Directly Executing The Thread
        // Don't have Control -> Can't Shut down the thread Pool from executing

        // *** ExecutorService is Providing more Features to Operate by Extending Executor

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

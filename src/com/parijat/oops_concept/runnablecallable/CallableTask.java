package com.parijat.oops_concept.runnablecallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTask {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor(); // Returns ExecutorService Object

        Future <?> future = executor.submit(() -> {
            String output = "Output of Thread";
            System.out.println("Completed Execution");
            return output;
        });

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executor.shutdown();
    }
}

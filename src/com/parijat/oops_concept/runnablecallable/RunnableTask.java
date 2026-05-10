package com.parijat.oops_concept.runnablecallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableTask {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor(); // Returns ExecutorService Object

        Future <?> future = executor.submit(() -> System.out.println("Runnable Without Result Message.."));

        try {
            System.out.println(future.get()); // No message but it can be used to pause execution on main until thread executes
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
    }
}

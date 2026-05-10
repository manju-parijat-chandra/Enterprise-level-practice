package com.parijat.oops_concept.runnablecallable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class RunnableWithMessageTask {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor(); // Returns ExecutorService Object

        Future <?> future = executor.submit(() -> System.out.println("Hello There"), "Success.. , Can be Any Datatype");

        try {
            System.out.println(future.get()); // Get the message
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        executor.shutdown();
    }


}

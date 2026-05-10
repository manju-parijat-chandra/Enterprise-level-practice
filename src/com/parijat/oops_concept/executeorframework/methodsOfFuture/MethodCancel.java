package com.parijat.oops_concept.executeorframework.methodsOfFuture;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MethodCancel {

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(1);

        Future <Integer> future = service.submit(() -> {
                    System.out.println("Task Completed");

                    Thread.sleep(2000);

                    return 1;
                });

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        future.cancel(true); // Task must be canceled doesn't matter if the task is running or in a queue

        // future.cancel(false); // Cancel only if not running , // DO NOT interrupt
        System.out.println(future.isCancelled()); // Task keeps running in background until it finishes or throw error
        System.out.println(future.isDone());
        service.shutdown();
    }
}

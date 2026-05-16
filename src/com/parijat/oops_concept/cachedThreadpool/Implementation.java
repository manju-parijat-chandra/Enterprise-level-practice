package com.parijat.oops_concept.cachedThreadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Implementation {
    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool(); // Dynamically Adjust Pool Size
        // Create and Destroy Thread according to Requirement / Need / Variable Load (Short Lived)
        // Terminate if inactive for 60 seconds
        // !!! Risk as it can create too many thread. no limitation

        Future<?> future = service.submit(() -> System.out.println("new Cached thread pool"));

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        service.shutdown();
    }
}

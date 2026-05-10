package com.parijat.oops_concept.executeorframework.methodsOfFuture;

import java.util.concurrent.*;

public class InvokeAllTask {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newSingleThreadExecutor();

        // Returns object of FutureTask Object (represents the result of that asynchronous task)
        Future <Integer> future = service.submit(() -> 1+2);


        System.out.println(future.get());

        service.shutdown(); // Starts Shutdown but Doesn't Shut down instantly
        Thread.sleep(1); // Needed as Shutdown should be finished
        System.out.println(service.isTerminated()); // Returns true only if everything is Terminated
                                                    // Even Shutting Down

    }
}

package com.parijat.oops_concept.executeorframework;

import java.util.Calendar;
import java.util.concurrent.*;

public class WithFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Generate Thread
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Runnable runnable = () -> System.out.println("Hello"); // Returns Void
        Callable <?> callable = () -> {System.out.println("Hello"); return "not_null";}; // Requires Return

        Future<?> futureRun = executorService.submit(runnable);
        Future<?> futureCall = executorService.submit(callable);

        System.out.println(futureRun.get()); // Null since Void is returned
        System.out.println(futureCall.get()); // Can return any Datatype

        executorService.shutdown();
    }
}

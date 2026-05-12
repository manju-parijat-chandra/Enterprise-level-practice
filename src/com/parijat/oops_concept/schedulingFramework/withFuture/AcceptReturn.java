package com.parijat.oops_concept.schedulingFramework.withFuture;

import java.util.concurrent.*;

public class AcceptReturn {

    public static void main(String[] args) {

        // Only schedule() -> scheduled with delay can return Result. (as it can accept both callable and runnable.
        // scheduleAtFixedRate , scheduleWithFixedDelay ONLY ACCEPT ** RUNNABLE TASK **

        /* If you need to "return" data from a periodic task,
        you usually update a shared variable (like an AtomicReference or a ConcurrentHashMap)
        inside the task instead of trying to return it through the Future. */

        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();

        ScheduledFuture<?> future = service.schedule(() -> System.out.println("Task with scheduled delay"),1, TimeUnit.SECONDS);

        try {
            System.out.println(future.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        ScheduledFuture <String> future1 = service.schedule(() -> {
            System.out.println("Periodic Task with initial delay");
            return "Periodic Task";
            },
                    2,
                    TimeUnit.SECONDS
        );

        // .get() Pause the main thread as it requires to fetch output of scheduled task.

        try {
            System.out.println(future1.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Initializing Shutdown...");

        service.shutdown();

    }
}

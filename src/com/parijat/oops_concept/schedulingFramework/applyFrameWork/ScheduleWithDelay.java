package com.parijat.oops_concept.schedulingFramework.applyFrameWork;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Demonstrates the ScheduledExecutorService lifecycle, focusing on
 * the critical differences between Fixed Rate and Fixed Delay scheduling.
 */
public class ScheduleWithDelay {

    public static void main(String[] args) {

        /*
         * 1. INITIALIZATION:
         * We create a pool with ONE worker thread.
         * Note: In a single-threaded pool, tasks cannot run in parallel.
         * If one task is "sleeping," the entire pool is blocked.
         */
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        /*
         * 2. ONE-SHOT TASK:
         * Standard delayed execution. Executes once after 1 second.
         */
        scheduler.schedule(() -> System.out.println("--- One-shot Task: Executing after 1s ---"),
                1,
                TimeUnit.SECONDS);

        /*
         * 3. PERIODIC TASK (FIXED RATE):
         * Logic: "Start a new execution every 1 second, regardless of when the last one ended."
         * Reality: Since the task takes 10s and we only have 1 thread, the executions
         * will actually start back-to-back as soon as the thread becomes free.
         */
        scheduler.scheduleAtFixedRate(() -> {
                    try {
                        System.out.println("Fixed Rate Task: Starting (10s work)...");
                        Thread.sleep(10000);
                        System.out.println("Fixed Rate Task: Finished.");
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                },
                1, 1, TimeUnit.SECONDS);

        /*
         * 4. PERIODIC TASK (FIXED DELAY):
         * Logic: "Wait for 1 second AFTER the previous execution has fully finished."
         * This creates a gap between tasks. If the task takes 10s and the delay is 1s,
         * the total cycle time is 11 seconds.
         */
        scheduler.scheduleWithFixedDelay(() -> {
            try {
                System.out.println("Fixed Delay Task: Starting (2s work)...");
                Thread.sleep(2000);
                System.out.println("Fixed Delay Task: Finished. Now waiting 1s before next start.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }, 1, 1, TimeUnit.SECONDS);

        /*
         * 5. GRACEFUL SHUTDOWN TASK:
         * Scheduled for 2 seconds. It won't kill the running 10s task immediately,
         * but it prevents the scheduler from starting *new* periodic cycles.
         */
        scheduler.schedule(() -> {
            System.out.println("Shutdown Task: Initiating scheduler shutdown...");
            scheduler.shutdown();
        }, 2, TimeUnit.SECONDS);

        /*
         * 6. MAIN THREAD KEEP-ALIVE:
         * Keeps the JVM alive long enough to see the logs.
         */
        try {
            System.out.println("Main Thread: Waiting 20s to observe behavior...");
            Thread.sleep(20000);
            System.out.println("Main Thread: Done.");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("End of main Thread");
    }
}

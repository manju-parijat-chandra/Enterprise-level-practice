package com.parijat.oops_concept.countdownLatch;

import java.util.concurrent.*;

public class UsingExecutorService {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        ExecutorService service = Executors.newFixedThreadPool(3);
//
//        Future<String> future1 =  service.submit(new DependentService());
//        Future<String> future2 = service.submit(new DependentService());
//        Future<String> future3 = service.submit(new DependentService());
//
//        future1.get();
//        future2.get();
//        future3.get();
//
//        System.out.println("All dependent service finished. Starting main Thread.. ");
//        service.shutdown();

        // ********* Using Latch to simplify tedious task ***********

        int numberOfService = 3;

        ExecutorService service = Executors.newFixedThreadPool(numberOfService);

        // number of threads for which we need to pause main thread until their completion
        CountDownLatch latch = new CountDownLatch(numberOfService);  // No of Threads or operation is passed

        service.submit(new DependentService(latch));
        service.submit(new DependentService(latch));
        service.submit(new DependentService(latch));


        latch.await(); // UsingExecutorService method waits until Every execution if completed

        // latch.await(5000,TimeUnit.MILLISECONDS);

        System.out.println("UsingExecutorService Started");

        // service.shutdownNow() -> Doesn't matter if the thread was still running in background.
        // It will be stopped
        service.shutdown();


    }
}
class DependentService implements Callable<String>{

    private final CountDownLatch latch;  // Should not be reassigned

    public DependentService(CountDownLatch latch){
        this.latch = latch;
    }

    @Override
    public String call() throws Exception {

        // Good Practice to Keep it in try and finally block

        // At the end countdown should be updated , even if any exception

        try{
            System.out.println(Thread.currentThread().getName() + " Service Started. ");
            Thread.sleep(2000);
        }finally {
            latch.countDown();
        }
        return "ok";
    }
}
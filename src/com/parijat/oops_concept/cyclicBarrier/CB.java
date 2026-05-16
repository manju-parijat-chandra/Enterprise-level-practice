package com.parijat.oops_concept.cyclicBarrier;

import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CB {
    public static void main(String[] args) {

        int noOfService = 3;
        CyclicBarrier barrier = new CyclicBarrier(noOfService);

        ExecutorService service = Executors.newFixedThreadPool(noOfService);

        service.submit(new DependentServices(barrier));
        service.submit(new DependentServices(barrier));
        service.submit(new DependentServices(barrier));


        // Cyclic Barrier Doesn't block main thread
        System.out.println("Main thread started..");

        service.shutdown();

        barrier.reset(); // Unlike Latch, we can reset.

    }
}

class DependentServices implements Callable<String> {

    private final CyclicBarrier barrier;

    public DependentServices(CyclicBarrier barrier){
        this.barrier = barrier;
    }

    @Override
    public String call() throws Exception {

        System.out.println(Thread.currentThread().getName() + " Service Started");
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " is Waiting at the Barrier...");
        barrier.await(); // Dormant until all Thread comes at the Barrier
        return "ok";
    }
}

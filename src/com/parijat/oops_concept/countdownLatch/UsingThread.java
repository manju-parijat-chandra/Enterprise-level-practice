package com.parijat.oops_concept.countdownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class UsingThread {

    public static void main(String[] args) throws InterruptedException {

        int noOfServices = 3;

        CountDownLatch latch = new CountDownLatch(noOfServices);

        for (int i = 0; i < noOfServices; i++){
            new Thread(new DependentServices(latch)).start(); // Created a new thread and Started
        }

        // Long wait until Thread complete its execution
        // latch.await();

        latch.await(5000, TimeUnit.MILLISECONDS); // Timed Waiting -> Thread will keep running in background
                                                            // If extra time needed
        // Wait only till 5 second Then Run Main Thread
        System.out.println("Main Thread Started");
    }
}

class DependentServices implements Runnable{

    private final CountDownLatch latch;

    DependentServices(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(6000);
            System.out.println(Thread.currentThread().getName() + " Service Started");
        }catch (Exception e){
            System.out.println(Thread.currentThread().getName() + " Caught Exception " + e);
        }finally {
            latch.countDown();
        }
    }
}

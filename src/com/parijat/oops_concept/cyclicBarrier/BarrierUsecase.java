package com.parijat.oops_concept.cyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarrierUsecase {

    public static void main(String[] args) {

        int noOfSubSystem = 4;


        // Last thread will complete this Barrier Action
        CyclicBarrier barrier = new CyclicBarrier(noOfSubSystem, new Runnable() {
            @Override
            public void run() {
                // Barrier await Reached then Print
                // i.e -> all Thread have reached at the Barrier
                System.out.println("All Sub-Systems are up and Running. System startup complete");
            }
        });

        Thread webServerThread = new Thread(new SubSystem("Web Server", 1000, barrier));
        Thread databaseThread = new Thread(new SubSystem("Database", 2000, barrier));
        Thread cacheThread = new Thread(new SubSystem("Cache", 3000, barrier));
        Thread messagingServiceThread = new Thread(new SubSystem("Messaging Service", 4000, barrier));


        webServerThread.start();
        databaseThread.start();
        cacheThread.start();
        messagingServiceThread.start();
    }
}

class SubSystem implements Runnable{

    private CyclicBarrier barrier;
    private String name;
    private int initializationTime;

    public SubSystem(String name, int initializationTime, CyclicBarrier barrier){
        this.name = name;
        this.initializationTime = initializationTime;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " Initialization Started.");
            Thread.sleep(initializationTime);
            System.out.println(name + " initialization Completed.");
            barrier.await();
        }catch (InterruptedException | BrokenBarrierException e){
            e.printStackTrace();
        }
    }
}
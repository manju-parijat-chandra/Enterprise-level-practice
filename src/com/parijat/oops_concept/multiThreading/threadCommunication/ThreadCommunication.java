package com.parijat.oops_concept.multiThreading.threadCommunication;

class SharedResources{
    private int data;
    private boolean hasData;

    // wait() and notify() can be used only if Synchronized
    public synchronized void produce(int value){
        while (hasData){
            try {
                wait(); // Data is already in Buffer so wait
            } catch (InterruptedException e) {
                // Restore the state if Interrupted
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced: " + value);
        notify(); // Notify Consumer to Consume data as it is Available
    }

    public synchronized void consume(){
        while(!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

        hasData = false; // As this data will be consumed by the consumer thread
        // Buffer will be Empty
        notify(); // Notify Producer to Produce Data as it is Consumed
        System.out.println(Thread.currentThread().getName() + " Consumed: " + data);
    }
}

class Producer implements Runnable{
    private SharedResources resources;

    public Producer(SharedResources resources){
        this.resources = resources;
    }

    @Override
    public void run() {
        for (int i = 0; i < 30; i++){
            resources.produce(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Consumer implements Runnable{
    private SharedResources resources;

    public Consumer(SharedResources resources){
        this.resources = resources;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            resources.consume();
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {
        SharedResources resources = new SharedResources();

        Thread producerThread = new Thread(new Producer(resources));
        Thread consumeThread1 = new Thread(new Consumer(resources), "Consumer Thread 1");
        Thread consumeThread2 = new Thread(new Consumer(resources), "Consumer Thread 2");
        Thread consumeThread3 = new Thread(new Consumer(resources), "Consumer Thread 3");

        producerThread.start();
        consumeThread1.start();
        consumeThread2.start();
        consumeThread3.start();

    }
}

// Without wait and notify            With wait and notify

//Produced: 0                       Produced: 0
//Consumed: 0                       Consumed: 0
//Produced: 1                       Produced: 1
//Produced: 2                       Consumed: 1
//Consumed: 2                       Produced: 2
//Produced: 3                       Consumed: 2
//Consumed: 3                       Produced: 3
//Produced: 4                       Consumed: 3
//Produced: 5                       Produced: 4
//Consumed: 5                       Consumed: 4
//Produced: 6                       Produced: 5
//Produced: 7                       Consumed: 5
//Consumed: 7                       Produced: 6
//Produced: 8                       Consumed: 6
//Produced: 9                       Produced: 7
//Consumed: 9                       Consumed: 7
//Consumed: 9                       Produced: 8
//Consumed: 9                       Consumed: 8
//Consumed: 9                       Produced: 9
//Consumed: 9                       Consumed: 9
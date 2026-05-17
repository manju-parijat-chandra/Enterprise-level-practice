package com.parijat.oops_concept.volatileAtomic;

// Only for simple usage -> Like flag -> where we are only dealing with State
// For complex usage This will not work
// As it let multiple thread read at a time  -> Solution Atomicity

public class VolatileExample {

    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread writerThread  = new Thread(() -> {
            try {
                Thread.sleep(1000);  // To make Reader Thread get Stuck in loop
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); // Restore its state
            }
            resource.setFlagTrue();}
        );
        Thread readerThread = new Thread(resource::getFlag);

        writerThread.start();
        readerThread.start();

        // Every Thread store Variables value in its own cache for performance
        // To make them read from Main memory every time it require any Value -> Change that Variable to Volatile
    }

}

class SharedResource{

    // Every thread is forced to read from main memory ** Rather than Reading from local Cache **
    private volatile boolean flag = false;

    public void getFlag(){
        while (!flag){
            // Do nothing
        }
        System.out.println("Flag is True");
    }

    public void setFlagTrue(){
        System.out.println("Writer thread made the Flag True..");
        flag = true;
    }
}

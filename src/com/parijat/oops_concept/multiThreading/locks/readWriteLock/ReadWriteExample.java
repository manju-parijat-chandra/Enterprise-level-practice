package com.parijat.oops_concept.multiThreading.locks.readWriteLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteExample {

    private int count = 0;

    // ReentrantReadWrite has both method *** Read and Write *** (Locks)
    private final ReentrantReadWriteLock readWrite = new ReentrantReadWriteLock(false);

    // Make Two Locks -> for read and write process
    private final Lock readLock = readWrite.readLock();
    private  final Lock writeLock = readWrite.writeLock();

    // Write Operation
    public void increment(){
        // System.out.println(Thread.currentThread().getName() + " Is Trying to Put Lock for ** Write ** Operation");
        writeLock.lock(); // Lock the resources
        // System.out.println(Thread.currentThread().getName() + " has Acquired the write lock");
        try {
            count++;
            // System.out.println("Incrementation completed !!");
            Thread.sleep(50);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            //System.out.println(Thread.currentThread().getName() + " Finished Incrementing , releasing Resource");
            writeLock.unlock(); // Release the resources
        }
    }

    // Read Operation
    public int getCount(){
        // System.out.println(Thread.currentThread().getName() + " Is Trying to Put Lock for ** Read ** Operation");
        readLock.lock(); // Lock The resources
        // System.out.println(Thread.currentThread().getName() + " has Acquired the read lock");
        try {
            // System.out.println("Current count is " + count);
            return count;
        }finally {
            // System.out.println(Thread.currentThread().getName() + " Finished Reading , releasing Resource");
            readLock.unlock(); // Release the Resources
        }
    }

}

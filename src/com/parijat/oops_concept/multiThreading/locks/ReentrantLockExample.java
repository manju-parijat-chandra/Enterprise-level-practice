package com.parijat.oops_concept.multiThreading.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {

    private final Lock lock = new ReentrantLock();

    public void outerMethod(){
        // Thread will lock the Resource
        lock.lock();

        try {
            System.out.println("Outer Method");
            innerMethod();
            // System.out.println(Thread.currentThread().getName());
        }finally {
            lock.unlock();
        }
    }

    private void innerMethod() {
        // Again thread is Locking the resource
        lock.lock();
        try {
            System.out.println("Inner Method");
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantLockExample example = new ReentrantLockExample();

        // Main thread is Running Outer method
        example.outerMethod();
        example.outerMethod();
        example.outerMethod();
    }
}

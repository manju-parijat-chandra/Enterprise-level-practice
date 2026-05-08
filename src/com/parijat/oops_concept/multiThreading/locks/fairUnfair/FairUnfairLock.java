package com.parijat.oops_concept.multiThreading.locks.fairUnfair;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairUnfairLock {

    private final Lock fairUnfair = new ReentrantLock(true);

    public void accessResource(){
        fairUnfair.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " acquired the lock" );
            Thread.sleep(100);
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }finally {
            System.out.println(Thread.currentThread().getName() + " has Released the Lock");
            fairUnfair.unlock(); // Must be the last statement
        }
    }

}

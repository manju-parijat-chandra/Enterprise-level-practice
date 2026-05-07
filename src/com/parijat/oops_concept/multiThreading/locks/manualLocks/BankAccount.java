package com.parijat.oops_concept.multiThreading.locks.manualLocks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {

    private int balance = 100;

    // Create Object of Lock Interface with the help of ReentrantLock
    private final Lock lock = new ReentrantLock(); // It's  like a Key kept outside the door

    public void withdrawAmount(int amount){
        System.out.println(Thread.currentThread().getName() + " attempting to withdraw " + amount);
        try{
            if(lock.tryLock(2, TimeUnit.MILLISECONDS)){ // Trying to check if key is available
                // Since Key was available Open the door enter and close the door to do your work
                // No one can access the room (Resource)
                if(amount <= balance){
                    try {
                        System.out.println(Thread.currentThread().getName() + " Started Processing of withdrawal");
                        Thread.sleep(1); // Interruption Exception
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " has Withdrawn " + amount);
                    }catch (InterruptedException e){
                        Thread.currentThread().interrupt(); // Good Practice to let other threads know as it was interrupted
                    }finally {

                        if(Thread.currentThread().isInterrupted()){
                            System.out.println(Thread.currentThread().getName() + " Was Interrupted");
                        }

                        lock.unlock(); // Leave the key outside so that other can use the room (resource)
                    }
                }else {
                    System.out.println("Sorry "+ Thread.currentThread().getName() + " Not enough balance to withdraw amount " + amount);
                }
            }else{ // Door is locked and key is not there
                System.out.println(Thread.currentThread().getName() + " couldn't acquire the lock, will try later");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // good Practice as it tells Other thread that this thread was interrupted
        }
        if(Thread.currentThread().isInterrupted()){
            System.out.println(Thread.currentThread().getName() + " Was Interrupted");
        }
    }
}

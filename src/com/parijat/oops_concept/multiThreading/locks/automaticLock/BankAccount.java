package com.parijat.oops_concept.multiThreading.locks.automaticLock;

public class BankAccount {
    private int balance = 100;


    // Critical section
    // All thread is sharing same resource and updating simultaneously

    public synchronized void withdrawMoney(int amount){

        System.out.println(Thread.currentThread().getName() + " is Attempting to Withdraw " + amount + " from " +balance);
        if(amount <= balance){

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Has Withdrawn " + amount);
        }else {
            System.out.println("Sorry " + Thread.currentThread().getName() + " has no money to withdraw");
        }
    }
}

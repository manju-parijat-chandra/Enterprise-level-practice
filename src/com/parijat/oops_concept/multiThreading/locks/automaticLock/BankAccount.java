package com.parijat.oops_concept.multiThreading.locks.automaticLock;

public class BankAccount {
    private int balance = 100;


    // Critical section
    // All thread is sharing same resource and updating simultaneously

    public synchronized void withdrawMoney(int amount){
        if(amount <= balance){
            try {
                Thread.sleep(1);
            }catch (Exception e){

            }
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " Has Withdrawn " + amount);
        }else {
            System.out.println("Sorry " + Thread.currentThread().getName() + " has no money to withdraw");
        }
    }
}

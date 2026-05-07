package com.parijat.oops_concept.multiThreading.locks.automaticLock;

public class Test {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        // Create anonymous class of Runnable Interface
        Runnable task = new Runnable() {
            @Override
            public void run() {
                acc.withdrawMoney(50);
            }
        };

        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        Thread t3 = new Thread(task,"Thread 3");
        Thread t4 = new Thread(task,"Thread 4");
        Thread t5 = new Thread(task,"Thread 5");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();


        // ****** Race Condition ******
        // Without synchronization -> all thread withdrawn 250 in total even though we had only 100 bucks

//        Thread 3 is Attempting to Withdraw 50 from 100
//        Thread 5 is Attempting to Withdraw 50 from 100
//        Thread 2 is Attempting to Withdraw 50 from 100
//        Thread 1 is Attempting to Withdraw 50 from 100
//        Thread 4 is Attempting to Withdraw 50 from 100
//        Thread 3 Has Withdrawn 50
//        Thread 4 Has Withdrawn 50
//        Thread 5 Has Withdrawn 50
//        Thread 1 Has Withdrawn 50
//        Thread 2 Has Withdrawn 50

        // Solution is ** Synchronisation ** of Critical Section

//        Thread 1 is Attempting to Withdraw 50 from 100
//        Thread 1 Has Withdrawn 50
//        Thread 5 is Attempting to Withdraw 50 from 50
//        Thread 5 Has Withdrawn 50
//        Thread 4 is Attempting to Withdraw 50 from 0
//        Sorry Thread 4 has no money to withdraw
//        Thread 3 is Attempting to Withdraw 50 from 0
//        Sorry Thread 3 has no money to withdraw
//        Thread 2 is Attempting to Withdraw 50 from 0
//        Sorry Thread 2 has no money to withdraw

        // Only Two thread is able to withdraw the money. -> Correctly executed

        // Once a thread access critical section -> It put Lock so that no other Thread can access
        // Automatically lock and unlocks are managed by JVM

        // We can't Control which one should lock first and which one should not

        // *** Solution manual lock and unlock ***
    }
}

package com.parijat.oops_concept.multiThreading.locks.automaticLock;

public class WithdrawTask implements Runnable{
    private BankAccount acc;

    public WithdrawTask(BankAccount acc){
        this.acc = acc;
    }

    @Override
    public void run(){
        acc.withdrawMoney(50);
    }
}

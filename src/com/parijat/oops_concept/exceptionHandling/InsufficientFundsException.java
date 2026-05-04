package com.parijat.oops_concept.exceptionHandling;

// Custom Exception

public class InsufficientFundsException extends Exception{
    private double amount;
    public InsufficientFundsException(double amount)
    {
        super("You don't have Enough funds !!!");
        this.amount = amount;
    }

    public void excessAmount(){
        System.out.printf("Need to add %.2f", amount);
        System.out.println();
    }

}

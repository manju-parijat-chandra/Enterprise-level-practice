package com.parijat.oops_concept.innerClasses.anonymousInnerClass;

public class Cash implements Payment{

    @Override
    public void pay(double amount) {
        System.out.println("Paid : " + amount + " in Cash.");
    }
}

package com.parijat.oops_concept.innerClasses.anonymousInnerClass;

public class CreditCard implements Payment{

    private String creditCardNumber;
    private int creditCardPin;

    public CreditCard(String creditCardNumber, int creditCardPin){
        this.creditCardNumber = creditCardNumber;
        this.creditCardPin = creditCardPin;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " Using Credit Card");
    }
}

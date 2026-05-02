package com.parijat.oops_concept.innerClasses.anonymousInnerClass;

public class ShoppingCart {

    private double totalAmount;

    public ShoppingCart(double totalAmount){
        this.totalAmount = totalAmount;
    }

    public void processPayment(Payment paymentMethod){ // Allowed to take Reference.

        // Call pay method To Complete the payment
        paymentMethod.pay(totalAmount);
    }
}

package com.parijat.oops_concept.innerClasses.anonymousInnerClass;

public class Test {


    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart(150);

        CreditCard creditCard = new CreditCard("12341234", 1234);

        // Can't create Object of Interface (Payment).... so ->
        // need a class that Implements Payment Interface
        shoppingCart.processPayment(creditCard);

        // With this we can have Multiple payment method supported By our Application
        Cash cash = new Cash();
        shoppingCart.processPayment(cash);


        // ************ Creating Anonymous Class ***********

        // No need to create separate CreditCard class
        // Instantiated and Defined Together Below....
        // Payment type object is *** Parsed *** of implementation class Payment

        // On the Fly written Implementation of payment -> And Created an Object -> And Passed the Object
        // Everything Done at Once.

        ShoppingCart newcart = new ShoppingCart(200);

        newcart.processPayment(new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " Using Credit card");
            }
        });

        // *********** One Time Use *************
        // Created Object -> Passed Object  ( Both at same Place )

        newcart.processPayment((new Payment() {
            @Override
            public void pay(double amount) {
                System.out.println("Paid " + amount + " Using GPay");
            }
        }));

    }



}

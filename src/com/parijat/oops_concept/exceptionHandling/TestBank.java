package com.parijat.oops_concept.exceptionHandling;

public class TestBank {
    public static void main(String[] args) throws Exception {

        Bank account1 = null;

        try {
            account1 = new Bank("Parijat", 20, "Patna", "12345");
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
        System.out.println(account1); // Prints address where actual object is stored
        // account1 is a reference variable of type BANK.

        account1.depositeAmount(100);

        // Custom EXCEPTION
        try {
            account1.withdrawAmount(200);
        }catch (InsufficientFundsException e){
            System.out.println(e);
            // Custom Exception and Method -> Provides Flexibility
            e.excessAmount();
        }


        account1.getBalance();

        Bank acc = null;

        try {
            acc = new Bank("Nishitha", 5, "Hyderabad", "2345");
        }catch (IllegalArgumentException e){
            System.out.println(e);
        }
        try {
            acc.withdrawAmount(20);
        }catch (Exception e){
            System.out.println(e);
        }


    }
}

package com.parijat.oops_concept.exceptionHandling;

public class Bank{

    private String name;
    private int age;
    private String address;
    private String accountNumber;
    private double balance;

    public Bank(String name, int age, String address, String accountNumber) {
        // Only Throw -> Do not Put try and catch in Constructor
        // If so We will end up initializing partially

        if(age < 18){
            System.out.println("Invalid Age");
            throw new IllegalArgumentException("Create Dependent Account");
        }

        this.name = name;
        this.age = age;
        this.address = address;
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        System.out.println("Account Creation Successful");

    }
    public void getDetails(){
        System.out.printf("Account number %s belongs to %s from %s",accountNumber, name, address);
        System.out.println();
    }
    public void getBalance(){
        System.out.printf("Account number %s has %.2f Amount", accountNumber, balance);
        System.out.println();
    }

    public void depositeAmount(double amount) throws IllegalArgumentException{
        if(amount > 0){
            balance = balance + amount;
            System.out.printf("%.2f is Success Fully Deposited.", amount);
            System.out.println();
        }else {
            throw new IllegalArgumentException();
        }
    }

    public void withdrawAmount(double amount) throws InsufficientFundsException{
        if(balance > amount){
            balance -= amount;
            System.out.printf("Transaction for %.2f is successful", amount);
            System.out.println();
        }else {
            throw new InsufficientFundsException(amount-balance);
        }
    }

}

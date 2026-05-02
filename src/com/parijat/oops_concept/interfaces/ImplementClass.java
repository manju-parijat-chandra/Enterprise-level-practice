package com.parijat.oops_concept.interfaces;

// Implementing Both Interfaces
public class ImplementClass implements Utility, As_interface{

    @Override
    public void watchTime() {
        System.out.println("Abstract Methods Overridden");
    }

    @Override
    public int sum(int a, int b) {
        return Utility.super.sum(a, b);
    }

    @Override
    public void sum() {

    }

    @Override
    public void mul() {

    }

    public void classname(){
        System.out.println("implement child class");
    }

}

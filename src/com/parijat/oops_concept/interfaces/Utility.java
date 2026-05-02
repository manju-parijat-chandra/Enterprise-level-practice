package com.parijat.oops_concept.interfaces;

// Pure Abstraction Is achieved -> Since concrete methods are not allowed
// Multiple Inheritance is Possible -> Child Can implement multiple Interfaces

public interface Utility {

    // public static final  -> By Default  -> Static Constants
    double pi = 3.14;
    int lifeSpan = 20;
    // Utility.pi; -> Direct


    // public abstract  -> By default  -> Abstract Methods
    void watchTime();
    // Body will be written in every class that implements this interface

    // Static methods
    // Used to print information about this Interface

    static void info(){
        System.out.println("Print Details of this interface");
    }

    // Can have Default methods onluy  -> Regular methods (with body) Not allowed
    default int sum(int a, int b){
        return a+b;
    }

}

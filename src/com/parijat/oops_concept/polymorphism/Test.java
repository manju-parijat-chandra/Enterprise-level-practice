package com.parijat.oops_concept.polymorphism;

import java.lang.ref.Reference;

public class Test {

    public static void main(String[] args) {

        // ********* Method Overloading *********

        // Reference Variable is Of Child Class
        Dog sheru = new Dog("Sheru", 5);

        sheru.sayHello();
        System.out.println();

        // Reference Variable is Of Parent Class
        // Run Time Polymorphism
        Animal dobi = new Dog("Dobi", 7);

        dobi.sayHello(); // At Run Time JVM decided whether to run Parent method or child method
        System.out.println();

        // ********* Method Overriding ************
        // Compile Time Polymorphism
        // Passing Parameter
        Dog kalu = new Dog("Kalu", 6);
        kalu.sayHello(false); // At Compile Time it is decided that which Method should Run
                                            // (with parameter or without Parameter)
    }
}

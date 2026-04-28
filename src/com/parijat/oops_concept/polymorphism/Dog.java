package com.parijat.oops_concept.polymorphism;

public class Dog extends Animal{

    // Initialize instance Variables
    public Dog(String name, int age) {
        super(name, age);
    }


    // Run Time Polymorphism is Achieved by Method Overriding.
    // Same Method Signature But Different Body.
    @Override
    public void sayHello(){
        System.out.println("Woof.. Woof...");
    }
}

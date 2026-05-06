package com.parijat.oops_concept.oopsPillars.abstraction;

public class Dog extends Animal{
    // We need to Write abstract function's Body !!!
    @Override
    public void sayHello() {
        System.out.println("Woof..");
    }

    public void sleep(){
        System.out.println("zzzzz!!");
    }
}

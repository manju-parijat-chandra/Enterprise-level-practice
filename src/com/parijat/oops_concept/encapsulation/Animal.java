package com.parijat.oops_concept.encapsulation;

public class Animal {
    // Public -> AnyWhere
    // Private -> Only this Class
    // Protected -> Child Class

    public String name;
    private int age;
    protected int speed;

    public Animal(String name, int age, int speed){
        this.name = name;
        this.age = age;
        this. speed = speed;
    }

    public void eat(){
        System.out.println("nom nom nom .... Finished !!!");
    }
}

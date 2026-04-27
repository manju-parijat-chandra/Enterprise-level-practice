package com.parijat.oops_concept.encapsulation;

public class Dog {

    // Instance Variables as Private

    private String name;
    private int age;

    // Getters and Setters along with constructor (Public)

    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void increaseAge(int age){
        this.age += age;
    }

}

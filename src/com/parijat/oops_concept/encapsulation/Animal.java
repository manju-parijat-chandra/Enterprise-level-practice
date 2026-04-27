package com.parijat.oops_concept.encapsulation;

// How to Achieve Encapsulation  (Data Hiding -> Preventing Direct access)
// 1 -> Set Instance Variable as Private
// 2 -> Define Getter and Setter method as Public si that Changes can be made via these for an instance (object)

public class Animal {
    // Public -> AnyWhere
    // Private -> Only this Class
    // Protected -> Child Class

    public String name;
    private int age;
    protected int speed;
    private String sound;

    public Animal(String name, int age, int speed){
        this.name = name;
        this.age = age;
        this. speed = speed;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public void eat(){
        System.out.println("nom nom nom .... Finished !!!");
    }
}

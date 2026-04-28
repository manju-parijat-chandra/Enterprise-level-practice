package com.parijat.oops_concept.inheritance;

// Multi-Level Inheritance is Achieved
// Grand-Parent -> Parent -> Child

// Inheritance is Achieved by extending other class.
public class Dog extends Animal{
    // Specific Properties a Dog can have which differ it from other animal

    private String sound;
    private String breed;
    private boolean isPet;

    public Dog(
            int lifeSpan, int metabolismRate, String cellularStructure, boolean isAlive,
            String name, int age, String dietType, String movementType,
            String sound, String breed, boolean isPet){

        // Initializing Parent and Grand Parent First
        super(lifeSpan,metabolismRate,cellularStructure,isAlive,name,age,dietType,movementType);

        this.sound = sound;
        this.breed = breed;
        this.isPet = isPet;
    }

    // Method Overloading -> Different Signature of method but same name
    // Allow Missing Properties.
    public Dog(boolean isAlive, String name, int age, String sound){
        super(isAlive,name,age);
        this.sound = sound;
    }

    @Override
    // Method Overriding from Grand Parent
    // Same method Signature in both parent class and child class
    public String soundsLike(){

        // Can use Super Keyword for Calling Methods of Parent and GrandParent Class
        // Unlike Constructor -> Any Order is Acceptable Here

        super.imAlive();
        super.tellName();
        return sound;
    }
}

package com.parijat.oops_concept.inheritance;

// Hierarchical Inheritance (Dog, Cat -> Siblings)

public class Cat extends Animal{

    private String sound;
    private String breed;
    private boolean isPet;

    public Cat(int lifeSpan, int metabolismRate, String cellularStructure, boolean isAlive, String name, int age, String dietType, String movementType, String sound, String breed, boolean isPet) {
        // Parent and Grand Parents Properties
        super(lifeSpan, metabolismRate, cellularStructure, isAlive, name, age, dietType, movementType);

        this.sound = sound;
        this.breed = breed;
        this.isPet = isPet;

    }

    public Cat(boolean isAlive, String name, int age, String sound) {
        super(isAlive, name, age);
        this.sound = sound;
    }

    public String soundsLike(){
        return sound;
    }
}

package com.parijat.oops_concept.inheritance;

// Inheritance is Achieved by extending other class.
public class Animal extends Living_Organism{
    // Living_Organism -> Kept Properties that any living organism must have.
    // Animal -> General Properties among animals.

    private String name;
    private int age;

    private String dietType;
    private String movementType;

    public Animal(
            int lifeSpan, int metabolismRate, String cellularStructure, boolean isAlive,
            String name, int age, String dietType, String movementType){

        // Since we have Parametrized Constructor in Parent class we need to initialize those Parameter in here as well.
        // By super() -> constructor for Parent class -> Default --> super() -> hidden like default constructor

        // Always at the top of Parent class constructor.
        // Before Initializing Parent class properties we can't initialize child class properties
        super(lifeSpan, metabolismRate, cellularStructure, isAlive);

        // this Keyword -> States that we are talking about this particular instance.

        this.name = name;
        this.age = age;
        this.dietType = dietType;
        this.movementType = movementType;
    }

    // Not all Properties are important
    // Allowing some Missing values
    public Animal(boolean isAlive, String name, int age){
        super(isAlive);

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void tellName(){
        System.out.println("What is your name");
    }
}

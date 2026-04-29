package com.parijat.oops_concept.abstraction;
// Hiding Internal Details
// We can't Create Object (Instance) of an astract class.
// -> Since Abstract methods doesn't have body and without body it is of no use. (Makes no sense)

// Why ? Because This class contains General Methods that are common among animals
// But Every Animal has their Own way. So Methods must be Overridden By child class
// So that we do not miss The details of child class. (Will throw Error)

// Abstract -> Idea or Quality (Doesn't exist Physically). But Exist conceptually.
public abstract class Animal {
    private String type;
    private int age;

    // We can have Constructor of Abstract class to Initial setup.
    protected Animal(){ // We can't Create abject so it makes no sence to have Public Access Modifier
        this.type = "Animal";
        this.age = 100;
    } // Or Parametrized -> in this case we must pass Via super(String type, int age) Form Child class.


    // Abstract Method
    // Can be written in Abstract Class Only

    // We Write Abstract Methods in Parent class without Body.
    // We enforce these methods to be Overridden By Child classes.

    public abstract void sayHello(); // Only Definition , Body will be written in Child Class
    // It makes no sense to have Body Since Child class will have their Own way to Write this method
    // So we just declare here and force child class to Write the Body in its own way...

    // Abstract Class may have concrete methods But Normal Class can't have abstract methods.
    public void sayBy(){
        System.out.println("Byeeeee!!");
    } // Concrete method have Both -> ** (Definition and Body) **


}

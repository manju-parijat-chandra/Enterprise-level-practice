package com.parijat.oops_concept.interfaces;


// For Abstract class -> Child class had to extend Abstract class (only one at a time)
// For Interface -> Child class Implements interfaces (Multiple at a time)

// Class -> Blueprint for Generating Object
// Interface -> Blueprint for Creating class

// Abstract class is similar to Interface
// -> Child must Implement all the abstract methods (Write Body)
// -> Can't create Object of Abstract class

// Interface differ from Abstract class as
// -> Can't have Regular method (Concrete) in Interface But Abstract class can have Regular method


// So interface can only have Abstract Methods and Static Constants
// By Interface We can achieve  -> Multiple Inheritance  -> Pure Abstraction

public interface As_interface {

    // Can't have a constructor



    // **** Properties -> static constant ****

    // any variables are By Default public static final
    public static final int age = 0;

    // No need to write (public static final)
    int lifeSpan = 10;

    // Can be accessed Via Both
    // As_interface.age;   -> Direct
    // objDog.age;         -> via Object of class that implements this interface

    // **** Methods ****

    // Any method Declared In Interfaces are :-
    // ** By Default **  ==> public  & ==> abstract
    public abstract void sum();

    // without public abstract  -> same
    void mul();

    // These methods must have Body in Child class that implements this Interface

    // *** Can't have normal methods -> Unlike Abstract class

    // ********** In Java 8 Few Changes were Made ***********
    // Interface can have Static and Default Methods

    // very useful for Extracting Information about any Interface
    static void info(){
        System.out.println("Description and Details Of this Interface");
    }

    // Since Static we can Access this methods Without creating any Object.
    // As_Interface.info();
    // Dog.info() -> Not Allowed to access via Child class

    // *** Important use case is Utils class ***  -> No need to create Object of Utils
    // Also no class would like to Implement

    // Check utils Interface

}

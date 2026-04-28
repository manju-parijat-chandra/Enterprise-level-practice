package com.parijat.oops_concept.encapsulation;

public class Dog {

    // Instance Variables as Private

    private String name;
    private int age;

    // Getters and Setters along with constructor (Public)


    // void return type since setters sets the value. doesn't return anything.
    // nothing if constructor.
    // Constructor -> Special Method Used to Initialize the Declared Properties (name, age) -> works as setter
    // Default constructor -> Hidden and present in class. That's why we do = new Dog() <- calls default constructor
    //                        Default constructor set Default values to our properties.
    //                        Helps in creating Object with Default values. (Assign space in heap memory)
    //               Like -> int -> 0, float -> 0.0, String -> null, boolean -> false.
    // Parametrize constructor -> We Overload Default Constructor, To initialize Properties via constructor
    //                            while creating the object, = new Dog("someName", 10) <- parametrize constructor
    //                            which we created here.

    // We keep Access Modifier as public so that anyone can create object of this class.
    // If we make it Private -> We are restricting anyone to make object of this class.

    // Summary -> Constructor ensures that the necessary memory is initialized.
    //         -> and values are assigned to properties. (Either Default or Given).
    // We can Overload if we cant to allow any missing value (Default will be assigned for that property)


    public Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Allow Missing Value for age -> Default value will be assigned.
    public Dog(String name){
        this.name = name;
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

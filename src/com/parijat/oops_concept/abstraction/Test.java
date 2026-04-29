package com.parijat.oops_concept.abstraction;

public class Test {

    public static void main(String[] args) {

        // Override Is must
        Animal dobi = new Animal() {
            @Override
            public void sayHello() {
                System.out.println("...");
            }
        }; // Well this makes no sense . Just for reference that this can also be done

        dobi.sayHello();

        // Animal dogi = new Animal();  -> Not Allowed

        // Or we can access Only Via Child class.

        Animal logi = new Dog();
        logi.sayHello();
        // logi.sleep(); -> Can't Access Since Object is a "Reference" Of Animal Class
        // ThereFor only abstract Methods and Methods that are present in "Animal" Class can be Accessed.

        Dog sheru = new Dog();

        sheru.sleep(); // All methods in both child and parent can be accessed.

        // When To Use Abstract Class
        // -> One Parent with so many child class
        // Abstract class can have many generic (common) Methods
        // We do not need to create object of Parent class (Abstract) -> Since too Generic
        // All Child class ** Must ** have these generic Features in their Own way

    }
}

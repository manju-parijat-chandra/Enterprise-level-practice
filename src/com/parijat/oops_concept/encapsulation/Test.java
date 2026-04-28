package com.parijat.oops_concept.encapsulation;

public class Test {
    public static void main(String[] args){
        Animal obj = new Animal("Sheru", 2, 10);

        // name is public -> Can access in Same Parcage
        System.out.println(obj.name);

        // age is private -> can access only within the class
        // System.out.println(obj.age);

        // speed is protected -> can access in same package
        // But Can also access if child in Other Package -> Extra Benifit From Default
        System.out.println(obj.speed);



        // Proper Encapsulation is achieved in Dog class

        Dog kalu = new Dog("Kalu", 10);

        // No Direct access of Instance Variable
        // kalu.name;

        // Accessed via Getters and Setters

        System.out.printf("%s's name and age : %d is registered successfully",kalu.getName(), kalu.getAge());

        kalu.increaseAge(2);

        System.out.println();

        System.out.printf("New Age of %s is %d",kalu.getName(),kalu.getAge());

        System.out.println();
        // With Missing value
        Dog lalu = new Dog("Lalu");
        System.out.printf("%s's name and age : %d is registered successfully",lalu.getName(), lalu.getAge());
    }
}

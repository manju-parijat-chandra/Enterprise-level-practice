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
    }
}

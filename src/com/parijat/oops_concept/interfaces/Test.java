package com.parijat.oops_concept.interfaces;

public class Test {
    public static void main(String[] args) {
        ImplementClass obj = new ImplementClass();

        // ******** Static Constants ************

        double abc = Utility.pi; // Best Practice
        double asd = obj.pi; // Not best Practice

        // ********* Abstract Methods ***********

        obj.watchTime(); // Abstract Method

        // Static Methods
        Utility.info(); // Can Be called via Interface Only
        // obj.info();  -> Not Allowed to call via Object


        // ********* Default Methods ************
        int xyz = obj.sum(3,4); // Default Method -> Called Only via Object
        // Utility.sum(3 ,4); Non Static Methods -> Can't call Directly


    }
}

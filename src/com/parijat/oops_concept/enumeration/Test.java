package com.parijat.oops_concept.enumeration;

public class Test {
    public static void main(String[] args) {

        // toString method is Overridden in num
        System.out.println(Day.MONDAY);

        // Store Reference of Day Object in Reference Variable -> Can store memory address of Day Object class.
        Day obj = Day.MONDAY;
        System.out.println(obj);
    }
}

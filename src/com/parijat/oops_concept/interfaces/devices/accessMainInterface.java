package com.parijat.oops_concept.interfaces.devices;

public interface accessMainInterface {

    // Can write Main Method in Interface
    // As JVM only cares about accessable main method (Doesn't matter if class or interface)
    // JVM only needs Main method
    // And it should be static as it can be accessed without creating Object

    public static void main(String[] args) {
        System.out.println("Hello World");

    }
}

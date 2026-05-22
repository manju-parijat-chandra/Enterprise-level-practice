package com.parijat.collection_framework.collection_list.vector;

// Vector is a Legacy Class ->  Implements List Interface.
// Vector is Thread Safe  -> (Synchronization)
// Reduced Performance due to locks.
// In single Thread environment -> ArrayList and Linked list is better.

import java.util.Vector;

public class VectorJava {

    public static void main(String[] args) {

        // Similar to ArrayList
        Vector<Integer> numbers = new Vector<>(5,2); // Initial Capacity + Increment by.

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        System.out.println(numbers.capacity()); // Unlike ArrayList we can check Capacity Directly.
    }
}

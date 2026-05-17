package com.parijat.oops_concept.generics.myGenericInterface;

// Interface That Accept DataType Dynamically
// Code Re-Usability Achieved

public interface Container<T> {

    void set(T item);

    T get();
}

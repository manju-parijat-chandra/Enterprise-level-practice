package com.parijat.oops_concept.generics.myGenericInterface;

// Class that implements Container and Can Dynamically Accept any DataType

public class DynamicContainer <T> implements Container <T>{

    private T item;

    @Override
    public void set(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}

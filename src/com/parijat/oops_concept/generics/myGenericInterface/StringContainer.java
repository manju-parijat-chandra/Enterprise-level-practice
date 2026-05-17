package com.parijat.oops_concept.generics.myGenericInterface;

// Class that implements Container and Accept only String Data Type

public class StringContainer implements Container <String>{

    private String item;

    @Override
    public void set(String item) {
        this.item = item;
    }

    @Override
    public String get() {
        return item;
    }
}

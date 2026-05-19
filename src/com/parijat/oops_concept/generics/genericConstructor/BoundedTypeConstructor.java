package com.parijat.oops_concept.generics.genericConstructor;

public class BoundedTypeConstructor {

    private final Object value;

    public <T extends Number> BoundedTypeConstructor(T value){
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public static void main(String[] args) {
        BoundedTypeConstructor obj = new BoundedTypeConstructor(10);
        System.out.println(obj.getValue());

        // Only Number type is accepted
        // BoundedTypeConstructor obj2 = new BoundedTypeConstructor("Parijat");

    }
}
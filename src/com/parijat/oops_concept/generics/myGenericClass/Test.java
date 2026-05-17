package com.parijat.oops_concept.generics.myGenericClass;

// We are now able to define The Type of data that we want to

public class Test {

    public static void main(String[] args) {

        // **** Will get error if not used Generics ****

        BoxNoGen error = new BoxNoGen();

        error.setError(120.2);
        // String err = (String) error.getError(); // Runtime Error  -> No typeSafety
        Double err = (Double) error.getError();
        System.out.println(err);


        // **** Solved By generic Class ****

        Box<String> item = new Box<>(); // Box is now TypeSafe

        item.setItem("NewItem");

        System.out.println(item.getItem());
    }
}

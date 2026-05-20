package com.parijat.oops_concept.generics.exceptions;

public class MyException extends Exception {

    public <T> MyException(T value){
        super("Exception related to value: " + value.toString() + " of type: " + value.getClass().getName());
    }
}

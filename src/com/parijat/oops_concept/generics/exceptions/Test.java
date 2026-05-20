package com.parijat.oops_concept.generics.exceptions;

// This is how we Write Customized Exception
// But we need to write multiple classes, So we Write Generic Exception Class.

class StringProcessingException extends Exception{
    public StringProcessingException(String message){
        super("Exception related to value: " + message + " of type: " + message.getClass().getName());
    }
}

class IntegerProcessingException extends Exception{
    public IntegerProcessingException(Integer message){
        super("Exception related to value: " + message.toString() + " of type: " + message.getClass().getName());
    }
}

public class Test {
    public static void main(String[] args) {

        // Non-Generic Type Exception

        try {
            throw new IntegerProcessingException(123);
        }catch (IntegerProcessingException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            throw new StringProcessingException("String");
        }catch (StringProcessingException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }



        // Generic Type Exception
        try{
            throw new  MyException(123);
        }catch (MyException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }

        try {
            throw new MyException("String");
        }catch (MyException e){
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

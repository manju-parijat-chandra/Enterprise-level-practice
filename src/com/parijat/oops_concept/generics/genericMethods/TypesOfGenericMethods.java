package com.parijat.oops_concept.generics.genericMethods;

import java.sql.Array;

public class TypesOfGenericMethods {

    // Generic method
    public <T> T getValue(T parameter){
        return parameter;
    }

    // Generic Method Accepting Array
    public <T> void printArray(T[] array){
        for(T element : array){
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Generic Static method
    public static <T> void printSomething(T value){
        System.out.println("Value received was " + value);
    }

    // Bounded Methods
    public <N extends Number> N getNumber(N number){
        System.out.println("Only number was accepted");
        return number;
    }

    public static void main(String[] args) {
        TypesOfGenericMethods obj = new TypesOfGenericMethods();

        System.out.println(obj.getValue("Parijat"));
        System.out.println(obj.getValue(10));

        obj.printArray(new Integer[]{1,2,4,7});
        obj.printArray(new String[]{"a","e","i","o","u"});
        obj.printArray(new Character[]{'a','b','c','d','e'});

        printSomething("hellooo");

        System.out.println(obj.getNumber(1000));


    }
}

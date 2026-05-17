package com.parijat.oops_concept.generics;

import java.util.ArrayList;
import java.util.Objects;

public class ProblemSolvedByGenerics {

    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // Can store Object (any DataType)

        // Problem 1  ->> Able to add any Data type -> No Type Safety

        list.add("Parijat");
        list.add('a');
        list.add(1);
        list.add(12.23);
        list.add(true);


        // List -> Box -> Object
        // Inside Box we have string integer ETC.
        System.out.println(list.get(0).getClass().getName()); // -> Return String as at run time it checks actual memory type
        // Compiler Can't see Inside Memory so it throws no error at run time
        // But Parent class can't be assigned to Child class
        // Object -> String (No)  ,But,   String -> Object (Ok)

        Object obj = list.get(0); // Object type (Parent) is acceptable

        // Problem 2 -> *** Manual Casting ***
        String name = (String) list.get(0); // Need To typeCast as it is of Object Type

        // Problem 3 -> *** Error at RunTime ***
        // String num = (String) list.get(2); // Will throw Error at run time

        Integer num = (Integer) list.get(2);

        System.out.println(list); // Print all List
    }
}

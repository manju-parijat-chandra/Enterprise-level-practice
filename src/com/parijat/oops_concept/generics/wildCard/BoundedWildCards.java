package com.parijat.oops_concept.generics.wildCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoundedWildCards {

    // Only accepts Object of class that extends Number
    public static double sum(List<? extends Number> numbers){
        double sum = 0;
        for (Number o: numbers){
            sum += o.doubleValue();
        }
        return sum;
    }

    // Type safe as it accepts any Child of Number class
    // And they can be changed to double
    public static double upperBound(List<? extends Number> numbers){
        double sum = 0;
        for (Number o: numbers){
            sum += o.doubleValue();
        }
        return sum;
    }

    // Since It accepts anything above Integer class -> We can only do read operation
    // Not Type Safe for write operation
    public static void LowerBound(List<? super Number> numbers){
        for (Object obj: numbers){  // Only object is accepted as it is Parent of all the classes
            System.out.println(obj);
        }
    }



    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("Hello");

        // Unbonded wild card -> No Type Safety
        ArrayList<?> strlist = new ArrayList<String>();
        // strlist.add("Hello"); Not Type safe at run time so
        strlist.add(null); // Can add null only

        // Bounded wild card
        System.out.println(sum(Arrays.asList(1,2,3.8,20)));

        List<? extends Number> lowerBounds = Arrays.asList(1,2,3,4); // some unknown type that is a child of Number.
        // lowerBounds.add(0);
        lowerBounds.add(null); // Type safe as 0, 0.0, anytype with 0 will be assigned
        //The actual list could be a List<Double> or a List<Float>.
        // You cannot safely add an Integer to a list of Double, so the compiler blocks it completely

        List<? super Integer> upperBounds = Arrays.asList(1,2,3,4); // some unknown type that is a parent of Integer.
        upperBounds.add(0); // Integer can be added -> Lower Bound is known, and it is type safe to add Integer
    }
}
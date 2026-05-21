package com.parijat.collection_framework.collection_list.arrayList;

// Array list is dynamic in terms of Capacity
// with initial capacity 10 and increase by 1.5x
// Initial capacity can be edited.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ImplementationOfMethods {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> initialCapacity = new ArrayList<>(11);

        // *** Add *** element to Array
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        // *** Extract *** element from Array
        int element = arr.get(1);
        System.out.println(element);

        // Array *** Size *** -> No of element present in array (Initial Capacity is hidden)
        int size = arr.size();
        System.out.println(size);

        // *** Remove *** Element from array
        arr.remove(3); // Remove value at index 1
        arr.remove(Integer.valueOf(2)); // Remove element of value 2

        // *** Insert *** element at index
        arr.add(1,80);

        // *** Replace *** Value at index
        arr.set(1,90);

        // *** Trim Capacity to Size ***
        arr.trimToSize();

        // **** Immutable List ****
        // asList returns Arrays$ArrayList -> can Store in Parent
        List<String> strlst =  Arrays.asList("Apple", "Banana", "Orange"); // Fixed Size (Element can be Replaced)

        // strlst.add("Papaya"); -> immutable List is returned So we can't add element
        strlst.set(1,"Strawberry");

        // To Make it mutable we need to Pass it to a ArrayList

        ArrayList<String> mutable = new ArrayList<>(strlst); // Can Pass Collection and Initial Size
        mutable.add("Papaya");


        // *** Immutable and Irreplaceable ***
        List<String> fixedList = List.of("Cow","Dog","Cat");
        // fixedList.set(1,"Buffalo"); -> Won't Work

        // Still it can be copied to normal ArrayList
        ArrayList<String> animal = new ArrayList<>(fixedList);
        animal.add("Buffalo");

        // *** Checking is Element is Present ***
        System.out.println(animal.contains("Buffalo"));

        // *** Converting ArrayList to Arrays ***
        String[] array = animal.toArray(new String[0]); // new String[0] -> Takes Arrays (Convention)
        // 1-> Specifies the exact runtime type  ---> (Type Hint)
        // 2 -> Optimizes performance
        // [0] -> Uses reflection to automatically allocate a brand-new array of the correct type and size matching of collection.


        //  ***** Sorting *****

        animal.sort(null);
        // animal.sort(((o1, o2) -> o1.length() - o2.length())); -> Comparator
        animal.sort((Comparator.comparingInt(String::length))); // Direct

        // Specific Condition Written
        animal.sort((o1,o2) -> {
            return (int) o1.charAt(1) - o2.charAt(1);
        });

        System.out.println(animal);

    }

}

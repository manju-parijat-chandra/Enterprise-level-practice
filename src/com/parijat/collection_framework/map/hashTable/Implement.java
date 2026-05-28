package com.parijat.collection_framework.map.hashTable;

// Legacy Class

import java.util.Hashtable;

public class Implement {

    public static void main(String[] args) {

        // Thread Safe
        // No null Value is Accepted (Either Key or Value)

        Hashtable<Integer, String> hashtable = new Hashtable<>();

        hashtable.put(1,"One");
        hashtable.put(2,"Two");
        hashtable.put(3,"Three");
        hashtable.put(4,"Four");
        hashtable.put(5,"Five");
        hashtable.put(6,"Six");

        System.out.println(hashtable);

    }

}

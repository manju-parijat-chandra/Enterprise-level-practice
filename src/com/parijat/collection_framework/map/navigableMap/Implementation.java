package com.parijat.collection_framework.map.navigableMap;

import java.util.NavigableMap;
import java.util.TreeMap;

public class Implementation {
    public static void main(String[] args) {
        // Extends SortedMap -> Provide More Navigation Option

        NavigableMap<Integer, String> navigableMap = new TreeMap<>();

        navigableMap.put(1,"One");
        navigableMap.put(2,"Two");
        navigableMap.put(3,"Three");
        navigableMap.put(4,"Four");

        System.out.println(navigableMap);

        System.out.println(navigableMap.lowerKey(1));
        System.out.println(navigableMap.higherKey(1));
        System.out.println(navigableMap.ceilingEntry(1));


    }
}

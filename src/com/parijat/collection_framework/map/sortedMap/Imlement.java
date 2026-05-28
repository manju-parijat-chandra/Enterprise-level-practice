package com.parijat.collection_framework.map.sortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class Imlement {
    public static void main(String[] args) {
        SortedMap<String,Integer> map = new TreeMap<>();

        // Tree Map has Self Balancing Binary Search Tree
        // Red Black Tree

        map.put("Parijat",91);
        map.put("Mohit",21);
        map.put("Rohit", 109);
        map.put("Sohit", 9);

        System.out.println(map);

        // Extra Methods in interface -> SortedMap, then Map

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());

        System.out.println(map.subMap("Mohit","Sohit")); // from [Mohit, Sohit)
    }
}

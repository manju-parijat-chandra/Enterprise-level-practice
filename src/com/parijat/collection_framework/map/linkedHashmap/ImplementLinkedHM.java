package com.parijat.collection_framework.map.linkedHashmap;
import java.util.LinkedHashMap;
import java.util.Map;

// For Cache Eviction Strategy.

public class ImplementLinkedHM {
    public static void main(String[] args) {
        // Linked Hashmap Maintains Order of Entry -> Unlike Hashmap

        // Use only when order matters

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>(11,0.3f,true);
        // Access order -> Least Recently Used

        linkedHashMap.put("Orange", 7);
        linkedHashMap.put("Apple", 10);
        linkedHashMap.put("Guava", 5);
        linkedHashMap.put("Watermelon", 4);
        linkedHashMap.put("Muskmelon", 3);
        linkedHashMap.put("Grapes", 1);
        linkedHashMap.put("Strawberry", 2);

        for (Map.Entry<String,Integer> entry : linkedHashMap.entrySet()){
            System.out.print(entry.getKey() + ": " + entry.getValue() + " , ");
        }

        System.out.println();

        // Since we are accessing -> it will go to last
        linkedHashMap.get("Guava");

        for (Map.Entry<String,Integer> entry : linkedHashMap.entrySet()){
            System.out.print(entry.getKey() + ": " + entry.getValue() + " , ");
        }
        System.out.println();

        // If we add anything it'll go to last (Here also we are accessing in a way)
        linkedHashMap.put("Chiku", 1);

        for (Map.Entry<String,Integer> entry : linkedHashMap.entrySet()){
            System.out.print(entry.getKey() + ": " + entry.getValue() + " , ");
        }

        // Check if present otherwise return default
        System.out.println(linkedHashMap.getOrDefault("Ram",0));
        // Check if absent Place it in map
        linkedHashMap.putIfAbsent("Blackberry",1);
    }
}

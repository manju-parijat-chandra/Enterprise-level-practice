package com.parijat.collection_framework.map.linkedHashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUcacheImplementation<K,V> extends LinkedHashMap<K,V> {
    private final int capacity;
    public LRUcacheImplementation(int capacity){
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size() > capacity;
    }

    public static void main(String[] args) {
        LRUcacheImplementation <String, Integer> studentMap = new LRUcacheImplementation<>(3);

        studentMap.put("Bob",99);
        studentMap.put("Alica",89);
        studentMap.put("Ram",91);
        studentMap.put("Shyam",89);

        // Removed as capacity is 3
        System.out.println(studentMap.get("Bob"));

        System.out.println(studentMap);
    }
}

package com.parijat.collection_framework.map.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class implementationClass {

    public static void main(String[] args) {
        HashMap<Integer, String> student = new HashMap<>();

        // Add element in key value pair
        // Unique Key is accepted
        // Value can be duplicated for multiple key

        // If Duplicate Key is added -> Previous Key value will be Updated
        student.put(4,"Ram");
        student.put(2,"Neha");
        student.put(1,"Akshit");
        student.put(3,"Shubham");
        student.put(null,null); // Only one key can have null
        student.put(null,"Shyam"); // null key will be updated

        // In any order We insert in hashmap -> Always arranged in key values order
        System.out.println(student);

        String s = student.get(69); // If no such key then Return null
        System.out.println(s);
        String stu = student.get(1);
        System.out.println(stu);

        // Check if key and value is present
        System.out.println(student.containsKey(2));  // For Key
        System.out.println(student.containsValue("Ram")); // For Value

        // Remove
        student.remove(1); // remove both key and value
        student.remove(1,"Ram"); // remove only if Value is "Ram"

        // Looping
        Set<Integer> keys = student.keySet(); // Store all Keys in a set
        for (Integer i : keys){
            System.out.println(i + " " +  student.get(i));
        }


        // Change Values to uppercase
        Set<Map.Entry<Integer,String>> entries = student.entrySet();

        for (Map.Entry<Integer,String> entry : entries){
            entry.setValue(entry.getValue().toUpperCase());
        }

        System.out.println(student);
    }
}

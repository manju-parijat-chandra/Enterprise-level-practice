package com.parijat.collection_framework.map.identityHashMap;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class Implementation {
    public static void main(String[] args) {
        String key1 = new String("Key"); // Different address
        String key2 = new String("Key"); // Different address

        // String class has its own HashCode logic -> Created via Value instead of address
        System.out.println(key1.hashCode());  // Overridden inside String class
        System.out.println(key2.hashCode());

        // HashCode   AND   .equals()

        Map<String, Integer> map = new HashMap<>();

        map.put(key1,1);
        map.put(key2,2); // Since both are equal -> Value updated

        System.out.println(key1.equals(key2)); // true since checking Value.

        System.out.println(map);

        // **** Now use Identity Hash Map ****

        Map<String, Integer> identityMap = new IdentityHashMap<>();
        identityMap.put(key1,1);
        identityMap.put(key2,2);


        // Identity Hashcode   AND   ==  (Check address)
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));

        System.out.println(identityMap);

    }
}

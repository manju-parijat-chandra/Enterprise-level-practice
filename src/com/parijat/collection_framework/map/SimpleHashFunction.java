package com.parijat.collection_framework.map;

public class SimpleHashFunction {
    public static void main(String[] args) {
        System.out.println(simpleHash("ok"));

        // Collision Case
        System.out.println(simpleHash("ABC"));
        System.out.println(simpleHash("BCA"));
    }

    public static int simpleHash(String key){
        int sum = 0;
        for (char c : key.toCharArray()){
            sum += (int) c;
        }
        return sum % 16;
    }
}

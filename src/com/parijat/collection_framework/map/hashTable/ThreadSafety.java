package com.parijat.collection_framework.map.hashTable;

import java.util.Hashtable;

public class ThreadSafety {

    public static void main(String[] args) throws InterruptedException {

        // HashMap<Integer, String> map = new HashMap<>(); -> Less than 2000

        Hashtable<Integer, String> map = new Hashtable<>();

        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 1000; i++){
                map.put(i, i + " Thread t1");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1001; i <= 2000; i++){
                map.put(i, i + " Thread t2");
            }
        });



        t1.start();
        t2.start();

        t1.join();t2.join();

        System.out.println(map.size());
    }
}

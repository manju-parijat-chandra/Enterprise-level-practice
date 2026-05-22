package com.parijat.collection_framework.collection_list.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorSync {
    public static void main(String[] args) {

        Vector<Integer> sharedResource = new Vector<>(); // Synchronised
        // ArrayList<Integer> sharedResource = new ArrayList<>(); // Non Synchronised

        Thread s1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                sharedResource.add(i);
            }
        });

        Thread s2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++){
                sharedResource.add(i);
            }
        });

        s1.start();
        s2.start();

        try {
            s1.join();
            s2.join();
        }catch (InterruptedException ignored){

        }

        System.out.println(sharedResource.size());
    }
}

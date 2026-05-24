package com.parijat.collection_framework.map.weakHashMap.weakReference;

import java.util.Map;
import java.util.WeakHashMap;

public class Implementation {

    public static void main(String[] args) {
        WeakHashMap<String, Image> imageCached = new WeakHashMap<>();

        // Method 1 -> Creating Strong Reference first then Nullifying it.

        String k1 = new String("Img1");
        String k2 = new String("Img1");

        imageCached.put(k1, new Image("Image 1"));
        imageCached.put(k2, new Image("Image 2"));

        k1 = null;
        k2 = null;

        // Method 2 -> Create object without Reference and Pass

        // No need to nullify the reference variable
        imageCached.put(new String("Img 3"), new Image("Image 3"));
        imageCached.put(new String("Img 4"), new Image("Image 4"));


        // *******  Method 3 (Best) *******  -> Inside method
        loadCache(imageCached); // Scope of Strong Referenced variable is only inside Method
                                // So Object or Resource are disposed of or cleaned (Auto Closable)

        System.out.println(imageCached);

        System.gc();

        simulateApplicationRunning();

        System.out.println("Cache after running (Some Entries may be cleared): " + imageCached);
    }

    public static void loadCache(Map<String, Image> imageCached){
        String k1 = new String("Img5");
        String k2 = new String("Img6");
        imageCached.put(k1, new Image("Image 5"));
        imageCached.put(k2, new Image("Image 6"));
    }

    public static void simulateApplicationRunning(){
        try {
            System.out.println("Simulation Application is Running...");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Image{
    String name;

    public Image(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " is in Cache";
    }
}
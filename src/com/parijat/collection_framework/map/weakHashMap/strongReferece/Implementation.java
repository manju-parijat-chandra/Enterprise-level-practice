package com.parijat.collection_framework.map.weakHashMap.strongReferece;
import java.util.WeakHashMap;

public class Implementation {

    public static void main(String[] args) {
        WeakHashMap<String , Image> imageCache = new WeakHashMap<>();

        imageCache.put("Img1",new Image("Image 1"));
        imageCache.put("Img2",new Image("Image 2"));

        System.out.println(imageCache);

        System.gc();

        simulateApplicationRunning();

        System.out.println("Cache after running (Some Entries may be clared): " + imageCache);
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
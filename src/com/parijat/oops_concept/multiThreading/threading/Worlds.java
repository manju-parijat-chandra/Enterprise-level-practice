package com.parijat.oops_concept.multiThreading.threading;

// Method 2 -> By Implementing Runnable Interface

public class Worlds implements Runnable{

    @Override
    public void run(){
        for (int i =  0; i < 100000; i++){
            System.out.println("Worlds");
        }
    }
}

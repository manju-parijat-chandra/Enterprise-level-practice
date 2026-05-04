package com.parijat.oops_concept.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowKeyword {
    public static void main(String[] args){ // Should be handled at JVM
        method2();
    }
    public static void method2(){ // Should be handled at main method
        // Catching Forcefully Thrown Exception
        try{
            method1();
        }catch (RuntimeException r){
            System.out.println(r); // my message is passed instead of object -> e
        }
    }
    public static void method1() throws RuntimeException { // Should be handled at method2
        try {
            FileReader file = new FileReader("a.txt");
        }catch (FileNotFoundException e){
            System.out.println("File Not Found");
            throw new RuntimeException("oops"); // ForceFully Throwing this Exception
        }
    }
}

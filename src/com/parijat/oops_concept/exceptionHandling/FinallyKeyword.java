package com.parijat.oops_concept.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.SortedMap;

public class FinallyKeyword {
    public static void main(String[] args){ // Should be handled at JVM
        method2();
    }
    public static void method2(){ // Should be handled at main method
        method1();
    }
    public static void method1(){ // Should be handled at method2
        try{
            FileReader file = new FileReader("a.txt");
        }catch (FileNotFoundException f){
            System.out.println(f);
        }finally {
            System.out.println("Byeee!! "); // this block will Always run No matter What
        }
    }
}

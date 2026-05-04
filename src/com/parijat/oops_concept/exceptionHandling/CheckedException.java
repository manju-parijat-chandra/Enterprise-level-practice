package com.parijat.oops_concept.exceptionHandling;

// Checked Exception -> Checked at Compile Time

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
    public static void main(String[] args) throws FileNotFoundException { // throws to method which is calling this Method
        FileReader file = new FileReader("a.txt");
    }
    // Or
    // try {
    //      FileReader file = new FileReader("a.txt");
    //}catch (FileNotFoundException e){
    //      }
}

package com.parijat.oops_concept.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsException {
    public static void main(String[] args) throws FileNotFoundException{ // Should be handled at JVM
        method2();
    }
    public static void method2() throws  FileNotFoundException{ // Should be handled at main method
        method1();
    }
    public static void method1() throws FileNotFoundException { // Should be handled at method2

        FileReader file = new FileReader("a.txt");
    }
}

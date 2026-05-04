package com.parijat.oops_concept.exceptionHandling;

// Unchecked Exception -> Not checked at compile time

public class UncheckedException {
    public static void main(String[] args) {
        int[] num = new int[]{10,20,30,40,50};
        int[] dnum = new int[]{2,3,4,0,5};

        for(int i = 0; i < num.length; i++){
            System.out.println(divide(num[i],dnum[i]));
        }

    }
    private static int divide(int a, int b){
        try {
            return a/b; // divide by zero Possible at this point
                        // Therefore Enclosed in try catch
            // ******* Multi catch and Multiple catch block **********
        }catch (ArithmeticException | NullPointerException e){ // here e is object of ArithmeticException (class)
                                        // JVM throws Exception in the form of Object
                                        // Exception e -> Also Fine -> Parent class of all exceptions
            System.out.println(e);  // as all class Automatically Object class
                                    // and inside Object class we have toString Method
                                    // -> So we are able to see String Output -> Can Override
            return -1;
        }catch (Exception o){ // any name is acceptable -> e, a , xyz
            // If Not Caught them Exception will have all kind of exceptions

            StackTraceElement[] stackTrace = o.getStackTrace(); // To get Full pathway to Point where Exception Occurred
            System.out.println(o.getMessage());
            return -1;
        }
    }
}

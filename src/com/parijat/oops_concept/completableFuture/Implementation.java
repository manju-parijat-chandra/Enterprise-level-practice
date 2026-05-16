package com.parijat.oops_concept.completableFuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Implementation {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");


            }catch (Exception e){

            }
            return "ok";

        });

        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");


            }catch (Exception e){

            }
            return 1;

        });

        CompletableFuture<Void> f = CompletableFuture.allOf(f1,f2); // Just indicate if future is completed or not
        // When all the completable future is completed



        System.out.println(f1.get()); // To get result
        System.out.println(f2.get()); // To get result

        System.out.println("Status " + f.get()); // To get Status

        System.out.println("Main");


        // *** Functional Programming ***
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");


            }catch (Exception e){

            }
            return 1;

        }).get();
    }
}

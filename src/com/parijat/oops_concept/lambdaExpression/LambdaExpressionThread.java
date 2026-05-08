package com.parijat.oops_concept.lambdaExpression;

public class LambdaExpressionThread {
    public static void main(String[] args) {

        // Anonymous Class

        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task 1");
            }
        };

        Thread t1 = new Thread(task1);
        t1.start();

        // Lambda Expression

        Runnable task2 = () -> System.out.println("Task 2");
        Thread t2 = new Thread(task2);
        t2.start();

        // Directly Passing Lambda Expression

        Thread t3 = new Thread(()-> System.out.println("Task 3"));
        t3.start();

        // Directly passing with multiple line

        Thread t4 = new Thread(() -> {
            System.out.println("Task 4 For Multiple line.");
        });
        t4.start();
    }
}

package com.parijat.oops_concept.multiThreading.threading;

public class MyThreadPriority extends Thread {

    // To Set Name of a thread
     private String name;

     public MyThreadPriority(String name){
         // Pass Name to Constructor of Parent Class
         super(name);
     }

    @Override
    public void run(){
        String a = "";
        for(int j = 0; j < 5; j++) {

            for (int i = 0; i < 100000; i++) {
                a += a;
            }

            // Need To use Thread Class to access methods of Thread Class
            // Access From Parent Class -> Thread

            System.out.println("Thread name : " + Thread.currentThread().getName() + " Priority : " + Thread.currentThread().getPriority() + " - Count : " + j);

            try {
                Thread.sleep(100);
            } catch (Exception ignored) {

            }

        }
    }

    public static void main(String[] args) {
        //Create Anonymous Inner Class
        Runnable myTaskClass = new Runnable() {

            // Anonymous Class Can't have Constructor as There is no name of the class
            // Can have methods and properties -> accessable only within class
            @Override
            public void run() {
                System.out.println("Started Anonymous Class Without Lambda Expression");
            }
        };

        Thread cus = new Thread(myTaskClass,"Custome Priority");
        // {{  Check Anonymous Class -> we could create and pass object at the same place -> no need of myTaskClass
        // not possible with lambda expression  }}

        // now we have object of thread so we can access all the methods present inside thread class
        cus.setPriority(2);
        cus.start();

        System.out.println("Thread name : " + cus.getName() + " Priority : " + cus.getPriority());

        // Lambda Expression -> To Create Anonymous Inner Class
        // Lambda Expression Can be used if an Interface has only one Method
        Runnable task = () -> System.out.println("Started Anonymous Class With Lambda Expression");
        Thread lambdaTask = new Thread(task, "lambdaTask");

        lambdaTask.start();
        System.out.println("Thread name : " + lambdaTask.getName() + " Priority : " + lambdaTask.getPriority());

        // Otherwise Normally like Above

        // myTaskClass, task is an Instance of Anonymous Class which implements Runnable Interface
        // cus, lambdaTask is an Instance of Thread Class


        // Create Multiple Threads
        MyThreadPriority l = new MyThreadPriority("Low Priority");
        MyThreadPriority m = new MyThreadPriority("Medium Priority");
        MyThreadPriority h = new MyThreadPriority("High Priority");

        // Set Priority
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        h.setPriority(Thread.MAX_PRIORITY);

        // Start Threads
        l.start();
        m.start();
        h.start();


        // Priority order that we set is not a Strict Rule
        // Its just hint for JVM and OS to Run according to Priority - if Possible

        // priority actually Depends on JVM, OS, Cores, And Type of Task Written in code
        // More Noticeable in case of Single core Processor

        // In case Of Multi core Processor -> True Parallelism is Happening
    }
}

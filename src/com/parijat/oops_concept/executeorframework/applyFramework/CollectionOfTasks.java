package com.parijat.oops_concept.executeorframework.applyFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class CollectionOfTasks {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);

        // ******** Runnable Task *******

        Runnable runTask1 = () -> System.out.println("Runnable Task 1");
        Runnable runTask2 = () -> System.out.println("Runnable Task 2");
        Runnable runTask3 = () -> System.out.println("Runnable Task 3");

        // Create a List of Callable Task
        // Need To Convert Runnable to Callable as -> invokeAll only takes List of Callable which returns Future Objects.

        List<Callable<Object>> runTaskList = Arrays.asList(Executors.callable(runTask1),
                Executors.callable(runTask2),
                Executors.callable(runTask3));

        // As we have List Of task we will get List of Future Objects
        List<Future<Object>> runFutureList = null;
        try {
            runFutureList = service.invokeAll(runTaskList,1, TimeUnit.MILLISECONDS); // Can Provide Time Limit
        } catch (CancellationException f) {
        } catch (InterruptedException f){
        }

        System.out.println("Runnable Task Finished");

        // *********** Callable Task ************

        Callable<String> callTask1 = () -> {
            System.out.println("Callable Task 1");
            return "Call Task 1";
        };
        Callable<String> callTask2 = () -> {
            System.out.println("Callable Task 2");
            return "Call Task 2";
        };
        Callable<String> callTask3 = () -> {
            System.out.println("Callable Task 3");
            return "Call Task 3";
        };

        // Create List of Callable task as it is Requirement of InvokeAll Method
        List<Callable<String>> callTaskList = Arrays.asList(callTask1, callTask2, callTask3);

        // Invoke all is taking Collection of task and Invoking them Together
        List<Future<String>> callFutureList = null;
        try {
            callFutureList = service.invokeAll(callTaskList);
        } catch (CancellationException f) {
        } catch (InterruptedException f){
        }

        // *** Invoke all Returns Either Future Object Or List Of Future Objects
        // And Reason why it Returns Future Object as we Can access Results in case anything is Returned
        //              Otherwise it helps us to get status and call Different Methods Available in Future
        //              Containing Info about out Task

        System.out.println("Callable Task Finished");

        // *** InvokeAll blocks the Calling Thread Until Task is Completed or Timed Out

        service.shutdown();
        System.out.println("All Task Finished");

        // Fetch all the Outputs

        for(Future<Object> f : runFutureList){
            try {
                System.out.println(f.get());
            } catch (CancellationException z) {
            } catch (InterruptedException z){
            }catch (ExecutionException z){
            }
        }

        for(Future<String> f : callFutureList){
            try {
                System.out.println(f.get());
            } catch (CancellationException z) {
            } catch (InterruptedException z){
            }catch (ExecutionException z){
            }
        }
    }
}

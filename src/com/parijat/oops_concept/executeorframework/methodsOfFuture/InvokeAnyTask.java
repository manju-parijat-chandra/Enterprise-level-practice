package com.parijat.oops_concept.executeorframework.methodsOfFuture;

// Unlike Invoke All which returned Future Object
// Invoke Any Returns result of that particular task which is executed
// Invoke all Runs Only one Task Out of any and ** Cancels Remaining Task **

// Whichever task completed first will be returned -> rest will be canceled

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InvokeAnyTask {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(1); // only 1 is better
        // If Multiple thread -> Multiple Thread will Start Multiple Task
        // But As soon as one thread completes its task . Rest all Task Execution will be canceled

        Callable<Integer> task1 = () -> {
            System.out.println("Task 1 Running");
            return 1+1;
        };
        Callable<Integer> task2 = () -> {
            System.out.println("Task 2 Running");
            return 1+2;
        };
        Callable<Integer> task3 = () -> {
            System.out.println("Task 3 Running");
            return 1+3;
        };

        List<Callable<Integer>> listOfCallableTask = Arrays.asList(task1, task2, task3);

        Integer result;

        try {
            result = service.invokeAny(listOfCallableTask);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println(result);
        service.shutdown();
    }
}

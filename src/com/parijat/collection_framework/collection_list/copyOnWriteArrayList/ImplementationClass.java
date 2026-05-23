package com.parijat.collection_framework.collection_list.copyOnWriteArrayList;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.concurrent.CopyOnWriteArrayList;

// Thread safe.
// Best for Read Heavy Task
// Keeps a Separate Copy of List for Read Task  -> (Original is Updated once Reading task is Completed)
// Creates Separate copy of List for Writing task.

// ArrayList Requires Stable Array.


public class ImplementationClass {

    public static void main(String[] args) {

        CopyOnWriteArrayList <String> list = new CopyOnWriteArrayList<>();

        list.add("Milk");
        list.add("Eggs");
        list.add("Bread");

        // Try to Do Write operation while a Reading task us Going on.

        for (String item : list){
            System.out.println(item);

            // Trying to Modify while Reading
            if(item.equals("Eggs")){
                list.add("Butter");
                System.out.println("Added Butter while Reading Task");
                // Another Thread will start with New copy. If checked Here.
                // System.out.println(list);
            }
        }
        // While Reading task, it did not show Newly added Element. (As it was Printing from a Copy of Original)

        // After Reading task is completed we can see the change in next Reading Task
        System.out.println(list);



        // ******** Error if Used ArrayList Alone  *********

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);


        try{
            for (Integer item : nums){
                System.out.println(item);
                if(item.equals(3)){
                    // Added While Reading
                    nums.add(5);
                    System.out.println("5 is added");
                }
            }
        }catch (ConcurrentModificationException e){
            System.out.println(e);
            // Exception occurred and *** Execution Stopped ***
        }
    }
}


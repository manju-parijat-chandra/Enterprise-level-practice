package com.parijat.collection_framework.collection_list.linkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class JavaLinkedList {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>();

        // Add elements ti linked list
        students.add("Ram");
        students.add("Shyam");
        students.add("Ghanshyam");


        // Since Doubly Linked List is Implemented -> Can access Both First and Last in O(1)
        students.addFirst("Sohan"); // Head
        students.addLast("Rohan");  // Tail

        System.out.println(students.getFirst());
        System.out.println(students.getLast());
        System.out.println(students);

        students.remove("Sohan"); // Remove One Element
        students.removeIf(x -> x.length() == 3); // Remove with a condition
        System.out.println(students);

        LinkedList<String> toRemove = new LinkedList<>(Arrays.asList("Rohan","Shyam"));
        students.removeAll(toRemove); // Remove All Matching elements

        System.out.println(students);


        // If Referencing to Parent Class (List)

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        // linkedList.addFirst(5)  -> Can't add as List Interface doesn't have method declaration of (addFirst)
        // linkedList.addLast(5)  -> No addLast in Interface (List)
        // linkedList.getFirst()  , getLast()  -> No such function Declared

        System.out.println(linkedList);


    }
}

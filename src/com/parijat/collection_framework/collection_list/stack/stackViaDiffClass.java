package com.parijat.collection_framework.collection_list.stack;

// We can implement stack via -> Array List, Linked List (Specially used for single threaded environment)
// Via (Vector, Stack) Sync.
// Via Linked list is efficient for Insertion and Delition Heavy task.
// Via Stack for LIFO

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class stackViaDiffClass {

    public static void main(String[] args) {

        // ****  Via Array List  ****
        ArrayList<Integer> alStack = new ArrayList<>();

        // Push
        alStack.addLast(1);
        alStack.addLast(2);
        alStack.addLast(3);
        alStack.addLast(4);

        // POP
        alStack.removeLast();
        alStack.removeLast();

        // Peek
        System.out.println(alStack.get(alStack.size() - 1));
        System.out.println(alStack.getLast());

        System.out.println(alStack);


        // **** Via Linked List  ****
        LinkedList<Integer> llStack = new LinkedList<>();

        // Push
        llStack.addLast(1);
        llStack.addLast(2);
        llStack.addLast(3);
        llStack.addLast(4);

        // POP
        llStack.removeLast();
        llStack.removeLast();

        // Peek
        System.out.println(llStack.getLast());

        System.out.println(llStack);


        // ****  Via Vector  ****
        Vector<Integer> vecStack = new Vector<>();

        // Push
        vecStack.add(1);
        vecStack.add(2);
        vecStack.add(3);
        vecStack.add(4);

        // POP
        vecStack.remove(vecStack.size() - 1);
        vecStack.removeLast();

        System.out.println(vecStack);

        // Peek
        System.out.println(vecStack.get(vecStack.size() - 1));
        System.out.println(vecStack.getLast());


    }
}

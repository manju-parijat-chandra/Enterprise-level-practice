package com.parijat.collection_framework.collection_list.stack;

// Extends Vector -> So, it is also synchronized.

import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {


        Stack<Integer> stack = new Stack<>();

        // To add elements in stack
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);

        // To remove elements from stack
        Integer removedElement = stack.pop();
        System.out.println(removedElement);

        // Check element present at the top
        int peek = stack.peek();
        System.out.println(peek);

        // Check if Stack in empty
        System.out.println(stack.isEmpty());

        // Check size of stack
        System.out.println(stack.size());

        // Check any element index from the top (Starts with 1)
        System.out.println(stack.search(3));

        // *******  Can use all methods present in Vector  *******
        System.out.println(stack.capacity());

    }
}

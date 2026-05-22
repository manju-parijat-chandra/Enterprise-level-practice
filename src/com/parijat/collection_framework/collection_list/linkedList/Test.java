package com.parijat.collection_framework.collection_list.linkedList;

public class Test {
    public static void main(String[] args) {

        // Singly Linked List

        SinglyLL<String> node1 = new SinglyLL<>("First");
        SinglyLL<String> node2 = new SinglyLL<>("Second");
        SinglyLL<String> node3 = new SinglyLL<>("Third");
        SinglyLL<Integer> node4 = new SinglyLL<>(4);

        node1.setNext(node2);
        node2.setNext(node3);
        // node3.setNext(node4); -> Can't do this. String value type node needed

        // For Circular
        node3.setNext(node1);

        System.out.println(node1.getNextValue());
        System.out.println(node2.getNextValue());
        System.out.println(node3.getNextValue());

        System.out.println(node1.getValue());
        System.out.println(node2.getValue());
        System.out.println(node3.getValue());

        // Doubly Linked List

        DoublyLL<String> dnode1 = new DoublyLL<>("First");
        DoublyLL<String> dnode2 = new DoublyLL<>("Second");
        DoublyLL<String> dnode3 = new DoublyLL<>("Third");

        // Next Node
        dnode1.setNextNode(dnode2);
        dnode2.setNextNode(dnode3);

        // Previous Node
        dnode2.setPrevNode(dnode1);
        dnode3.setPrevNode(dnode2);

        // For Circular
        dnode3.setNextNode(dnode1);
        dnode1.setPrevNode(dnode3);


        System.out.println("Doublyyyyyyyyyy");

        System.out.println(dnode1.getNextValue());
        System.out.println(dnode1.getPreValue());

        System.out.println(dnode2.getNextValue());
        System.out.println(dnode2.getPreValue());

        System.out.println(dnode3.getNextValue());
        System.out.println(dnode3.getPreValue());
    }
}
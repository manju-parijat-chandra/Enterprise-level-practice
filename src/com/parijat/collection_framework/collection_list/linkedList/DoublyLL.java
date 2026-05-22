package com.parijat.collection_framework.collection_list.linkedList;

public class DoublyLL<T> {

    private T value;
    private DoublyLL <T> prevNode;
    private DoublyLL <T> nextNode;

    public DoublyLL(T value){
        this.value = value;
        this.prevNode = null;
        this.nextNode = null;
    }

    public void setNextNode(DoublyLL <T> node){
        this.nextNode = node;
    }

    public void setPrevNode(DoublyLL<T> node){
        this.prevNode = node;
    }

    public DoublyLL <T> getNextNode(){
        return prevNode;
    }

    public DoublyLL <T> getPrevNode(){
        return nextNode;
    }

    public T getValue(){
        return this.value;
    }

    public T getNextValue(){

        if(nextNode == null){
            return null;
        }
        return nextNode.value;
    }

    public T getPreValue(){

        if(prevNode == null){
            return null;
        }
        return prevNode.value;
    }
}

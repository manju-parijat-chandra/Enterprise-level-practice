package com.parijat.collection_framework.collection_list.linkedList;

public class SinglyLL <T> {
    private T value;
    private SinglyLL <T> node;

    public  SinglyLL(T value){
        this.value = value;
        this.node = null;
    }

    public void setNext(SinglyLL <T> node){
        this.node = node;
    }

    public SinglyLL<T> getNext(){
        return node;
    }

    public T getNextValue(){
        if(node == null){
            return null;
        }
        return node.getValue();
    }

    public T getValue(){
        return value;
    }

    public void changeValue(T value){
        this.value = value;
    }

}

package com.parijat.oops_concept.generics.genericConstructor;

public class WithoutGenericClass {

    private final Object value;
    public <T> WithoutGenericClass(T value){
        this.value = value;
    }
    public Object getValue(){
        return value;
    }
}

class Testt{
    public static void main(String[] args) {
        WithoutGenericClass obj = new WithoutGenericClass(10);
        System.out.println(obj.getValue());
    }
}
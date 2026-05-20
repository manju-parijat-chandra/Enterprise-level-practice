package com.parijat.oops_concept.generics.typeEraser;

public class BeforeCompilation<T> {

    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

}

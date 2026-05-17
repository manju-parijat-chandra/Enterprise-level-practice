package com.parijat.oops_concept.generics.myGenericClass;

import java.util.Objects;

// Class that can accept Generic Data Type
// Can write anything in the place of T ( -> Standard Convention is Single letter in Caps)

// Value of T is set while Referencing and Creating Object
// Dynamically accepting DataType

public class Box <T> { // Type is Included with Class
    private T item;

    public T getItem() {
        return item;
    }
    public void setItem(T item){
        this.item = item;
    }
}

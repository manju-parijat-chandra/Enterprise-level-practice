package com.parijat.oops_concept.generics.boundedTypeParameter;

// Condition Can be Applied on Generic Type

public class Box <N extends Number> {  // Only Accept Class that Extents Number
    private N value;

    public void setValue(N value){
        this.value = value;
    }

    public N getValue(){
        return value;
    }
}

class Main{
    public static void main(String[] args) {

        // Box<String> box = new Box<String>(); // String Type Not Accepted

        Box <Integer> box = new Box<>(); // Integer , Double, Long etc. (which Extends Number Class are accepted)

        box.setValue(1);
        System.out.println(box.getValue());
    }
}

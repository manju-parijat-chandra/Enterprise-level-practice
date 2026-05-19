package com.parijat.oops_concept.generics.genericConstructor;

public class WithGenericClass <N extends Number> {
    private N value;

    // Generic Constructor
    public WithGenericClass(N value){
        this.value = value;
    }

    public N getValue() {
        return value;
    }
}

class Test{
    public static void main(String[] args) {
        WithGenericClass<Integer> obj = new WithGenericClass<>(10);
        System.out.println(obj.getValue());
    }
}
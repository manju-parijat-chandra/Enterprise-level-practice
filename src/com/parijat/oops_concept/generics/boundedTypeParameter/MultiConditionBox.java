package com.parijat.oops_concept.generics.boundedTypeParameter;

// Condition 1 -> Interface
interface InterfaceCondition{
    void printCondition();
}

// Condition 2 -> Class
class ClassCondition{
    private int value;

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}

// Class That implements and extends condition
class MyNumber extends ClassCondition implements InterfaceCondition{

    public MyNumber(int value){
        setValue(value);
    }

    @Override
    public void printCondition() {
        System.out.println("Entered Number is " +  getValue());
    }
}

// Accept only Those Class That Extends 'ClassCondition' and Implements 'InterfaceCondition'
public class MultiConditionBox<N extends ClassCondition & InterfaceCondition> {

    private final N item;

    // Takes Object of Class that Extends 'ClassCondition' and Implements 'InterfaceCondition'
    public MultiConditionBox(N item){
        this.item = item;
    }

    // this will call the method of the class
    public void display(){
        item.printCondition();
    }

    // This Will Return Address Of the Object
    public N getValue(){
        return item;
    }
}

class Test{
    public static void main(String[] args) {

        MyNumber number = new MyNumber(143);

        System.out.println(number); // Returns memory address where ** number ** is Store.

        // Accepts ** Object ** of Class That Implements ClassCondition and Implements InterfaceCondition
        MultiConditionBox<MyNumber> myNumber = new MultiConditionBox<>(number);

        myNumber.display();
        System.out.println(myNumber.getValue()); // Return memory address as Above.
    }
}
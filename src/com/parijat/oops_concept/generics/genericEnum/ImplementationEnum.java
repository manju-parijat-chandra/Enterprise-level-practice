package com.parijat.oops_concept.generics.genericEnum;

public class ImplementationEnum {

    enum Operation{
        ADD, SUBTRACT, DIVIDE, MULTIPLY;

        public <T extends Number> double apply(T a, T b){
            switch (this){
                case ADD:
                    return a.doubleValue() + b.doubleValue();
                case SUBTRACT:
                    return a.doubleValue() - b.doubleValue();
                case MULTIPLY:
                    return a.doubleValue() * b.doubleValue();
                case DIVIDE:
                    return a.doubleValue() / b.doubleValue();
                default:
                    throw new AssertionError("Unknown operation: " + this);
            }
        }
    }
    public static void main(String[] args) {

        // Storing in reference variable then storing value
        Operation obj = Operation.MULTIPLY;
        double res = obj.apply(10,20);
        System.out.println(res);

        // Applying method on the go and storing in a variable
        double result = Operation.ADD.apply(10, 20);
        System.out.println(result);
    }
}

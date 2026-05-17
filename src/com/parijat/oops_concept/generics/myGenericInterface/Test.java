package com.parijat.oops_concept.generics.myGenericInterface;

public class Test {

    public static void main(String[] args) {

        // *** Specific Type Mandatory ***

        StringContainer strType = new StringContainer();

        // strType.set(1); // Error -> Can only Accept String
        strType.set("Parijat");
        System.out.println(strType.get());



        // ****** Dynamic Type -> Code Reusability Achieved ******

        // DynamicContainer dynType = new DynamicContainer(); -> Need To Specify Generic Type

        DynamicContainer<Integer> dynType = new DynamicContainer<>();

        dynType.set(1);
        System.out.println(dynType.get());

        DynamicContainer<String> dynTypeStr = new DynamicContainer<>();

        dynTypeStr.set("Parijat");
        System.out.println(dynTypeStr.get());
    }

}

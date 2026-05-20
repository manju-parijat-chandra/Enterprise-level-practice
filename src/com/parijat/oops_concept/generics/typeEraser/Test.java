package com.parijat.oops_concept.generics.typeEraser;

public class Test {

    public static void main(String[] args) {

        // This is how generic is Implemented
        BeforeCompilation <String> generic = new BeforeCompilation<>();
        generic.setValue("Generic");
        String genericValue = generic.getValue();
        System.out.println(genericValue.getClass());

        // This is how it goes to JVM after Compilation as Generics are erased
        InBytecode afterCompilationOfGeneric = new InBytecode();
        afterCompilationOfGeneric.setValue("Generic-Erased");
        String nonGenericValue = (String) afterCompilationOfGeneric.getValue();
        System.out.println(nonGenericValue.getClass());


        // JVM can't understand "Generics" so during compilation Generics are erased and converted to normal code.
    }
}

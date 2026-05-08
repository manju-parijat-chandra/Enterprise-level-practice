package com.parijat.oops_concept.lambdaExpression;

public class Test {
    public static void main(String[] args) {

        // Implementing via Creating new Class
        Student student = new EngineeringStud();
        System.out.println(student.getInfo("Parijat"));

        // Implementing via Anonymous Class
        Student anonyStud = new Student() {
            @Override
            public String getInfo(String name) {
                return name + " is a Physics Student";
            }
        };
        System.out.println(anonyStud.getInfo("Parijat"));

        // Implementing via Lambda Expression
        Student lambdaExp = name -> name + " is a Biology Student"; // inline since only one expression
        System.out.println(lambdaExp.getInfo("Parijat"));

        // Or multiple parameter

        Student lamda2 = (String name) -> {return name + " is a flying student";};
        System.out.println(lamda2.getInfo("Parijat"));
    }
}

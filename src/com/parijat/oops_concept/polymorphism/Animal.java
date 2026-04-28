package com.parijat.oops_concept.polymorphism;

// Compile Time Polymorphism -> Achieved by Method OverLoading
// Run Time Polymorphism -> Achieved by Method Overriding

public class Animal {

        private String name;
        private int age;

        public Animal(String name, int age){
            this.name = name;
            this.age = age;
        }


        // Method Overloading

        // Change Signature to achieve
        // 1 - Change in Number Of Parameters
        // 2 - Change in Data Type of Parameters
        // 3 - Change in Order of Parameters
        public void sayHello(){
            System.out.println("Hello..");
        }

        // Achieved by changing Parameters
        public void sayHello(boolean yes){
            if(yes){
                System.out.println("Already Greeted");
            }else{
                System.out.println("Hello..");
            }
        }

}

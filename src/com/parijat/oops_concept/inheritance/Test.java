package com.parijat.oops_concept.inheritance;

public class Test {
    public static void main(String[] args) {
        Dog bhalu = new Dog(true, "Bhalu", 10, "Woof !!");

        System.out.printf("My Dog Name is %s, He is %s, His age is %d, He sounds like %s",
                bhalu.getName(), bhalu.isAlive(), bhalu.getAge(), bhalu.soundsLike());


        // Referencing to Animal (Parent) and Creating Object of Cat (Child)
        Animal billi = new Cat(true, "Billi", 5, "Meww !!");

        System.out.println();

        System.out.printf("My Cat Name is %s, She is %s, Her age is %d, She sounds like %s",
                billi.getName(), billi.isAlive(), billi.getAge(), billi.soundsLike());

        // Referencing to Animal (Parent) and Creating Object of Cat (Child)
        Living_Organism lilli = new Cat(true, "Billi", 5, "Meww !!");

        System.out.println();
        // Can't Access getName and getAge As it is not Written in Living_org..
        // Solution -> Write Methods And Override in Child Class
        // System.out.printf("My Cat Name is %s, She is %s, Her age is %d, She sounds like %s",
                // lilli.getName(), lilli.isAlive(), lilli.getAge(), lilli.soundsLike());
    }
}

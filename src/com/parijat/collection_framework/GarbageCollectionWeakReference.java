package com.parijat.collection_framework;

import java.lang.ref.WeakReference;

public class GarbageCollectionWeakReference {
    public static void main(String[] args) {
        Person objPerson = new Person("Ram", 25);
        // Here objPerson is a Strong Reference of Type Person -> Directly Pointing to Object Created in Heap Memory.

        System.out.println(objPerson);

        objPerson = null; // Now no one is pointing to Object Created above. (Garbage)

        System.out.println(objPerson);

        // when Garbage collector is Ran by JVM it'll be cleaned.

        WeakReference<Person> personWeakReference = new WeakReference<>(new Person("Shyam", 25));

        System.out.println(personWeakReference.get()); // .get to access the Object

        // Here personWeakRef is a weak reference to Object created above.
        // Will be Removed from Memory after sometime once Garbage collection is Ran by JVM.

        System.gc(); // Hinting JVM to run Garbage Collection

        System.out.println(personWeakReference.get());
    }
}

class Person{
    int age;
    String name;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name= " + name + "age= " + age;
    }
}

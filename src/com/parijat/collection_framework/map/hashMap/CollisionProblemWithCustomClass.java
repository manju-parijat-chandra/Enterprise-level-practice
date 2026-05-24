package com.parijat.collection_framework.map.hashMap;

// Problem with Object is solved by Overriding Method (Hashcode and equals)

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class CollisionProblemWithCustomClass {


    public static void main(String[] args) {
        HashMap<Student, Integer> map = new HashMap<>();

        Student s1 = new Student("Ram", 1);
        Student s2 = new Student("Shyam",2);
        Student s3 = new Student("Ram", 1);  // Did Correction But Instead of Replacing created new

        map.put(s1, 60);
        map.put(s2,80);
        map.put(s3, 99);

        Set<Student> keys = map.keySet(); // Store all Keys in a set
        for (Student i : keys){
            System.out.println(i + " " +  map.get(i));
        }


        // String has it Overridden already. So No collision in case of String

        HashMap<String, Integer> strMap = new HashMap<>();

        String p1 = new String("Kalu");
        String p2 = new String("Lalu");
        String p3 = new String("Kalu");

        strMap.put(p1,20);
        strMap.put(p2,40);
        strMap.put(p3,20);

        Set<String> key = strMap.keySet();
        for (String i : key){
            System.out.println(i + " " + strMap.get(i));
        }
    }
}


class Student{
    int id;
    String name;

    public Student(String name,int id){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name;
    }


    // Solution of Collision
    // Override HashCode and Equals method

    @Override
    public int hashCode(){

        // Use Parameters to create hashcode Instead of memory address (memory location)
        return Objects.hash(this.name, this.id);
    }

    @Override
    public boolean equals(Object obj){

         // If Address is same then Return true
         if(this == obj){
             return true;
         }

         // If Object is Pointing to null then return false
         if(obj == null){
             return false;
         }

         // If different class then False.
         if(this.getClass() != obj.getClass()){
             return false;
         }

         // if id and name are same then return true
         Student other = (Student) obj;
         return this.id == other.getId() && Objects.equals(this.name, other.getName());
        }
}
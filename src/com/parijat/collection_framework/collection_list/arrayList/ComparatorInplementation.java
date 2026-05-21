package com.parijat.collection_framework.collection_list.arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorInplementation {
    public static void main(String[] args) {

        // Writing own Comparator
        List<String> strArray = new ArrayList<>();
        strArray.add("Alice");
        strArray.add("Bob");
        strArray.add("Charlie");
        strArray.add("Akshat");

        // By Writing Separate Class
        strArray.sort(new StringComparator());
        System.out.println(strArray);


        // Comparing objects of Class
        List<Student> student = new ArrayList<>();
        student.add(new Student("Alice",3.5));
        student.add(new Student("Bob",3.7));
        student.add(new Student("Charlie",3.5));
        student.add(new Student("Akshit",3.9));

        student.sort(new StringLengthComparator());
        for(Student stu : student){
            System.out.print(stu.getName() + " ");
        }
        System.out.println();

        // Writing Class On the go (Lambda Expression)

        // Comparing Gpa
        student.sort((s1,s2) -> (int) (s1.getGpa() - s2.getGpa())); // Direct Will not work due to decimal

        student.sort((s1,s2) -> {
            if(s1.getGpa() > s2.getGpa()){
                return 1;
            }else if(s1.getGpa() < s2.getGpa()){
                return -1;
            }else{
                return s1.getName().compareTo(s2.getName());
            }
        });

        for (Student stu : student){
            System.out.print(stu.getName() + " " + stu.getGpa() + " , ");
        }
        System.out.println();

        // Using Pre Defined method -> Java 8

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        student.sort(comparator);

        for (Student stu : student){
            System.out.print(stu.getGpa() + " " + stu.getName()  + " ");
        }

    }
}

class StringLengthComparator implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2){
        return o1.getName().length() - o2.getName().length();

        // +ve -> Ascending order
        // -ve -> Descending order
        // zero -> No change
    }
}

class StringComparator implements Comparator<String>{
    @Override
    public int compare(String o1, String o2){
        return o2.length() - o1.length();

        // +ve -> Ascending order
        // -ve -> Descending order
        // zero -> No change
    }
}


class Student{
    private final double gpa;
    private final String name;

    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

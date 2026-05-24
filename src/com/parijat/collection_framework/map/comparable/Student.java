package com.parijat.collection_framework.map.comparable;

public class Student implements Comparable<Student>{

    private String name;
    private int id;
    private double cgpa;

    public Student(String name, int id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", CGPA: " + cgpa + '\n';
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student obj) {
        // return this.cgpa - obj.cgpa;

        // To avoid decimal problem.
        return Double.compare(this.cgpa, obj.getCgpa()); // Ascending

        // return Double.compare(obj.getCgpa(), this.cgpa); // Descending
    }
}

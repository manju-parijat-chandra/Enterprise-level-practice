package com.parijat.collection_framework.map.comparable;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Ram", 1, 3.8));
        list.add(new Student("Shyam", 2, 4.1));
        list.add(new Student("Kalu", 3, 2.6));
        list.add(new Student("Bholu", 4, 3.7));
        list.add(new Student("Dholu", 5, 4.9));
        list.add(new Student("Rahul", 6, 4.1));
        list.add(new Student("Rocky", 7, 4.9));

        list.sort(null);
        // Natural Sorting -> Ascending (As Mentioned inside Class)

        System.out.println(list);

        System.out.println();
        System.out.println();

        // *********   Using Comparator ...   **********

        // Custom Sorting -> Descending + Extra Logic if Same order.

        list.sort((o1,o2) ->{
            if(o2.getCgpa() - o1.getCgpa() > 0){
                return 1;
            }else if(o2.getCgpa() - o1.getCgpa() < 0){
                return - 1;
            }else {
                return o2.getName().compareTo(o1.getName());
            }
        });

        System.out.println(list);

    }
}

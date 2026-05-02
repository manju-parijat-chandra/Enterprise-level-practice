package com.parijat.oops_concept.innerClasses.localClass;

public class Test {
    public static void main(String[] args) {

        Hotel hotel = new Hotel("SunShine Hotel", 10, 5);

        hotel.reserveRoom("Akshit", 3);

        hotel.reserveRoom("Shubham", 4);

        hotel.reserveRoom("", 1);

        hotel.reserveRoom("Parijat", -1);
    }
}

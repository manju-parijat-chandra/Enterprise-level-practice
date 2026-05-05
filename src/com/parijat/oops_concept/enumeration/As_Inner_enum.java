package com.parijat.oops_concept.enumeration;

public class As_Inner_enum {

    // Inner Enum
    enum Day{
        SUNDAY("Sunday","Raviwar"),
        MONDAY("Monday","Somwar"),
        TUESDAY("Tuesday","Mangalwar"),
        WEDNESDAY("Wednesday","Boodhwar"),
        THRUSDAY("Thrusday","Guruwar"),
        FRIDAY("Friday","Shukrawar"),
        SATURDAY("Saturday","Shaniwar");

        // Declaration to store new Property
        final String lower;
        final String hindi;

        // First Enum Constructor is Called  -> Written in Parent Enum class Automatically as we write the enum class
        // Enum(String name, int ordinal){
           // this.name = name;
           // this.ordinal = ordinal;
        //}

        // This Constructor is Called For Other two Fields
        Day (String lower, String hindi){
            this.lower = lower;
            this.hindi = hindi;
        }

    }

    public static void main(String[] args) {
        Day day = Day.MONDAY;

        System.out.println(day);
    }
}

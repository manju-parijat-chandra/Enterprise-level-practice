package com.parijat.oops_concept.enumeration;

public enum Day {
    // Objects of Day class (List of Related Things)
    // Frequently Used Data is Kept as Enumerate
    SUNDAY,MONDAY,TUESDAY, WEDNESDAY, THRUSDAY, FRIDAY, SATURDAY;

    public String toString(){
        return "Today is " + this.name();
    }
}

package com.parijat.oops_concept.access_modifiers_and_keywords;

// Inner/nested classes can be Protected
// Visible to Subclasses and To the classes in same Package
// Can be accessed by Class Present in other package which extends this Package

public class As_protected {
    protected static class as_nested{
        // Best Practice is to have it static
    }

    // Can be accessed within Package
    // Or it can be accessed by the class which Extends this class in Other Package
    protected String name;

    // Same as above
    protected void sleep(){

    }
}

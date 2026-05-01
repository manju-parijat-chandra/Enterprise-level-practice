package com.parijat.oops_concept.access_modifiers_and_keywords;

// Inner/nested classes can be Private
// Only visible to Outer class
// Or visible for this class only

public class As_private {

    // Allow Inner Class to Access Private member of outer class
    private static class as_inner{
        // Best Practice it to have it static
    }

    // If We do not want anyone to create object of this class
    // Make Constructor Private
    // Making sure that no one create Object of this class
    private As_private(){

    }


    // Need Object of Outer class to access Inner class

    // Create Instance of outer class
    // as_private outer = new as_private();

    // Use Instance of outer class to create inner instance
    // as_private.as_inner inner = outer.new as_inner();


    // Can be accessed within this class.
    // obj.name -> No Access
    private String name;

    // Can Be accessed whithin class only
    private void myMethods(){

    }

}

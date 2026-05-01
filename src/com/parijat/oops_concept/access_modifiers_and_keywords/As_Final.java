package com.parijat.oops_concept.access_modifiers_and_keywords;

// Used to make any value constant
// -> Make Any value Final -> Can't be updated.



// ***** Final Class *****
// If we do not want any class to inherit (Extend) this class then we make the class final
public final class As_Final { // Can't be inherited by any child


    // ****** Final Variables (Properties) ********
    // static -> so that it can be accessed Directly Via class
    // final -> So that it can't be updated
    public static final double pi;
    //  -> public static final double pi = 3.14;
    // Can be initialized outside or inside static block.

    static{
        pi = 3.14;
    }

    // **** Summary -> Final variable **** //

    // 1 -> Initialized inline  -> Both Possible -> Static or non-static
    // 2 -> Initialized in the static block  -> Connect to Class
    // 3 -> Initialized inside Constructor   -> Connected to Instance

    // ********** Final Methods ***********


    // function Definition (function body) -> Can't be updated by Child class
    public final void airBag(){
        System.out.println("4 Air Bags");
    }

    // Used when we do not want child class to "Override" this method.


    // *************** Summary *************

    // Final Class     -> Can't Extend
    // Final Variables -> Can't Initialize again or Update
    // Final Methods   -> Can't Override

    // we Do not make Constructor as Final
    // public final As_Final() {} -> Final is Not Allowed

}

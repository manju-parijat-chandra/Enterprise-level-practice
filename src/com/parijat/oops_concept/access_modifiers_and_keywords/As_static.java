package com.parijat.oops_concept.access_modifiers_and_keywords;

// static keyword is is primarily used for memory management
// it can be applied to Variables , Methods, Block, and nested classes

// ***** Main Concept  *****
// If static keyword is used while Declaring Properties or methods
// This method or property Now Belongs to class
// Can be accessed without making object of the class

// If normal (without static keyword) Properties and methods can only be accessed By Creating Object of the class.
public class As_static {

    // Can access Directly -> Class.property_name;
    public static int age;

    // Can be accessed Directly -> As_static.sum();
    public static void sum(){

    }

    //   **** Use case ****
    // To Keep track of count of objects

    public static int count = 0;

    // Increment Count in constructor
    public As_static() {
        count++;
        // Count will be Increased as new objects are created for this class
    }

    // If Not static -> Each time an object is created -> It create new instance of the variable count
    // In this scenario Each time count is initialized by 0 and incremented by one. So count always stays 1.


    // ***** Summary *****
    // Static Methods or variables are accessed Via Class
    // Non-Static Methods or Variables are Only accessed via object of the class

    // So whenever we want to attach property or methods with Class we use static Keyword
    // ***** this and super keyword is not used in case of static members ***** -> as it belongs to instance
    // As this -> refers to current instance
    // super -> refers to parent class

    // *** Before instance is Created -> static variables are initialized..


    public String nonStatic = "DSP";
    // As_static obj = new As_static(); -> Create instance of a class
    //  -> obj.nonStatic;    -> Access Via Instance of the class
    public static String yesStatic = "DPS";
    // As_static.yesStatic;  -> Access Directly via class

    // One Major examplw is main Methods
    // public static void main(String[] args)

    // this main method is accessed by JVM without creating object of this class.

    // In case of non-static -> It doesn't  make sense since whole name or age or property we are pointing to.


    //  **** Static Block ****
    // Executes when the class is loaded inside memory.

    static{
        System.out.println("Hello World"); // Executes as soon as object is created
    }

    //  ***** Use case *****  // One Time setup task
    // Want to make connection with Database
    // then write in static block so that connection is established before creating object of the class
    //   ==== Also used for Utility class  ====
    // Since no need to create object of that class,  just need to use value present in this class
    // Also no need to write logic again and again. -> doing sum in a project -> using sum function present in util class


    //  ******* Singleton Design Pattern *******
    // Object should be created only once

    // Create Object of the class as static member. Later used to access property of this class
    public static As_static school = new As_static(); // Declare and initialize the object

    // make constructor so that no one can create object from outside
    //   private As_static(){}

    // To access this instance
    public static As_static getInstance(){
        return school;
    }

    // So to access
    // As_static.getInstance(); this will return the object created above

    // So any time we run this we will get only this instance


}

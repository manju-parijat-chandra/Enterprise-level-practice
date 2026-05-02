package com.parijat.oops_concept.innerClasses.mamberInnerClass;

public class Car {

    // Final as Model Doesn't keep changing
    private final String model;
    boolean isEngineOn;

    // Constructor
    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    // Inner Member Class
    // Related to Above car only

    // Impossible to switch on engine of other's car by sitting in my car.
    // And If you have a car then only you  can start it's Engine

    // Object of Engine class can be created with the help of Car Object Only !!!..

    // Inner class will behave as a member of Outer class
    class Engine{
        void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model + " Engine started.");
            }else{
                System.out.println(model + " Engine is already on.");
            }
        }

        public void stop() {
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model + " Engine stopped.");
            }else{
                System.out.println(model + " Engine is already off.");
            }
        }
    }
}

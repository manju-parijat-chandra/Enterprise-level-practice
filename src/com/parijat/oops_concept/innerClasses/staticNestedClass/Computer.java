package com.parijat.oops_concept.innerClasses.staticNestedClass;

public class Computer {
    private String brand;
    private String model;
    private OperatingSystem os; // Part of computer -> Related -> Inner Member class

    public Computer(String brand, String model, String osName){
        this.brand = brand;
        this.model = model;

        // Creating object of OperatingSystem class
        // And initializing member variable -> os
        this.os = new OperatingSystem(osName);
    }

     public OperatingSystem getOs() {
        return os;
    }

    // Static Nested Class
    // Not Related to computer class
    // No Dependencies on Computer Class
    // **** If any Instance is Generated For Computer class -> No Effect on USB Class ****
    // **** Memory is Being Saved *****
    static class USB{
        private String type;

        public USB(String type){
            this.type = type;
        }

        public void displayInfo(){
            System.out.println("USB Type : " + type);
        }
    }

    // Computer has its own OS
    class OperatingSystem{
        private String osName;

        public OperatingSystem(String os){
            this.osName = os;
        }

        // Work only if public or protected Class
        public void displayInfo(){
            System.out.println("Computer Model : " + model + ", Os : " + osName);
        }
    }
}

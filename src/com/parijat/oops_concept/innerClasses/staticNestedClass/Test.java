package com.parijat.oops_concept.innerClasses.staticNestedClass;

public class Test {

    public static void main(String[] args) {
        
        Computer computer = new Computer("Hp", "Pavilion", "Windows");
        
        // Can't do this Since OperatingSystem class is Private
        //Computer.OperatingSystem = computer.new OperatingSystem();
        

        computer.getOs().displayInfo();

        // Object is Created By attaching computer class
        // But still they are Independent
        Computer.USB usb = new Computer.USB("Type C");

        usb.displayInfo();

        // We can make different number of computer -> same number of OS
        // But different number of USB -> Can be only few for 100 computer
        // **** Memory is saved ****
    }

    
}

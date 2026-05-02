package com.parijat.oops_concept.innerClasses.mamberInnerClass;

import com.sun.source.tree.CaseLabelTree;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("BMW");

        // Car.Engine  -> Reference
        // Property of Instance
        // obj.new  -> Object of inner class
        //  and Inner class is associated with the Object of Outer class

        // new Engine is associated with "car" (instance of outer class)
        Car.Engine engine = car.new Engine(); // Created New Engine with the help of instance of outer class

        // Can be accessed Only via object "engine" which is generated via instance of outer class.
        engine.start();
        engine.stop();

        System.out.println();

        Car car1 = new Car("Audi");
        Car.Engine engine1 = car1.new Engine();
        engine1.stop();
        engine1.start();
        engine1.stop();

        System.out.println();

        // ************* Without Inner Class ************
        // Not as clean code as Inner class
        // still same output

        CarNonInner car2 = new CarNonInner("Alto");
        // Can Make Object of Engine Directly.
        EngineNonInner engine2 = new EngineNonInner(car2);

        engine2.start();
        engine2.start();
        engine2.stop();

        System.out.println();

        CarNonInner car3 = new CarNonInner("Tata");
        EngineNonInner engine3 = new EngineNonInner(car3);

        engine3.stop();
        engine3.start();
        engine3.stop();

    }
}

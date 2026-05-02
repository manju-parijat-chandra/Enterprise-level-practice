package com.parijat.oops_concept.innerClasses.mamberInnerClass;

public class EngineNonInner {

    private CarNonInner car;

    public EngineNonInner(CarNonInner car){
        this.car = car;
    }

    public void start(){
        if(!car.isEngineOn()){
            car.setEngineOn(true);
            System.out.println(car.getModel() + " engine Started.");
        }else{
            System.out.println(car.getModel() + " engine is already On.");
        }
    }
    public void stop(){
        if(car.isEngineOn()){
            car.setEngineOn(false);
            System.out.println(car.getModel() + " engine Stopped.");
        }else{
            System.out.println(car.getModel() + " engine is already Off.");
        }
    }
}

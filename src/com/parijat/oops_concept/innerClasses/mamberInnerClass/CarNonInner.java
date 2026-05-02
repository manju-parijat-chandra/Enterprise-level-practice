package com.parijat.oops_concept.innerClasses.mamberInnerClass;

public class CarNonInner {

    private String model;
    private boolean isEngineOn;

    public CarNonInner(String model){
        isEngineOn = false;
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public boolean isEngineOn(){
        return isEngineOn;
    }

    public void setEngineOn(boolean isEngineOn){
        this.isEngineOn = isEngineOn;
    }
}

package com.parijat.oops_concept.inheritance;

public class Living_Organism {
    // Generalized Class.
    // Common Behavior can be added in this class. (common among living organism)
    private int lifeSpan;
    private int metabolismRate ;
    private String cellularStructure;
    private boolean isAlive;

    public Living_Organism(int lifeSpan, int metabolismRate, String cellularStructure, boolean isAlive){
        this.lifeSpan = lifeSpan;
        this.metabolismRate = metabolismRate;
        this.cellularStructure = cellularStructure;
        this.isAlive = isAlive;
    }

    // Allow missing data
    public Living_Organism(boolean isAlive){
        this.isAlive = isAlive;
    }

    public String isAlive(){
        if(isAlive){
            return "Alive";
        }else {
            return "Dead";
        }
    }

    public String soundsLike(){
        return "Some Sound";
    }

    public void imAlive(){
        System.out.println("Hey im Alive");
    }

}

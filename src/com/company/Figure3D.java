package com.company;

public abstract class Figure3D {
    private String type;

    //Aria totala si volumul

    public abstract double Aria();
    public abstract double Volum();

    //Constructor

    public Figure3D(String type){
        this.type = type;
    }

    //Getters

    public String getType(){
        return this.type;
    }

    //Setters

    public void setType(String type){
        this.type = type;
    }
}

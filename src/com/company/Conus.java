package com.company;

public class Conus extends Figure3D{
    private int raza;
    private double height;

    //Constructor

    public Conus(int raza, double height) {
        super("Conus");
        this.raza = raza;
        this.height = height;
    }

    //Getters

    public int getRaza() {
        return raza;
    }

    public double getHeight() {
        return height;
    }

    //Setters

    public void setRaza(int raza) {
        this.raza = raza;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double Aria() {
        return Math.PI * raza * Math.sqrt(Math.pow(raza, 2) + height * height) +  Math.PI * Math.pow(raza, 2);
    }

    @Override
    public double Volum(){
        return height / 3 * Math.PI * Math.pow(raza, 2);
    }
}

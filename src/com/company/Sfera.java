package com.company;

public class Sfera extends Figure3D{
    private double raza;

    //Constructor

    public Sfera(double raza) {
        super("Sfera");
        this.raza = raza;
    }

    //Getters

    public double getRaza() {
        return raza;
    }

    public void setRaza(double raza) {
        this.raza = raza;
    }

    @Override
    public double Aria() {
        return 4 * Math.PI * Math.pow(raza, 2);
    }

    @Override
    public double Volum() {
        return 4 / 3 * Math.PI * Math.pow(raza, 3);
    }
}

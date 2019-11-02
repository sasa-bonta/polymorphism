package com.company;

public class Paralelepiped extends Figure3D{
    private int lenght;
    private int width;
    private int height;

    //Constructor

    public Paralelepiped(int lenght, int width, int height) {
        super("Paralelipiped");
        this.lenght = lenght;
        this.width = width;
        this.height = height;
    }

    //Setters

    public int getLenght() {
        return lenght;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    //Setters

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double Aria() {
        return (lenght * width + lenght * height + width * height) *2;
    }

    @Override
    public double Volum() {
        return lenght * width * height;
    }
}

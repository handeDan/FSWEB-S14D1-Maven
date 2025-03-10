package com.workintech.cylinder;

public class Cylinder extends Circle{
    //instance variables:
    private double height;

    //constructor:
    public Cylinder(double radius, double height) {
        super(radius);
        if(height < 0) {
            height = 0;
        }
        this.height = height;
    }

    //getter methods:
    public double getHeight() {
        return height;
    }

    //methods:
    public double getVolume(){
        return getArea()*height;
    }
}

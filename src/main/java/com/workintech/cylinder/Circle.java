package com.workintech.cylinder;

public class Circle {
    //instance variables:
    private double radius;

    //constructor:
    public Circle( double radius){
        if(radius < 0){
            radius = 0;
        }
        this.radius = radius;
    }

    //getter methods:
    public double getRadius() {
        return radius;
    }

    //methods:
    public double getArea() {
        return radius*radius*Math.PI;
    }
}

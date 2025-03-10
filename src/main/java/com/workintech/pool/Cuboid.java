package com.workintech.pool;

public class Cuboid extends Rectangle{
    //instance variables:
    private double height;

    //constructor:
    public Cuboid(double width, double length, double height) {
        super(width, length);
        setHeight(height);
    }

    //getter methods:
    public double getHeight() {
        return height;
    }

    //setter methods:
    public void setHeight(double height) {
        this.height = (height < 0) ? 0 : height;
    }

    //methods:
    public double getVolume() {
        return getArea()*height;
    }
}

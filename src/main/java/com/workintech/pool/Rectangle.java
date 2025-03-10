package com.workintech.pool;

public class Rectangle {
    //instance variables:
    private double width;
    private double length;

    //constructor:
    public Rectangle(double width, double length){
        setWidth(width);
        setLength(length);
    }

    //getter methods:
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    //setter methods:
    public void setWidth(double width) {
        this.width = (width < 0) ? 0 : width;
    }

    public void setLength(double length) {
        this.length = (length < 0) ? 0 : length;
    }

    //methods:
    public double getArea() {
        return width*length;
    }



}

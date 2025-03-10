package com.workintech.developers;

public class Employee {
    //instance variables:
    private long id;
    private String name;
    private double salary;

    //constructor:
    public Employee(long id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //getter methods:
    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    //setter methods:
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String id) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //methods:
    public void work(){
        System.out.println("Employee starts to working");
    }
}

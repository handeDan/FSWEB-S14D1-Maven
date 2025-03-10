package com.workintech.developers;

public class SeniorDeveloper extends Employee{
    public SeniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    //override method:
    @Override
    public void work(){
        setSalary(getSalary() + 30000);
        System.out.println(getName() + " works as a Senior Developer. Salary increased to " + getSalary());
    }
}
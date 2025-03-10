package com.workintech.developers;

public class MidDeveloper extends Employee{
    public MidDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    //override method:
    @Override
    public void work(){
        setSalary(getSalary() + 20000);
        System.out.println(getName() + " works as a Mid Developer. Salary increased to " + getSalary());
    }
}

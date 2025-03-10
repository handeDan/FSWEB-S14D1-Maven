package com.workintech.developers;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(long id, String name, double salary) {
        super(id, name, salary);
    }

    //override method:
    @Override
    public void work(){
        setSalary(getSalary() + 15000);
        System.out.println(getName() + " works as a Junior Developer. Salary increased to " + getSalary());
    }
}

package com.workintech.developers;

public class HRManager extends Employee{
    //instance variables:
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[2];
        midDevelopers = new MidDeveloper[2];
        seniorDevelopers = new SeniorDeveloper[2];
    }

    //override method:
    @Override
    public void work(){
        System.out.println(getName() + " starts to working");
    }

    // JuniorDeveloper ekleme:
    public void addEmployee(JuniorDeveloper junior){
        for(int i = 0; i < juniorDevelopers.length; i++) {
            if(juniorDevelopers[i] == null) {
                juniorDevelopers[i] = junior;
                System.out.println(junior.getName() + " added to Junior Developers.");
                return;
            }
        }
        System.out.println("Junior Developer list is full.");
    }

    // MidDeveloper ekleme:
    public void addEmployee(MidDeveloper mid){
        for(int i = 0; i < midDevelopers.length; i++) {
            if(midDevelopers[i] == null) {
                midDevelopers[i] = mid;
                System.out.println(mid.getName() + " added to Mid Developers.");
                return;
            }
        }
        System.out.println("Mid Developer list is full.");
    }

    // SeniorDeveloper ekleme:
    public void addEmployee(SeniorDeveloper senior){
        for(int i = 0; i < seniorDevelopers.length; i++) {
            if(seniorDevelopers[i] == null) {
                seniorDevelopers[i] = senior;
                System.out.println(senior.getName() + " added to Senior Developers.");
                return;
            }
        }
        System.out.println("Senior Developer list is full.");
    }

}

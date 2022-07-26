package com.cc.java;

public class Mitarbeiter extends Person {
    
    
    public String workID;
    public String department;
    public String role;


    public Mitarbeiter(String name, String firstName, int birthYear, String workID, String department, String role) {
        super(name, firstName, birthYear);
        this.workID = workID;
        this.department = department;
        this.role = role;
    }

    protected void hasLunch(){
        System.out.println("I have lunch!");
    }

    protected void startsWork(){
        System.out.println("I starts working!");
    }

}

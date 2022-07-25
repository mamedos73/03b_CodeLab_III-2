package com.cc.java;

public class Mitarbeiter {
    
    
    private String name;
    private String firstName;
    private int birthYear;
    public String workID;
    public String department;
    public String role;


    public Mitarbeiter(String name, String firstName, int birthYear, String workID, String department, String role) {
        this.name = name;
        this.firstName = firstName;
        this.birthYear = birthYear;
        this.workID = workID;
        this.department = department;
        this.role = role;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }

    public int getBirthYear(){
        return this.birthYear;
    }

    public void hasLunch(){
        System.out.println("I have lunch!");
    }

    public void startsWork(){
        System.out.println("I starts working!");
    }

}

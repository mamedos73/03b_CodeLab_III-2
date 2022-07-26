package com.cc.java;

public class Person {


    private String name;
    private String firstName;
    private int birthYear;
    
    
    public Person(String name, String firstName, int birthYear) {
        this.name = name;
        this.firstName = firstName;
        this.birthYear = birthYear;
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
    
    
}

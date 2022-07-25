package com.cc.java;

public class MA_Produktion extends Mitarbeiter {

    
    public MA_Produktion(String name, String firstName, int birthYear, String workID, String department, String role) {
        super(name, firstName, birthYear, workID, department, role);
    }

    private void produceCar() {
        System.out.println("I produce a car!");
    }
    
    public void doYourWork(String flag) {
        
        switch (flag) {
            case "#hasLunch":
                hasLunch();
                break;
            case "#startsWork":
                startsWork();
                break;
                case "#doYourWork":
                produceCar();
                break;
            default:
                System.out.println("I am not at work today!");
                break;
        }
    }

    
}

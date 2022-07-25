package com.cc.java;

public class MA_Advertising extends Mitarbeiter {
    
    
    public MA_Advertising(String name, String firstName, int birthYear, String workID, String department, String role) {
        super(name, firstName, birthYear, workID, department, role);
    }

    private void sendAdvertisement() {
        System.out.println("I send Advertisement!");
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
                sendAdvertisement();
                break;
            default:
                System.out.println("I am not at work today!");
                break;
        }
    }

}

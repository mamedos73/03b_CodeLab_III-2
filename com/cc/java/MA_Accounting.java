package com.cc.java;

public class MA_Accounting extends Mitarbeiter {
    

    public MA_Accounting(String name, String firstName, int birthYear, String workID, String department, String role) {
        super(name, firstName, birthYear, workID, department, role);
    }

    private void callsCustomer() {
        System.out.println("I call to customer!");
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
                callsCustomer();
                break;
            default:
                System.out.println("I am not at work today!");
                break;
        }
    }
}

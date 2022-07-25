package com.cc.java;

public class Firma {
    
    public static void main(String[] args) {
    
        
        MA_Accounting ma_Accounting1 = new MA_Accounting("Hoff", "Karl", 1975, "1", "Buchhandlung", "Abteilungsleiter");
        MA_Accounting ma_Accounting2 = new MA_Accounting("Weiß", "Lisa", 1983, "2", "Buchhandlung", "Buchhalter");
        MA_Accounting ma_Accounting3 = new MA_Accounting("Hoffmann", "Berta", 1991, "3", "Buchhandlung", "Buchhalter");

        output("Name: " + ma_Accounting1.getName());
        output("Vorname: " + ma_Accounting1.getFirstName());
        output("Geburtsjahr: " + String.valueOf(ma_Accounting1.getBirthYear()));
        output("Mitarbeiternummer: " + ma_Accounting1.workID);
        output("Abteilung: " + ma_Accounting1.department);
        output("Position: " + ma_Accounting1.role);
        ma_Accounting1.doYourWork("#hasLunch");

        output("---------------------");

        output("Name: " + ma_Accounting2.getName());
        output("Vorname: " + ma_Accounting2.getFirstName());
        output("Geburtsjahr: " + String.valueOf(ma_Accounting2.getBirthYear()));
        output("Mitarbeiternummer: " + ma_Accounting2.workID);
        output("Abteilung: " + ma_Accounting2.department);
        output("Position: " + ma_Accounting2.role);
        ma_Accounting2.doYourWork("#startsWork");

        output("---------------------");

        output("Name: " + ma_Accounting3.getName());
        output("Vorname: " + ma_Accounting3.getFirstName());
        output("Geburtsjahr: " + String.valueOf(ma_Accounting3.getBirthYear()));
        output("Mitarbeiternummer: " + ma_Accounting3.workID);
        output("Abteilung: " + ma_Accounting3.department);
        output("Position: " + ma_Accounting3.role);
        ma_Accounting3.doYourWork("#doYourWork");

        output("--------------------");

        MA_Advertising ma_Advertising1 = new MA_Advertising("Klein", "Klaus", 1970, "4", "Werbung", "Abteilungsleiter");
        MA_Advertising ma_Advertising2 = new MA_Advertising("Fischmann", "Klara", 1981, "5", "Werbung", "Meneger");
        MA_Advertising ma_Advertising3 = new MA_Advertising("Kleist", "Erik", 1987, "6", "Werbung", "Meneger");

        output("Name: " + ma_Advertising1.getName());
        output("Vorname: " + ma_Advertising1.getFirstName());
        output("Geburtsjahr: " + String.valueOf(ma_Advertising1.getBirthYear()));
        output("Mitarbeiternummer: " + ma_Advertising1.workID);
        output("Abteilung: " + ma_Advertising1.department);
        output("Position: " + ma_Advertising1.role);
        ma_Advertising1.doYourWork("#hasLunch");

        output("---------------------");

        output("Name: " + ma_Advertising2.getName());
        output("Vorname: " + ma_Advertising2.getFirstName());
        output("Geburtsjahr: " + String.valueOf(ma_Advertising2.getBirthYear()));
        output("Mitarbeiternummer: " + ma_Advertising2.workID);
        output("Abteilung: " + ma_Advertising2.department);
        output("Position: " + ma_Advertising2.role);
        ma_Advertising2.doYourWork("#startsWork");

        output("---------------------");

        output("Name: " + ma_Advertising3.getName());
        output("Vorname: " + ma_Advertising3.getFirstName());
        output("Geburtsjahr: " + String.valueOf(ma_Advertising3.getBirthYear()));
        output("Mitarbeiternummer: " + ma_Advertising3.workID);
        output("Abteilung: " + ma_Advertising3.department);
        output("Position: " + ma_Advertising3.role);
        ma_Advertising3.doYourWork("#doYourWork");

        output("--------------------");

        MA_Produktion ma_Produktion1 = new MA_Produktion("Krone", "Teodor", 1982, "7", "Produktion", "Master");
        MA_Produktion ma_Produktion2 = new MA_Produktion("Fillmann", "Alex", 1987, "8", "Produktion", "Maschinenbediner");
        MA_Produktion ma_Produktion3 = new MA_Produktion("Baumann", "Tom", 1995, "9", "Produktion", "Technik");

        output("Name: " + ma_Produktion1.getName());
        output("Vorname: " + ma_Produktion1.getFirstName());
        output("Geburtsjahr: " + String.valueOf(ma_Produktion1.getBirthYear()));
        output("Mitarbeiternummer: " + ma_Produktion1.workID);
        output("Abteilung: " + ma_Produktion1.department);
        output("Position: " + ma_Produktion1.role);
        ma_Produktion1.doYourWork("#hasLunch");

        output("--------------------");

        output("Name: " + ma_Produktion2.getName());
        output("Vorname: " + ma_Produktion2.getFirstName());
        output("Geburtsjahr: " + String.valueOf(ma_Produktion2.getBirthYear()));
        output("Mitarbeiternummer: " + ma_Produktion2.workID);
        output("Abteilung: " + ma_Produktion2.department);
        output("Position: " + ma_Produktion2.role);
        ma_Produktion2.doYourWork("#startsWork");

        output("--------------------");

        output("Name: " + ma_Produktion3.getName());
        output("Vorname: " + ma_Produktion3.getFirstName());
        output("Geburtsjahr: " + String.valueOf(ma_Produktion3.getBirthYear()));
        output("Mitarbeiternummer: " + ma_Produktion3.workID);
        output("Abteilung: " + ma_Produktion3.department);
        output("Position: " + ma_Produktion3.role);
        ma_Produktion3.doYourWork("#doYourWork");

        output("--------------------");

    }

    public static void output(String outputStr) {
        System.out.println(outputStr);
    }



}


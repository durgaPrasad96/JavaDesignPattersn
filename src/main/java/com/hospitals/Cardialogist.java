package com.hospitals;

import com.observer.Admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Cardialogist implements Hospitals{
    String Message;

    public void setMessage(String message) {
        Message = message;
        System.out.println(Message + "recieved by Caridaology");
    }
    static List<String> doctors = new ArrayList<String>();

    static {
        doctors.add("Cardialogist Doctor1");
        doctors.add("Cardialogist Doctor2");
        doctors.add("Cardialogist Doctor3");
        doctors.add("Cardialogist Doctor4");
        doctors.add("Cardialogist Doctor5");
    }
    Admin ad = Admin.getInstance();
    public Cardialogist()
    {
        ad.add(this);
    }
    @Override
    public void Treatement() {
        Random ran = new Random();
        int MedicalBill = ran.nextInt(1000);
        System.out.println("Dr. " + doctors.get(ran.nextInt(doctors.size())) + " Assigned to the patient");
        System.out.println("Suggesting common Heart related  tests");
        System.out.println("Doctor Fee: 500 \n"+"Medical Bill : "+MedicalBill);
        System.out.println("Total Bill "+(500+MedicalBill));
    }


}

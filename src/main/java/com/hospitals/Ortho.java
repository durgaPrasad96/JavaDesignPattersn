package com.hospitals;

import com.observer.Admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ortho implements Hospitals {
    String Message;
    Admin ad = Admin.getInstance();
    public Ortho()
    {
        ad.add(this);
    }
    public void setMessage(String message) {
        Message = message;
        System.out.println(Message + "Recieved by Orhto");
    }
    static List<String> doctors = new ArrayList<String>();

    static {
        doctors.add("Ortho Doctor1");
        doctors.add("Ortho Doctor2");
        doctors.add("Ortho Doctor3");
        doctors.add("Ortho Doctor4");
        doctors.add("Ortho Doctor5");
    }

    @Override
    public void Treatement() {
        Random ran = new Random();
        int MedicalBill = ran.nextInt(1000);
        System.out.println("Dr. " + doctors.get(ran.nextInt(doctors.size())) + " Assigned to the patient");
        System.out.println("Suggesting common Ortho related  tests");
        System.out.println("Doctor Fee: 500 \n"+"Medical Bill : "+MedicalBill);
        System.out.println("Total Bill "+(500+MedicalBill));
    }


}

package com.hospitals;

import com.observer.Admin;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ENTHospital implements Hospitals{
    String Message;
    Admin ad = Admin.getInstance();
    public ENTHospital()
    {
        ad.add(this);

    }


    public void setMessage(String message) {
        Message = message;
        System.out.println(Message +"received by ENT");
    }

    static List<String> doctors = new ArrayList<String>();
    static {
        doctors.add("ENTDoctor1");
        doctors.add("ENTDoctor2");
        doctors.add("ENTDoctor3");
        doctors.add("ENTDoctor4");
        doctors.add("ENTDoctor5");
    }

    @Override
    public void Treatement() {
        Random ran = new Random();
        int MedicalBill = ran.nextInt(1000);
        System.out.println("Dr. "+doctors.get(ran.nextInt(doctors.size()))+" Assigned to the patient");
        System.out.println("Suggesting common Ent tests");
        System.out.println("Doctor Fee: 500 \n"+"Medical Bill : "+MedicalBill);
        System.out.println("Total Bill "+(500+MedicalBill));

    }
}

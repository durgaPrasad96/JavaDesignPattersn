package com.observer;

import com.factory.Hospital;
import com.hospitals.Cardialogist;
import com.hospitals.ENTHospital;
import com.hospitals.Hospitals;
import com.hospitals.Ortho;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Admin {
    List<Hospitals> hosp = new ArrayList<Hospitals>();
    private static Admin ad = new Admin();

    public List<Hospitals> getHosp() {
        return hosp;
    }

    private Admin()
    {}
    public static Admin getInstance(){
          if(ad == null)
                ad = new Admin();
        return ad;
    }
    public void add(Hospitals hp)
    {
        hosp.add(hp);
    }

    public static void main(String args[])
    {
        Hospital hp = new Hospital();
        new Cardialogist();
        new Ortho();
        new ENTHospital();
        Thread t1 = new Thread(()->{
            System.out.println("Sending Messgaes");
             try{Thread.sleep(50);} catch(Exception e){}
            for(Hospitals hps: ad.hosp ) {
                hps.setMessage("Today close all hospitals ");
            }
        });
        t1.start();
        try{Thread.sleep(10);} catch(Exception e){}
        System.out.println("Main method continued........");
    }
}

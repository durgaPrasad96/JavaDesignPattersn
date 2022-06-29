package com.observer;

import com.hospitals.Hospitals;

public class SendMessage extends Thread{
    public void run()
    {
        Admin ad = Admin.getInstance();
        try{Thread.sleep(5000);} catch(Exception e){}
        for(Hospitals hp: ad.getHosp() )
        {
            hp.setMessage("Today close all hospitals ");
        }

    }

}

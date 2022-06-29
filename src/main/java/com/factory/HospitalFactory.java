package com.factory;

import com.hospitals.Cardialogist;
import com.hospitals.ENTHospital;
import com.hospitals.Hospitals;
import com.hospitals.Ortho;

public class HospitalFactory {
    public static Hospitals getInstance(String keyword)
    {
        if(keyword.equals("Ear"))
            return new ENTHospital();
        else if(keyword.equals("Heart"))
            return new Cardialogist();
        else
            return new Ortho();
    }
}

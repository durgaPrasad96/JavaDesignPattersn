package com.strategy;

import com.factory.Hospital;
import com.hospitals.Cardialogist;
import com.hospitals.ENTHospital;
import com.hospitals.Ortho;

public class OPD {
    public static void main(String args[])
    {
          Hospital h = new Hospital();
          switch("Heart")
          {
              case "ear":
                  h.callHospitals(new ENTHospital());
              break;
              case "Heart":
                  h.callHospitals(new Cardialogist());
                  break;
              default:
                  h.callHospitals(new Ortho());
                  break;
          }

    }
}

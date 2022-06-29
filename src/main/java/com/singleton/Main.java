package com.singleton;

public class Main {
    public static void main(String args[])
    {
        Hospital hosp = Hospital.getInstance();
        hosp.setHid(100);
        hosp.setName("KIMS");
        System.out.println("Hospital id "+hosp.getHid());
        System.out.println("Hospital Name "+ hosp.getName());
    }
}

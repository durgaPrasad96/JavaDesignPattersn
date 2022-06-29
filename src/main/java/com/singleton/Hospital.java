package com.singleton;

public class Hospital {
    int Hid;
    String Name;
    private static Hospital hosp = new Hospital();
    private Hospital()
    {}
    public static Hospital getInstance()
    {
        return hosp;
    }

    public int getHid() {
        return Hid;
    }
    public void setHid(int hid) {
        Hid = hid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

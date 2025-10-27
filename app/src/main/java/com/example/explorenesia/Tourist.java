package com.example.explorenesia;

public class Tourist {
    private String name;
    private String location;
    private String desc;
    private int pict;

    public Tourist(String name, String location, String desc, int pict) {
        this.name = name;
        this.location = location;
        this.desc = desc;
        this.pict = pict;
    }

    public String getName() { return name; }
    public String getLocation() { return location; }
    public String getDesc() { return desc; }
    public int getPict() { return pict; }
}

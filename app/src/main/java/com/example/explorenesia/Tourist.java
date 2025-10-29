package com.example.explorenesia;

public class Tourist {
    private String name;
    private String location;
    private String desc;
    private int pict;
    private String maps;
    private float rating;


    public Tourist(String name, String location, String desc, int pict, String maps, float rating) {
        this.name = name;
        this.location = location;
        this.desc = desc;
        this.pict = pict;
        this.maps = maps;
        this.rating = rating;
    }

    public String getName() { return name; }
    public String getLocation() { return location; }
    public String getDesc() { return desc; }
    public int getPict() { return pict; }
    public String getMaps() { return maps; }
    public float getRating() {return rating;}
}

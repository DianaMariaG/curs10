package ro.fasttrackit.curs10.classes;

public class Flashlight {
    private int lumens;
    private String battery;

    public Flashlight (int lumens, String battery) {
        this.lumens = lumens;
        this.battery = battery;
    }
    public int getLumens(){
        return this.lumens;
    }
    public String getBattery(){
        return this.battery;
    }
}

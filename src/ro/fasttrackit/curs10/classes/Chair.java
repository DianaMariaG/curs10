package ro.fasttrackit.curs10.classes;

public class Chair {
    private int legs;
    private String woodType;

    public Chair (int legs, String woodType) {
        this.legs = legs;
        this.woodType = woodType;
    }
    public int getLegs(){
        return this.legs;
    }
    public String getWoodType(){
        return this.woodType;
    }
}

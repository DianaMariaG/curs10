package ro.fasttrackit.curs10.classes;

public class Door {
    private int height;
    private String resistance;

    public Door (int height, String resistance) {
        this.height = height;
        this.resistance = resistance;
    }
    public int getHeight(){
        return this.height;
    }
    public String getResistance(){
        return this.resistance;
    }
}

package ro.fasttrackit.curs10.classes;

public class TV {
    private String resolution;
    private int screenSize;

    public TV (String resolution, int screenSize) {
        this.resolution = resolution;
        this.screenSize = screenSize;
    }
    public String getResolution(){
        return this.resolution;
    }
    public int getScreenSize(){
        return this.screenSize;
    }
}

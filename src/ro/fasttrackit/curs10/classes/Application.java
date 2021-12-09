package ro.fasttrackit.curs10.classes;

public class Application {
    private String userInterface;
    private double loadingTime;

    public Application (String userInterface, double loadingTime) {
        this.userInterface = userInterface;
        this.loadingTime = loadingTime;
    }
    public String getUserInterface(){
        return this.userInterface;
    }
    public double getLoadingTime(){
        return this.loadingTime;
    }
}

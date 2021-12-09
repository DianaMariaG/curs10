package ro.fasttrackit.curs10.classes;

public class Pool {
    private String waterClarity;
    private int temperature;

    public Pool (String waterClarity, int temperature) {
        this.waterClarity = waterClarity;
        this.temperature = temperature;
    }
    public String getWaterClarity(){
        return this.waterClarity;
    }
    public int getTemperature(){
        return this.temperature;
    }
}

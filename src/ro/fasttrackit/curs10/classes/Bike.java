package ro.fasttrackit.curs10.classes;

public class Bike {
    private int speed;
    private String brand;

    public Bike (int speed, String brand) {
        this.speed = speed;
        this.brand = brand;
    }
    public int getSpeed(){
        return this.speed;
    }
    public String getBrand(){
        return this.brand;
    }
}

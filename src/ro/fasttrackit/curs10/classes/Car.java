package ro.fasttrackit.curs10.classes;

public class Car {
    private String brand;
    private String colour;

    public Car (String brand, String colour) {
        this.brand = brand;
        this.colour = colour;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getColour(){
        return this.colour;
    }
}

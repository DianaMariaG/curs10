package ro.fasttrackit.curs10.classes;

public class Milk {
    private int fats;
    private int proteins;

    public Milk (int fats, int proteins) {
        this.fats = fats;
        this.proteins = proteins;
    }
    public int getFats(){
        return this.fats;
    }
    public int getProteins(){
        return this.proteins;
    }
}

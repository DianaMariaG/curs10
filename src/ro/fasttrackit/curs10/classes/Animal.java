package ro.fasttrackit.curs10.classes;

public class Animal {
    private String species;
    private boolean isDangerous;

    public Animal (String species, boolean isDangerous) {
        this.species = species;
        this.isDangerous = isDangerous;
    }
    public String getSpecies() {
        return this.species;
    }
    public boolean isDangerous(){
        return this.isDangerous;
    }
}

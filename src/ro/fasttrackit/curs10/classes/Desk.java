package ro.fasttrackit.curs10.classes;

public class Desk {
    private String texture;
    private String toughness;

    public Desk (String texture, String toughness) {
        this.texture = texture;
        this.toughness = toughness;
    }
    public String getTexture(){
        return this.texture;
    }
    public String getToughness(){
        return this.toughness;
    }
}

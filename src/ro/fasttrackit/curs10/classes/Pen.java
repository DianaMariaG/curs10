package ro.fasttrackit.curs10.classes;

public class Pen {
    private String inkColour;
    private String pointMaterial;

    public Pen (String inkColour, String pointMaterial) {
        this.inkColour = inkColour;
        this.pointMaterial = pointMaterial;
    }
    public String getInkColour(){
        return this.inkColour;
    }
    public String getPointMaterial(){
        return this.pointMaterial;
    }
}

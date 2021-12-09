package ro.fasttrackit.curs10.classes;

public class Window {
    private String glassTransparency;
    private boolean open;

    public Window (String glassTransparency, boolean open) {
        this.glassTransparency = glassTransparency;
        this.open = open;
    }
    public String getGlassTransparency(){
        return this.glassTransparency;
    }
    public boolean open(){
        return this.open;
    }
}

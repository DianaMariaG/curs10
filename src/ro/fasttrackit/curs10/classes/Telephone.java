package ro.fasttrackit.curs10.classes;

public class Telephone {
    private String screenBrightness;
    private String soundClarity;

    public Telephone (String screenBrightness, String soundClarity) {
        this.screenBrightness = screenBrightness;
        this.soundClarity = soundClarity;
    }
    public String getScreenBrightness(){
        return this.screenBrightness;
    }
    public String getSoundClarity(){
        return this.soundClarity;
    }
}

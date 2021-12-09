package ro.fasttrackit.curs10.classes;

public class Toothbrush {
    private int spikes;
    private boolean isElectric;

    public Toothbrush (int spikes, boolean isElectric) {
        this.spikes = spikes;
        this.isElectric = isElectric;
    }
    public int getSpikes(){
        return this.spikes;
    }
    public boolean isElectric(){
        return this.isElectric;
    }
}

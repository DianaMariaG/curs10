package ro.fasttrackit.curs10.classes;

public class OperatingSystem {
    private int functions;
    private String design;

    public OperatingSystem (int functions, String design) {
        this.functions = functions;
        this.design = design;
    }
    public int getFunctions(){
        return this.functions;
    }
    public String getDesign(){
        return this.design;
    }
}

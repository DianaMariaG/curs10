package ro.fasttrackit.curs10.classes;

public class Laptop {
    private int memory;
    private String processor;

    public Laptop (int memory, String processor) {
        this.memory = memory;
        this.processor = processor;
    }
    public int getMemory(){
        return this.memory;
    }
    public String getProcessor(){
        return this.processor;
    }
}

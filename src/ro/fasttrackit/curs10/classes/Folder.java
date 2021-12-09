package ro.fasttrackit.curs10.classes;

public class Folder {
    private String name;
    private int usedMemory;

    public Folder (String name, int usedMemory) {
        this.name = name;
        this.usedMemory = usedMemory;
    }
    public String getName(){
        return this.name;
    }
    public int getUsedMemory(){
        return this.usedMemory;
    }
}

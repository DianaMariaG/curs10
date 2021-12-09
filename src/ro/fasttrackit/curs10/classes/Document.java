package ro.fasttrackit.curs10.classes;

public class Document {
    private String name;
    private int words;

    public Document (String name, int emptySpace) {
        this.name = name;
        this.words = emptySpace;
    }
    public String getName(){
        return this.name;
    }
    public int getWords(){
        return this.words;
    }
}

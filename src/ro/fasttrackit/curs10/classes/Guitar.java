package ro.fasttrackit.curs10.classes;

public class Guitar {
    private int stringsNumber;
    private String type;

    public Guitar (int stringsNumber, String type) {
        this.stringsNumber = stringsNumber;
        this.type = type;
    }
    public int getStringsNumber(){
        return this.stringsNumber;
    }
    public String type(){
        return this.type;
    }
}

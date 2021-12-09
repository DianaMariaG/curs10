package ro.fasttrackit.curs10.classes;

public class House {
    private int size;
    private int dwellers;

    public House (int size, int dwellers) {
        this.size = size;
        this.dwellers = dwellers;
    }
    public int getSize() {
        return this.size;
    }
    public int getDwellers(){
        return this.dwellers;
    }
}

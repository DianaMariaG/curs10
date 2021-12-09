package ro.fasttrackit.curs10.classes;

public class Classroom {
    private int desks;
    private int thoughtfulStudents;

    public Classroom (int desks, int thoughtfulStudents) {
        this.desks = desks;
        this.thoughtfulStudents = thoughtfulStudents;
    }
    public int getDesks(){
        return this.desks;
    }
    public int getThoughtfulStudents(){
        return this.thoughtfulStudents;
    }
}

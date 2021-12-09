package ro.fasttrackit.curs10.classes;

public class School {
    private int rooms;
    private int teachers;

    public School (int rooms, int teachers) {
        this.rooms = rooms;
        this.teachers = teachers;
    }
    public int getRooms(){
        return this.rooms;
    }
    public int getTeachers(){
        return this.teachers;
    }
}

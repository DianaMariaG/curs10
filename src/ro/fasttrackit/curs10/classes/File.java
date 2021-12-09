package ro.fasttrackit.curs10.classes;

public class File {
    private int javaProjects;
    private boolean isEmpty;

    public File (int javaProjects, boolean isEmpty) {
        this.javaProjects = javaProjects;
        this.isEmpty = isEmpty;
    }
    public int getJavaProjects(){
        return this.javaProjects;
    }
    public boolean isEmpty(){
        return this.isEmpty;
    }
}

package ro.fasttrackit.curs10.classes;

public class Person {
    private int age;
    private String profession;


    public Person (int age, String profession) {
        this.age = age;
        this.profession = profession;
    }

    public int getAge() {
        return this.age;
    }
    public String getProfession() {
        return this.profession;
    }
}


package ro.fasttrackit.curs10.ex3;

public class Person {
    private String name;
    private int age;
    private String position;

    public Person (String name, int age, String pos) {
        this.name = name;
        this.age = age;
        this.position = pos;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getPosition() {
        return this.position;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}

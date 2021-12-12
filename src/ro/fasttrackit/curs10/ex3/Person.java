package ro.fasttrackit.curs10.ex3;

import ro.fasttrackit.curs10.homework.StringUtils;

public class Person {
    private String name;
    private int age;
    private String position;

    public Person (String name, int age, String pos) {
        this.name = StringUtils.ensureNoEmpty(name);
        this.age = Math.max(age, 18);
        this.position = StringUtils.ensureNoEmpty(pos);
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public String getPosition() {
        return position;
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

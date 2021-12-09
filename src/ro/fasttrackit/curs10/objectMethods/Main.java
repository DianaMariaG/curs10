package ro.fasttrackit.curs10.objectMethods;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("Ana"); //nu scriu Object p pt ca nu mai pot apela metodele din Person

        System.out.println(p.equals("test")); //verifica daca 2 obiecte sunt egale
        System.out.println(p.equals(new Person("Ana")));
        System.out.println(p.equals(new Person("Bogdan")));
        System.out.println(p.toString());
        System.out.println(p.getClass());
        System.out.println(p.hashCode());
    }
}

class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return "name";
    }

    public boolean equals(Object other) {
        if(other == this) {
            return true;
        }
        if(!other.getClass().equals(this.getClass())) {
            return false;
        }
        Person otherPerson = (Person) other;
        return otherPerson.name.equals(this.name);
    }
}

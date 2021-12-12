package ro.fasttrackit.curs10.ex3;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Person> employees = new ArrayList<>();

    public Person getManager() {
        for (Person employee : employees) {
            if (employee.getPosition().equals("manager")) {
                return employee;
            }
        }
        return null;
    }

    public List<Person> getPersons (String profession) {
        List <Person> personsWithSameProfession = new ArrayList<>();
        for (Person employee : employees) {
            if (employee.getPosition().equalsIgnoreCase(profession)) {
                personsWithSameProfession.add(employee);
            }
        }
        return personsWithSameProfession;
    }

    public List<Person> getPersonsOlder (int age) {
        List<Person> olderPersons = new ArrayList<>();
        for (Person employee : employees) {
            if (employee.getAge() > age) {
                olderPersons.add(employee);
            }
        }
        return olderPersons;
    }

    public List<Person> getPerson (String filterName) {
        List<Person> specificNames = new ArrayList<>();
        for (Person employee : employees) {
            if (employee.getName().contains(filterName)) {
                specificNames.add(employee);
            }
        }
        return specificNames;
    }

    public void employ (Person person) {
        employees.add(person);
    }

    public void employAll (List<Person> allPersonsList) {
        if (allPersonsList != null) {
            employees.addAll(allPersonsList);
        }
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees +
                '}';
    }
}

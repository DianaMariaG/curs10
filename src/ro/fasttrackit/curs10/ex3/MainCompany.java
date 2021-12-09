package ro.fasttrackit.curs10.ex3;

import java.util.Arrays;

public class MainCompany {
    public static void main(String[] args) {
        Company company = new Company();
        Person manager = new Person ("Dan",24,"manager");
        Person welder1 = new Person ("Peter",40,"welder");
        Person welder2 = new Person ("Steve",37,"welder");
        Person carpenter1 = new Person ("Bill",48,"carpenter");
        Person carpenter2 = new Person ("William",53,"carpenter");
        Person plummer1 = new Person ("Bob", 29,"plummer");
        Person plummer2 = new Person ("John", 33,"plummer");
        Person plummer3 = new Person ("Sylvester", 58,"plummer");

        company.employ(manager);
        company.employAll(Arrays.asList(welder1, welder2, carpenter1, carpenter2, plummer1, plummer2, plummer3));
        System.out.println(company);

        System.out.println(company.getManager());
        System.out.println(company.getPersons("plummer"));

        System.out.println(company.getPerson("Der"));
        System.out.println(company.getPersonsOlder(37));

    }
}

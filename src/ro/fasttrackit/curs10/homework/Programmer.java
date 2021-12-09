package ro.fasttrackit.curs10.homework;

import java.time.LocalDate;

public class Programmer extends Employee{
    private String language;

    public Programmer(String name, LocalDate birthday, LocalDate dateOfEmployment, String lang) {
        super(name, birthday, dateOfEmployment, "programmer");
        this.language = lang;
    }

    public String getLanguage() {
        return this.language;
    }
}

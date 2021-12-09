package ro.fasttrackit.curs10.homework;

import java.time.LocalDate;

public class DatabaseAdmin extends Employee{
    private String database;

    public DatabaseAdmin(String name, LocalDate birthday, LocalDate dateOfEmployment,String database) {
        super(name, birthday, dateOfEmployment, "db Admin");
        this.database = database;
    }

    public String getDatabase() {
        return database;
    }

    @Override
    public String getName() {
        return "db" + super.getName();
    }

    @Override
    public String toString() {
        return "DatabaseAdmin{" +
                super.toString() + //am adaugat eu SAU
                //"name= '" + getName()+
                //"birthday='" + getBirthday() +
                "database='" + database + '\'' +
                '}';
    }
}

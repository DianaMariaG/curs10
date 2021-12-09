package ro.fasttrackit.curs10.homework;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;

import static java.time.LocalDate.now;
import static java.time.temporal.ChronoUnit.*;
import static ro.fasttrackit.curs10.homework.StringUtils.ensureNoEmpty;

public class Employee implements Person{
    private String name;
    private LocalDate birthday;
    private LocalDate dateOfEmployment;
    private String position;

    public Employee(String name, LocalDate birthday, LocalDate dateOfEmployment, String pos) {
        setName(name);
        this.birthday = (birthday != null && birthday.isBefore(now()))
            ? birthday
            : now().minus(18, YEARS);
        this.dateOfEmployment = validateDateOfEmployment(dateOfEmployment, this.birthday);
        this.position = ensureNoEmpty(position);
    }

    public void moveEmploymentDate(int months) {
        this.dateOfEmployment = dateOfEmployment.plus(months, MONTHS);
    }
    public void setName(String name) {
        this.name = ensureNoEmpty(name);
    }


    private LocalDate validateDateOfEmployment(LocalDate dateOfEmployment, LocalDate birthday) {
        if(dateOfEmployment != null && dateOfEmployment.minus(18,YEARS).isAfter(birthday)) {
            return dateOfEmployment;
        } else {
            return birthday.plus(18,YEARS);
        }
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public LocalDate getBirthday() {
        return this.birthday;
    }
    public LocalDate getDateOfEmployment() {
        return dateOfEmployment;
    }
    public String getPosition() {
        return position;
    }

    @Override //se apeleaza cand printez direct un obiect de tipul acesta
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", dateOfEmployment=" + dateOfEmployment +
                ", position='" + position + '\'' +
                '}';
    }
}

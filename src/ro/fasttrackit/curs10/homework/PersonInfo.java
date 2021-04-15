package ro.fasttrackit.curs10.homework;

import java.time.LocalDate;
import java.time.Period;

public class PersonInfo {
    private final Person person;

    public PersonInfo(Person person) {
        this.person = person;
    }

    public String fullName() {
        return person.getFirstName() + " " + person.getLastName();
    }

    public int calculateAge() {
        return Period.between(person.getBirthday(), LocalDate.now()).getYears();
    }
}

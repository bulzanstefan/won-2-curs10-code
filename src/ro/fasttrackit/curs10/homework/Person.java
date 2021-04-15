package ro.fasttrackit.curs10.homework;

import java.time.LocalDate;

public interface Person {
    String getFirstName();

    String getLastName();

    LocalDate getBirthday();

    String getAddress();
}

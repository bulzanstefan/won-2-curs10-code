package ro.fasttrackit.curs10.interfaceInheritance;

import ro.fasttrackit.curs10.homework.Person;

import java.time.LocalDate;

public interface Student extends Person {
    int[] getGrades();
}

class UBBStudent implements Student {
    private final String firstName;
    private final String lastName;

   public UBBStudent(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public int[] getGrades() {
        return new int[]{10, 9, 6, 10};
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getAddress() {
        return "Cluj";
    }

    @Override
    public LocalDate getBirthday() {
        return LocalDate.now();
    }
}

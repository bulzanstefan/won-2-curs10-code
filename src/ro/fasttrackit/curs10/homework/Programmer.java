package ro.fasttrackit.curs10.homework;

import java.time.LocalDate;

public class Programmer extends Employee {
    private long salary;
    private String language;

    public Programmer(String firstName, String lastName, LocalDate birthday, String address, long salary, String language) {
        this(firstName, lastName, birthday, address, salary, LocalDate.now(), language);
    }

    public Programmer(String firstName, String lastName, LocalDate birthday, String address, long salary, LocalDate employmentDate, String language) {
        super(firstName, lastName, birthday, address, "PROGRAMATOR", employmentDate);
        this.salary = salary;
        this.language = language;
    }

    @Override
    public long getSalary() {
        return Math.round(salary * 1.3);
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}

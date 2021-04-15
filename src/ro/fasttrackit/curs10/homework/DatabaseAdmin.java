package ro.fasttrackit.curs10.homework;

import java.time.LocalDate;

public class DatabaseAdmin extends Employee {
    private final String dbTechnology;
    private long salary;

    public DatabaseAdmin(String firstName, String lastName, LocalDate birthday, String address, long salary, String dbTech) {
        super(firstName, lastName, birthday, address, "DB_ADMIN", LocalDate.now());
        this.salary = salary;
        this.dbTechnology = dbTech;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public long getSalary() {
        return Math.round(salary * 1.1);
    }

    public String getDbTechnology() {
        return dbTechnology;
    }
}

package com.netlight.lab9;

public class NewEmployee {
    private String firstName, lastName, place;
    private long salary;
    private Dates dates;

    public NewEmployee(String firstName, String lastName, String place, int salary, Dates dates) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.place = place;
        // replace phone with salary for more clear example
        this.salary = salary;
        this.dates = dates;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Dates getDates() {
        return dates;
    }

    public void setDates(Dates dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", place='" + place + '\'' +
                ", salary='" + salary + '\'' +
                ", dates=" + dates +
                '}';
    }
}
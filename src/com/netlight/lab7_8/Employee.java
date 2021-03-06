package com.netlight.lab7_8;

public class Employee {
    String lastname;
    String name;
    int baseSalary;
    EmployeePosition position;


    public Employee(String lastname,
                    String name,
                    int baseSalary,
                    EmployeePosition emposition) {
        this.lastname = lastname;
        this.name = name;
        this.baseSalary = baseSalary;
        this.position = emposition;
    }

    public double getSalary() {
        return position.calcSalary(baseSalary);
    }
}

package com.netlight.lab78;

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

}

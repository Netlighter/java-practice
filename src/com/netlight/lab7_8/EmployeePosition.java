package com.netlight.lab7_8;

public interface EmployeePosition {
    Company com = null;

    String getJobTitle();

    double calcSalary(double baseSalary);
}

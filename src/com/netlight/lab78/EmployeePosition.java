package com.netlight.lab78;

public interface EmployeePosition {
    Company com = null;

    String getJobTitle();

    double calcSalary(double baseSalary);
}

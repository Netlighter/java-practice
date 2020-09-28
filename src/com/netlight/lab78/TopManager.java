package com.netlight.lab78;

public class TopManager implements EmployeePosition {

    Company company; //TODO done here

    @Override
    public String getJobTitle() {
        return "Top Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary + (baseSalary * 1.5);
    }
}

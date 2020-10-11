package com.netlight.lab7_8;

public class TopManager implements EmployeePosition {

    Company company;

    public TopManager(Company company) {
        this.company = company;
    }

    @Override
    public String getJobTitle() {
        return "Top Manager";
    }

    @Override
    public double calcSalary(double baseSalary) {
        if (company.income > 10000000) {
            return baseSalary + (company.income * 1.5);
        } else return baseSalary;
    }
}

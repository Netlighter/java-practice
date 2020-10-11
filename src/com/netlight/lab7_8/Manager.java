package com.netlight.lab7_8;

public class Manager implements EmployeePosition {
    private double income;

    @Override
    public String getJobTitle() {
        return "Manager";
    }


    double generateIncome() {
        this.income = 115000 + Math.random() * 25000;
        return this.income;
    }

    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary + (income * 0.05);
    }
}

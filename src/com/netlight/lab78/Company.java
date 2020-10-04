package com.netlight.lab78;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {
    String name;
    ArrayList<Employee> empar = new ArrayList<Employee>();
    double income;

    public Company(String name) {
        this.name = name;
    }

    void hire(Employee emp) {
        empar.add(emp);
    }

    void hireAll(Employee... emps) {
        for (Employee emp :
                emps) {
            empar.add(emp);

        }
    }

    void checkIncome() {
        income = 0;
        for (Employee emp :
                empar) {
            if (emp.position.getClass() == Manager.class) {
                income += ((Manager) emp.position).generateIncome();
            }
        }
        System.out.println("Income is " + income / 1000000 + " m rub");
    }

    void fire(Employee emp) {
        empar.remove(emp);
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    List<Employee> getTopSalaryStaff(int count) {
        empar.sort(Comparator.comparing(Employee::getSalary).reversed());
        return empar.subList(0, count);
    }

    List<Employee> getLowestSalaryStaff(int count) {
        empar.sort(Comparator.comparing(Employee::getSalary));
        return empar.subList(0, count);
    }
}

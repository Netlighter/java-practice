package com.netlight.lab78;

import java.util.ArrayList;

public class Company {
    ArrayList<Employee> empar = new ArrayList<Employee>;
    double income;

    void hire(Employee emp) {
        empar.add(emp);
        emp.setCompany(this);
    }

    void hireAll(Employee... emps) {
        for (Employee emp :
                emps) {
            empar.add(emp);
            emp.setCompany(this);
        }
    }

    void fire(Employee emp) {
        empar.remove(emp);
        emp.setCompany(null);
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

//    List<Employee> getTopSalaryStaff(int count){}
//    List<Employee> getLowestSalaryStaff(int count){}
}

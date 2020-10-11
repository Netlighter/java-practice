package com.netlight.lab9;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<NewEmployee> employeeList = new ArrayList<>();

    public List<NewEmployee> getNewEmployeeList() {
        return employeeList;
    }

    public void setNewEmployeeList(List<NewEmployee> employeeList) {
        this.employeeList = employeeList;
    }

    public void hire(NewEmployee employee) {
        employeeList.add(employee);
    }

    public void hireAll(List<NewEmployee> allNewEmployees) {
        employeeList.addAll(allNewEmployees);
    }

    public void fire(double percent) {
        int numFire = (int) (employeeList.size() * percent / 100);
        for (int i = 0; i < numFire; i++) {
            employeeList.remove((int) (Math.random() * (employeeList.size() - 1)));
        }
    }

    public void doSomethingWithNewEmployee(
            NewEmployeeSelector selector,
            NewEmployeeHandler handler
    ) {
        int count = 0;
        for (NewEmployee employee : employeeList) {
            if (selector.isNeedNewEmployee(employee)) {
                handler.handleNewEmployees(employee, count);
                count++;
            }
        }
        System.out.println(count + " of employees have a good salary");
    }
}
package com.netlight.lab9;

public class UniqueClass implements NewEmployeeSelector {

    private final int number;

    public UniqueClass(int number) {
        this.number = number;
    }

    @Override
    public boolean isNeedNewEmployee(NewEmployee employee) {
        return employee.getSalary() >= number;
    }
}
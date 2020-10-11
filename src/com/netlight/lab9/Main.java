package com.netlight.lab9;

import com.netlight.lab7_8.Names;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Company company = new Company();

        String[] ln = new Names().getLastname();
        String[] n = new Names().getNames();

        for (int i = 0; i < 100; i++) {
            company.hire(new NewEmployee(
                    n[(int) (Math.random() * n.length)],
                    ln[(int) (Math.random() * ln.length)],
                    "Moscow",
                    (int) (Math.random() * 1000000 + 10000000),
                    new Dates(
                            (int) (Math.random() * 27 + 1),
                            (int) (Math.random() * 12 + 1),
                            (int) (Math.random() * 30 + 2000))));
        }
//interface
//        checking salary "if more than 10600000"
        company.doSomethingWithNewEmployee(
                new UniqueClass(10600000),
                (employee, i) -> System.out.println(
                        "Employee #" +
                                (i + 1) +
                                ": " + " " +
                                employee.getFirstName() + " " +
                                employee.getLastName() + " " +
                                employee.getSalary() + " " +
                                employee.getDates()));
//anon class
//        checking salary "if more than 10700000"
        company.doSomethingWithNewEmployee(new NewEmployeeSelector() {
            @Override
            public boolean isNeedNewEmployee(NewEmployee employee) {
                return employee.getSalary() > 10700000;
            }
        }, new NewEmployeeHandler() {
            @Override
            public void handleNewEmployees(NewEmployee employee, int index) {
                System.out.println(
                        "Employee #" +
                                (index + 1) +
                                ": " + " " +
                                employee.getFirstName() + " " +
                                employee.getLastName() + " " +
                                employee.getSalary() + " " +
                                employee.getDates());

            }
        });

//lambda
//        checking salary "if more than 10800000"
        ArrayList<NewEmployee> empar = new ArrayList<>();
        company.doSomethingWithNewEmployee(
                employee -> employee.getSalary() > 10800000,
                (employee, i) -> empar.add(employee));
        for (int i = 0; i < empar.size(); i++) {
            System.out.println(
                    "Employee #" +
                            (i + 1) +
                            ": " + " " +
                            empar.get(i).getFirstName() + " " +
                            empar.get(i).getLastName() + " " +
                            empar.get(i).getSalary() + " " +
                            empar.get(i).getDates());
        }

    }

}
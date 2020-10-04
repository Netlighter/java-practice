package com.netlight.lab78;

public class Main {
    public static void main(String[] args) {
        Company company = new Company("BruhDev");

        String[] ln = new Names().lastname;
        String[] n = new Names().names;
        for (int i = 0; i < 80; i++) {
            String lastName = ln[(int) (Math.random() * ln.length)];
            String name = n[(int) (Math.random() * 100)];
            company.hire(new Employee(lastName, name, 100000, new Manager()));
        }
        for (int i = 0; i < 180; i++) {
            String lastName = ln[(int) (Math.random() * ln.length)];
            String name = n[(int) (Math.random() * 100)];
            company.hire(new Employee(lastName, name, 40000, new Operator()));
        }
        for (int i = 0; i < 10; i++) {
            String lastName = ln[(int) (Math.random() * ln.length)];
            String name = n[(int) (Math.random() * 100)];
            company.hire(new Employee(lastName, name, 140000, new TopManager(company)));
        }
        company.checkIncome();
        System.out.println("Top 15 salary:");
        for (Employee x :
                company.getTopSalaryStaff(15)) {
            System.out.println((int) x.getSalary() + "rub");
        }
        System.out.println("\nLowest 30 salary:");
        for (Employee x :
                company.getLowestSalaryStaff(30)) {
            System.out.println((int) x.getSalary() + "rub");
        }

        System.out.println(company.empar.size() + "emps");
        for (int i = 0; i < company.empar.size() / 2; i++) {
            company.fire(company.empar.get((int) Math.random() * company.empar.size() / 2));
        }
        System.out.println(company.empar.size() + "emps");

        company.checkIncome();
        System.out.println("Top 15 salary:");
        for (Employee x :
                company.getTopSalaryStaff(15)) {
            System.out.println((int) x.getSalary() + "rub");
        }
        System.out.println("\nLowest 30 salary:");
        for (Employee x :
                company.getLowestSalaryStaff(30)) {
            System.out.println((int) x.getSalary() + "rub");
        }


    }
}

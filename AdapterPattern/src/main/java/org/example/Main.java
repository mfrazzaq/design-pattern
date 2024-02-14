package org.example;

public class Main {
    public static void main(String[] args) {
        // Data in the legacy system
        LegacyEmployee employee = new LegacyEmployee("adam", "1", 2200);

        // Using adapter to get data from the legacy system
        NewEmployee newEmployee = new NewEmployee(employee);
        System.out.println(newEmployee.getID());
        System.out.println(newEmployee.getName());
        System.out.println(newEmployee.getSalary());

    }
}
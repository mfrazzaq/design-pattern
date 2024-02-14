package org.example;

public class LegacyEmployee {
    private String name;
    private String id;
    private double salary;

    public LegacyEmployee(String name, String id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }
}

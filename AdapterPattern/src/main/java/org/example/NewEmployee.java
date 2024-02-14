package org.example;

import java.rmi.dgc.Lease;

public class NewEmployee implements  Employee{
    private LegacyEmployee legacyEmployee;

    public NewEmployee(LegacyEmployee legacyEmployee) {
        this.legacyEmployee = legacyEmployee;
    }

    @Override
    public String getName() {
        return this.legacyEmployee.getName();
    }

    @Override
    public String getID() {
        return this.legacyEmployee.getId();
    }

    @Override
    public double getSalary() {
        return this.legacyEmployee.getSalary();
    }
}

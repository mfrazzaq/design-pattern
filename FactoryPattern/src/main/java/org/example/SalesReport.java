package org.example;

public class SalesReport implements IReport{
    @Override
    public void generate() {
        System.out.println("Sales summary report is generated");
    }
}

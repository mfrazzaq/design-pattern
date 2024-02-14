package org.example;

public class SalesSummaryReport implements IReport{
    @Override
    public void generate() {
        System.out.println("Sales Summary Report is generated");
    }
}

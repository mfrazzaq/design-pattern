package org.example;

public class DetailedReport implements  IReport{
    @Override
    public void generate() {
        System.out.println("Detailed Report is generated");
    }
}

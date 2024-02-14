package org.example;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryReport abstractFactoryReport = new AbstractFactoryReport();
        IReport localDetail = abstractFactoryReport.createDetailedReport("local");
        localDetail.generate();
        IReport foreignSales = abstractFactoryReport.createSalesReport("foreign");
        foreignSales.generate();

    }
}
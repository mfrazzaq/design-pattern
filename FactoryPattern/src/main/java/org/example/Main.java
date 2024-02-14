package org.example;

public class Main {
    public static void main(String[] args) {
        ReportFactory reportFactory = new ReportFactory();
        try{
            IReport salesReport = reportFactory.createFactory("Sales");
            IReport detailedReport = reportFactory.createFactory("DetailedReport");
            salesReport.generate();
            detailedReport.generate();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
package org.example;

public interface IAbstractReportFactory {
    public IReport createDetailedReport(String reportType);
    public IReport createSalesReport(String reportType);
}

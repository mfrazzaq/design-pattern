package org.example;

public class ReportFactory implements IReportFactory{
    @Override
    public IReport createFactory(String reportType) throws Exception {
        switch (reportType) {
            case "Sales":
                return new SalesReport();
            case "SalesSummary":
                return new SalesSummaryReport();
            case "DetailedReport":
                return new DetailedReport();
            default:
                throw new Exception("No such report found");
        }
    }
}

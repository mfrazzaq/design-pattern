package org.example;

public class AbstractFactoryReport implements IAbstractReportFactory{
    @Override
    public IReport createDetailedReport(String reportType) {
        if(reportType.equals("local")){
            return new DetailedLocalProviderReport();
        } else {
            return new DetailedForeignProviderReport();
        }
    }

    @Override
    public IReport createSalesReport(String reportType) {
        if(reportType.equals("local")){
            return  new SalesForeignReport();
        } else {
            return new SalesForeignReport();
        }
    }
}

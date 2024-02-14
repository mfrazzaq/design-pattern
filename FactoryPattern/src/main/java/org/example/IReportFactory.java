package org.example;

public interface IReportFactory {
    public IReport createFactory(String reportType) throws Exception;
}

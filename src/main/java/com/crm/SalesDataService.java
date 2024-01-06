package com.crm;

import java.util.List;
import java.util.Optional;

public interface SalesDataService {
    List<SalesData> getAllSalesData();

    Optional<SalesData> getSalesDataById(long salesId);

    SalesData createSalesData(SalesData salesData);

    SalesData updateSalesData(long salesId, SalesData salesData);

    void deleteSalesData(long salesId);
}



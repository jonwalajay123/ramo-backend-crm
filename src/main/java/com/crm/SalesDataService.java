package com.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SalesDataService {

    @Autowired
    private SalesDataRepository salesDataRepository;

    public List<SalesData> getAllSalesData() {
        return salesDataRepository.findAll();
    }

    public SalesData getSalesDataById(long salesId) {
        return salesDataRepository.findById(salesId).orElse(null);
    }

    public SalesData createSalesData(SalesData salesData) {
        return salesDataRepository.save(salesData);
    }

    public SalesData updateSalesData(long salesId, SalesData updatedSalesData) {
        if (salesDataRepository.existsById(salesId)) {
            updatedSalesData.setSalesId(salesId);
            return salesDataRepository.save(updatedSalesData);
        }
        return null;
    }

    public void deleteSalesData(long salesId) {
        salesDataRepository.deleteById(salesId);
    }
}




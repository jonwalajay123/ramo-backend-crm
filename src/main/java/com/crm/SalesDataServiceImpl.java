package com.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalesDataServiceImpl implements SalesDataService {

    @Autowired
    private SalesDataRepository salesDataRepository;

    @Override
    public List<SalesData> getAllSalesData() {
        return salesDataRepository.findAll();
    }

    @Override
    public Optional<SalesData> getSalesDataById(long salesId) {
        return salesDataRepository.findById(salesId);
    }

    @Override
    public SalesData createSalesData(SalesData salesData) {
        return salesDataRepository.save(salesData);
    }

    @Override
    public SalesData updateSalesData(long salesId, SalesData salesData) {
        if (salesDataRepository.existsById(salesId)) {
            salesData.setSalesId(salesId);
            return salesDataRepository.save(salesData);
        } else {
            // Handle not found scenario
            return null;
        }
    }

    @Override
    public void deleteSalesData(long salesId) {
        salesDataRepository.deleteById(salesId);
    }
}


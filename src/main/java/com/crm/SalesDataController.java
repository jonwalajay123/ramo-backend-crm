package com.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/sales-data")
public class SalesDataController {

    @Autowired
    private SalesDataService salesDataService;

    @GetMapping
    public List<SalesData> getAllSalesData() {
        return salesDataService.getAllSalesData();
    }

    @GetMapping("/{salesId}")
    public SalesData getSalesDataById(@PathVariable long salesId) {
        return salesDataService.getSalesDataById(salesId);
    }

    @PostMapping
    public SalesData createSalesData(@RequestBody SalesData salesData) {
        return salesDataService.createSalesData(salesData);
    }

    @PutMapping("/{salesId}")
    public SalesData updateSalesData(@PathVariable long salesId, @RequestBody SalesData updatedSalesData) {
        return salesDataService.updateSalesData(salesId, updatedSalesData);
    }

    @DeleteMapping("/{salesId}")
    public void deleteSalesData(@PathVariable long salesId) {
        salesDataService.deleteSalesData(salesId);
    }
}

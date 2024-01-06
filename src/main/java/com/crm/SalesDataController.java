package com.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sales-data")
@CrossOrigin(origins = "http://localhost:3000")
public class SalesDataController {

    @Autowired
    private SalesDataService salesDataService;

    @GetMapping
    public List<SalesData> getAllSalesData() {
        return salesDataService.getAllSalesData();
    }

    @GetMapping("/{salesId}")
    public ResponseEntity<SalesData> getSalesDataById(@PathVariable long salesId) {
        Optional<SalesData> salesData = salesDataService.getSalesDataById(salesId);
        return salesData.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<SalesData> createSalesData(@RequestBody SalesData salesData) {
        SalesData createdSalesData = salesDataService.createSalesData(salesData);
        return new ResponseEntity<>(createdSalesData, HttpStatus.CREATED);
    }

    @PutMapping("/{salesId}")
    public ResponseEntity<SalesData> updateSalesData(@PathVariable long salesId, @RequestBody SalesData salesData) {
        SalesData updatedSalesData = salesDataService.updateSalesData(salesId, salesData);
        return updatedSalesData != null ?
                new ResponseEntity<>(updatedSalesData, HttpStatus.OK) :
                new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{salesId}")
    public ResponseEntity<Void> deleteSalesData(@PathVariable long salesId) {
        salesDataService.deleteSalesData(salesId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

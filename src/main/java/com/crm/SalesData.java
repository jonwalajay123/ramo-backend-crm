package com.crm;


import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "sale")
public class SalesData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long salesId;
    
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    private LocalDate salesDate;

    private String serviceName;

    private double amount;

	public long getSalesId() {
		return salesId;
	}

	public void setSalesId(long salesId) {
		this.salesId = salesId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public LocalDate getSalesDate() {
		return salesDate;
	}

	public void setSalesDate(LocalDate salesDate) {
		this.salesDate = salesDate;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public SalesData(long salesId, Customer customer, LocalDate salesDate, String serviceName, double amount) {
		super();
		this.salesId = salesId;
		this.customer = customer;
		this.salesDate = salesDate;
		this.serviceName = serviceName;
		this.amount = amount;
	}

	public SalesData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
    

    // Getters and Setters
}

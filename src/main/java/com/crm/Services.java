package com.crm;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "services")
public class Services {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long serviceId;
    private String serviceName;
    private int price;
    private String category;
    private String description;
	public Services(long serviceId, String serviceName, int price, String category, String description) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.price = price;
		this.category = category;
		this.description = description;
	}
	public Services() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getServiceId() {
		return serviceId;
	}
	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
   
    // Getters and Setters
}

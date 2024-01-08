package com.crm;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name ="projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;
    private String projectName;
    private LocalDate startDate;
    private LocalDate endDate;
    private String customerId;
    private String status;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "project") 
    private List<Task> tasks;

	public Long getProjectId() {
		return projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public Project(Long projectId, String projectName, LocalDate startDate, LocalDate endDate, String customerId,
			String status, List<Task> tasks) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.customerId = customerId;
		this.status = status;
		this.tasks = tasks;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
    
}
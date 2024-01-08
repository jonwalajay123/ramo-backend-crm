package com.crm;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name ="tasks")
public class Task {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long taskId;
    private String title;
    private LocalDate startDate;
    private LocalDate deadline;
    private String relatedTo;
    private String assignedTo;
    private boolean completed;

    @ManyToOne
    @JoinColumn(name = "project_id")
    @JsonBackReference
    private Project project;

	public Long getTaskId() {
		return taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	public String getRelatedTo() {
		return relatedTo;
	}

	public void setRelatedTo(String relatedTo) {
		this.relatedTo = relatedTo;
	}

	public String getAssignedTo() {
		return assignedTo;
	}

	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Task(Long taskId, String title, LocalDate startDate, LocalDate deadline, String relatedTo, String assignedTo,
			boolean completed, Project project) {
		super();
		this.taskId = taskId;
		this.title = title;
		this.startDate = startDate;
		this.deadline = deadline;
		this.relatedTo = relatedTo;
		this.assignedTo = assignedTo;
		this.completed = completed;
		this.project = project;
	}

	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	
}


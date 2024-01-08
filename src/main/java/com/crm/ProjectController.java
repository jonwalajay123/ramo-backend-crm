package com.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/projects")
@CrossOrigin(origins = "http://localhost:3000")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @GetMapping
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/{projectId}")
    public Project getProjectById(@PathVariable Long projectId) {
        return projectService.getProjectById(projectId);
    }

    @PostMapping
    public Project createProject(@RequestBody Project project) {
        return projectService.createProject(project);
    }

    @PutMapping("/{projectId}")
    public Project updateProject(@PathVariable Long projectId, @RequestBody Project updatedProject) {
        return projectService.updateProject(projectId, updatedProject);
    }

    @DeleteMapping("/{projectId}")
    public void deleteProject(@PathVariable Long projectId) {
        projectService.deleteProject(projectId);
    }
}


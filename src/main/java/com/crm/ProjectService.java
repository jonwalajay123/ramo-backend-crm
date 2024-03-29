package com.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepo projectRepository;

    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    public Project getProjectById(Long projectId) {
        return projectRepository.findById(projectId).orElse(null);
    }

    public Project createProject(Project project) {
        return projectRepository.save(project);
    }

    public Project updateProject(Long projectId, Project updatedProject) {
        if (projectRepository.existsById(projectId)) {
            updatedProject.setProjectId(projectId);
            return projectRepository.save(updatedProject);
        }
        return null;
    }

    public void deleteProject(Long projectId) {
        projectRepository.deleteById(projectId);
    }
}


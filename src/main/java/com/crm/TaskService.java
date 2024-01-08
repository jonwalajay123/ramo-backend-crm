package com.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskService {

    @Autowired
    private TaskRepo taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long taskId) {
        return taskRepository.findById(taskId).orElse(null);
    }

    public Task createTask(Task task) {
        return taskRepository.save(task);
    }

    public Task updateTask(Long taskId, Task updatedTask) {
        if (taskRepository.existsById(taskId)) {
            updatedTask.setTaskId(taskId);
            return taskRepository.save(updatedTask);
        }
        return null;
    }

    public void deleteTask(Long taskId) {
        taskRepository.deleteById(taskId);
    }
}

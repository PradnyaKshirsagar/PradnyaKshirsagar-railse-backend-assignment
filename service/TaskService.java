package com.pradnya.workforcemgmt.service;

import com.pradnya.workforcemgmt.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TaskService {

    private final List<Task> tasks = new ArrayList<>();
    private final AtomicLong idCounter = new AtomicLong();

    // Create task
    public Task createTask(Task task) {
        task.setId(idCounter.incrementAndGet());
        tasks.add(task);
        return task;
    }

    // Get all tasks
    public List<Task> getAllTasks() {
        return tasks;
    }

    // Get task by ID
    public Task getTaskById(Long id) {
        return tasks.stream()
                .filter(t -> t.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Update task
    public Task updateTask(Long id, Task updatedTask) {
        for (Task task : tasks) {
            if (task.getId().equals(id)) {
                task.setTitle(updatedTask.getTitle());
                task.setDescription(updatedTask.getDescription());
                task.setStatus(updatedTask.getStatus());
                return task;
            }
        }
        return null;
    }

    // Delete task
    public boolean deleteTask(Long id) {
        return tasks.removeIf(task -> task.getId().equals(id));
    }
}

package com.pradnya.workforcemgmt.dto;

import com.pradnya.workforcemgmt.model.enums.Priority;

import java.time.LocalDate;

public class CreateTaskRequest {
    private String name;
    private String description;
    private Priority priority;
    private LocalDate dueDate;

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }
}

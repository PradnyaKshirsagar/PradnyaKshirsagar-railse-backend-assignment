package com.pradnya.workforcemgmt.mapper;

import com.pradnya.workforcemgmt.dto.CreateTaskRequest;
import com.pradnya.workforcemgmt.dto.TaskDto;
import com.pradnya.workforcemgmt.model.Task;
import com.pradnya.workforcemgmt.model.enums.Status;

public class TaskMapper {

    public static Task toTask(CreateTaskRequest request) {
        Task task = new Task();
        task.setName(request.getName());
        task.setDescription(request.getDescription());
        task.setPriority(request.getPriority());
        task.setDueDate(request.getDueDate());
        task.setStatus(Status.PENDING); // Default status
        return task;
    }

    public static TaskDto toDto(Task task) {
        TaskDto dto = new TaskDto();
        dto.setId(task.getId());
        dto.setName(task.getName());
        dto.setDescription(task.getDescription());
        dto.setPriority(task.getPriority());
        dto.setStatus(task.getStatus());
        dto.setDueDate(task.getDueDate());
        return dto;
    }
}

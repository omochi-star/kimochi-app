package com.example.kimochi.controller.task;

import com.example.kimochi.service.task.TaskEntity;
import com.example.kimochi.service.task.TaskStatus;

public record TaskForm (
        String summary,
        String description,
        String status
){

    public TaskEntity toEntity() {
        return new TaskEntity(null,summary(),description(), TaskStatus.valueOf(status()));
    }
}

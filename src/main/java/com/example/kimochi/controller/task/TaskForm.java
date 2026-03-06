package com.example.kimochi.controller.task;

import com.example.kimochi.service.task.TaskEntity;
import com.example.kimochi.service.task.TaskStatus;
import jakarta.validation.constraints.NotBlank;

public record TaskForm(
        @NotBlank
        String summary,

        String description,

        @NotBlank
        String status
) {

    public TaskEntity toEntity() {
        return new TaskEntity(null, summary(), description(), TaskStatus.valueOf(status()));
    }
}

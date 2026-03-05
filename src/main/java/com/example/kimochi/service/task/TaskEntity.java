package com.example.kimochi.service.task;

public record TaskEntity(
        Long id,
        String summary,
        String description,
        TaskStatus status
) {

}

package com.example.kimochi.service.task;

public record TaskEntity(
        long id,
        String summary,
        String description,
        TaskStatus status
) {

}

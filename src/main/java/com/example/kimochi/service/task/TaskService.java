package com.example.kimochi.service.task;

import java.util.List;

public class TaskService {
    public List<TaskEntity> find(){
        var task1 = new TaskEntity(1L, "SpringBootを学ぶ", "TODOアプリケーションを作ってみる", TaskStatus.TODO);
        var task2 = new TaskEntity(2L, "Spring Securityを学ぶ", "TODOアプリケーションを作ってみる", TaskStatus.DOING);
        return List.of(task1,task2);
    }
}

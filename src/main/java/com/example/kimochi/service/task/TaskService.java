package com.example.kimochi.service.task;

import com.example.kimochi.controller.task.TaskDTO;

import java.util.List;

public class TaskService {
    public List<TaskDTO> find(){
        var task1 = new TaskDTO(1L, "SpringBootを学ぶ", "TODOアプリケーションを作ってみる", "TODO");
        var task2 = new TaskDTO(2L, "Spring Securityを学ぶ", "TODOアプリケーションを作ってみる", "TODO");
        return List.of(task1,task2);
    }
}

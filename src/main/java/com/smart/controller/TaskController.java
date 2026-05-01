package com.smart.controller;

import com.smart.entities.Task;
import com.smart.entities.User;
import com.smart.dao.TaskRepository;
import com.smart.dao.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tasks")   // 🔥 ध्यान दो (tasks plural)
@CrossOrigin
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private UserRepository userRepository;

    // Assign Task
    @PostMapping("/assign/{userId}")
    public Task assignTask(@PathVariable Long userId, @RequestBody Task task) {
        User user = userRepository.findById(userId).orElseThrow();
        task.setUser(user);
        return taskRepository.save(task);
    }

    // Get User Tasks
    @GetMapping("/user/{userId}")
    public List<Task> getUserTasks(@PathVariable Long userId) {
        return taskRepository.findByUserId(userId);
    }
}
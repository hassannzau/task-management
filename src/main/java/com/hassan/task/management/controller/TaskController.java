package com.hassan.task.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hassan.task.management.DTOs.TaskResponse;
import com.hassan.task.management.entity.Task;
import com.hassan.task.management.service.TaskService;

@RestController
	@RequestMapping("/tasks")
	public class TaskController {

	    @Autowired
	    private TaskService taskService;

	    @PostMapping
	    public TaskResponse createTask(@RequestBody Task request) {
	        return taskService.createTask(request.getTitle(), request.getStatus(), request.getTags());
	    }

	    @GetMapping
	    public List<TaskResponse > getAllTasks() {
	        return taskService.getAllTasks();
	    }
	}




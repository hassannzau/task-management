package com.hassan.task.management.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hassan.task.management.DTOs.TaskResponse;
import com.hassan.task.management.entity.Tag;
import com.hassan.task.management.entity.Task;
import com.hassan.task.management.repository.TagRepository;
import com.hassan.task.management.repository.TaskRepository;

@Service
	public class TaskService {

	    @Autowired
	    private TaskRepository taskRepository;

	    @Autowired
	    private TagRepository tagRepository;

	    public Task createTask(String title, Boolean status, List<String> tagNames) {
	        Task task = new Task();
	        task.setTitle(title);
	        task.setStatus(status);

	        List<Tag> tags = tagNames.stream()
	            .map(name -> tagRepository.findByName(name).orElseGet(() -> new Tag(name)))
	            .collect(Collectors.toList());

	        task.setTags(tags);
	        return taskRepository.save(task);
	    }

	    public List<TaskResponse> getAllTasks() {
	        return taskRepository.findAll().stream()
	            .map(task -> new TaskResponse(
	                task.getId(),
	                task.getTitle(),
	                task.getStatus(),
	                task.getTags().stream().map(Tag::getName).collect(Collectors.toList())
	            ))
	            .collect(Collectors.toList());
	    }
	
}

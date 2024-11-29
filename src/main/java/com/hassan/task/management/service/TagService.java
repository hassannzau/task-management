package com.hassan.task.management.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hassan.task.management.DTOs.TagSummary;
import com.hassan.task.management.entity.Tag;
import com.hassan.task.management.exceptions.ResourceNotFoundException;
import com.hassan.task.management.repository.TagRepository;

@Service
	public class TagService {

	    @Autowired
	    private TagRepository tagRepository;

	    public List<TagSummary> getAllTagsWithCounts() {
	        return tagRepository.findAllWithTaskCounts();
	    }

	    public Tag getTagDetails(Long id) {
	        return tagRepository.findById(id)
	            .orElseThrow(() -> new ResourceNotFoundException("Tag not found with ID: " + id));
	    }
	}

	


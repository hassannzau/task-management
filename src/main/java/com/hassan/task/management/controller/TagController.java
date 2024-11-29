package com.hassan.task.management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hassan.task.management.DTOs.TagSummary;
import com.hassan.task.management.entity.Tag;
import com.hassan.task.management.service.TagService;

@RestController
	@RequestMapping("/tags")
	public class TagController {

	    @Autowired
	    private TagService tagService;

	    @GetMapping
	    public List<TagSummary> getAllTags() {
	        return tagService.getAllTagsWithCounts();
	    }

	    @GetMapping("/{id}")
	    public Tag getTagDetails(@PathVariable Long id) {
	        return tagService.getTagDetails(id);
	    }
	}



